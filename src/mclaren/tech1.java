/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mclaren;

import aventador.gallery;
import aventador.specs;
import aventador.explore;
import aventador.home;
import AppPackage.AnimationClass;
import General.Choose;
import General.LaunchWeb;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author GAMER
 */
public class tech1 extends javax.swing.JFrame {

    /**
     * Creates new form tech
     */
    public tech1() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/General/logo2.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home1 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        explore = new javax.swing.JButton();
        spec = new javax.swing.JButton();
        gallery = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        tech1 = new javax.swing.JLabel();
        tech2 = new javax.swing.JLabel();
        tech3 = new javax.swing.JLabel();
        tech4 = new javax.swing.JLabel();
        tech5 = new javax.swing.JLabel();
        up = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1289, 80));
        setPreferredSize(new java.awt.Dimension(1289, 799));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttfinal.gif"))); // NOI18N
        home1.setBorderPainted(false);
        home1.setContentAreaFilled(false);
        home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home1MouseExited(evt);
            }
        });
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 100, 80));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mc logo.jpg"))); // NOI18N
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 170, 80));

        explore.setBackground(new java.awt.Color(0, 0, 0));
        explore.setBorderPainted(false);
        explore.setContentAreaFilled(false);
        explore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        explore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exploreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exploreMouseExited(evt);
            }
        });
        explore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exploreActionPerformed(evt);
            }
        });
        getContentPane().add(explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 110, 80));

        spec.setBorderPainted(false);
        spec.setContentAreaFilled(false);
        spec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spec.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        spec.setDoubleBuffered(true);
        spec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                specMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                specMouseExited(evt);
            }
        });
        spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specActionPerformed(evt);
            }
        });
        getContentPane().add(spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 90, 80));

        gallery.setBorderPainted(false);
        gallery.setContentAreaFilled(false);
        gallery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gallery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                galleryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                galleryMouseExited(evt);
            }
        });
        gallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galleryActionPerformed(evt);
            }
        });
        getContentPane().add(gallery, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 110, 80));

        next.setBackground(new java.awt.Color(0, 0, 0));
        next.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        next.setHideActionText(true);
        next.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 220, 140, 520));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 500));

        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 110, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mc line.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, -1, 120));

        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expsider.jpg"))); // NOI18N
        getContentPane().add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1310, 170));

        tech1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tech1a.jpg"))); // NOI18N
        getContentPane().add(tech1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 260, 1030, 460));

        tech2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tech1b.jpg"))); // NOI18N
        getContentPane().add(tech2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 470));

        tech3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tech1c.jpg"))); // NOI18N
        getContentPane().add(tech3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 470));

        tech4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tech1d.jpg"))); // NOI18N
        getContentPane().add(tech4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 470));

        tech5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tech1e.jpg"))); // NOI18N
        getContentPane().add(tech5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 460));

        up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/techup.jpg"))); // NOI18N
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1528, 267));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    next.setEnabled(true); 
    AnimationClass IMG = new AnimationClass();
   if (tech1.getY()== 1030 && tech2.getY()== 1030 && tech3.getY()== 1030 && tech4.getY()== 1030 && tech5.getY()== 260)
           IMG.jLabelYUp(1030,260,5, 5,tech4);
   else if (tech1.getY()== 1030 && tech2.getY()== 1030 && tech3.getY()== 1030 && tech4.getY()== 260 && tech5.getY()== 260)
       IMG.jLabelYUp(1030,260,5,5,tech3);
   else if (tech1.getY()== 1030 && tech2.getY()== 1030 && tech3.getY()== 260 && tech4.getY()== 260 && tech5.getY()== 260)
       IMG.jLabelYUp(1030,260,5,5,tech2);
   else if (tech1.getY()== 1030 && tech2.getY()== 260 && tech3.getY()== 260 && tech4.getY()== 260 &&tech5.getY()== 260)
       IMG.jLabelYUp(1030,260,5,5,tech1);
   
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
 back.setEnabled(true);   
 AnimationClass IMG = new AnimationClass();
   if (tech1.getY()== 260 && tech2.getY()== 260 && tech3.getY()== 260 && tech4.getY()== 260 && tech5.getY()== 260)
           IMG.jLabelYDown(260,1030,5, 5,tech1);
   else if (tech1.getY()== 1030 && tech2.getY()== 260 && tech3.getY()== 260 && tech4.getY()== 260 && tech5.getY()== 260)
       IMG.jLabelYDown(260,1030,5,5,tech2);
   else if (tech1.getY()== 1030 && tech2.getY()== 1030 && tech3.getY()== 260 && tech4.getY()== 260 && tech5.getY()== 260)
       IMG.jLabelYDown(260,1030,5,5,tech3);
   else if (tech1.getY()== 1030 && tech2.getY()== 1030 && tech3.getY()== 1030 && tech4.getY()== 260 &&tech5.getY()== 260)
       IMG.jLabelYDown(260,1030,5,5,tech4);
   
    }//GEN-LAST:event_nextActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        home frm1= new home();
        home1 frm2=new home1();
        frm2.setLocation(frm1.getX(),frm1.getY());
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void specMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specMouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/specsat.jpg"));
        spec.setIcon(B);
    }//GEN-LAST:event_specMouseEntered

    private void specMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specMouseExited
        
        spec.setIcon(null);
    }//GEN-LAST:event_specMouseExited

    private void specActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specActionPerformed
        home frm1= new home();
        specs1 frm2=new specs1();
        frm2.setLocation(frm1.getX(),frm1.getY());
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_specActionPerformed

    private void exploreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/images/expbt.jpg"));
        explore.setIcon(A);

    }//GEN-LAST:event_exploreMouseEntered

    private void exploreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMouseExited
        
        explore.setIcon(null);
    }//GEN-LAST:event_exploreMouseExited

    private void exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreActionPerformed
        home frm1= new home();
        explore1 frm2=new explore1();
        frm2.setLocation(frm1.getX(),frm1.getY());
        frm2.setVisible(true);
        frm2.setLocation(frm1.getX(),frm1.getY());
        this.setVisible(false);

    }//GEN-LAST:event_exploreActionPerformed

    private void galleryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galleryMouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/gallb.jpg"));
        gallery.setIcon(B);
    }//GEN-LAST:event_galleryMouseEntered

    private void galleryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galleryMouseExited
        gallery.setIcon(null);
    }//GEN-LAST:event_galleryMouseExited

    private void galleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galleryActionPerformed
        home frm1= new home();
        gallery1 frm2=new gallery1();
        frm2.setLocation(frm1.getX(),frm1.getY());
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_galleryActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered

    }//GEN-LAST:event_backMouseEntered

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
  
    }//GEN-LAST:event_nextMouseEntered

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
  if(tech5.getY()== 260 && tech1.getY()!= 260 && tech2.getY()!= 260 && tech3.getY()!= 260 && tech4.getY()!= 260)
    next.setEnabled(false);
