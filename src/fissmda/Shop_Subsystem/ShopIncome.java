/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fissmda.Shop_Subsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Binali Jayawindi
 */
public class ShopIncome extends javax.swing.JFrame {

    /**
     * Creates new form ShopIncome
     */
    public ShopIncome() throws SQLException {
        
        initComponents();
        Show_Income_In_JTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totDSAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totRSAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        additionalDSAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totAmount = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        incomeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1276, 815));
        setMinimumSize(new java.awt.Dimension(1276, 815));
        setPreferredSize(new java.awt.Dimension(1276, 815));

        jPanel1.setBackground(new java.awt.Color(153, 153, 91));
        jPanel1.setMaximumSize(new java.awt.Dimension(1276, 815));
        jPanel1.setMinimumSize(new java.awt.Dimension(1276, 815));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Shop ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Total Delivered Stock Amount");

        totDSAmount.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Total Returned Stock Amount");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Additional Delivered Stock Amount ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Total Amount");

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        calculate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Paid Date");

        incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Shop ID", "Total Amount", "Date"
            }
        ));
        jScrollPane1.setViewportView(incomeTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SHOP INCOME");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Demo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/backB.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(totDSAmount)
                                .addComponent(totRSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(additionalDSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(429, 429, 429)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totDSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totRSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(additionalDSAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

            // TODO add your handling code here:
            if(((sID.getText() == null) || (totDSAmount.getText() == null) || (totRSAmount.getText() == null) || (additionalDSAmount.getText() == null) || (date.getDate() ==null )) == true){
            JOptionPane.showMessageDialog(this, "You have to fill all the fields");
            return;
            }
            else{
            int shopID = Integer.parseInt(sID.getText());
            float deliveredAmount = Float.parseFloat(totDSAmount.getText());
            float returnedAmount = Float.parseFloat(totRSAmount.getText());
            float additionalAmount = Float.parseFloat(additionalDSAmount.getText());
            java.sql.Date paidDate = new java.sql.Date(date.getDate().getTime());            
            
           
            
            
            float totalValue = Float.parseFloat(totAmount.getText());
         try { 
             
            Connection con = DBConnection.getConnection();
            String sql1 = "INSERT INTO shop_income(iDate, sID, deliveredAmount, returnedAmount, additionalAmount, totalAmount) VALUES('"+paidDate+"','"+shopID+"', '"+deliveredAmount+"', '"+returnedAmount+"','"+additionalAmount+"', '"+totalValue+"')";
            PreparedStatement ps = con.prepareStatement(sql1);
            
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure to Add this details to the system");
               if(dialogResult == JOptionPane.YES_OPTION){
                   ps.execute();
                   JOptionPane.showMessageDialog(this, "New Income added to the system successfully");
//                   ViewAllShops vas = new ViewAllShops();
                     Show_Income_In_JTable();



               }else{
                   return;
               }
        
// 
        } catch (SQLException ex) {
            Logger.getLogger(ShopIncome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        if(((sID.getText() == null) || (totDSAmount.getText() == null) || (totRSAmount.getText() == null) || (additionalDSAmount.getText() == null) || (date.getDate() ==null )) == true){
            JOptionPane.showMessageDialog(this, "More Empty Fields");
            return;
        }
        else{
        float totalAmount = 0;
        int shopID = Integer.parseInt(sID.getText());
        float deliveredAmount = Float.parseFloat(totDSAmount.getText());
        float returnedAmount = Float.parseFloat(totRSAmount.getText());
        float additionalAmount = Float.parseFloat(additionalDSAmount.getText());
        java.sql.Date paidDate = new java.sql.Date(date.getDate().getTime());        
        
        if(sID.equals("")){   
                JOptionPane.showMessageDialog(this, "Shop ID Field Cannot be Empty");
                return;
            }
            
            if((totDSAmount.equals("")) || (deliveredAmount < 0)){
                JOptionPane.showMessageDialog(this, "Delivered amount should be a postive value");   
                return;
            }
            
            if((totRSAmount.equals("")) || (returnedAmount < 0)){
                JOptionPane.showMessageDialog(this, "Returned amount should be a positive value");   
                return;
            }
            
            if(deliveredAmount < returnedAmount){
                JOptionPane.showMessageDialog(this, "Returned stock amount should be less than delivered stock amount");   
                return;
            }
            
            if((additionalDSAmount.equals("")) || (additionalAmount < 0)){
                JOptionPane.showMessageDialog(this, "Additional Delivered amount should be a postive value");   
                return;
            }
            
            if(date.equals("")){
                JOptionPane.showMessageDialog(this, "Please choose the paid date");   
                return;
            }

        
        totalAmount = deliveredAmount - returnedAmount + additionalAmount;
        
        String totalValue = Float.toString(totalAmount);
        totAmount.setText(totalValue);
        
        
        
        }   
        
    }//GEN-LAST:event_calculateActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        sID.setText(null);
        totAmount.setText(null);
        totDSAmount.setText(null);
        totRSAmount.setText(null);
        additionalDSAmount.setText(null);
        date.setDate(null);
        
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sID.setText("60");
        totDSAmount.setText("15000");
        totRSAmount.setText("2000");
        additionalDSAmount.setText("2000");
        String date1 = "Sep 5, 2018";
        java.util.Date date2;
        try {
            date2 = new SimpleDateFormat("MMM d, yyyy").parse(date1);
             date.setDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(AddShopUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        ShopUI s = new ShopUI();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        s.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        s.setVisible(true);
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
            java.util.logging.Logger.getLogger(ShopIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShopIncome().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ShopIncome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
     public ArrayList<Shop_Income> viewIncomeList() throws SQLException{
        ArrayList<Shop_Income> incomeList = new ArrayList<Shop_Income>();
        Connection con = DBConnection.getConnection();
        String query1 = "SELECT sID,totalAmount,iDate FROM shop_income";
        //String query2 = "SELECT phone FROM shop_phone sp, shop s WHERE s.sID = sp.sID,";
        
        Statement st;
        ResultSet rs;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(query1);
           // rs = st.executeQuery(query2);
            Shop_Income shop_income;
            
            while(rs.next()){
                shop_income = new Shop_Income(rs.getInt("sID"),rs.getFloat("totalAmount"),rs.getString("iDate"));
                incomeList.add(shop_income);
            }
        }catch(SQLException e){
            Logger.getLogger(ViewAllShops.class.getName()).log(Level.SEVERE, null, e);

        }
        
        return incomeList;
    }
     
       public void Show_Income_In_JTable() throws SQLException
    {
        ArrayList<Shop_Income> list = viewIncomeList();
        DefaultTableModel model = (DefaultTableModel)incomeTable.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] column = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            column[0] = list.get(i).getSID();
            column[1] = list.get(i).getTotalAmount();
            column[2] = list.get(i).getDate();

            
            model.addRow(column);
        }
    }
       public boolean isEmpty(){
          
           return false;
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField additionalDSAmount;
    private javax.swing.JButton calculate;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTable incomeTable;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sID;
    private javax.swing.JTextField totAmount;
    private javax.swing.JTextField totDSAmount;
    private javax.swing.JTextField totRSAmount;
    // End of variables declaration//GEN-END:variables
}
