package listacompra.gui;

import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import listacompra.dto.Producto;
import listacompra.gui.tablamodelos.ProductosTablaModelo;
import listacompra.logica.LogicaListaCompra;
import org.netbeans.validation.api.builtin.stringvalidation.MayusculasValidacion;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author Irache Mtnez.
 */
public class ListaCompra extends javax.swing.JFrame {

    public ListaCompra() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/listacompra/gui/images/icono.png")).getImage());
        refrescarTabla();
        jButtonAnadirProducto.setEnabled(false);
        ValidationGroup grupo = panelValidacion.getValidationGroup();
        grupo.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING, new MayusculasValidacion());

        panelValidacion.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (panelValidacion.getProblem() == null) {
                    jButtonAnadirProducto.setEnabled(true);
                } else {
                    jButtonAnadirProducto.setEnabled(false);
                }
            }
        });
    }

    private void refrescarTabla() {
        jTableListaCompra.setModel(new ProductosTablaModelo(LogicaListaCompra.getListaProductos()));
    }

    private void borrarDatosFormulario() {
        jSpinnerCantidad.setValue(1);
        jTextFieldNombre.setText("");
        jComboBoxSeccion.setSelectedIndex(0);
        jCheckBoxUrgente.setSelected(false);
    }

    private void borrarFilas() {
        if (!LogicaListaCompra.listaVacia()) {
            boolean noHayFilasSeleccionadas = true;
            for (int i = 0; i < jTableListaCompra.getRowCount(); i++) {
                if (jTableListaCompra.getValueAt(i, 0) == "true") {
                    LogicaListaCompra.borrarProducto(i);
                    noHayFilasSeleccionadas = false;
                }
            }
            if (noHayFilasSeleccionadas = true) {
                JOptionPane.showMessageDialog(this, "No hay filas seleccionadas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                refrescarTabla();
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay productos en la lista.", "Advertencia", JOptionPane.WARNING_MESSAGE);
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

        jPanelProducto = new javax.swing.JPanel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelSeccion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxSeccion = new javax.swing.JComboBox<>();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jCheckBoxUrgente = new javax.swing.JCheckBox();
        jButtonAnadirProducto = new javax.swing.JButton();
        panelValidacion = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jLabelListaCompra = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaCompra = new javax.swing.JTable();
        buttonBorrarSeleccion = new java.awt.Button();
        buttonBorrarLista = new java.awt.Button();
        buttonImprimir = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de la compra");

        jLabelCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(0, 0, 51));
        jLabelCantidad.setText("Cantidad:");

        jLabelSeccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSeccion.setForeground(new java.awt.Color(0, 0, 51));
        jLabelSeccion.setText("Sección:");

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jTextFieldNombre.setToolTipText("Nombre del producto");
        jTextFieldNombre.setName("Nombre"); // NOI18N
        jTextFieldNombre.setNextFocusableComponent(jComboBoxSeccion);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jComboBoxSeccion.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jComboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Panadería", "Pescadería", "Frutería", "Carnicería", "Charcutería", "Conservas", "Perfumería", "General" }));
        jComboBoxSeccion.setToolTipText("Sección del supermercado");
        jComboBoxSeccion.setName("Sección"); // NOI18N
        jComboBoxSeccion.setNextFocusableComponent(jCheckBoxUrgente);

        jSpinnerCantidad.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 250, 1));
        jSpinnerCantidad.setToolTipText("Unidades necesarias");
        jSpinnerCantidad.setName("Cantidad"); // NOI18N
        jSpinnerCantidad.setNextFocusableComponent(jTextFieldNombre);

        jCheckBoxUrgente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxUrgente.setForeground(new java.awt.Color(0, 0, 51));
        jCheckBoxUrgente.setText("Urgente");
        jCheckBoxUrgente.setToolTipText("Marcar si es urgente");
        jCheckBoxUrgente.setName("Urgente"); // NOI18N
        jCheckBoxUrgente.setNextFocusableComponent(jButtonAnadirProducto);
        jCheckBoxUrgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUrgenteActionPerformed(evt);
            }
        });

        jButtonAnadirProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listacompra/gui/images/cesta_imagen.png"))); // NOI18N
        jButtonAnadirProducto.setToolTipText("Añadir a la lista");
        jButtonAnadirProducto.setBorder(null);
        jButtonAnadirProducto.setBorderPainted(false);
        jButtonAnadirProducto.setContentAreaFilled(false);
        jButtonAnadirProducto.setNextFocusableComponent(buttonBorrarSeleccion);
        jButtonAnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirProductoActionPerformed(evt);
            }
        });

        jLabelListaCompra.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabelListaCompra.setForeground(new java.awt.Color(0, 0, 51));
        jLabelListaCompra.setText("Mi lista de la compra");

        jTableListaCompra.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jTableListaCompra.setForeground(new java.awt.Color(0, 0, 51));
        jTableListaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableListaCompra.setToolTipText("Listado de Productos");
        jTableListaCompra.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane2.setViewportView(jTableListaCompra);

        buttonBorrarSeleccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonBorrarSeleccion.setLabel("Borrar Selección");
        buttonBorrarSeleccion.setName("Borrar Seleccion"); // NOI18N
        buttonBorrarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarSeleccionActionPerformed(evt);
            }
        });

        buttonBorrarLista.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonBorrarLista.setLabel("Borrar Lista");
        buttonBorrarLista.setName("Borrar Lista"); // NOI18N
        buttonBorrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarListaActionPerformed(evt);
            }
        });

        buttonImprimir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonImprimir.setLabel("Imprimir");
        buttonImprimir.setName("Imprimir"); // NOI18N
        buttonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProductoLayout = new javax.swing.GroupLayout(jPanelProducto);
        jPanelProducto.setLayout(jPanelProductoLayout);
        jPanelProductoLayout.setHorizontalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductoLayout.createSequentialGroup()
                                .addComponent(jLabelSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProductoLayout.createSequentialGroup()
                                .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductoLayout.createSequentialGroup()
                                .addGap(0, 149, Short.MAX_VALUE)
                                .addComponent(jCheckBoxUrgente))
                            .addComponent(jTextFieldNombre)))
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButtonAnadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabelListaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelValidacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelProductoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(buttonBorrarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(buttonBorrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(buttonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelProductoLayout.setVerticalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxUrgente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelValidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBorrarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBorrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxUrgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUrgenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUrgenteActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    //Botón imprimir
    private void buttonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImprimirActionPerformed
        JOptionPane.showMessageDialog(this, LogicaListaCompra.crearLista(), "Lista de la Compra", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_buttonImprimirActionPerformed

    //Botón borrar selección
    private void buttonBorrarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarSeleccionActionPerformed
        borrarFilas();
    }//GEN-LAST:event_buttonBorrarSeleccionActionPerformed

    //Botón borrar lista completa
    private void buttonBorrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarListaActionPerformed
        LogicaListaCompra.borrarListaProductos();
        refrescarTabla();
    }//GEN-LAST:event_buttonBorrarListaActionPerformed

    //botón Agregar Producto a la tabla (imagen cesta compra +)
    private void jButtonAnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirProductoActionPerformed

        Producto producto = new Producto(
                (int) jSpinnerCantidad.getValue(),
                jTextFieldNombre.getText(),
                jComboBoxSeccion.getSelectedItem().toString(),
                jCheckBoxUrgente.isSelected()
        );
        LogicaListaCompra.anadirProducto(producto);
        refrescarTabla();
        borrarDatosFormulario();

    }//GEN-LAST:event_jButtonAnadirProductoActionPerformed

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
            java.util.logging.Logger.getLogger(ListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es", "ES"));
                new ListaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonBorrarLista;
    private java.awt.Button buttonBorrarSeleccion;
    private java.awt.Button buttonImprimir;
    private javax.swing.JButton jButtonAnadirProducto;
    private javax.swing.JCheckBox jCheckBoxUrgente;
    private javax.swing.JComboBox<String> jComboBoxSeccion;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelListaCompra;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSeccion;
    private javax.swing.JPanel jPanelProducto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableListaCompra;
    private javax.swing.JTextField jTextFieldNombre;
    private org.netbeans.validation.api.ui.swing.ValidationPanel panelValidacion;
    // End of variables declaration//GEN-END:variables
}
