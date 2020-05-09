/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventador;


import General.Choose;
import General.LaunchWeb;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mclaren.home1;

/**
 *
 * @author GAMER
 */
public class home extends javax.swing.JFrame {
     
public home()
{
  initComponents();
  setIconImage(new ImageIcon(getClass().getResource("/General/logo2.jpg")).getImage());
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home1 = new javax.swing.JButton();
        explore = new javax.swing.JButton();
        spec = new javax.swing.JButton();
        tech = new javax.swing.JButton();
        gallery = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        up = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1309, 840));
        setName("home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1303, 855));
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
        getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 100, 90));

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
        getContentPane().add(explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 100, 90));

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
        getContentPane().add(spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 90, 90));

        tech.setBorderPainted(false);
        tech.setContentAreaFilled(false);
        tech.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                techMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                techMouseExited(evt);
            }
        });
        tech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                techActionPerformed(evt);
            }
        });
        getContentPane().add(tech, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 130, 90));

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
        getContentPane().add(gallery, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 110, 90));

        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 110, 90));

        up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uphome.jpg"))); // NOI18N
        up.setText("jLabel7");
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-anim.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 1000, 550));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1309homelam.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 1000, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exprsidehom.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 170, 770));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exprsidehom.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 750));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 760, 1330, 130));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreActionPerformed
    home frm1= new home();
    explore frm2=new explore();
    frm2.setLocation(frm1.getX(),frm1.getY()); 
    frm2.setVisible(true);
    frm2.setLocation(frm1.getX(),frm1.getY());
    this.setVisible(false);
      
      
    }//GEN-LAST:event_exploreActionPerformed

    private void techActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techActionPerformed
       home frm1= new home();
    tech frm2=new tech();
    frm2.setLocation(frm1.getX(),frm1.getY()); 
    frm2.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_techActionPerformed

    private void specActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specActionPerformed
    home frm1= new home();
    specs frm2=new specs();
    frm2.setLocation(frm1.getX(),frm1.getY()); 
    frm2.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_specActionPerformed

    private void galleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galleryActionPerformed
    home frm1= new home();
    gallery frm2=new gallery();
    frm2.setLocation(frm1.getX(),frm1.getY()); 
    frm2.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_galleryActionPerformed

    private void exploreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMouseEntered
    ImageIcon A = new ImageIcon(getClass().getResource("/images/expbt.jpg"));
   explore.setIcon(A);
   
    
    }//GEN-LAST:event_exploreMouseEntered

    private void exploreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMouseExited
   explore.setIcon(null);
    }//GEN-LAST:event_exploreMouseExited

    private void specMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specMouseEntered
     ImageIcon B = new ImageIcon(getClass().getResource("/images/specsat.jpg"));
   spec.setIcon(B);
    }//GEN-LAST:event_specMouseEntered

    private void specMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specMouseExited
    spec.setIcon(null);
    }//GEN-LAST:event_specMouseExited

    private void techMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techMouseEntered
     ImageIcon B = new ImageIcon(getClass().getResource("/images/techb.jpg"));
   tech.setIcon(B);
    }//GEN-LAST:event_techMouseEntered

    private void techMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techMouseExited
 tech.setIcon(null);   
    }//GEN-LAST:event_techMouseExited

    private void galleryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galleryMouseEntered
     ImageIcon B = new ImageIcon(getClass().getResource("/images/gallb.jpg"));
   gallery.setIcon(B);   
    }//GEN-LAST:event_galleryMouseEntered

    private void galleryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galleryMouseExited
    
gallery.setIcon(null);   
    }//GEN-LAST:event_galleryMouseExited

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LaunchWeb LW = new LaunchWeb();
        LW.Launch_Lambo();
    }//GEN-LAST:event_jButton2ActionPerformed
   

public static void main(String args[]) {
    
         
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
         catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } // if modal, application will pause here

        System.out.println("Dialog closed");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
}
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton explore;
    private javax.swing.JButton gallery;
    private javax.swing.JButton home1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton spec;
    private javax.swing.JButton tech;
    private javax.swing.JLabel up;
    // End of variables declaration//GEN-END:variables
}
