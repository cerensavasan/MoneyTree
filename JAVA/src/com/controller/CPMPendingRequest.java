/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import TestModules.JTableDataPopulation.JsonParsing;
import UserObjects.SingleOrder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.model.PortfolioManagerDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author kjha4
 */
public class CPMPendingRequest {

    static ArrayList<SingleOrder> pendings;
    static ArrayList<SingleOrder> executed;
            
    static public void setPendings(ArrayList<SingleOrder> pendings) {
        CPMPendingRequest.pendings = pendings;
    }

    static public void setExecuted(ArrayList<SingleOrder> executed) {
        CPMPendingRequest.executed = executed;
    }
    
    public static PMPendingRequestTableModel getPRTableModel() {
        ArrayList objList = (ArrayList) pendings;
        return new PMPendingRequestTableModel(objList);
    }
    
    public static TableModel getOHTableModel() {
        ArrayList<SingleOrder> objList = (ArrayList) executed;
        return new PMOrderHistoryTableModel(objList);

    }
    
    public static TableModel getTableModel() {
        ArrayList objList = (ArrayList) updateOrders();
        return new PMPendingRequestTableModel(objList);
    }

    private static ArrayList getData() {
        PortfolioManagerDAO pmDAO = new PortfolioManagerDAO();
        return pmDAO.getPendingRequestObjList();
    }

    public static List<SingleOrder> updateOrders() {
        String currUsername = CMAIN.reportUser().getUsername();
        HttpResponse<JsonNode> resp;
        try {
            resp = Unirest.get("http://139.59.17.119:8080/api/pm/orders/" + currUsername)
                    .header("content-type", "application/json")
                    .asJson();

            //THIS IS THE JSONRESPONSE TURNED INTO JSONOBJECT  
            JSONObject myRespO = new JSONObject(resp.getBody());
            JSONArray arrJson = myRespO.getJSONArray("array");
            //GET ORDERS FROM ARRAY
            List<SingleOrder> arrayOrders = new ArrayList<>();

            for (int i = 0; i < arrJson.length(); i++) {
                JSONObject currentOrder = arrJson.getJSONObject(i);
                SingleOrder currentSingleOrder = JsonParsing.parseJsonToSingleOrderObject(currentOrder.toString());
                if(currentSingleOrder.getStatus().equals("Pending") || currentSingleOrder.getStatus().equals("pending")){
                    arrayOrders.add(currentSingleOrder);
                } else {
                    System.out.println("ORDER NOT VALID!!!!!!");
                }
            }
            return arrayOrders;
        } catch (UnirestException | JSONException ex) {
            Logger.getLogger(CPMOrderHistory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
