/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_thomas_version_console;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Jules
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeCellules grille;
    int nbCoups;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;

        Bravo.setVisible(false);
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        initialiserPartie();

        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }

    }

    public void verifierGrilleEteinte() {
        if (grille.cellulesToutesEteintes()) {
            Bravo.setText("La grille est éteinte !");
              Bravo.setVisible(true);
        } else {

         
        }
        repaint();
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        btnLigne0 = new javax.swing.JButton();
        btnLigne9 = new javax.swing.JButton();
        btnLigne1 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnLigne7 = new javax.swing.JButton();
        btnLigne8 = new javax.swing.JButton();
        btnColonne0 = new javax.swing.JButton();
        btnColonne1 = new javax.swing.JButton();
        btnColonne2 = new javax.swing.JButton();
        btnColonne3 = new javax.swing.JButton();
        btnColonne4 = new javax.swing.JButton();
        btnColonne5 = new javax.swing.JButton();
        btnColonne6 = new javax.swing.JButton();
        btnColonne7 = new javax.swing.JButton();
        btnColonne8 = new javax.swing.JButton();
        btnColonne9 = new javax.swing.JButton();
        btnDiagD = new javax.swing.JButton();
        btnDiagM = new javax.swing.JButton();
        Bravo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(102, 204, 255));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(360, 360));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        btnLigne0.setText("btnLigne0");
        btnLigne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 20));

        btnLigne9.setText("btnLigne9");
        btnLigne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, 20));

        btnLigne1.setText("btnLigne1");
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));

        btnLigne2.setText("btnLigne2");
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 20));

        btnLigne3.setText("btnLigne3");
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 20));

        btnLigne4.setText("btnLigne4");
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, 20));

        btnLigne5.setText("btnLigne5");
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 20));

        btnLigne6.setText("btnLigne6");
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 20));

        btnLigne7.setText("btnLigne7");
        btnLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, 20));

        btnLigne8.setText("btnLigne8");
        btnLigne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 20));

        btnColonne0.setText("0");
        btnColonne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        btnColonne1.setText("1");
        btnColonne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        btnColonne2.setText("2");
        btnColonne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        btnColonne3.setText("3");
        btnColonne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        btnColonne4.setText("4");
        btnColonne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        btnColonne5.setText("5");
        btnColonne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        btnColonne6.setText("6");
        btnColonne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnColonne7.setText("7");
        btnColonne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        btnColonne8.setText("8");
        btnColonne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        btnColonne9.setText("9");
        btnColonne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        btnDiagD.setText("Diag D");
        btnDiagD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagDActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, -1));

        btnDiagM.setText("Diag M");
        btnDiagM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagMActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        Bravo.setText("Bravo vous avez gagné!!");
        getContentPane().add(Bravo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne0ActionPerformed
        this.grille.activerLigneDeCellules(0);
        repaint();
        verifierGrilleEteinte();

    }//GEN-LAST:event_btnLigne0ActionPerformed

    private void btnLigne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne9ActionPerformed
        this.grille.activerLigneDeCellules(9);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne9ActionPerformed

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        this.grille.activerLigneDeCellules(1);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        this.grille.activerLigneDeCellules(2);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        this.grille.activerLigneDeCellules(3);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        this.grille.activerLigneDeCellules(4);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        this.grille.activerLigneDeCellules(5);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        this.grille.activerLigneDeCellules(6);
        repaint();    
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne7ActionPerformed
        this.grille.activerLigneDeCellules(7);
        repaint();
    }//GEN-LAST:event_btnLigne7ActionPerformed

    private void btnLigne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne8ActionPerformed
        this.grille.activerLigneDeCellules(8);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnLigne8ActionPerformed

    private void btnColonne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne0ActionPerformed
        this.grille.activerColonneDeCellules(0);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne0ActionPerformed

    private void btnColonne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne1ActionPerformed
        this.grille.activerColonneDeCellules(1);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne1ActionPerformed

    private void btnColonne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne2ActionPerformed
        this.grille.activerColonneDeCellules(2);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne2ActionPerformed

    private void btnColonne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne3ActionPerformed
        this.grille.activerColonneDeCellules(3);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne3ActionPerformed

    private void btnColonne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne4ActionPerformed
        this.grille.activerColonneDeCellules(4);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne4ActionPerformed

    private void btnColonne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne5ActionPerformed
        this.grille.activerColonneDeCellules(5);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne5ActionPerformed

    private void btnColonne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne6ActionPerformed
        this.grille.activerColonneDeCellules(6);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne6ActionPerformed

    private void btnColonne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne7ActionPerformed
        this.grille.activerColonneDeCellules(7);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne7ActionPerformed

    private void btnColonne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne8ActionPerformed
        this.grille.activerColonneDeCellules(8);
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnColonne8ActionPerformed

    private void btnColonne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne9ActionPerformed
        this.grille.activerColonneDeCellules(9);
        repaint();
        verifierGrilleEteinte();

    }//GEN-LAST:event_btnColonne9ActionPerformed

    private void btnDiagDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagDActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnDiagDActionPerformed

    private void btnDiagMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagMActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        verifierGrilleEteinte();
        
    }//GEN-LAST:event_btnDiagMActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bravo;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnColonne0;
    private javax.swing.JButton btnColonne1;
    private javax.swing.JButton btnColonne2;
    private javax.swing.JButton btnColonne3;
    private javax.swing.JButton btnColonne4;
    private javax.swing.JButton btnColonne5;
    private javax.swing.JButton btnColonne6;
    private javax.swing.JButton btnColonne7;
    private javax.swing.JButton btnColonne8;
    private javax.swing.JButton btnColonne9;
    private javax.swing.JButton btnDiagD;
    private javax.swing.JButton btnDiagM;
    private javax.swing.JButton btnLigne0;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JButton btnLigne7;
    private javax.swing.JButton btnLigne8;
    private javax.swing.JButton btnLigne9;
    // End of variables declaration//GEN-END:variables
}
