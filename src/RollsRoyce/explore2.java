/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RollsRoyce;

import mclaren.*;
import aventador.specs;
import aventador.home;
import AppPackage.AnimationClass;
import General.Choose;
import General.LaunchWeb;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author GAMER
 */
public class explore2 extends javax.swing.JFrame {

    /**
     * Creates new form explore
     */
    public explore2() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/General/logo2.jpg")).getImage());
    }
   LaunchWeb LW = new LaunchWeb();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        home2 = new javax.swing.JButton();
        spec1 = new javax.swing.JButton();
        tech1 = new javax.swing.JButton();
        gallery1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lside = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exp1 = new javax.swing.JLabel();
        exp2 = new javax.swing.JLabel();
        exp3 = new javax.swing.JLabel();
        exp4 = new javax.swing.JLabel();
        exp5 = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        rside = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1274, 800));
        setPreferredSize(new java.awt.Dimension(1288, 805));
        setResizable(false);
        getContentPane().setLayout(null);

        home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttfinal.gif"))); // NOI18N
        home2.setBorderPainted(false);
        home2.setContentAreaFilled(false);
        home2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home2MouseExited(evt);
            }
        });
        home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2ActionPerformed(evt);
            }
        });
        getContentPane().add(home2);
        home2.setBounds(450, 0, 100, 80);

        spec1.setBorderPainted(false);
        spec1.setContentAreaFilled(false);
        spec1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spec1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        spec1.setDoubleBuffered(true);
        spec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                spec1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                spec1MouseExited(evt);
            }
        });
        spec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spec1ActionPerformed(evt);
            }
        });
        getContentPane().add(spec1);
        spec1.setBounds(680, 0, 90, 80);

        tech1.setBorderPainted(false);
        tech1.setContentAreaFilled(false);
        tech1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tech1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tech1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tech1MouseExited(evt);
            }
        });
        tech1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tech1ActionPerformed(evt);
            }
        });
        getContentPane().add(tech1);
        tech1.setBounds(780, 0, 130, 80);

        gallery1.setBorderPainted(false);
        gallery1.setContentAreaFilled(false);
        gallery1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gallery1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gallery1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gallery1MouseExited(evt);
            }
        });
        gallery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gallery1ActionPerformed(evt);
            }
        });
        getContentPane().add(gallery1);
        gallery1.setBounds(920, 0, 100, 80);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(140, 690, 440, 80);

        next.setBackground(new java.awt.Color(0, 0, 0));
        next.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        next.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nextStateChanged(evt);
            }
        });
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(730, 690, 420, 80);

        home1.setBorderPainted(false);
        home1.setContentAreaFilled(false);
        home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        getContentPane().add(home1);
        home1.setBounds(450, 0, 110, 80);

        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1041, 1, 110, 70);

        lside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exprside.jpg"))); // NOI18N
        getContentPane().add(lside);
        lside.setBounds(0, 260, 140, 410);

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 0, 120, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rollsLine.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-40, 90, 1350, 100);
        getContentPane().add(exp1);
        exp1.setBounds(140, 260, 1010, 410);

        exp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exp2b.jpg"))); // NOI18N
        getContentPane().add(exp2);
        exp2.setBounds(140, 260, 1010, 410);

        exp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exp2c.jpg"))); // NOI18N
        getContentPane().add(exp3);
        exp3.setBounds(140, 260, 1010, 410);

        exp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exp2d.jpg"))); // NOI18N
        getContentPane().add(exp4);
        exp4.setBounds(140, 260, 1010, 410);

        exp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exp2e.jpg"))); // NOI18N
        getContentPane().add(exp5);
        exp5.setBounds(140, 260, 1010, 410);

        head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.jpg"))); // NOI18N
        getContentPane().add(head);
        head.setBounds(0, 0, 1310, 260);

        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expsider.jpg"))); // NOI18N
        getContentPane().add(down);
        down.setBounds(0, 670, 1310, 170);

        rside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exprside.jpg"))); // NOI18N
        getContentPane().add(rside);
        rside.setBounds(1150, 260, 160, 410);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1230, -10, 100, 270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
   back.setEnabled(true);
   AnimationClass IMG = new AnimationClass();
   if (exp1.getX()== 140 && exp2.getX()== 140 && exp3.getX()== 140 && exp4.getX()== 140 && exp5.getX()== 140)
           IMG.jLabelXLeft(140,-1030,5, 5,exp1);
   else if (exp1.getX()== -1030 && exp2.getX()== 140 && exp3.getX()== 140 && exp4.getX()== 140 && exp5.getX()== 140)
       IMG.jLabelXLeft(140,-1030,5,5,exp2);
   else if (exp1.getX()== -1030 && exp2.getX()== -1030 && exp3.getX()== 140 && exp4.getX()== 140 && exp5.getX()== 140)
       IMG.jLabelXLeft(140,-1030,5,5,exp3);
   else if (exp1.getX()== -1030 && exp2.getX()== -1030 && exp3.getX()== -1030 && exp4.getX()== 140 && exp5.getX()== 140)
       IMG.jLabelXLeft(140,-1030,5,5,exp4);
 
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       next.setEnabled(true);
       AnimationClass IMG = new AnimationClass();
   if (exp1.getX()== -1030 && exp2.getX()== 140 && exp3.getX()== 140 && exp4.getX()== 140 && exp5.getX()== 140)
           IMG.jLabelXRight(-1030,140,5, 5,exp1);
   else if (exp1.getX()== -1030 && exp2.getX()== -1030 && exp3.getX()== 140 && exp4.getX()== 140 && exp5.getX()== 140)
       IMG.jLabelXRight(-1030,140,5,5,exp2);
   else if (exp1.getX()== -1030 && exp2.getX()== -1030 && exp3.getX()== -1030 && exp4.getX()== 140 && exp5.getX()== 140)
       IMG.jLabelXRight(-1030,140,5,5,exp3);
   else if (exp1.getX()== -1030 && exp2.getX()== -1030 && exp3.getX()== -1030 && exp4.getX()== -1030 && exp5.getX()== 140)
       IMG.jLabelXRight(-1030,140,5,5,exp4);
   else if (exp1.getX()== -1030 && exp2.getX()== -1030 && exp3.getX()== -1030 && exp4.getX()==-1030 && exp5.getX()== -1030)
       IMG.jLabelXRight(-1030,140,5,5,exp5);
    }//GEN-LAST:event_backActionPerformed

    private void spec1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spec1MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/specsat.jpg"));
        spec1.setIcon(B);
    }//GEN-LAST:event_spec1MouseEntered

    private void spec1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spec1MouseExited
        spec1.setIcon(null);
    }//GEN-LAST:event_spec1MouseExited

    private void spec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spec1ActionPerformed
       specs2  frm2=new specs2();
       frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_spec1ActionPerformed

    private void gallery1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery1MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/gallb.jpg"));
        gallery1.setIcon(B);
    }//GEN-LAST:event_gallery1MouseEntered

    private void gallery1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery1MouseExited
        gallery1.setIcon(null);
    }//GEN-LAST:event_gallery1MouseExited

    private void gallery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallery1ActionPerformed
       gallery2 frm2=new gallery2();
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gallery1ActionPerformed

    private void tech1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tech1MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/techb.jpg"));
        tech1.setIcon(B);
    }//GEN-LAST:event_tech1MouseEntered

    private void tech1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tech1MouseExited
        tech1.setIcon(null);
    }//GEN-LAST:event_tech1MouseExited

    private void tech1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tech1ActionPerformed
      tech2 frm2=new tech2();
       frm2.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_tech1ActionPerformed

    private void nextStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nextStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nextStateChanged

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
  if(exp5.getX()== 140 && exp1.getX()!= 140 && exp2.getX()!= 140 && exp3.getX()!= 140 && exp4.getY()!= 140)
    next.setEnabled(false);
