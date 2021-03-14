/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib.poo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GUIFactura extends javax.swing.JFrame {

    
    double t = 0.0;

    /**
     * Creates new form Factura
     */
    public GUIFactura() {
        initComponents();

        try {
            ObjectInputStream recuperarFactura = new ObjectInputStream(new FileInputStream("Factura.txt"));
            ArrayList<Facturas> factura = (ArrayList<Facturas>) recuperarFactura.readObject();
            recuperarFactura.close();
            System.out.println("Factura recuperado con exito");
            for (Facturas facturas : factura) {

                if (Integer.toString(facturas.getCedula()).length() < 10) {

                    txaSalida.append("0" + facturas.getCedula() + "\n" + facturas.getNombre() + "\n" + facturas.getCiudad()
                            + "\n" + facturas.getDomicilio() + "\n\n");
                } else {
                    txaSalida.append(facturas.getCedula() + "\n" + facturas.getNombre() + "\n" + facturas.getCiudad()
                            + "\n" + facturas.getDomicilio() + "\n\n");
                }

            }

            try {
                ObjectInputStream recuperarObjeto = new ObjectInputStream(new FileInputStream("Venta.txt"));
                ArrayList<Venta> venta = (ArrayList<Venta>) recuperarObjeto.readObject();
                recuperarObjeto.close();
                System.out.println("Lista recuperado con exito");

                txaSalida.append("Codigo \t Nombre \t\t Cantidad \t Precio\n");
                for (Venta pr : venta) {

                    txaSalida.append(pr.getCodigo() + "\t" + pr.getNombre() + "\t\t" + pr.getStock() + "\t"
                            + pr.totalPagar() + "\n");
                    t = t + pr.totalPagar();

                }
                txaSalida.append("\n\n\n TOTAL A PAGAR: ");
                txaSalida.append(t + "\n");
                txaSalida.setBounds(168, 45, 421, 300);

            } catch (FileNotFoundException e1) {
                System.out.println("Error1");
            } catch (IOException e1) {
                System.out.println("Error2");
            } catch (ClassNotFoundException e1) {
                System.out.println("Error3");
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Error1");
        } catch (IOException e1) {
            System.out.println("Error2");
        } catch (ClassNotFoundException e1) {
            System.out.println("Error3");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFactura = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSalida = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFactura.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblFactura.setText("FACTURA");
        getContentPane().add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        btnFinalizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 50));

        txaSalida.setColumns(20);
        txaSalida.setRows(5);
        txaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txaSalidaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txaSalida);
        txaSalida.getAccessibleContext().setAccessibleParent(txaSalida);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 520, 240));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/FondoFactura.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
 JOptionPane.showMessageDialog(getContentPane(), "La factura se ha impreso", "Mensaje", 1);
        Menu nuevoMenu = new Menu();
        nuevoMenu.setVisible(true);
        GUIFactura.this.dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txaSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txaSalidaKeyTyped
        // TODO add your handling code here:
        if ((int) evt.getKeyChar() > 0) {
	evt.consume();
        }
    }//GEN-LAST:event_txaSalidaKeyTyped

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
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextArea txaSalida;
    // End of variables declaration//GEN-END:variables
}
