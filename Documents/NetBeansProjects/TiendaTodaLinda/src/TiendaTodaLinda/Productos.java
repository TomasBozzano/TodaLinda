package TiendaTodaLinda;

import TiendaTodaLinda.Clases.ComboBox;
import TiendaTodaLinda.Clases.Conexion;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JPanel {
    
    Connection con;
    Statement st;
    DefaultTableModel modelo;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cs;
    ResultSetMetaData rsMd;

    public Productos() {
        initComponents();
        jCodProd.setText("Escriba el codigo del producto");
        jProdNombre.setText("Escriba el nombre del producto");
        
        // Primero, creas un objeto ComboBox
        ComboBox cm = new ComboBox();

        // Luego, llamas a ConsultaComboBox para cada JComboBox que quieras llenar
        cm.ConsultaComboBox("Marca","nombreMarca", jComboMarca); // Llena jComboMarca con datos de la tabla "Marca"
        cm.ConsultaComboBox("Tipo_prenda","nombreTp", jComboTipo); // Llena jComboTipo con datos de la tabla "Tipo_prenda"
        jBusqueda.setText("Busqueda..");
        consulta();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorProductos = new java.awt.Panel();
        CargarCli = new java.awt.Panel();
        jId = new javax.swing.JTextField();
        jIdL = new javax.swing.JLabel();
        jNombreL = new javax.swing.JLabel();
        jCodL = new javax.swing.JLabel();
        jCodProd = new javax.swing.JTextField();
        jProdNombre = new javax.swing.JTextField();
        jActualizarProd = new javax.swing.JButton();
        jGuardarProd = new javax.swing.JButton();
        jEliminarProd = new javax.swing.JButton();
        jMarcaL = new javax.swing.JLabel();
        jTipoL = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jComboMarca = new javax.swing.JComboBox<>();
        jResetear = new javax.swing.JButton();
        jBusqueda = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProducto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(183, 226, 209));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 730));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorProductos.setBackground(new java.awt.Color(254, 249, 245));
        ContenedorProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContenedorProductos.setMaximumSize(new java.awt.Dimension(700, 450));
        ContenedorProductos.setMinimumSize(new java.awt.Dimension(700, 450));

        CargarCli.setBackground(new java.awt.Color(254, 255, 190));
        CargarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarCli.setForeground(new java.awt.Color(255, 255, 255));
        CargarCli.setMaximumSize(new java.awt.Dimension(610, 450));
        CargarCli.setMinimumSize(new java.awt.Dimension(610, 450));

        jId.setForeground(new java.awt.Color(102, 102, 102));
        jId.setToolTipText("");
        jId.setEnabled(false);

        jIdL.setBackground(new java.awt.Color(204, 204, 204));
        jIdL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIdL.setText("ID :");
        jIdL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jNombreL.setBackground(new java.awt.Color(204, 204, 204));
        jNombreL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNombreL.setText("Nombre :");
        jNombreL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCodL.setBackground(new java.awt.Color(204, 204, 204));
        jCodL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCodL.setText("Cod. Producto :");
        jCodL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCodProd.setForeground(new java.awt.Color(102, 102, 102));
        jCodProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCodProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCodProdFocusLost(evt);
            }
        });

        jProdNombre.setForeground(new java.awt.Color(102, 102, 102));
        jProdNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jProdNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jProdNombreFocusLost(evt);
            }
        });

        jActualizarProd.setText("Actualizar");
        jActualizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarProdActionPerformed(evt);
            }
        });

        jGuardarProd.setText("Guardar");
        jGuardarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarProdActionPerformed(evt);
            }
        });

        jEliminarProd.setText("Eliminar");
        jEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarProdActionPerformed(evt);
            }
        });

        jMarcaL.setBackground(new java.awt.Color(204, 204, 204));
        jMarcaL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarcaL.setText("Marca :");
        jMarcaL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTipoL.setBackground(new java.awt.Color(204, 204, 204));
        jTipoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTipoL.setText("Tipo :");
        jTipoL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese el Tipo de prenda" }));

        jComboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese la marca" }));

        jResetear.setText("Limpiar");
        jResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetearActionPerformed(evt);
            }
        });

        jBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBusquedaFocusLost(evt);
            }
        });
        jBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBusquedaKeyPressed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CargarCliLayout = new javax.swing.GroupLayout(CargarCli);
        CargarCli.setLayout(CargarCliLayout);
        CargarCliLayout.setHorizontalGroup(
            CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarCliLayout.createSequentialGroup()
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CargarCliLayout.createSequentialGroup()
                                .addComponent(jNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProdNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                            .addGroup(CargarCliLayout.createSequentialGroup()
                                .addComponent(jCodL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCodProd))
                            .addGroup(CargarCliLayout.createSequentialGroup()
                                .addComponent(jIdL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CargarCliLayout.createSequentialGroup()
                                    .addComponent(jTipoL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CargarCliLayout.createSequentialGroup()
                                    .addComponent(jMarcaL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargarCliLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jActualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        CargarCliLayout.setVerticalGroup(
            CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarCliLayout.createSequentialGroup()
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCodL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMarcaL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTipoL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar)))
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jEliminarProd)
                        .addGap(18, 18, 18)
                        .addComponent(jGuardarProd)
                        .addGap(21, 21, 21)
                        .addComponent(jActualizarProd)
                        .addGap(18, 18, 18)
                        .addComponent(jResetear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cod. Prod", "Nombre", "Marca", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jProducto);

        javax.swing.GroupLayout ContenedorProductosLayout = new javax.swing.GroupLayout(ContenedorProductos);
        ContenedorProductos.setLayout(ContenedorProductosLayout);
        ContenedorProductosLayout.setHorizontalGroup(
            ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorProductosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CargarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ContenedorProductosLayout.setVerticalGroup(
            ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 660, 570));

        jTitulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTitulo.setText("Alta Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 290, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCodProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCodProdFocusGained
        if (jCodProd.getText().equals("Escriba el codigo del producto")) {
            jCodProd.setText("");
            jCodProd.setForeground(black);
        }
    }//GEN-LAST:event_jCodProdFocusGained

    private void jCodProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCodProdFocusLost
        if (jCodProd.getText().equals("")) {
            jCodProd.setText("Escriba el codigo del producto");
            jCodProd.setForeground(gray);
        }
    }//GEN-LAST:event_jCodProdFocusLost

    private void jProdNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdNombreFocusGained
        if (jProdNombre.getText().equals("Escriba el nombre del producto")) {
            jProdNombre.setText("");
            jProdNombre.setForeground(black);
        }
    }//GEN-LAST:event_jProdNombreFocusGained

    private void jProdNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdNombreFocusLost
        if(jProdNombre.getText().equals("")) {
            jProdNombre.setText("Escriba el nombre del producto");
            jProdNombre.setForeground(gray);
        }
    }//GEN-LAST:event_jProdNombreFocusLost

    private void jActualizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarProdActionPerformed
        actualizar();
    }//GEN-LAST:event_jActualizarProdActionPerformed

    private void jGuardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarProdActionPerformed
        guardar();
    }//GEN-LAST:event_jGuardarProdActionPerformed

    private void jEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarProdActionPerformed
        eliminar();
    }//GEN-LAST:event_jEliminarProdActionPerformed

    private void jProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductoMouseClicked
        if (evt.getClickCount() == 1) {
        int selectedRow = jProducto.getSelectedRow(); // Obtener el índice de la fila seleccionada
        
        if (selectedRow != -1) { // Verificar que una fila esté seleccionada
            jId.setText(jProducto.getValueAt(selectedRow, 0).toString());
            jCodProd.setText(jProducto.getValueAt(selectedRow, 1).toString());
            jProdNombre.setText(jProducto.getValueAt(selectedRow, 2).toString());

            // Obtener los valores de los índices de los ComboBox desde la tabla
            int marcaIndex = getIndexFromComboBox(jComboMarca, jProducto.getValueAt(selectedRow, 3).toString());
            int tipoIndex = getIndexFromComboBox(jComboTipo, jProducto.getValueAt(selectedRow, 4).toString());

            // Actualizar los JComboBox con los índices correspondientes
            jComboMarca.setSelectedIndex(marcaIndex);
            jComboTipo.setSelectedIndex(tipoIndex);

            jGuardarProd.setEnabled(false);
            jId.setEnabled(false);
            jCodProd.setEnabled(false);
        }
    }
}

    private int getIndexFromComboBox(JComboBox<String> comboBox, String value) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        if (comboBox.getItemAt(i).equals(value)) {
            return i;
        }
    }
    return -1;
    }//GEN-LAST:event_jProductoMouseClicked

    private void jResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetearActionPerformed
        resetear();
    }//GEN-LAST:event_jResetearActionPerformed

    private void jBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBusquedaFocusGained
        if (jBusqueda.getText().equals("Busqueda..")) {
            jBusqueda.setText("");
            jBusqueda.setForeground(black);
        }
    }//GEN-LAST:event_jBusquedaFocusGained

    private void jBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBusquedaFocusLost
        if (jBusqueda.getText().equals("")) {
            jBusqueda.setText("Busqueda..");
            jBusqueda.setForeground(gray);
        }
    }//GEN-LAST:event_jBusquedaFocusLost

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBusquedaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String buscar = jBusqueda.getText();
        buscar();
       }
    }//GEN-LAST:event_jBusquedaKeyPressed
    //metodo consulta para llenar tabla
