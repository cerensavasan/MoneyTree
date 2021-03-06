var express = require('express');
var router = express.Router();
var transporter = require('../mailer/mailer.js');
var pool = require('../db/config');
var randomstring = require("randomstring");

/* GET users listing. */
router.get('/', function (req, res) {
    console.log("GET request on /trader");
    res.send('Welcome to trader page');
});


router.route('/orders/:username')
    .get(function (req, res) {
        console.log('Get request on /trader/orders/:username');
        pool.getConnection(function (err, conn) {
            conn.query({
                    sql: 'SELECT s.*, u.username, p.assigned_to FROM single_order s INNER JOIN pm_order p ON s.order_id = p.order_id INNER JOIN user u ON u.u_id = p.pm_id WHERE status = "Pending" and p.assigned_to = (SELECT u_id FROM user WHERE username = ? ) ORDER BY s.sorder_id;'

                    //sql: 'SELECT s.*, p.assigned_to FROM single_order s INNER JOIN pm_order p ON s.order_id = p.order_id WHERE s.status = "Pending" and p.assigned_to = (SELECT u_id FROM user WHERE username = ? ) ORDER BY s.sorder_id'
                }, [req.params.username],
                function (error, results, fields) {
                    // error will be an Error if one occurred during the query 
                    // results will contain the results of the query 
                    // fields will contain information about the returned results fields (if any)
                    if (error) {
                        console.log('Error performing the query:');
                        console.log(error);
                        res.status(500).send(error);
                    } else {
                        res.json(results);
                    }
                });
            conn.release();
        });
    });


function process_block(res, single_block) {
    pool.getConnection(function (err, conn) {
            console.log("Single block:");
            console.log(single_block);
            /* Insert general block info into trader_block table */
            var blockId = 0;
            conn.query({
                    sql: 'INSERT INTO trader_block (t_id, b_id, symbol, quantity, order_type) VALUES (?, ?, ?, ?, ?)'
                }, [single_block.t_id, single_block.b_id, single_block.symbol, single_block.quantity, single_block.order_type],
                function (error, results, fields) {
                    // error will be an Error if one occurred during the query 
                    // results will contain the results of the query 
                    // fields will contain information about the returned results fields (if any)
                    if (error) {
                        console.log('Error performing the query:');
                        console.log(error);
                        res.status(500).send(error);
                    } else {
                        console.log("Block insert successful");
                        console.log(results);

                        blockId = results.insertId;
                        console.log("Block id:" + blockId);

                        /* Updating single_order information */
                        for (var j in single_block.holdingOrders) {
                            var single_order = single_block.holdingOrders[j];
                            console.log("Single order id: " + single_order.sorder_id);
                            conn.query({
                                    sql: 'UPDATE single_order SET block_id = ?, date_trequest = CURDATE(), status = ? WHERE sorder_id = ?'
                                }, [blockId, "Processed", single_order.sorder_id],
                                function (error, results, fields) {
                                    if (error) {
                                        console.log('Error performing the query:');
                                        console.log(error);
                                        res.status(500).send(error);
                                    } else {
                                        console.log("Single_order updated successfully");
                                    }

                                }
                            );
                        }

                        /* Send email to the broker */

                        // auto-generate the link
                        var url = randomstring.generate(32);
                        var link = "http://139.59.17.119:8080/views/trade/" + url;
                        var brokerEmail = single_block.b_email;

                        // Create the email content
                        var orderTable = "<table style=\"table, th, td {border: 1 px solid black;}\"><tr><th>Symbol</th><th>Quantity</th><th>Action</th><th>Order type</th><th>Stop price</th><th>Limit price</th></tr><tr><td>" + single_block.symbol + "</td><td>" + single_block.quantity + "</td><td>" + single_block.order_type + "</td><td>" + single_block.price_stop + "</td><td>" + single_block.price_limit + "</td></tr></table>"

                        var mailText = "A new order has been placed: <br/>" + orderTable + "<br/>Please, press the following button when executed:<br/><a href=\"" + link + "\"><button>Confirm</button></a>";
                        var mailOptions = {
                            from: 'info@moneytree.com',
                            to: brokerEmail,
                            subject: 'New trade request',
                            html: mailText
                        };

                        transporter.sendMail(mailOptions, function (error, info) {
                            if (error) {
                                return console.log(error);
                            }
                            console.log('Message sent: ' + info.response);
                        });

                        conn.query({
                                sql: 'INSERT INTO temp_link (block_id, uid) VALUES (?, ?)'
                            }, [blockId, url],
                            function (error, results, fields) {
                                if (error) {
                                    console.log('Error performing the query:');
                                    console.log(error);
                                    res.status(500).send(error);
                                } else {
                                    console.log("temp_link recorded successfully");
                                }
                            });
                    }
                });
            conn.release();

        }

    )
}

router.route('/blocks/')
    .post(function (req, res) {
        for (var i in req.body) {
            var single_block = req.body[i];
            process_block(res, single_block);
        }
        res.status(200).send();
    });

router.route('/blocks/:username')
    .get(function (req, res) {
        console.log('Get request on /trader/blocks/:username');
        pool.getConnection(function (err, conn) {
            conn.query({
                    sql: 'SELECT b.*, k.name FROM trader_block b INNER JOIN broker k ON k.b_id = b.b_id WHERE b.t_id = (SELECT u_id FROM user WHERE username = ? ) ORDER BY b.block_id'
                }, [req.params.username],
                function (error, results, fields) {
                    // error will be an Error if one occurred during the query 
                    // results will contain the results of the query 
                    // fields will contain information about the returned results fields (if any)
                    if (error) {
                        console.log('Error performing the query:');
                        console.log(error);
                        res.status(500).send(error);
                    } else {
                        res.json(results);
                    }
                });
            conn.release();
        });
    });



module.exports = router;