else 
      next.setEnabled(true);
    }//GEN-LAST:event_nextMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
  if(tech1.getY()== 260)
    back.setEnabled(false);
else 
      back.setEnabled(true);
    }//GEN-LAST:event_backMouseClicked

    private void home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("/images/butt1.gif"));
        home1.setIcon(B);
    }//GEN-LAST:event_home1MouseEntered

    private void home1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseExited
        ImageIcon B = new ImageIcon(getClass().getResource("/images/buttfinal.gif"));
        home1.setIcon(B);
    }//GEN-LAST:event_home1MouseExited

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        Choose frm2=new Choose();
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_home1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        LaunchWeb LW = new LaunchWeb();
        LW.Launch_Mclaren();
    }//GEN-LAST:event_jButton9ActionPerformed

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
        }
         catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tech1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tech1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tech1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tech1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tech1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel down;
    private javax.swing.JButton explore;
    private javax.swing.JButton gallery;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next;
    private javax.swing.JButton spec;
    private javax.swing.JLabel tech1;
    private javax.swing.JLabel tech2;
    private javax.swing.JLabel tech3;
    private javax.swing.JLabel tech4;
    private javax.swing.JLabel tech5;
    private javax.swing.JLabel up;
    // End of variables declaration//GEN-END:variables
}