else 
      next.setEnabled(true);
    }//GEN-LAST:event_nextMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered

    }//GEN-LAST:event_backMouseEntered

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
    if(exp1.getX()== -1030 && exp5.getX()!= -1030 && exp2.getX()!= -1030 && exp3.getX()!= -1030 && exp4.getY()!= -1030)
    back.setEnabled(false);
else 
     if(exp1.getX()!= -1030 && exp5.getX()!= -1030 && exp2.getX()!= -1030 && exp3.getX()!= -1030 && exp4.getY()!= -1030)
    back.setEnabled(false);
    else
      back.setEnabled(true);
    }//GEN-LAST:event_backMouseClicked

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        home frm2=new home();
      frm2.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_home1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   home2 frm1 = new home2();
   this.setVisible(false);
   frm1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void home2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home2MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/butt1.gif"));
        home1.setIcon(B);
    }//GEN-LAST:event_home2MouseEntered

    private void home2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home2MouseExited
        ImageIcon B = new ImageIcon(getClass().getResource("/images/buttfinal.gif"));
        home1.setIcon(B);
    }//GEN-LAST:event_home2MouseExited

    private void home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2ActionPerformed
        Choose frm2=new Choose();
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_home2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
LW.Launch_Rolls();
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
            java.util.logging.Logger.getLogger(explore2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(explore2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(explore2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(explore2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new explore2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel down;
    private javax.swing.JLabel exp1;
    private javax.swing.JLabel exp2;
    private javax.swing.JLabel exp3;
    private javax.swing.JLabel exp4;
    private javax.swing.JLabel exp5;
    private javax.swing.JButton gallery1;
    private javax.swing.JLabel head;
    private javax.swing.JButton home1;
    private javax.swing.JButton home2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lside;
    private javax.swing.JButton next;
    private javax.swing.JLabel rside;
    private javax.swing.JButton spec1;
    private javax.swing.JButton tech1;
    // End of variables declaration//GEN-END:variables
}
