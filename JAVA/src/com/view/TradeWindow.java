package com.view;

import UserObjects.SingleOrder;
import com.controller.ControllerBlockOrders;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agopa3
 */
public class TradeWindow extends javax.swing.JFrame {

    /**
     * Creates new form TradeWindow
     */
    public TradeWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TraderPlatformTabbedPane = new javax.swing.JTabbedPane();
        TraderPlatformRequestsTab = new javax.swing.JPanel();
        TraderIncomingRequestsScrollPane = new javax.swing.JScrollPane();
        TraderIncomingRequestsTable = new javax.swing.JTable();
        TraderBlockOrders = new javax.swing.JButton();
        FilterOptionsTraderRequests = new javax.swing.JComboBox<>();
        FilterTextTraderRequests = new javax.swing.JTextField();
        TraderRequestsFilter = new javax.swing.JButton();
        TraderPlatformBlockedRequests = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        TraderSubmitBlocks = new javax.swing.JButton();
        TraderSelectAllBlocks = new javax.swing.JCheckBox();
        TraderSelectBrokerOptions = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TraderPlatformBlockOrderHistory = new javax.swing.JPanel();
        TraderBlockHistoryScrollPane = new javax.swing.JScrollPane();
        TraderBlockHistoryTable = new javax.swing.JTable();
        FilterTextTraderBlockHistory = new javax.swing.JTextField();
        FilterOptionsTraderBlockHistory = new javax.swing.JComboBox<>();
        TraderBlockHistoryFilter = new javax.swing.JButton();
        ChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trader Platform");
        setName("TraderPlatformFrame"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        TraderPlatformTabbedPane.setName("TraderPlatformTabbedPane");

        TraderPlatformRequestsTab.setName("TraderPlatformRequestsTab"); // NOI18N

        TraderIncomingRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Portfolio ID", "Symbol", "Quantity", "Action", "Stop Price", "Limit Price", "Stock Exchange", "Account Type", "Order Type", "Assigned By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TraderIncomingRequestsScrollPane.setViewportView(TraderIncomingRequestsTable);

        TraderBlockOrders.setText("Block Orders");
        TraderBlockOrders.setActionCommand("BlockOrders()");
        TraderBlockOrders.setName("TraderBlockOrders"); // NOI18N
        TraderBlockOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraderBlockOrdersActionPerformed(evt);
            }
        });

        FilterOptionsTraderRequests.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order ID", "Portfolio ID", "Symbol", "Quantity", "Action", "Stop Price", "Limit Price", "Account Type", "Order Type", "Assigned By" }));
        FilterOptionsTraderRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterOptionsTraderRequestsActionPerformed(evt);
            }
        });

        FilterTextTraderRequests.setText("Filter By");
        FilterTextTraderRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterTextTraderRequestsActionPerformed(evt);
            }
        });

        TraderRequestsFilter.setText("Filter");
        TraderRequestsFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraderRequestsFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TraderPlatformRequestsTabLayout = new javax.swing.GroupLayout(TraderPlatformRequestsTab);
        TraderPlatformRequestsTab.setLayout(TraderPlatformRequestsTabLayout);
        TraderPlatformRequestsTabLayout.setHorizontalGroup(
            TraderPlatformRequestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraderPlatformRequestsTabLayout.createSequentialGroup()
                .addGroup(TraderPlatformRequestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TraderIncomingRequestsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(TraderPlatformRequestsTabLayout.createSequentialGroup()
                        .addComponent(FilterTextTraderRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FilterOptionsTraderRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TraderRequestsFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TraderBlockOrders)))
                .addContainerGap())
        );
        TraderPlatformRequestsTabLayout.setVerticalGroup(
            TraderPlatformRequestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TraderPlatformRequestsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TraderIncomingRequestsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TraderPlatformRequestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TraderPlatformRequestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FilterTextTraderRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilterOptionsTraderRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TraderRequestsFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TraderBlockOrders))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        TraderPlatformTabbedPane.addTab("Requests", TraderPlatformRequestsTab);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Portfolio ID", "Symbol", "Quantity", "Action", "Stop Price", "Limit Price", "Account Type", "Order Type", "Assigned By"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Portfolio ID", "Symbol", "Quantity", "Action", "Stop Price", "Limit Price", "Account Type", "Order Type", "Assigned By"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Portfolio ID", "Symbol", "Quantity", "Action", "Stop Price", "Limit Price", "Account Type", "Order Type", "Assigned By"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jLabel2.setText("Block 1");

        jLabel3.setText("Block 2 ");

        jLabel4.setText("Block 3");

        jButton1.setText("Split Block");

        jButton2.setText("Split Block");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Split Block");

        jCheckBox1.setText("Select ");

        jCheckBox2.setText("Select");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Select");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        TraderSubmitBlocks.setText("Submit Selected Blocks");

        TraderSelectAllBlocks.setText("Select All");
        TraderSelectAllBlocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraderSelectAllBlocksActionPerformed(evt);
            }
        });

        TraderSelectBrokerOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Broker 1", "Broker 2", "Broker 3", "Broker 4" }));
        TraderSelectBrokerOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraderSelectBrokerOptionsActionPerformed(evt);
            }
        });

        jLabel5.setText("Select Broker");

        javax.swing.GroupLayout TraderPlatformBlockedRequestsLayout = new javax.swing.GroupLayout(TraderPlatformBlockedRequests);
        TraderPlatformBlockedRequests.setLayout(TraderPlatformBlockedRequestsLayout);
        TraderPlatformBlockedRequestsLayout.setHorizontalGroup(
            TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraderPlatformBlockedRequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane4)
                    .addGroup(TraderPlatformBlockedRequestsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TraderPlatformBlockedRequestsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(TraderPlatformBlockedRequestsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(TraderPlatformBlockedRequestsLayout.createSequentialGroup()
                                .addComponent(TraderSelectAllBlocks)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(TraderSelectBrokerOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                .addComponent(TraderSubmitBlocks))))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        TraderPlatformBlockedRequestsLayout.setVerticalGroup(
            TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraderPlatformBlockedRequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TraderSubmitBlocks)
                    .addComponent(TraderSelectAllBlocks)
                    .addComponent(jLabel5)
                    .addComponent(TraderSelectBrokerOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TraderPlatformBlockedRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        TraderPlatformTabbedPane.addTab("Blocked Orders", TraderPlatformBlockedRequests);

        TraderBlockHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Block ID", "Symbol", "Quantity", "Order Type", "Stop Price", "Limit Price", "Broker Assigned", "Status", "Stock Exchange"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TraderBlockHistoryScrollPane.setViewportView(TraderBlockHistoryTable);

        FilterTextTraderBlockHistory.setText("Filter By");
        FilterTextTraderBlockHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterTextTraderBlockHistoryActionPerformed(evt);
            }
        });

        FilterOptionsTraderBlockHistory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Block ID", "Symbol", "Quantity", "Order Type", "Stop Price", "Limit Price", "Broker Assigned", "Status" }));
        FilterOptionsTraderBlockHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterOptionsTraderBlockHistoryActionPerformed(evt);
            }
        });

        TraderBlockHistoryFilter.setText("Filter");
        TraderBlockHistoryFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraderBlockHistoryFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TraderPlatformBlockOrderHistoryLayout = new javax.swing.GroupLayout(TraderPlatformBlockOrderHistory);
        TraderPlatformBlockOrderHistory.setLayout(TraderPlatformBlockOrderHistoryLayout);
        TraderPlatformBlockOrderHistoryLayout.setHorizontalGroup(
            TraderPlatformBlockOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraderPlatformBlockOrderHistoryLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(TraderPlatformBlockOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TraderPlatformBlockOrderHistoryLayout.createSequentialGroup()
                        .addComponent(FilterTextTraderBlockHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FilterOptionsTraderBlockHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TraderBlockHistoryFilter))
                    .addComponent(TraderBlockHistoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TraderPlatformBlockOrderHistoryLayout.setVerticalGroup(
            TraderPlatformBlockOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraderPlatformBlockOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TraderBlockHistoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(TraderPlatformBlockOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilterTextTraderBlockHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterOptionsTraderBlockHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TraderBlockHistoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(388, Short.MAX_VALUE))
        );

        TraderPlatformTabbedPane.addTab("Block Order History", TraderPlatformBlockOrderHistory);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = -83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 11, 10);
        getContentPane().add(TraderPlatformTabbedPane, gridBagConstraints);

        ChangePassword.setText("Change Password");
        ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 607, 0, 10);
        getContentPane().add(ChangePassword, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TraderSelectAllBlocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraderSelectAllBlocksActionPerformed
        if(TraderSelectAllBlocks.isSelected()){
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);     
        }
        else{
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);     
        }
            
    }//GEN-LAST:event_TraderSelectAllBlocksActionPerformed

    private void TraderSelectBrokerOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraderSelectBrokerOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TraderSelectBrokerOptionsActionPerformed

    private void FilterTextTraderBlockHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterTextTraderBlockHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterTextTraderBlockHistoryActionPerformed

    private void FilterOptionsTraderBlockHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterOptionsTraderBlockHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterOptionsTraderBlockHistoryActionPerformed

    private void ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordActionPerformed
         new ChangePassword().setVisible(true);
    }//GEN-LAST:event_ChangePasswordActionPerformed

    private void FilterOptionsTraderRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterOptionsTraderRequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterOptionsTraderRequestsActionPerformed

    private void FilterTextTraderRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterTextTraderRequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterTextTraderRequestsActionPerformed

    private void TraderBlockOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraderBlockOrdersActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) TraderIncomingRequestsTable.getModel();
        int nRow = dtm.getRowCount();
        int nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        List<SingleOrder> parsedOrders = new ArrayList();
        ControllerBlockOrders control = new ControllerBlockOrders();
        
        for(int i = 0; i < nRow; i++){
            for (int j = 0 ; j < nCol ; j++){
                tableData[i][j] = dtm.getValueAt(i,j);
            }
            SingleOrder o = new SingleOrder();
            o.SingleOrderMakeBlocks(tableData[i]);
            parsedOrders.add(o);                   
        }
        control.MakeBlock(parsedOrders);
        showMessageDialog(null, "Blocks have been successfully completed."); 
        dtm.setRowCount(0);
    }//GEN-LAST:event_TraderBlockOrdersActionPerformed

    private void TraderRequestsFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraderRequestsFilterActionPerformed
            // TODO add your handling code here:
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(TraderIncomingRequestsTable.getModel());
        TraderIncomingRequestsTable.setRowSorter(sorter);
        String text = FilterTextTraderRequests.getText();
        if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter(text));
        }
        
    }//GEN-LAST:event_TraderRequestsFilterActionPerformed

    private void TraderBlockHistoryFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraderBlockHistoryFilterActionPerformed
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(TraderBlockHistoryTable.getModel());
        TraderBlockHistoryTable.setRowSorter(sorter);
        String text = FilterTextTraderBlockHistory.getText();
        if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_TraderBlockHistoryFilterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            /*
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TradeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TradeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TradeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TradeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePassword;
    private javax.swing.JComboBox<String> FilterOptionsTraderBlockHistory;
    private javax.swing.JComboBox<String> FilterOptionsTraderRequests;
    private javax.swing.JTextField FilterTextTraderBlockHistory;
    private javax.swing.JTextField FilterTextTraderRequests;
    private javax.swing.JButton TraderBlockHistoryFilter;
    private javax.swing.JScrollPane TraderBlockHistoryScrollPane;
    private javax.swing.JTable TraderBlockHistoryTable;
    private javax.swing.JButton TraderBlockOrders;
    private javax.swing.JScrollPane TraderIncomingRequestsScrollPane;
    private javax.swing.JTable TraderIncomingRequestsTable;
    private javax.swing.JPanel TraderPlatformBlockOrderHistory;
    private javax.swing.JPanel TraderPlatformBlockedRequests;
    private javax.swing.JPanel TraderPlatformRequestsTab;
    private javax.swing.JTabbedPane TraderPlatformTabbedPane;
    private javax.swing.JButton TraderRequestsFilter;
    private javax.swing.JCheckBox TraderSelectAllBlocks;
    private javax.swing.JComboBox<String> TraderSelectBrokerOptions;
    private javax.swing.JButton TraderSubmitBlocks;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
