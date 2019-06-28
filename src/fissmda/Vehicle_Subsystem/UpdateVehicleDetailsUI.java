/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fissmda.Vehicle_Subsystem;

import fissmda.Vehicle_Subsystem.DBConnection;
import fissmda.MainUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MaC BrAvO
 */
public class UpdateVehicleDetailsUI extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    /**
     * Creates new form UpdateVehicleDetailsUI
     */
    public UpdateVehicleDetailsUI() {
        initComponents();
        
                
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        try {
            //create objects
            connection = DBConnection.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                fillVehicleCombobox2();
                loadVehicleTable();
    }
    
    public void fillVehicleCombobox2()
    {
        try {
            String q5 = "SELECT * FROM vehicle";
            ps = connection.prepareStatement(q5);
            rs = ps.executeQuery(q5);
            
            //remove all available items 
            combobox2.removeAllItems();
            combobox2.addItem("Select Vehicle");
            
            while(rs.next()){
                
                combobox2.addItem(rs.getString("vehicle_number") );
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RemoveVehicleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public int getVehicleId(String vehicle_number)
    {
        int vehicleId = 0;
        
        String vID = "SELECT vID FROM vehicle WHERE vehicle_number = ?";
        
        try
        {
            ps = connection.prepareStatement(vID);
            ps.setString(1, vehicle_number);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                vehicleId = (int) rs.getInt("vID");
            }
            return vehicleId;
        }
        
        catch (SQLException ex) {
            Logger.getLogger(RemoveVehicleUI.class.getName()).log(Level.SEVERE, null, ex);
            return vehicleId;
        }
        
    }
    
    public void loadVehicleTable()
    {
        try {
            String q4 = "SELECT vehicle_number as 'Vehicle Number', model as 'Model', type as 'Type',brand as 'Brand' , model_year as 'Model Year' ,  fuel_type as 'Fuel Type' FROM vehicle";
            ps = connection.prepareStatement(q4);
            rs = ps.executeQuery();
            
            updatetable.setModel(DbUtils.resultSetToTableModel(rs));
            
            //change row height
            updatetable.setRowHeight(30);
            
            //change column width of column two
            TableColumnModel columnModel = updatetable.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(500);
            columnModel.getColumn(1).setPreferredWidth(500);
            columnModel.getColumn(2).setPreferredWidth(500);
            columnModel.getColumn(3).setPreferredWidth(500);
            columnModel.getColumn(4).setPreferredWidth(500);
            columnModel.getColumn(5).setPreferredWidth(500);
            
        } catch (SQLException ex) {
            Logger.getLogger(RemoveVehicleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean isInt (String year1)
    {
        try
        {
            Integer.parseInt(year1);
        }
        catch(NumberFormatException e)
            
        {
            return false;
        }
        catch(NullPointerException e)
        {
            return false;
        }
        return true;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PannelLeft = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        combobox2 = new javax.swing.JComboBox<>();
        modelupdate = new javax.swing.JTextField();
        typeupdate = new javax.swing.JTextField();
        yearupdate = new javax.swing.JTextField();
        fueltypeupdate = new javax.swing.JTextField();
        brandupdate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backbutton7 = new javax.swing.JButton();
        backbutton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updatetable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1276, 815));

        PannelLeft.setBackground(new java.awt.Color(137, 229, 45));

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/greenBack.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/greenHome.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 91));
        jPanel2.setPreferredSize(new java.awt.Dimension(1276, 815));

        combobox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle" }));
        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });

        modelupdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        modelupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelupdateActionPerformed(evt);
            }
        });

        typeupdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        typeupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeupdateActionPerformed(evt);
            }
        });

        yearupdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        fueltypeupdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        brandupdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        brandupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandupdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vehicle Model");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vehicle Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vehicle Year");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vehicle Fuel Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vehicle Brand");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Select Vehicle to be Updated :");

        backbutton7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        backbutton7.setText("CANCEL");
        backbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton7ActionPerformed(evt);
            }
        });

        backbutton8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        backbutton8.setText("UPDATE");
        backbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton8ActionPerformed(evt);
            }
        });

        updatetable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        updatetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(updatetable);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/updateVehicle_title.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fueltypeupdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(yearupdate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(typeupdate)
                                .addComponent(brandupdate))
                            .addComponent(modelupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(backbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modelupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yearupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fueltypeupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(brandupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbutton8)
                    .addComponent(backbutton7))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/CompanyLogoSmall(new).png"))); // NOI18N

        javax.swing.GroupLayout PannelLeftLayout = new javax.swing.GroupLayout(PannelLeft);
        PannelLeft.setLayout(PannelLeftLayout);
        PannelLeftLayout.setHorizontalGroup(
            PannelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PannelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PannelLeftLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelLeftLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addGroup(PannelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(PannelLeftLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addContainerGap())
        );
        PannelLeftLayout.setVerticalGroup(
            PannelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelLeftLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PannelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PannelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PannelLeftLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(103, 103, 103)))
                    .addGroup(PannelLeftLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PannelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(952, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PannelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modelupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelupdateActionPerformed

    private void typeupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeupdateActionPerformed

    private void brandupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandupdateActionPerformed

    private void backbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton7ActionPerformed
        
        VehicleUI ui8 = new VehicleUI();
        ui8.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbutton7ActionPerformed

    private void backbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton8ActionPerformed
        
        String modelUpdates = modelupdate.getText().toString();
        String typeUpdates = typeupdate.getText().toString();
        String fueltypeUpdates = fueltypeupdate.getText().toString();
        String brandUpdates = brandupdate.getText().toString();
        String yearUpdates = yearupdate.getText().toString();
        String getVehicleText = combobox2.getSelectedItem().toString();
        
        int year1;
        if(getVehicleText.equals("Select Vehicle"))
        {
            JOptionPane.showMessageDialog(null,"Please select a Vehicle to Update");
        }
        else if(modelUpdates.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Vehicle Model Can not be Empty");
        }
        else if(typeUpdates.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Vehicle Type Can not be Empty");
        }
        else if(fueltypeUpdates.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Vehicle Fuel Type Can not be Empty");
        }
        else if(brandUpdates.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Vehicle brand Can not be Empty");
        }
        else if(!isInt(yearUpdates))
        
        {
            JOptionPane.showMessageDialog(null,"Year Should be Integer Value. Please Enter Valid Value");
            yearupdate.setText(null);
        }
        else
        {
            int vehicleId = getVehicleId(getVehicleText);
            String query = "UPDATE vehicle SET model=? , type=? , brand=? , model_year=? , fuel_type=?  WHERE vID=?";
            
            try
            {
                year1 = Integer.parseInt(yearUpdates);
                ps = connection.prepareStatement(query);
                
             
                ps.setString(1, modelUpdates);
              
                ps.setString(2, typeUpdates);
                
                ps.setString(3, brandUpdates);
                ps.setString(4, yearUpdates);
                
                ps.setString(5, fueltypeUpdates);
                ps.setInt(6, vehicleId);
                
                ps.executeUpdate();
                
                //Clear Fields
                yearupdate.setText(null);
                modelupdate.setText(null);
                typeupdate.setText(null);
                brandupdate.setText(null);
                fueltypeupdate.setText(null);
                
                
                JOptionPane.showMessageDialog(null,"Update Successful");
                
                
                loadVehicleTable();
                fillVehicleCombobox2();
            }
            catch (SQLException ex) {
                Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }
    }//GEN-LAST:event_backbutton8ActionPerformed

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void updatetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatetableMouseClicked
       int selectedrow = updatetable.getSelectedRow();
       
       String VehicleNumber = updatetable.getValueAt(selectedrow, 0).toString();
       String Model = updatetable.getValueAt(selectedrow, 1).toString();
       String Type = updatetable.getValueAt(selectedrow, 2).toString();
       String Year = updatetable.getValueAt(selectedrow, 4).toString();
       String Fuel = updatetable.getValueAt(selectedrow, 5).toString();
       String Brand = updatetable.getValueAt(selectedrow, 3).toString();
       
       combobox2.setSelectedItem(VehicleNumber);
       modelupdate.setText(Model);
       typeupdate.setText(Type);
       yearupdate.setText(Year);
       fueltypeupdate.setText(Fuel);
       brandupdate.setText(Brand);
    }//GEN-LAST:event_updatetableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VehicleUI ui = new VehicleUI();
        ui.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainUI ui = new MainUI();
        ui.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateVehicleDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateVehicleDetailsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelLeft;
    private javax.swing.JButton backbutton7;
    private javax.swing.JButton backbutton8;
    private javax.swing.JTextField brandupdate;
    private javax.swing.JComboBox<String> combobox2;
    private javax.swing.JTextField fueltypeupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelupdate;
    private javax.swing.JTextField typeupdate;
    private javax.swing.JTable updatetable;
    private javax.swing.JTextField yearupdate;
    // End of variables declaration//GEN-END:variables
}