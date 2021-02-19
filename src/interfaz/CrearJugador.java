/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

public class CrearJugador extends javax.swing.JFrame {

    public CrearJugador() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menú Crear Jugador");
        iniciar();
        setIconImage(new ImageIcon(getClass().getResource("/img/ruletaIcon.png")).getImage());
    }
////METODO QUE SETEA LOS TXTFIELD EN NULO Y NO DEJA OPRIMIR BOTONES SI NO SE HA ESCRITO NINGUN NOMBRE////

    public void iniciar() {
        this.crear.setEnabled(false);
        this.txtNombre.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        PaneAnuncio = new javax.swing.JPanel();
        lblanuncio = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(626, 491));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(0, 102, 0));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear.setBackground(new java.awt.Color(0, 0, 0));
        btnCrear.setFont(new java.awt.Font("Malgun Gothic", 1, 26)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 0));
        btnCrear.setText("CREAR JUGADOR");
        btnCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 50));

        crear.setBackground(new java.awt.Color(0, 0, 255));
        crear.setFont(new java.awt.Font("Budmo Jiggler", 1, 36)); // NOI18N
        crear.setText("CREAR");
        crear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        Panel.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 140, 50));

        Volver.setBackground(new java.awt.Color(153, 0, 153));
        Volver.setFont(new java.awt.Font("Budmo Jiggler", 1, 36)); // NOI18N
        Volver.setForeground(new java.awt.Color(0, 0, 0));
        Volver.setText("VOLVER");
        Volver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        Panel.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, 50));

        PaneAnuncio.setBackground(new java.awt.Color(0, 0, 0));

        lblanuncio.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        lblanuncio.setForeground(new java.awt.Color(255, 0, 0));
        lblanuncio.setText(" Nombre del Jugador: ");

        javax.swing.GroupLayout PaneAnuncioLayout = new javax.swing.GroupLayout(PaneAnuncio);
        PaneAnuncio.setLayout(PaneAnuncioLayout);
        PaneAnuncioLayout.setHorizontalGroup(
            PaneAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
            .addGroup(PaneAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaneAnuncioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblanuncio)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PaneAnuncioLayout.setVerticalGroup(
            PaneAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(PaneAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaneAnuncioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblanuncio)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Panel.add(PaneAnuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, 30));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        Panel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 220, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoclientes.jpg"))); // NOI18N
        Panel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 490));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        ////DEVUELVE AL MENU//
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        ///LLAMA AL METODO CREAR JUGADOR ENVIANDOLE COMO PARAMETRO EL NOMBRE ///
        this.crearJugador(this.txtNombre.getText());
        ///INICIALIZA EL MENU DE NUEVO EN VACIO////
        this.iniciar();
    }//GEN-LAST:event_crearActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //////NO DEJA CREAR UN USUARIO SI NO TIENE COMO MINIMO DOS LETRAS////
        if (this.txtNombre.getText().length() <= 0) {
            this.crear.setEnabled(false);
        } else {
            this.crear.setEnabled(true);
        }

        int num = 9;
        char c = evt.getKeyChar();
        if (       (c >= 32 && c <= 64)
                || (c >= 91 && c <= 96)
                || (c >= 123 && c <160)
                || (c > 166 && c <255)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor solo ingrese letras");
            txtNombre.setCursor(null);
        }
        if (txtNombre.getText().length() >= num) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un nombre menor a 9 letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    public void crearJugador(String Nombre) {
        int id = 1; //SE FIJA LA VARIABLE DONDE SIEMPRE COMENZARA A RECORRER EL ARCHIVO
        boolean flag = false, centinela = false;
        String TraerNombres = "";
        int tam = 0;

        while (flag == false) {
            File ruta = new File("src\\ArchivosClientes\\" + id + ".txt");//RUTA DEL ARCHIVO
            File file = new File(ruta.getAbsolutePath()); //DIRECCION DEL ARCHIVO EN NUESTRO COMPUTADOR
            try {
                if (file.exists()) {
                    FileReader fr = new FileReader(file);
                    BufferedReader bf = new BufferedReader(fr);
                    String texto;

                    while ((texto = bf.readLine()) != null) {

                        String Separar[] = texto.split("_"); // SE SEPARA EL NOMBRE Y EL DINERO EN UN ARREGLO
                        TraerNombres = TraerNombres.concat(Separar[0]).concat("_");// CONCATENA TODOS LOS NOMBRES 
                        //QUE ENCUENTRA EN LOS ARCHIVOS EXISTENTES

                    }
                    fr.close();
                    bf.close();
                    tam++;
                    id++;
                } else {
                    flag = true;
                    String Nombres[] = TraerNombres.split("_");//SE SEPARA TODOS LOS NOMBRES QUE SE HABIAN CONCATENADO
                    for (int i = 0; i < tam; i++) {
                        if (Nombres[i].equals(Nombre)) { //VERIFICA QUE NO EXISTA UN NOMBRE COMO EL QUE SE QUIERE CREAR
                            centinela = true;

                        }
                    }
                    if (centinela == false) { //SI NO EXISTE UN NOMBRE IGUAL
                        //SE PROCEDE A CREARSE EL JUGADOR
                        file.createNewFile(); //SE CREA EL ARCHIVO EN VACIO
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
                        pw.write(Nombre + "_" + 0); //SE GUARDA EL NOMBRE Y EL DINERO EN 0 DENTRO DEL ARCHIVO

                        pw.close();
                        bw.close();
                    } else {
                        //INFORMA AL USUARIO QUE EL JUGADOR QUE SE QUIERE CREAR YA EXISTE
                        JOptionPane.showMessageDialog(null, "El nombre que Ingresó \nya se encuentra en uso");
                    }

                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        this.iniciar();

    }

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
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneAnuncio;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton crear;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblanuncio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
