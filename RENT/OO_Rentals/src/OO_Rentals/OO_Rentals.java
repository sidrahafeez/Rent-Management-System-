/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Rentals;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.text.*;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import javax.swing.JTextArea;
/**
 *
 * @author HP
 */
public class OO_Rentals extends javax.swing.JFrame {
    private Object jtxtCost;
    private Object jrtReceipt;
    private Object jtextCost;

    /**
     * Creates new form OO_Rentals
     */
    public OO_Rentals() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtSurName = new javax.swing.JTextField();
        jtxtTown = new javax.swing.JTextField();
        jtxtFirstName = new javax.swing.JTextField();
        jtxtDownPayment = new javax.swing.JTextField();
        jtxtPostCode = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtDeposit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtCustomerID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextCost = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtTotalPayment = new javax.swing.JTextField();
        jtxtLocalTax = new javax.swing.JTextField();
        jtxtWaterBill = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtElectricity = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jLabel1.setText("Rent Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 1188, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1310, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Town");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("FirstName");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("PostCode");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("SurName");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Down Payment");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Deposit");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));
        jPanel2.add(jtxtSurName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, 30));
        jPanel2.add(jtxtTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 100, 30));
        jPanel2.add(jtxtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 110, 30));
        jPanel2.add(jtxtDownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 90, 30));
        jPanel2.add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 100, 30));
        jPanel2.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 110, 30));
        jPanel2.add(jtxtDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Prove Of ID");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 230, -1));

        jtxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCustomerIDActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Customer ID");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Driving Licence", "Student ID", "Passport" }));
        jComboBox2.setBorder(null);
        jComboBox2.setKeySelectionManager(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("Customer Details");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 840, 280));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("No Of Rooms");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostActionPerformed(evt);
            }
        });
        jPanel3.add(jTextCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Cost");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Location");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBox1.setBorder(null);
        jComboBox1.setKeySelectionManager(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 30));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Karachi", "Lahore", "Islamabad" }));
        jComboBox3.setBorder(null);
        jComboBox3.setKeySelectionManager(null);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Rental Details");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, -1));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton1.setText("House");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton2.setText("Flat");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 410, 280));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtReceipt.setColumns(20);
        jtxtReceipt.setRows(5);
        jScrollPane1.setViewportView(jtxtReceipt);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 410, 420));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 460, 460));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Utility Bills");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Total Payment");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Electricity");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Water Bill");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jtxtTotalPayment.setToolTipText("");
        jtxtTotalPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalPaymentActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 150, 30));

        jtxtLocalTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLocalTaxActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtLocalTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 30));

        jtxtWaterBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtWaterBillActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtWaterBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Local Tax");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jtxtElectricity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtElectricityActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtElectricity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 150, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 410, 280));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 90, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Rental");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Reset");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 30, 90, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Print");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 30, 90, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 460, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalPaymentActionPerformed

    private void jtxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCustomerIDActionPerformed

    private void jTextCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostActionPerformed

    private void jtxtLocalTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLocalTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLocalTaxActionPerformed

    private void jtxtWaterBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtWaterBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtWaterBillActionPerformed

    private void jtxtElectricityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtElectricityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtElectricityActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JTextField cleartext= null;
       for (Component c:jPanel2.getComponents()){
           if (c.getClass().toString().contains("javax.swing.JTextField")){
               cleartext =(JTextField)c;
               cleartext.setText("");
               jTextCost.setText("");
               jtxtReceipt.setText("");
               
           }
       }
          
       
       for (Component c:jPanel6.getComponents()){
           if (c.getClass().toString().contains("javax.swing.JTextField")){
               cleartext =(JTextField)c;
               cleartext.setText("");
           }
       }
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed
private JFrame frame;
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          frame = new JFrame ("Exit");
          if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Rent Management System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
              System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        cCustomer iCustomer = new cCustomer();
        cRental iRental = new cRental();
        cUtilities iUtilities = new cUtilities();
        
        double iCustDeposit, iCustPayment, icost, inumberofroom, ilocalTax, iwaterBill, ielectricity;
       String strCost;
       
       iCustDeposit = Double.parseDouble(jtxtDeposit.getText());
       iCustPayment = Double.parseDouble(jtxtDownPayment.getText());
       icost=Double.parseDouble(jTextCost.getText());
       ielectricity=Double.parseDouble(jtxtElectricity.getText());
       iwaterBill=Double.parseDouble(jtxtWaterBill.getText());
       ilocalTax=Double.parseDouble(jtxtLocalTax.getText());
       
       
       
       iCustomer.setDeposit(iCustDeposit);
       iCustomer.setDownPayment(iCustPayment);
       iRental.setcost(icost);
       iUtilities.setelectricity(ielectricity);
       iUtilities.setlocaltax(ilocalTax);
       iUtilities.setwaterbill(iwaterBill);
       
       
       strCost = String.format("??%.2f", iCustomer.getDeposit() + iCustomer.getDownPayment() + iRental.getcost() + iUtilities.getelectricity()+ 
               iUtilities.getlocaltax() + iUtilities.getwaterbill());
       jtxtTotalPayment.setText(strCost);
       
       jtxtReceipt.append("\tRent Management System" + "\n" +
       "----------------------------------------------------------------------" + "\n");
       jtxtReceipt.append("Customer ID" + "\t\t\t" + jtxtCustomerID.getText() + "\n");
       jtxtReceipt.append("FirstName" + "\t\t\t" + jtxtFirstName.getText() + "\n");
       jtxtReceipt.append("SurName" + "\t\t\t" + jtxtSurName.getText() + "\n");
       jtxtReceipt.append("Address" + "\t\t\t" + jtxtAddress.getText() + "\n");
       jtxtReceipt.append("Post Code" + "\t\t\t" + jtxtPostCode.getText() + "\n");
       jtxtReceipt.append("Prove of ID" + "\t\t\t" + jComboBox2.getSelectedItem() + "\n");
       jtxtReceipt.append("Town" + "\t\t\t" + jtxtTown.getText() + "\n");
       jtxtReceipt.append("--------------------------------------------------------------------------" + "\n");
       jtxtReceipt.append("Deposite" + "\t\t\t" + jtxtDeposit.getText() + "\n");
       jtxtReceipt.append("Down Payment" + "\t\t\t" + jtxtDownPayment.getText() + "\n");
       jtxtReceipt.append("No of Room" + "\t\t\t" + jComboBox1.getSelectedItem() + "\n");
       
       jtxtReceipt.append("Electricity" + "\t\t\t" + jtxtElectricity.getText() + "\n");
       jtxtReceipt.append("Local Tax" + "\t\t\t" + jtxtLocalTax.getText() + "\n");
       jtxtReceipt.append("Water Bill" + "\t\t\t" + jtxtWaterBill.getText() + "\n");
       jtxtReceipt.append("--------------------------------------------------------------------------" + "\n");
       jtxtReceipt.append("Total Payment" + "\t\t\t" + jtxtTotalPayment.getText() + "\n");
       jtxtReceipt.append("--------------------------------------------------------------------------" + "\n");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try{
            jtxtReceipt.print();
        } catch (PrinterException ex){
            Logger.getLogger(OO_Rentals.class.getName()).log(Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(OO_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OO_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OO_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OO_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OO_Rentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCost;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCustomerID;
    private javax.swing.JTextField jtxtDeposit;
    private javax.swing.JTextField jtxtDownPayment;
    private javax.swing.JTextField jtxtElectricity;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtLocalTax;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JTextField jtxtSurName;
    private javax.swing.JTextField jtxtTotalPayment;
    private javax.swing.JTextField jtxtTown;
    private javax.swing.JTextField jtxtWaterBill;
    // End of variables declaration//GEN-END:variables
}
