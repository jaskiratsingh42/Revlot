/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mclaren;

import AppPackage.AnimationClass;
import General.Choose;
import General.LaunchWeb;
import javax.swing.ImageIcon;

/**
 *
 * @author GAMER
 */
public class gallery1 extends javax.swing.JFrame {

    /**
     * Creates new form gallery
     */
    public gallery1() {
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
        tech = new javax.swing.JButton();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        main2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 840));
        setPreferredSize(new java.awt.Dimension(1307, 824));
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
        getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 90, 80));

        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 180, 80));

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
        getContentPane().add(explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 100, 80));

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
        getContentPane().add(spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 80, 80));

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
        getContentPane().add(tech, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 110, 80));

        up.setBackground(new java.awt.Color(0, 0, 0));
        up.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        up.setForeground(new java.awt.Color(255, 255, 255));
        up.setText("Scroll UP");
        up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upMouseEntered(evt);
            }
        });
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 310, 70));

        down.setBackground(new java.awt.Color(0, 0, 0));
        down.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        down.setForeground(new java.awt.Color(255, 255, 255));
        down.setText("Scroll DOWN");
        down.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        down.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downMouseEntered(evt);
            }
        });
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        getContentPane().add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 290, 70));

        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 100, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gallery1up.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        main2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gallerymain1.jpg"))); // NOI18N
        getContentPane().add(main2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitledj.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1300, 100));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 160, 120, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseEntered
        if (main2.getY()== 290)
        up.setEnabled(false);
        else if
        (main2.getY()== -1180)
        up.setEnabled(true);
    }//GEN-LAST:event_upMouseEntered

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        down.setEnabled(false);
        AnimationClass IMG = new AnimationClass();
        if (main2.getY()== -1180) {
            IMG.jLabelYDown(-1180,290,20,5,main2);
        }
    }//GEN-LAST:event_upActionPerformed

    private void downMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseEntered
        if (main2.getY()== 290)
        down.setEnabled(true);
        else if(main2.getY()==-1180)
        down.setEnabled(false);
    }//GEN-LAST:event_downMouseEntered

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        up.setEnabled(false);
        AnimationClass IMG = new AnimationClass();
        if (main2.getY()== 290) {
            IMG.jLabelYUp(290,-1180,20,5,main2);
        }
    }//GEN-LAST:event_downActionPerformed

    private void exploreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMouseEntered
        if (main2.getY()== 290 || main2.getY()== -1180) {
            ImageIcon A = new ImageIcon(getClass().getResource("/images/expbt.jpg"));
            explore.setIcon(A);
        }
    }//GEN-LAST:event_exploreMouseEntered

    private void exploreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMouseExited
        explore.setIcon(null);
    }//GEN-LAST:event_exploreMouseExited

    private void exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreActionPerformed
        home1 frm1= new home1();
        explore1 frm2=new explore1();
        frm2.setLocation(frm1.getX(),frm1.getY());
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exploreActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        
        home1 frm2=new home1();
      
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void specMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specMouseEntered
        if (main2.getY()== 290 || main2.getY()== -1180) {
            ImageIcon B = new ImageIcon(getClass().getResource("/images/specsat.jpg"));
            spec.setIcon(B); }
    }//GEN-LAST:event_specMouseEntered

    private void specMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specMouseExited
        spec.setIcon(null);
    }//GEN-LAST:event_specMouseExited

    private void specActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specActionPerformed
        home1 frm1= new home1();
        specs1 frm2=new specs1();
        frm2.setLocation(frm1.getX(),frm1.getY());
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_specActionPerformed

    private void techMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techMouseEntered
        if (main2.getY()== 290 || main2.getY()== -1180)
        {  ImageIcon B = new ImageIcon(getClass().getResource("/images/techb.jpg"));
            tech.setIcon(B);  }
    }//GEN-LAST:event_techMouseEntered

    private void techMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techMouseExited
        tech.setIcon(null);
    }//GEN-LAST:event_techMouseExited

    private void techActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techActionPerformed
        
        tech1 frm2=new tech1();
        frm2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_techActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gallery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gallery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gallery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gallery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gallery1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton down;
    private javax.swing.JButton explore;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main2;
    private javax.swing.JButton spec;
    private javax.swing.JButton tech;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}