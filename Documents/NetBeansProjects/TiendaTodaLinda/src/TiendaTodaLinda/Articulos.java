
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

public class Articulos extends javax.swing.JPanel {
    
    Connection con;
    Statement st;
    DefaultTableModel modelo;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cs;
    ResultSetMetaData rsMd;
    
    public Articulos() {
        initComponents();
        
        jId.setText("");
        jCodProd.setText("Escriba el codigo del producto");
         // Primero, creas un objeto ComboBox
        ComboBox cm = new ComboBox();

        // Luego, llamas a ConsultaComboBox para cada JComboBox que quieras llenar
        cm.ConsultaComboBox("Talles","talle", jComboTalle); // Llena jComboMarca con datos de la tabla
        cm.ConsultaComboBox("Colores","color", jComboColor); // Llena jComboTipo con datos de la tabla

        jCosto.setText("P.Costo");
        jFinal.setText("P.Final");
        jStock.setText("Stock");
        jBusqueda.setText("Busqueda..");
        
        consulta();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorArticulos = new java.awt.Panel();
        CargarArticulo = new java.awt.Panel();
        jId = new javax.swing.JTextField();
        jIdL = new javax.swing.JLabel();
        jCodL = new javax.swing.JLabel();
        jCodProd = new javax.swing.JTextField();
        jActualizarArt = new javax.swing.JButton();
        jGuardarArt = new javax.swing.JButton();
        jEliminarArt = new javax.swing.JButton();
        jColorL = new javax.swing.JLabel();
        jComboColor = new javax.swing.JComboBox<>();
        jResetear = new javax.swing.JButton();
        jStockL = new javax.swing.JLabel();
        jStock = new javax.swing.JTextField();
        jCostoL1 = new javax.swing.JLabel();
        jCosto = new javax.swing.JTextField();
        jFinalL = new javax.swing.JLabel();
        jFinal = new javax.swing.JTextField();
        jColorL1 = new javax.swing.JLabel();
        jComboTalle = new javax.swing.JComboBox<>();
        jBusqueda = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jArticulo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(183, 226, 209));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 730));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorArticulos.setBackground(new java.awt.Color(254, 249, 245));
        ContenedorArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContenedorArticulos.setMaximumSize(new java.awt.Dimension(700, 450));
        ContenedorArticulos.setMinimumSize(new java.awt.Dimension(700, 450));

        CargarArticulo.setBackground(new java.awt.Color(254, 255, 190));
        CargarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        CargarArticulo.setMaximumSize(new java.awt.Dimension(610, 450));
        CargarArticulo.setMinimumSize(new java.awt.Dimension(610, 450));

        jId.setForeground(new java.awt.Color(102, 102, 102));
        jId.setToolTipText("");
        jId.setEnabled(false);

        jIdL.setBackground(new java.awt.Color(204, 204, 204));
        jIdL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIdL.setText("ID :");
        jIdL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        jActualizarArt.setText("Actualizar");
        jActualizarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarArtActionPerformed(evt);
            }
        });

        jGuardarArt.setText("Guardar");
        jGuardarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarArtActionPerformed(evt);
            }
        });

        jEliminarArt.setText("Eliminar");
        jEliminarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarArtActionPerformed(evt);
            }
        });

        jColorL.setBackground(new java.awt.Color(204, 204, 204));
        jColorL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jColorL.setText("Color :");
        jColorL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese el color" }));

        jResetear.setText("Limpiar");
        jResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetearActionPerformed(evt);
            }
        });

        jStockL.setBackground(new java.awt.Color(204, 204, 204));
        jStockL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jStockL.setText("Stock :");
        jStockL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jStock.setForeground(new java.awt.Color(102, 102, 102));
        jStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jStockFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jStockFocusLost(evt);
            }
        });

        jCostoL1.setBackground(new java.awt.Color(204, 204, 204));
        jCostoL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCostoL1.setText("Costo :");
        jCostoL1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCosto.setForeground(new java.awt.Color(102, 102, 102));
        jCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCostoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCostoFocusLost(evt);
            }
        });

        jFinalL.setBackground(new java.awt.Color(204, 204, 204));
        jFinalL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFinalL.setText("Final :");
        jFinalL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jFinal.setForeground(new java.awt.Color(102, 102, 102));
        jFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFinalFocusLost(evt);
            }
        });

        jColorL1.setBackground(new java.awt.Color(204, 204, 204));
        jColorL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jColorL1.setText("Talle :");
        jColorL1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboTalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese el talle" }));

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

        javax.swing.GroupLayout CargarArticuloLayout = new javax.swing.GroupLayout(CargarArticulo);
        CargarArticulo.setLayout(CargarArticuloLayout);
        CargarArticuloLayout.setHorizontalGroup(
            CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarArticuloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addComponent(jCodL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addComponent(jIdL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addComponent(jColorL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addComponent(jStockL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addComponent(jCostoL1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFinalL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addComponent(jColorL1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboTalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jActualizarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGuardarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEliminarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargarArticuloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        CargarArticuloLayout.setVerticalGroup(
            CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarArticuloLayout.createSequentialGroup()
                .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCodL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboTalle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jColorL1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jColorL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFinalL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCostoL1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jStockL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CargarArticuloLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jEliminarArt)
                        .addGap(18, 18, 18)
                        .addComponent(jGuardarArt)
                        .addGap(21, 21, 21)
                        .addComponent(jActualizarArt)
                        .addGap(18, 18, 18)
                        .addComponent(jResetear)))
                .addGap(5, 5, 5)
                .addGroup(CargarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cod. Prod", "Talle", "Color", "Costo", "Final", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jArticuloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jArticulo);

        javax.swing.GroupLayout ContenedorArticulosLayout = new javax.swing.GroupLayout(ContenedorArticulos);
        ContenedorArticulos.setLayout(ContenedorArticulosLayout);
        ContenedorArticulosLayout.setHorizontalGroup(
            ContenedorArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorArticulosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ContenedorArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CargarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ContenedorArticulosLayout.setVerticalGroup(
            ContenedorArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 670, 610));

        jTitulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTitulo.setText("Alta Articulos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jTitulo)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 290, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jActualizarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarArtActionPerformed
        actualizar();
    }//GEN-LAST:event_jActualizarArtActionPerformed

    private void jGuardarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarArtActionPerformed
        guardar();
    }//GEN-LAST:event_jGuardarArtActionPerformed

    private void jEliminarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarArtActionPerformed
        eliminar();
    }//GEN-LAST:event_jEliminarArtActionPerformed

    private void jResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetearActionPerformed
        resetear();
    }//GEN-LAST:event_jResetearActionPerformed

    private void jArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jArticuloMouseClicked
        if (evt.getClickCount() == 1) {
            int selectedRow = jArticulo.getSelectedRow(); // Obtener el índice de la fila seleccionada

            if (selectedRow != -1) { // Verificar que una fila esté seleccionada
                jId.setText(jArticulo.getValueAt(selectedRow, 0).toString());
                jCodProd.setText(jArticulo.getValueAt(selectedRow, 1).toString());

                // Obtener los valores de los índices de los ComboBox desde la tabla
                int talleIndex = getIndexFromComboBox(jComboTalle, jArticulo.getValueAt(selectedRow, 2).toString());
                int colorIndex = getIndexFromComboBox(jComboColor, jArticulo.getValueAt(selectedRow, 3).toString());

                // Actualizar los JComboBox con los índices correspondientes
                jComboTalle.setSelectedIndex(talleIndex);
                jComboColor.setSelectedIndex(colorIndex);
                
                jCosto.setText(jArticulo.getValueAt(selectedRow, 4).toString());
                jFinal.setText(jArticulo.getValueAt(selectedRow, 5).toString());
                jStock.setText(jArticulo.getValueAt(selectedRow, 6).toString());

                jGuardarArt.setEnabled(false);
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
    }//GEN-LAST:event_jArticuloMouseClicked

    private void jStockFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jStockFocusGained
        if (jStock.getText().equals("Stock")) {
            jStock.setText("");
            jStock.setForeground(black);
        }
    }//GEN-LAST:event_jStockFocusGained

    private void jStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jStockFocusLost
        if (jCodProd.getText().equals("")) {
            jCodProd.setText("Escriba el codigo del producto");
            jCodProd.setForeground(gray);
        }
    }//GEN-LAST:event_jStockFocusLost

    private void jCostoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCostoFocusGained
        if (jCosto.getText().equals("P.Costo")) {
            jCosto.setText("");
            jCosto.setForeground(black);
        }
    }//GEN-LAST:event_jCostoFocusGained

    private void jCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCostoFocusLost
        if (jCodProd.getText().equals("")) {
            jCodProd.setText("Escriba el codigo del producto");
            jCodProd.setForeground(gray);
        }
    }//GEN-LAST:event_jCostoFocusLost

    private void jFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFinalFocusGained
        if (jFinal.getText().equals("P.Final")) {
            jFinal.setText("");
            jFinal.setForeground(black);
        }
    }//GEN-LAST:event_jFinalFocusGained

    private void jFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFinalFocusLost
        if (jCodProd.getText().equals("")) {
            jCodProd.setText("Busqueda..");
            jCodProd.setForeground(gray);
        }
    }//GEN-LAST:event_jFinalFocusLost

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
    //metodo para guardar la prenda
