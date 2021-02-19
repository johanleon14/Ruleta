package interfaz;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Opciones de Clientes");
        setIconImage(new ImageIcon(getClass().getResource("/img/ruletaIcon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(626, 491));
        setResizable(false);
        setSize(new java.awt.Dimension(626, 491));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(0, 102, 0));
        Panel.setMaximumSize(new java.awt.Dimension(626, 626));
        Panel.setMinimumSize(new java.awt.Dimension(626, 626));
        Panel.setOpaque(false);
        Panel.setPreferredSize(new java.awt.Dimension(626, 626));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear.setBackground(new java.awt.Color(255, 0, 0));
        btnCrear.setFont(new java.awt.Font("Budmo Jiggler", 1, 36)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR JUGADOR");
        btnCrear.setAlignmentY(0.0F);
        btnCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        Panel.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 310, 50));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregar.setFont(new java.awt.Font("Budmo Jiggler", 1, 32)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR DINERO A JUGADOR");
        btnAgregar.setAlignmentY(0.0F);
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Panel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 500, 50));

        bntEliminar.setBackground(new java.awt.Color(0, 153, 0));
        bntEliminar.setFont(new java.awt.Font("Budmo Jiggler", 1, 36)); // NOI18N
        bntEliminar.setForeground(new java.awt.Color(0, 0, 0));
        bntEliminar.setText("ELIMINAR JUGADOR");
        bntEliminar.setAlignmentY(0.0F);
        bntEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarActionPerformed(evt);
            }
        });
        Panel.add(bntEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 360, 50));

        Volver.setBackground(new java.awt.Color(204, 0, 204));
        Volver.setFont(new java.awt.Font("Budmo Jiggler", 1, 36)); // NOI18N
        Volver.setForeground(new java.awt.Color(0, 0, 0));
        Volver.setText("VOLVER");
        Volver.setAlignmentY(0.0F);
        Volver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        Panel.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 150, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoclientes.jpg"))); // NOI18N
        fondo.setOpaque(true);
        Panel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        inicio i = new inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        CrearJugador c = new CrearJugador();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarDinero a = new AgregarDinero();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        EliminarJugador e = new EliminarJugador();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Volver;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}