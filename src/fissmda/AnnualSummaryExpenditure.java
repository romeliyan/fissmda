/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fissmda;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Romesh
 */
public class AnnualSummaryExpenditure extends javax.swing.JFrame {

    
    Connection con = null;
    
    PreparedStatement pste1 = null; 
    ResultSet rse1 = null;
    
    PreparedStatement pste2 = null; 
    ResultSet rse2 = null;
    
    PreparedStatement pste3 = null; 
    ResultSet rse3 = null;
    
    PreparedStatement pste4 = null; 
    ResultSet rse4 = null;
    
    PreparedStatement pste1w = null; 
    ResultSet rse1w = null;
    
    PreparedStatement pste2w = null; 
    ResultSet rse2w = null;
    
    PreparedStatement pste3w = null; 
    ResultSet rse3w = null;
    
    PreparedStatement pste4w = null; 
    ResultSet rse4w = null;
    
    
    /**
     * Creates new form AnnualSummaryExpenditure
     */
    public AnnualSummaryExpenditure() {
        initComponents();
        
        con = DBConnection.connect();
        
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
        pnl5 = new javax.swing.JPanel();
        but1 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mlab = new javax.swing.JLabel();
        vlab = new javax.swing.JLabel();
        wlab = new javax.swing.JLabel();
        slab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 91));
        jPanel1.setMaximumSize(new java.awt.Dimension(1276, 815));
        jPanel1.setMinimumSize(new java.awt.Dimension(1276, 815));
        jPanel1.setPreferredSize(new java.awt.Dimension(1276, 815));

        pnl5.setBackground(new java.awt.Color(187, 224, 103));
        pnl5.setLayout(new javax.swing.BoxLayout(pnl5, javax.swing.BoxLayout.LINE_AXIS));

        but1.setBackground(new java.awt.Color(204, 245, 75));
        but1.setText("Show");
        but1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        combo1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2017", "2018" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Compare Annual Expenditure of the Agency ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/homeB.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/backB.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fissmda/ButtonImages/ae.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Manufacturer");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Vehicle");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Warehouses");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Salaries");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Value");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Expenditure");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Type");

        jLabel10.setText("( Right click on the bar chart to see properties [ zoom in | zoom out | print | save as photo ] )");

        comBut.setBackground(new java.awt.Color(240, 242, 114));
        comBut.setText("Compare");
        comBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(comBut, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(67, 67, 67)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vlab, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(mlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(slab, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(wlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(24, 24, 24))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(pnl5, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comBut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(pnl5, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mlab))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vlab))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wlab))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slab))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        
        
        try{
                String sqle1 = "SELECT SUM(amount) As manuw FROM payment WHERE paidDate >= '2017/01/01' and paidDate <= '2017/12/31' ";
                 pste1 = con.prepareStatement(sqle1);
                 rse1 = pste1.executeQuery(); 
                // System.out.println(month);
        
                 if(rse1.next()){
        
                         String tt = rse1.getString("manuw");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se1 = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se1 = tot;
                         }
                     }
            
              }catch(SQLException e){
        
            
        }
        
        try{
                String sqle2 = "SELECT SUM(amount) As vehicle FROM vehicle_log WHERE paidDate >= '2017/01/01' and paidDate <= '2017/12/31' ";
                 pste2 = con.prepareStatement(sqle2);
                 rse2 = pste2.executeQuery(); 
                // System.out.println(month);
        
                 if(rse2.next()){
        
                         String tt = rse2.getString("vehicle");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se2 = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se2 = tot;
                         }
                     }
            
              }catch(SQLException e){
        
              }
        
        try{
                String sqle3 = "SELECT SUM(amount) As warehouse FROM expenditure WHERE paidDate >= '2017/01/01' and paidDate <= '2017/12/31' ";
                 pste3 = con.prepareStatement(sqle3);
                 rse3 = pste3.executeQuery(); 
                // System.out.println(month);
        
                 if(rse3.next()){
        
                         String tt = rse3.getString("warehouse");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se3 = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se3 = tot;
                         }
                     }
            
              }catch(SQLException e){
        
              }
        
        try{
                String sqle4 = "SELECT SUM(salary) As sala FROM payroll WHERE paidDate >= '2017/01/01' and paidDate <= '2017/12/31' ";
                 pste4 = con.prepareStatement(sqle4);
                 rse4 = pste4.executeQuery(); 
                // System.out.println(month);
        
                 if(rse4.next()){
        
                         String tt = rse4.getString("sala");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se4 = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se4 = tot;
                         }
                     }
            
              }catch(SQLException e){
        
              }
        
        //*******************************************2018********************************
        
        try{
                String sqle1w = "SELECT SUM(amount) As manuw FROM payment WHERE paidDate >= '2018/01/01' and paidDate <= '2018/12/31' ";
                 pste1w = con.prepareStatement(sqle1w);
                 rse1w = pste1w.executeQuery(); 
                // System.out.println(month);
        
                 if(rse1w.next()){
        
                         String tt = rse1w.getString("manuw");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se1w = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se1w = tot;
                         }
                     }
            
              }catch(SQLException e){
        
            
        }
        
        try{
                String sqle2w = "SELECT SUM(amount) As vehiclew FROM vehicle_log WHERE paidDate >= '2018/01/01' and paidDate <= '2018/12/31' ";
                 pste2w = con.prepareStatement(sqle2w);
                 rse2w = pste2w.executeQuery(); 
                // System.out.println(month);
        
                 if(rse2w.next()){
        
                         String tt = rse2w.getString("vehiclew");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se2w = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se2w = tot;
                         }
                     }
            
              }catch(SQLException e){
        
              }
        
        try{
                String sqle3w = "SELECT SUM(amount) As warehousew FROM expenditure WHERE paidDate >= '2018/01/01' and paidDate <= '2018/12/31' ";
                 pste3w = con.prepareStatement(sqle3w);
                 rse3w = pste3w.executeQuery(); 
                // System.out.println(month);
        
                 if(rse3w.next()){
        
                         String tt = rse3w.getString("warehousew");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se3w = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se3w = tot;
                         }
                     }
            
              }catch(SQLException e){
        
              }
        
        try{
                String sqle4w = "SELECT SUM(salary) As salaw FROM payroll WHERE paidDate >= '2018/01/01' and paidDate <= '2018/12/31' ";
                 pste4w = con.prepareStatement(sqle4w);
                 rse4w = pste4w.executeQuery(); 
                // System.out.println(month);
        
                 if(rse4w.next()){
        
                         String tt = rse4w.getString("salaw");
                         System.out.println(tt);
            
                         if(tt == null){
            
                             se4w = 0;
                         }
                          else if(tt != null){
                             Double tot = Double.parseDouble(tt);
            
                             se4w = tot;
                         }
                     }
            
              }catch(SQLException e){
        
              }
        
        //*****************print***************************
        
      
        
        DefaultCategoryDataset dcd5 = new DefaultCategoryDataset();
     
        String year = combo1.getSelectedItem().toString();
        
        
        if(year == "Select Year"){
        
             JOptionPane.showMessageDialog(null,"Please select Year.");
            
        }
        
        else if(year == "2017"){
            
        String v1 = String.valueOf(se1);
        String v2 = String.valueOf(se2);
        String v3 = String.valueOf(se3);
        String v4 = String.valueOf(se4);
        
        mlab.setText(v1);
        vlab.setText(v2);
        wlab.setText(v3);
        slab.setText(v4);
        
        
        dcd5.setValue(se1,"Expenditure","Manufacturer");
        dcd5.setValue(se2,"Expenditure","Vehicle");
        dcd5.setValue(se3,"Expenditure","Warehouse");
        dcd5.setValue(se4,"Expenditure","Salaries");
        
        
        JFreeChart jchart2 = ChartFactory.createBarChart("Annual Expenditure 2017", "Type", "Value Rs.", dcd5, PlotOrientation.VERTICAL, true , true, false);
        
        CategoryPlot plot2 = jchart2.getCategoryPlot();
      
        plot2.setBackgroundPaint(new Color(187, 224, 103));
        plot2.setRangeGridlinePaint(Color.black);
        
        ChartFrame chartFrm2 = new ChartFrame("Shop Income",jchart2,true);
        chartFrm2.setVisible(false);
        chartFrm2.setSize(500, 400);
        
        ChartPanel chartPanel2 = new ChartPanel(jchart2);
        
        pnl5.removeAll();
        pnl5.add(chartPanel2);
        pnl5.updateUI();
        
        }
        
        
        else if(year == "2018"){
            
        String k1 = String.valueOf(se1w);
        String k2 = String.valueOf(se2w);
        String k3 = String.valueOf(se3w);
        String k4 = String.valueOf(se4w);
        
        mlab.setText(k1);
        vlab.setText(k2);
        wlab.setText(k3);
        slab.setText(k4);    
            
        
        
        dcd5.setValue(se1w,"Expenditure","Manufacturer");
        dcd5.setValue(se2w,"Expenditure","Vehicle");
        dcd5.setValue(se3w,"Expenditure","Warehouse");
        dcd5.setValue(se4w,"Expenditure","Salaries");
        
        
        JFreeChart jchart2 = ChartFactory.createBarChart("Annual Expenditure 2018", "Type", "Value Rs.", dcd5, PlotOrientation.VERTICAL, true , true, false);
        
        CategoryPlot plot2 = jchart2.getCategoryPlot();
        
        plot2.getRenderer().setSeriesPaint(0, new Color(0, 128, 128));
      
        plot2.setBackgroundPaint(new Color(187, 224, 103));
        plot2.setRangeGridlinePaint(Color.black);
        
        ChartFrame chartFrm2 = new ChartFrame("Shop Income",jchart2,true);
        chartFrm2.setVisible(false);
        chartFrm2.setSize(500, 400);
        
        ChartPanel chartPanel2 = new ChartPanel(jchart2);
        
        pnl5.removeAll();
        pnl5.add(chartPanel2);
        pnl5.updateUI();
        
        
        
        }
        
        
        
        
    }//GEN-LAST:event_but1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //navigate to back
        AnnualSummaryType st1 = new AnnualSummaryType();
        st1.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        st1.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //navigate to mainUI
        MainUI mi1 = new MainUI();
        mi1.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mi1.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comButActionPerformed
        
         //navigate to compare
        CompareAnnualExpenditure c1 = new CompareAnnualExpenditure();
        c1.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        c1.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.dispose();
        
        
    }//GEN-LAST:event_comButActionPerformed

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
            java.util.logging.Logger.getLogger(AnnualSummaryExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnnualSummaryExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnnualSummaryExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnnualSummaryExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnnualSummaryExpenditure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton comBut;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mlab;
    private javax.swing.JPanel pnl5;
    private javax.swing.JLabel slab;
    private javax.swing.JLabel vlab;
    private javax.swing.JLabel wlab;
    // End of variables declaration//GEN-END:variables

    private double se1;
    private double se2;
    private double se3;
    private double se4;
    
    private double se1w;
    private double se2w;
    private double se3w;
    private double se4w;
    




}
