/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_thomas_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

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
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60,
                nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        for (int i = 0; i < nbLignes; i++) {
            final int j = i;
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }

        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();

        for (int i = 0; i < nbLignes; i++) {
            final int j = i;
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);

        }

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

    private void desactiverBoutons() {

        btnDiagD.setEnabled(false);
        btnDiagM.setEnabled(false);
    }

    public void verifierGrilleEteinte() {
        nbCoups++;
        if (grille.cellulesToutesEteintes()) {
            Bravo.setText("Bravo ! Vous avez eteint toutes les cellules en " + nbCoups + " coups.");
            Bravo.setVisible(true);
            desactiverBoutons();
            nbCoups++;
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
        btnDiagD = new javax.swing.JButton();
        btnDiagM = new javax.swing.JButton();
        Bravo = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();

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

        Bravo.setBackground(new java.awt.Color(255, 255, 51));
        Bravo.setText("Bravo");
        getContentPane().add(Bravo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 560, 20));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 50, 360));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 360, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagMActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        verifierGrilleEteinte();


    }//GEN-LAST:event_btnDiagMActionPerformed

    private void btnDiagDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagDActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        verifierGrilleEteinte();
    }//GEN-LAST:event_btnDiagDActionPerformed

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
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnDiagD;
    private javax.swing.JButton btnDiagM;
    // End of variables declaration//GEN-END:variables
}
