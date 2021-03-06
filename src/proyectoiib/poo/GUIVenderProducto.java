/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib.poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GUIVenderProducto extends javax.swing.JFrame {

    ArrayList<Venta> venta = new ArrayList<Venta>();
    ArrayList<Factura> factura = new ArrayList<Factura>();
    
    int a = 0;
    int vt = 0;
    String vp = "";

    
    /**
     * Creates new form VenderProducto
     */
    public GUIVenderProducto() {
        initComponents();
        
        
        try {
            ObjectInputStream recuperarObjeto = new ObjectInputStream(new FileInputStream("Productos.txt"));
            ArrayList<Producto> producto = (ArrayList<Producto>) recuperarObjeto.readObject();
            recuperarObjeto.close();
            System.out.println("Lista de productos recuperado con exito");
            
            
        txtCodigo.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	 for(Producto pr2 : producto) {
             if (e.getActionCommand().compareTo(pr2.getCodigo()) == 0) {
                 a++;
                 vp = pr2.getNombre();
                 vt = pr2.getStock();
             }
         }
	if (a > 0) {
            JOptionPane.showMessageDialog(getContentPane(), "El producto a vender es: " + vp, "Mensaje", 1);
            JOptionPane.showMessageDialog(getContentPane(), "Cantidad disponible: " + vt, "Mensaje", 1);
        } else {
            JOptionPane.showMessageDialog(getContentPane(), "El producto no existe", "Mensaje", 0);
        }
        a = 0;
        vt = 0;
        vp = "";
        }
        });
            
        btnAgregar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
        Venta v = new Venta();
	v.setCodigo(txtCodigo.getText());
        v.setStock(Integer.parseInt(txtCantidad.getText()));
        for (Producto prod : producto) {
            if (v.getCodigo().compareTo(prod.getCodigo()) == 0) {
                v.setNombre(prod.getNombre());
                v.setPrecio(prod.getPrecio());
                prod.setStock(prod.getStock() - v.getStock());
            }
        }
        txtCodigo.setText("");
        txtCantidad.setText("");
        venta.add(v);
        JOptionPane.showMessageDialog(getContentPane(), "Producto vendido", "Mensaje", 1);
        
        try {
            ObjectOutputStream guardarObjeto = new ObjectOutputStream(
                    new FileOutputStream("Productos.txt"));
            guardarObjeto.writeObject(producto);
            guardarObjeto.close();
            System.out.println("Lista guardada con exito");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            ObjectOutputStream guardarVenta = new ObjectOutputStream(new FileOutputStream("Venta.txt"));
            guardarVenta.writeObject(venta);
            guardarVenta.close();
            System.out.println("Venta guardada con exito");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }        
        }
});
        btnGenerarFactura.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
            factura.add(new Factura(Integer.parseInt(txtCedula.getText()), txtNombre.getText(), txtCiudad.getText(),
	txtDireccion.getText()));
	try {
            ObjectOutputStream guardarFactura = new ObjectOutputStream(new FileOutputStream("Factura.txt"));
            guardarFactura.writeObject(factura);
            guardarFactura.close();
            System.out.println("Venta guardada con exito");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        
	GUIFactura nuevoMenu = new GUIFactura();
        nuevoMenu.setVisible(true);
        GUIVenderProducto.this.dispose();
        }
     });   
        } catch (IOException iOException) {
        } catch (ClassNotFoundException classNotFoundException) {
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

        lblProducto = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vender");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProducto.setBackground(new java.awt.Color(255, 255, 255));
        lblProducto.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(204, 0, 51));
        lblProducto.setText("Producto");
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 130, 40));

        lblInformacion.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(204, 0, 0));
        lblInformacion.setText("Información");
        getContentPane().add(lblInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 170, 33));

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 87, 54, -1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 110, -1));

        lblCantidad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, -1));

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 91, 33));

        lblCedula.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCedula.setText("Cédula");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, -1));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 60, -1));

        lblCiudad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCiudad.setText("Ciudad");
        getContentPane().add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 50, -1));

        lblDireccion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblDireccion.setText("Dirección");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 70, -1));

        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnRegresar.setText("Volver");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 116, 38));

        btnGenerarFactura.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGenerarFactura.setText("Generar factura");
        getContentPane().add(btnGenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 38));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 90, 110, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 130, 110, -1));

        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 170, 110, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 210, 110, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/FondoVenderProducto.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        Menu nuevoMenu = new Menu();
        nuevoMenu.setVisible(true);
        GUIVenderProducto.this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // TODO add your handling code here:
        if ((int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57) {
	evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        if ((int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57) {
	evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        if ((int) evt.getKeyChar() < 48 || (int) evt.getKeyChar() > 57) {
	evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if ((int) evt.getKeyChar() > 48 && (int) evt.getKeyChar() < 58) {
	evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        // TODO add your handling code here:
        if ((int) evt.getKeyChar() > 48 && (int) evt.getKeyChar() < 58) {
	evt.consume();
        }
    }//GEN-LAST:event_txtCiudadKeyTyped

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
            java.util.logging.Logger.getLogger(GUIVenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVenderProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
