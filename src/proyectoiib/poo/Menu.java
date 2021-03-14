/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib.poo;



public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPCStore = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        btnNuevosProductos = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnAumentar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPCStore.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        lblPCStore.setText("PC STORE");
        getContentPane().add(lblPCStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        lblBienvenido.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblBienvenido.setText("BIENVENIDO");
        getContentPane().add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        btnNuevosProductos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNuevosProductos.setText("Nuevos Productos");
        btnNuevosProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevosProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, -1));

        btnVender.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 160, -1));

        btnInventario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 160, -1));

        btnAumentar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAumentar.setText("Aumentar");
        btnAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAumentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 160, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 160, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/FondoMenu.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        GUIEliminarProducto nuevoElim = new GUIEliminarProducto();
        nuevoElim.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevosProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevosProductosActionPerformed
        // TODO add your handling code here:
        GUIAniadirProducto nuevoProducto = new GUIAniadirProducto();
        nuevoProducto.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_btnNuevosProductosActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        GUIVenderProducto nuevaVenta = new GUIVenderProducto();
        nuevaVenta.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarActionPerformed
        // TODO add your handling code here:
        GUIAumentar nuevoAum = new GUIAumentar();
        nuevoAum.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_btnAumentarActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        GUIInventario nuevoInventario = new GUIInventario();
        nuevoInventario.setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNuevosProductos;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPCStore;
    // End of variables declaration//GEN-END:variables
}
