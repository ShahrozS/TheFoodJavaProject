/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.io.*;
/**
 *
 * @author Business Network
 */
public class BURGERS extends javax.swing.JFrame{


    
    /**
     * Creates new form BURGERS
     */
    public BURGERS() {
        initComponents();
    }
  int sum;
    public BURGERS(int i ){
                initComponents();
        this.sum = i;
        
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AMERICANCB = new javax.swing.JCheckBox();
        MASHROOMCB = new javax.swing.JCheckBox();
        STEAKCB = new javax.swing.JCheckBox();
        SPECIALCB = new javax.swing.JCheckBox();
        ACCEPTBTN = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 222, 173));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/burger.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("CHOOSE YOUR BURGERS:");

        AMERICANCB.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        AMERICANCB.setText("AMERICAN CHEESE BURGER          400rs.");
        AMERICANCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMERICANCBActionPerformed(evt);
            }
        });

        MASHROOMCB.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        MASHROOMCB.setText("MASHROOM SAUCE BURGER        400rs.");
        MASHROOMCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASHROOMCBActionPerformed(evt);
            }
        });

        STEAKCB.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        STEAKCB.setText("CHICKEN STEAK BURGER               450rs.");
        STEAKCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STEAKCBActionPerformed(evt);
            }
        });

        SPECIALCB.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        SPECIALCB.setText("THE FOOD SPECIAL BURGER         550rs.");
        SPECIALCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPECIALCBActionPerformed(evt);
            }
        });

        ACCEPTBTN.setBackground(new java.awt.Color(255, 235, 205));
        ACCEPTBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ACCEPTBTN.setText("ACCEPT");
        ACCEPTBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCEPTBTNActionPerformed(evt);
            }
        });

        BACKBTN.setBackground(new java.awt.Color(255, 235, 205));
        BACKBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        BACKBTN.setText("BACK");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ACCEPTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BACKBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(STEAKCB)
                                .addComponent(MASHROOMCB)
                                .addComponent(AMERICANCB)
                                .addComponent(SPECIALCB)))
                        .addContainerGap(57, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(AMERICANCB)
                .addGap(18, 18, 18)
                .addComponent(MASHROOMCB)
                .addGap(18, 18, 18)
                .addComponent(STEAKCB)
                .addGap(18, 18, 18)
                .addComponent(SPECIALCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACKBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACCEPTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AMERICANCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMERICANCBActionPerformed
            // TODO add your handling code here:
            
            
            
    }//GEN-LAST:event_AMERICANCBActionPerformed

    private void MASHROOMCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASHROOMCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MASHROOMCBActionPerformed

    private void STEAKCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STEAKCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STEAKCBActionPerformed

    private void SPECIALCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPECIALCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPECIALCBActionPerformed

    private void ACCEPTBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCEPTBTNActionPerformed


                PrintWriter pw = null;
        try {
            FileOutputStream file = new FileOutputStream("Bill.txt", true);
     pw = new PrintWriter(file);
    
            
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
         

        
if(STEAKCB.isSelected()){
//      
//      BILLING b1 = new BILLING();
//      
//      DefaultTableModel model = (DefaultTableModel) b1.tablebill.getModel();
pw.println("Chicken Steak Burger / 450rs");sum = sum + 450;
    

   
}
if(MASHROOMCB.isSelected()){
 pw.println("Mushroom Burger / 400rs");sum = sum +400;
       
}
if(AMERICANCB.isSelected()){
 pw.println("American Cheese Burger / 400rs");sum = sum + 400;
}
if(SPECIALCB.isSelected()){
     pw.println("The Food Special Burger / 500rs");sum = sum + 500;
}
//
//Food_Types f1 = new Food_Types();
//f1.setVisible(true);
//this.setVisible(false);

pw.close();
this.setVisible(false);
Food_Types f1 = new Food_Types();
f1.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_ACCEPTBTNActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Food_Types f1 = new Food_Types();
        f1.setVisible(true);
    }//GEN-LAST:event_BACKBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BURGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BURGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BURGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BURGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BURGERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACCEPTBTN;
    private javax.swing.JCheckBox AMERICANCB;
    private javax.swing.JButton BACKBTN;
    private javax.swing.JCheckBox MASHROOMCB;
    private javax.swing.JCheckBox SPECIALCB;
    private javax.swing.JCheckBox STEAKCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