public void guardar(){
    String cod = jCodProd.getText();

    // Obtener el Item seleccionado del JComboBox
    int talleItem = jComboTalle.getSelectedIndex();
    int colorItem = jComboColor.getSelectedIndex();
    
    String costoText = jCosto.getText();
    String finalText = jFinal.getText();
    String stockText = jStock.getText();

    // Verificar que los campos no estén vacíos
    if (cod.isEmpty() || costoText.isEmpty() || finalText.isEmpty() || stockText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.");
        return;
    }
        
    String sqlConsulta = "{call ExisteArt(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, cod);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            habilitar();
            JOptionPane.showMessageDialog(null, "El articulo ya existia y ha sido habilitado");
            return;
        } else{
            double pCosto = Double.parseDouble(costoText);
            double pFinal = Double.parseDouble(finalText);
            int stock = Integer.parseInt(stockText);
        
            String sql = "{call CrearArticulo(?, ?, ?, ?, ? ,?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, cod);
                cs.setInt(2, talleItem);
                cs.setInt(3, colorItem); // Usar el ID del objeto Item
                cs.setDouble(4, pCosto);
                cs.setDouble(5, pFinal);
                cs.setInt(6, stock);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo Articulo agregado");
            }
        }
        consulta();
        resetear();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
    //metodo para consultar
