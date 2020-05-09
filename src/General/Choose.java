/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import RollsRoyce.*;
import aventador.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import mclaren.home1;

/**
 *
 * @author GAMER
 */
public class Choose extends javax.swing.JFrame {

    /**
     * Creates new form Choose
     */
    public Choose() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("logo2.jpg")).getImage());
        new Thread()
        {
            public void run()
            {
            while(true)
            {
              Calendar call = new GregorianCalendar();
              DecimalFormat fmt = new DecimalFormat("00");
              
              int hour =call.get(Calendar.HOUR);
              int min =call.get(Calendar.MINUTE);
              int sec =call.get(Calendar.SECOND);
              int Am_Pm =call.get(Calendar.AM_PM);
              String A_P="";
              if(Am_Pm == 1){
             A_P ="PM";
              }
              else{
              A_P ="AM";
              }
              String time =fmt.format(hour)+":"+fmt.format(min)+":"+fmt.format(sec)+" "+A_P;
              
              clock.setText(time);
            }    
            
            }
        }.start();
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
        clock = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        choose2 = new javax.swing.JButton();
        choose1 = new javax.swing.JButton();
        choose3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 643));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clock.setFont(new java.awt.Font("DS-Digital", 0, 58)); // NOI18N
        clock.setForeground(new java.awt.Color(0, 165, 255));
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 370, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 370, 80));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Change Account");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        choose2.setContentAreaFilled(false);
        choose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choose2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choose2MouseExited(evt);
            }
        });
        choose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose2ActionPerformed(evt);
            }
        });
        jPanel1.add(choose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 360, 360));

        choose1.setContentAreaFilled(false);
        choose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choose1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choose1MouseExited(evt);
            }
        });
        choose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose1ActionPerformed(evt);
            }
        });
        jPanel1.add(choose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 360, 360));

        choose3.setContentAreaFilled(false);
        choose3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choose3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choose3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choose3MouseExited(evt);
            }
        });
        choose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose3ActionPerformed(evt);
            }
        });
        jPanel1.add(choose3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 370, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/head.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1270, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Choosepic.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1840, 860));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 840));

        setSize(new java.awt.Dimension(1318, 786));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void choose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose2ActionPerformed
 
    home frm2 = new home();
    frm2.setVisible(true);
    this.setVisible(false);
      
    }//GEN-LAST:event_choose2ActionPerformed

    private void choose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose1ActionPerformed
     this.setVisible(false);
     home1 frm2=new home1();
    frm2.setVisible(true);
    
     
    }//GEN-LAST:event_choose1ActionPerformed

    private void choose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose3ActionPerformed
 home2 frm1 = new home2();
 this.setVisible(false);
 frm1.setVisible(true);
    }//GEN-LAST:event_choose3ActionPerformed

    private void choose1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose1MouseEntered
ImageIcon A = new ImageIcon(getClass().getResource("/images/choosemc_4.jpg"));
        choose1.setIcon(A);
    }//GEN-LAST:event_choose1MouseEntered

    private void choose1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose1MouseExited
choose1.setIcon(null);
    }//GEN-LAST:event_choose1MouseExited

    private void choose2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose2MouseEntered
   ImageIcon A = new ImageIcon(getClass().getResource("/images/chooseLam.jpg"));
        choose2.setIcon(A);
    }//GEN-LAST:event_choose2MouseEntered

    private void choose2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose2MouseExited
 choose2.setIcon(null);
    }//GEN-LAST:event_choose2MouseExited

    private void choose3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose3MouseEntered
    ImageIcon A = new ImageIcon(getClass().getResource("/images/chooseRoll.jpg"));
        choose3.setIcon(A);
    }//GEN-LAST:event_choose3MouseEntered

    private void choose3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose3MouseExited
 choose3.setIcon(null);
    }//GEN-LAST:event_choose3MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
LogIn frm1 = new LogIn();
frm1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          
             public void run() {  
                 
                new Choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choose1;
    private javax.swing.JButton choose2;
    private javax.swing.JButton choose3;
    private javax.swing.JLabel clock;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