public void consulta() {
        try {
            modelo = new DefaultTableModel();

            Conexion cn = new Conexion();
            con = cn.conectar();
            ps = con.prepareCall("ConsultaProductos");
            rs = ps.executeQuery();

            rsMd = rs.getMetaData();
            int cantidadColumna = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Cod.Prod");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            modelo.addColumn("Tipo");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumna];

                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
            jProducto.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    //metodo guardar
public void guardar() {
    String cod = jCodProd.getText();
    String nombre = jProdNombre.getText();

    // Obtener el Item seleccionado del JComboBox
    int marcaItem = jComboMarca.getSelectedIndex();
    int tipoItem = jComboTipo.getSelectedIndex();


    String sqlConsulta = "{call ExisteProducto(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, cod);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "El Producto ya existe");
            resetear();
            return;
        } else {
            String sql = "{call CrearProducto(?, ?, ?, ?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, cod);
                cs.setString(2, nombre);
                cs.setInt(3, marcaItem); // Usar el ID del objeto Item
                cs.setInt(4, tipoItem); // Usar el ID del objeto Item

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo producto agregado");
            }
        }
        consulta();
        resetear();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
    //metodo eliminar
public void eliminar(){
    String id = jId.getText();
    String cod = jCodProd.getText();
    
    if(id.equals("") || cod.equals("")){
        JOptionPane.showMessageDialog(null, "Faltan datos para que se elimine el producto");
    }
    
    String sql = "{call EliminarProd(?, ?)}";

    try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, id);
                cs.setString(2, cod);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto eliminado");
        }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    resetear();
}
    //metodo actualizar
