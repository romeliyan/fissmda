/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fissmda.Warehouse_Subsystem;

import java.sql.Connection;
import java.sql.PreparedStatement; 
import fissmda.Warehouse_Subsystem.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class Warehouse {

    //Configure database Connection
    Connection connection;
    PreparedStatement ps;

    //Warehouse Variables
    private String warehouseNameText;
    private String warehouseAddL1;
    private String warehouseAddL2;
    private String warehouseAddL3;
    private String warehousePostal;
    private String warehouseProvince;
    private String warehouseTelephoneNumber;
    private String warehouseFaxNumber;
    private String warehouseCapacity;
    
    //Warehouse Dimention Variables
    private double warehouseLength;
    private double warehouseWidth;
    private double warehouseDepth;
    private double warePalletWidth;
    private double warePalletHeight;

    //define a constructor to initialize values
    public Warehouse(String warehouseNameText, String warehouseAddL1, String warehouseAddL2, String warehouseAddL3, String warehousePostal, String warehouseProvince, String warehouseTelephoneNumber, String warehouseFaxNumber, String warehouseCapacity) {
        this.warehouseNameText = warehouseNameText;
        this.warehouseAddL1 = warehouseAddL1;
        this.warehouseAddL2 = warehouseAddL2;
        this.warehouseAddL3 = warehouseAddL3;
        this.warehousePostal = warehousePostal;
        this.warehouseProvince = warehouseProvince;
        this.warehouseTelephoneNumber = warehouseTelephoneNumber;
        this.warehouseFaxNumber = warehouseFaxNumber;
        this.warehouseCapacity = warehouseCapacity;
    }
    
    //define a constructor initialize dimentions

    public Warehouse(double warehouseLength, double warehouseWidth, double warehouseDepth, double warePalletWidth, double warePalletHeight) {
        this.warehouseLength = warehouseLength;
        this.warehouseWidth = warehouseWidth;
        this.warehouseDepth = warehouseDepth;
        this.warePalletWidth = warePalletWidth;
        this.warePalletHeight = warePalletHeight;
    }
    

    //Warehouse inputs validations block
    public boolean validatewarehouseNameExistInDB() {

       connection = DBConnection.getConnection();
        String sqlExc = "select * from warehouse where warehouse_name  = '" + warehouseNameText + "'";
        ResultSet rs = null;

        try {
             
            ps = connection.prepareStatement(sqlExc);
            rs = ps.executeQuery();

            if (rs.next()) {

                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
    
    public boolean checkInputTextFiledNull(){
    
        if(warehouseNameText.isEmpty()|| warehouseAddL1.isEmpty() || warehouseAddL2.isEmpty() || warehousePostal.isEmpty() || warehouseTelephoneNumber.isEmpty() || warehouseFaxNumber.isEmpty() || warehouseCapacity.isEmpty() ){
        
            return false;
        }else{
            return true;
        }
    
    
    }
    
    public double calculateWarehouseCapacity(){
        return warehouseLength*warehouseWidth*warehouseDepth;
    }
    
    public double calculateWarehouseCoefficient(){
    
        int numberOfTotalPallet = ((int) warehouseWidth * (int)warehouseLength)/((int)warePalletWidth*(int)warePalletHeight);
        return calculateWarehouseCapacity()/(double)numberOfTotalPallet;
    }
}
