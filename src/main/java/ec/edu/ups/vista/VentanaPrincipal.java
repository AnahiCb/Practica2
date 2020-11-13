/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
/**
 *
 * @author Anahi
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private RegistroUsuario registroUsuario;
    private VentanaIniciarSesion ventanaIniciarSesion;
    private GestionTelefono gestionTelefono;
    private ControladorUsuario controladorUsuario;
    private ControladorTelefono controladorTelefono;
    /**
     * Creates new form VentanaPrincipal1
     */
    public VentanaPrincipal() {
        initComponents();

        controladorUsuario = new ControladorUsuario();
        controladorTelefono = new ControladorTelefono();

        gestionTelefono = new GestionTelefono(controladorUsuario, controladorTelefono);
        registroUsuario = new RegistroUsuario(controladorUsuario);
        ventanaIniciarSesion = new VentanaIniciarSesion(controladorUsuario, this, 
        gestionTelefono);
        

        desktopPane.add(registroUsuario);
        desktopPane.add(ventanaIniciarSesion);
        desktopPane.add(registroTelefono);
        desktopPane.add(gestionTelefono);;

        this.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
    }

    public JMenu getMenuGestion() {
        return menuGestion;
    }

    public JMenuItem getCerrarSesion() {
        return cerrarSesion;
    }

    public JMenuItem getRegistroUsuario() {
        return registroUsu;
    }

    public JMenuItem getInicioSesion() {
        return inicioSesion;
    }

    public void cerrarVentanas() {
        registroUsuario.setVisible(false);
        ventanaIniciarSesion.setVisible(false);
        registroTelefonos.setVisible(false);
        gestionTelefonos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        inicioSesion = new javax.swing.JMenuItem();
        registroUsu = new javax.swing.JMenuItem();
        registroTelefonos = new javax.swing.JMenuItem();
        cerrarSesion = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        gestionTelefonos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        menuInicio.setMnemonic('f');
        menuInicio.setText("Inicio");

        inicioSesion.setMnemonic('o');
        inicioSesion.setText("Iniciar Sesión");
        inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSesionActionPerformed(evt);
            }
        });
        menuInicio.add(inicioSesion);

        registroUsu.setMnemonic('s');
        registroUsu.setText("Registro Usuario");
        registroUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroUsuActionPerformed(evt);
            }
        });
        menuInicio.add(registroUsu);

        registroTelefonos.setMnemonic('a');
        registroTelefonos.setText("Registro Teléfono");
        registroTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroTelefonosActionPerformed(evt);
            }
        });
        menuInicio.add(registroTelefonos);

        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        menuInicio.add(cerrarSesion);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuInicio.add(exitMenuItem);

        menuBar.add(menuInicio);

        menuGestion.setMnemonic('e');
        menuGestion.setText("Gestion");

        gestionTelefonos.setMnemonic('t');
        gestionTelefonos.setText("Gestión Teléfono");
        gestionTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionTelefonosActionPerformed(evt);
            }
        });
        menuGestion.add(gestionTelefonos);

        menuBar.add(menuGestion);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void registroUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroUsuActionPerformed
        cerrarVentanas();
        registroUsuario.setVisible(true);
    }//GEN-LAST:event_registroUsuActionPerformed

    private void inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSesionActionPerformed
        cerrarVentanas();
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_inicioSesionActionPerformed

    private void registroTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroTelefonosActionPerformed
        cerrarVentanas();
        registroTelefonos.setVisible(true);
    }//GEN-LAST:event_registroTelefonosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        cerrarVentanas();
        menuGestion.setEnabled(false);
        cerrarSesion.setEnabled(false);
        registroUsuario.setEnabled(true);
        inicioSesion.setEnabled(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void gestionTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionTelefonosActionPerformed
        cerrarVentanas();
        gestionTelefonos.setVisible(true);
    }//GEN-LAST:event_gestionTelefonosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem gestionTelefonos;
    private javax.swing.JMenuItem inicioSesion;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem registroTelefonos;
    private javax.swing.JMenuItem registroUsu;
    // End of variables declaration//GEN-END:variables

}