public void actualizar(){
    String Id = jId.getText();
    String cod = jCodProd.getText();
    String nombre = jProdNombre.getText();

    // Obtener el Item seleccionado del JComboBox
    int marcaItem = jComboMarca.getSelectedIndex();
    System.out.print(marcaItem);
    int tipoItem = jComboTipo.getSelectedIndex();
    System.out.print(marcaItem);
    String sql = "{call ModificarProducto(?, ?, ?, ?, ?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, Id);
        cs.setString(2, cod);
        cs.setString(3, nombre);
        cs.setInt(4, marcaItem);
        cs.setInt(5, tipoItem);

        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Producto actualizado");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    resetear();
}
  //resetear componente
public void resetear() {
    jCodProd.setText("Escriba el codigo del producto");
    jProdNombre.setText("Escriba el nombre del producto");
    jComboMarca.setSelectedIndex(0); // Reiniciar JComboBox seleccionando el índice -1 (ninguna selección)
    jComboTipo.setSelectedIndex(0); // Reiniciar JComboBox seleccionando el índice -1 (ninguna selección)
    jBusqueda.setText("Busqueda..");
    jGuardarProd.setVisible(true);
}
    //metodo buscar
public void buscar(){
     String buscar = jBusqueda.getText();
    
    if (buscar.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe colocar el valor a buscar");
        return;
    }

    String sql = "{call BuscarProducto(?)}";

    try (CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, buscar);

        try (ResultSet rs = cs.executeQuery()) {
            // Modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel();

            // Obtener metadatos del ResultSet
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumna = rsMd.getColumnCount();

            // Agregar columnas al modelo
            modelo.addColumn("ID");
            modelo.addColumn("Cod.Prod");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            modelo.addColumn("Tipo");

            // Agregar filas al modelo
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumna];
                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

            // Establecer el modelo en la tabla
            jProducto.setModel(modelo);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Hubo un error al realizar la búsqueda: " + ex.getMessage());
        ex.printStackTrace();
    }
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel CargarCli;
    private java.awt.Panel Contenedor;
    private java.awt.Panel ContenedorProductos;
    private javax.swing.JButton jActualizarProd;
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jBusqueda;
    private javax.swing.JLabel jCodL;
    private javax.swing.JTextField jCodProd;
    private javax.swing.JComboBox<String> jComboMarca;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JButton jEliminarProd;
    private javax.swing.JButton jGuardarProd;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jIdL;
    private javax.swing.JLabel jMarcaL;
    private javax.swing.JLabel jNombreL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jProdNombre;
    private javax.swing.JTable jProducto;
    private javax.swing.JButton jResetear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTipoL;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
