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
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

public class AgregarDinero extends javax.swing.JFrame {

    /**
     * Creates new form AgregarDinero
     */
    public AgregarDinero() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menú Dinero");
        iniciar();
        setIconImage(new ImageIcon(getClass().getResource("/img/ruletaIcon.png")).getImage());
    }

    public void iniciar() {
        this.txtDinero.setText("");
        this.ComboNombre.setSelectedIndex(0);
        this.txtDinero.setEditable(false);
        this.btnAgregar.setEnabled(false);
        this.txtDineroactual.setEnabled(false);
        this.model();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        ComboNombre = new javax.swing.JComboBox<>();
        txtDinero = new javax.swing.JTextField();
        PanelJugador = new javax.swing.JPanel();
        lblJugador = new javax.swing.JLabel();
        PanelDineroactual = new javax.swing.JPanel();
        lblDineroactual = new javax.swing.JLabel();
        PanelDinero = new javax.swing.JPanel();
        lblDinero = new javax.swing.JLabel();
        txtDineroactual = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(626, 491));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(0, 102, 0));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn.setBackground(new java.awt.Color(0, 0, 0));
        btn.setFont(new java.awt.Font("Malgun Gothic", 1, 26)); // NOI18N
        btn.setForeground(new java.awt.Color(255, 255, 0));
        btn.setText("AGREGAR DINERO A JUGADOR");
        Panel.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 50));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregar.setFont(new java.awt.Font("Budmo Jiggler", 1, 36)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Panel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 50));

        Volver.setBackground(new java.awt.Color(204, 0, 204));
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

        ComboNombre.setBackground(new java.awt.Color(204, 204, 204));
        ComboNombre.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        ComboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNombreActionPerformed(evt);
            }
        });
        Panel.add(ComboNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 150, 30));

        txtDinero.setBackground(new java.awt.Color(0, 0, 0));
        txtDinero.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtDinero.setForeground(new java.awt.Color(255, 255, 255));
        txtDinero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDineroActionPerformed(evt);
            }
        });
        txtDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDineroKeyTyped(evt);
            }
        });
        Panel.add(txtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 150, 30));

        PanelJugador.setBackground(new java.awt.Color(0, 0, 0));

        lblJugador.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        lblJugador.setForeground(new java.awt.Color(255, 0, 0));
        lblJugador.setText("Seleccionar Jugador:");
        lblJugador.setAlignmentY(0.0F);
        lblJugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelJugadorLayout = new javax.swing.GroupLayout(PanelJugador);
        PanelJugador.setLayout(PanelJugadorLayout);
        PanelJugadorLayout.setHorizontalGroup(
            PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        PanelJugadorLayout.setVerticalGroup(
            PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(PanelJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        PanelDineroactual.setBackground(new java.awt.Color(0, 0, 0));

        lblDineroactual.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        lblDineroactual.setForeground(new java.awt.Color(255, 0, 0));
        lblDineroactual.setText("Dinero Actual:");
        lblDineroactual.setAlignmentY(0.0F);

        javax.swing.GroupLayout PanelDineroactualLayout = new javax.swing.GroupLayout(PanelDineroactual);
        PanelDineroactual.setLayout(PanelDineroactualLayout);
        PanelDineroactualLayout.setHorizontalGroup(
            PanelDineroactualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDineroactualLayout.createSequentialGroup()
                .addComponent(lblDineroactual)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelDineroactualLayout.setVerticalGroup(
            PanelDineroactualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDineroactualLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDineroactual))
        );

        Panel.add(PanelDineroactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 30));

        PanelDinero.setBackground(new java.awt.Color(0, 0, 0));

        lblDinero.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        lblDinero.setForeground(new java.awt.Color(255, 0, 0));
        lblDinero.setText("Dinero a Agregar:");
        lblDinero.setAlignmentY(0.0F);

        javax.swing.GroupLayout PanelDineroLayout = new javax.swing.GroupLayout(PanelDinero);
        PanelDinero.setLayout(PanelDineroLayout);
        PanelDineroLayout.setHorizontalGroup(
            PanelDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDineroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDineroLayout.setVerticalGroup(
            PanelDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDineroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDinero))
        );

        Panel.add(PanelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, -1));

        txtDineroactual.setBackground(new java.awt.Color(0, 0, 0));
        txtDineroactual.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtDineroactual.setForeground(new java.awt.Color(255, 255, 255));
        txtDineroactual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDineroactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDineroactualActionPerformed(evt);
            }
        });
        Panel.add(txtDineroactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoclientes.jpg"))); // NOI18N
        Panel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 491));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void ComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombreActionPerformed
        if (this.ComboNombre.getSelectedIndex() == 0) {
            this.txtDinero.setEditable(false);
            this.btnAgregar.setEnabled(false);
            this.txtDinero.setText("");
            this.txtDineroactual.setText("");
        } else {
            this.txtDinero.setEditable(true);
            this.btnAgregar.setEnabled(true);
            this.dineroActual(this.ComboNombre.getSelectedIndex());
        }
    }//GEN-LAST:event_ComboNombreActionPerformed

    private void txtDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDineroActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        this.agregarDinero(this.ComboNombre.getSelectedIndex(), this.ComboNombre.getItemAt(this.ComboNombre.getSelectedIndex()), Integer.parseInt(this.txtDinero.getText()));
        this.iniciar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDineroactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDineroactualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDineroactualActionPerformed

    private void txtDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDineroKeyTyped
        //condicion para que ingresen solo numeros  
        int num = 9;
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor solo ingrese numeros");
            txtDinero.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor solo ingrese numeros");
            txtDinero.setCursor(null);
        }
        if (txtDinero.getText().length() >= num) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un monto menor a 9 cifras");
        }
    }//GEN-LAST:event_txtDineroKeyTyped

    public void model() {
        boolean flag = true;
        int id = 1;//SE FIJA EL ID DESDE EL CUAL COMENZARA EL RECORRIDO
        int tamaño = 0;
        String TraerNombres = "";
        while (flag == true) {
            try {
                //SE ESTABLECE UNA RUTA DINAMICA 
                File ruta = new File("src\\ArchivosClientes\\" + id + ".txt");

                if (ruta.exists()) {
                    FileReader fr = new FileReader(ruta.getAbsolutePath());
                    BufferedReader bf = new BufferedReader(fr);
                    String texto;

                    while ((texto = bf.readLine()) != null) {

                        String Separar[] = texto.split("_"); //SEPARA AL NOMBRE Y AL DINERO EN UN ARREGLO
                        TraerNombres = TraerNombres.concat(Separar[0]).concat("_"); //CONCATENA LOS NOMBRES QUE ENCUENTRA

                        tamaño++;//SE AUMENTA EL TAMAÑO PARA EL ARREGLO QUE SE CREARA DESPUES
                    }
                    fr.close();
                    bf.close();
                    id++;
                } else {
                    flag = false;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            /////////////////////////////////CREA EL MODELO SEGUN EL NUMERO DE CLIENTES//////////   
            String Separar[] = TraerNombres.split("_");//SEPARA EN UN ARREGLO LOS NOMBRES QUE SE HABIAN CONCATENADO

            try {
                String combo[] = new String[tamaño + 1];//SE CREA EL ARREGLO DE NOMBRES EN LA VARIABLE COMBO
                combo[0] = "..."; //SE FIJA EL PRIMER VALOR DEL ARREGLO 

                for (int i = 1; i < combo.length; i++) {
                    combo[i] = Separar[i - 1];  //SE LLENA EL COMBO CON LOS NOMBRES QUE CONTIENE LA VARIABLE SEPARAR
                }
                //SETEA EL NUEVO COMBO CON LOS NOMBRES DE LOS JUGADORES EXISTENTES, REEMPLAZANDO EL COMBO POR DEFECTO
                this.ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(combo));
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public void agregarDinero(int id, String nombre, int dineroNuevo) {
        File ruta = new File("src\\ArchivosClientes\\" + id + ".txt");
        File file = new File(ruta.getAbsolutePath());
        int dineroAntiguo = 0;
        try {
//////////////////////////////////TRAE EL DINERO QUE EL JUGADOR YA TENIA////////////////
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader bf = new BufferedReader(fr);
                String texto;
                while ((texto = bf.readLine()) != null) {

                    String Separar[] = texto.split("_");//SE SEPARA EL NOMBRE Y EL DINERO EN UN ARREGLO
                    dineroAntiguo = Integer.parseInt(Separar[1]);// SE GUARDA EN LA VARIABLE EL DINERO QUE EL JUGADOR
                    //YA POSEIA               

                }
                bf.close();
                fr.close();
            }
            if (file.exists()) {
////////////////AGREGA EL NUEVO DINERO AL DINERO QUE EL JUGADOR YA POSEIA//////////////////
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                pw.write(nombre + "_" + (dineroAntiguo + dineroNuevo));//RESCRIBE EN EL ARCHIVO EL NOMBRE DEL JUGADOR
                // Y EL DINERO NUEVO MAS EL ANTIGUO (TOTAL)

                pw.close();
                bw.close();
                fw.close();

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dineroActual(int id) {
        //SE ESTABLECE LA RUTA SEGUN EL ID DEL JUGADOR SELECCIONADO EN EL COMBOBOX
        File ruta = new File("src\\ArchivosClientes\\" + id + ".txt");
        File file = new File(ruta.getAbsolutePath());
        int dineroActual = 0;
        try {
/////////////////////////////TRAE EL DINERO ACTUAL DEL JUGADOR///////////////////
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader bf = new BufferedReader(fr);
                String texto;
                while ((texto = bf.readLine()) != null) {

                    String Separar[] = texto.split("_");//SE SEPARA EL NOMBRE Y EL DINERO EN UN ARREGLO
                    dineroActual = Integer.parseInt(Separar[1]);// SE GUARDA EN LA VARIABLE EL DINERO QUE EL JUGADOR POSEE

                }
                bf.close();
                fr.close();

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        this.txtDineroactual.setText(String.valueOf(dineroActual));//SE SETEA EL TXTFIELD CON EL DINERO ACTUAL
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
            java.util.logging.Logger.getLogger(AgregarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDinero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboNombre;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelDinero;
    private javax.swing.JPanel PanelDineroactual;
    private javax.swing.JPanel PanelJugador;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblDinero;
    private javax.swing.JLabel lblDineroactual;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JTextField txtDinero;
    private javax.swing.JTextField txtDineroactual;
    // End of variables declaration//GEN-END:variables
}