public void consulta(){
    try {
            modelo = new DefaultTableModel();

            Conexion cn = new Conexion();
            con = cn.conectar();
            ps = con.prepareCall("ConsultaArticulo");
            rs = ps.executeQuery();

            rsMd = rs.getMetaData();
            int cantidadColumna = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Cod.Prod");
            modelo.addColumn("Talle");
            modelo.addColumn("Color");
            modelo.addColumn("Costo");
            modelo.addColumn("Final");
            modelo.addColumn("Stock");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumna];

                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
            jArticulo.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
}
    //metodo eliminar prendas
public void eliminar(){
    String id = jId.getText();
    String cod = jCodProd.getText();
    
    if(id.equals("") || cod.equals("")){
        JOptionPane.showMessageDialog(null, "Faltan datos para que se elimine el producto");
    }
    
    String sql = "{call EliminarArt(?, ?)}";

    try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, id);
                cs.setString(2, cod);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Articulo eliminado");
        }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    resetear();
}
    //metodo actualizar valores de prendas
public void actualizar(){
    
    String Id = jId.getText();
    String cod = jCodProd.getText();

    // Obtener el Item seleccionado del JComboBox
    int talleItem = jComboTalle.getSelectedIndex();
    int colorItem = jComboColor.getSelectedIndex();
    
    double pCosto = Double.parseDouble(jCosto.getText());
    double pFinal = Double.parseDouble(jFinal.getText());
    int stock = Integer.parseInt(jStock.getText());
    
    String sql = "{call ModificarArticulo(?, ?, ?, ?, ?, ?, ?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, Id);
        cs.setString(2, cod);
        cs.setInt(3, talleItem);
        cs.setInt(4, colorItem); // Usar el ID del objeto Item
        cs.setDouble(5, pCosto);
        cs.setDouble(6, pFinal);
        cs.setInt(7, stock);
        

        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Articulo actualizado");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    resetear();
}
    //metodo para resesetear valores de inputs
public void resetear(){
    jId.setText("");
    jCodProd.setText("Escriba el codigo del producto");
    jComboTalle.setSelectedIndex(0); // Reiniciar JComboBox seleccionando el índice
    jComboColor.setSelectedIndex(0); // Reiniciar JComboBox seleccionando el índice
    jCosto.setText("P.Costo");
    jFinal.setText("P.Final");
    jStock.setText("Stock");
    jBusqueda.setText("Busqueda..");
    jGuardarArt.setEnabled(true);
}
    //metodo buscar las descripciones
public void buscar() {
    String buscar = jBusqueda.getText();
    
    if (buscar.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe colocar el valor a buscar");
        return;
    }

    String sql = "{call BuscarArticulo(?)}";

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
            modelo.addColumn("Talle");
            modelo.addColumn("Color");
            modelo.addColumn("Costo");
            modelo.addColumn("Final");
            modelo.addColumn("Stock");

            // Agregar filas al modelo
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumna];
                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

            // Establecer el modelo en la tabla
            jArticulo.setModel(modelo);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Hubo un error al realizar la búsqueda: " + ex.getMessage());
        ex.printStackTrace();
    }
}
    //metodo habilitar
public void habilitar(){
    String id = jId.getText();
    String cod = jCodProd.getText();
    
    if (id.equals("") || cod.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan ingresar datos del articulo");
        return;
    }

    String sql = "{call ActivarArticulo(?,?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, id);
        cs.setString(2, cod);

        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Articulo habilitado");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    resetear();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel CargarArticulo;
    private java.awt.Panel Contenedor;
    private java.awt.Panel ContenedorArticulos;
    private javax.swing.JButton jActualizarArt;
    private javax.swing.JTable jArticulo;
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jBusqueda;
    private javax.swing.JLabel jCodL;
    private javax.swing.JTextField jCodProd;
    private javax.swing.JLabel jColorL;
    private javax.swing.JLabel jColorL1;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboTalle;
    private javax.swing.JTextField jCosto;
    private javax.swing.JLabel jCostoL1;
    private javax.swing.JButton jEliminarArt;
    private javax.swing.JTextField jFinal;
    private javax.swing.JLabel jFinalL;
    private javax.swing.JButton jGuardarArt;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jIdL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jResetear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jStock;
    private javax.swing.JLabel jStockL;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
