package TiendaTodaLinda;

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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Stock extends javax.swing.JPanel {
    
    Connection con;
    Statement st;
    DefaultTableModel modelo;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cs;
    ResultSetMetaData rsMd;
    
    public Stock() {
        initComponents();
        
        jBusqueda.setText("Busqueda..");
        consulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorProductos = new java.awt.Panel();
        CargarCli = new java.awt.Panel();
        jBusqueda = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jStock = new javax.swing.JTable();
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargarCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        CargarCliLayout.setVerticalGroup(
            CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jStock.setModel(new javax.swing.table.DefaultTableModel(
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
                "Cod. Prod", "Nombre", "Marca", "Tipo", "Color", "Talle", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jStock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jStock);

        javax.swing.GroupLayout ContenedorProductosLayout = new javax.swing.GroupLayout(ContenedorProductos);
        ContenedorProductos.setLayout(ContenedorProductosLayout);
        ContenedorProductosLayout.setHorizontalGroup(
            ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorProductosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addComponent(CargarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContenedorProductosLayout.setVerticalGroup(
            ContenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 710, 570));

        jTitulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTitulo.setText("Stock Productos");

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

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 320, 70));

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
    //metodo consulta de stock
public void consulta(){
    try {
            modelo = new DefaultTableModel();

            Conexion cn = new Conexion();
            con = cn.conectar();
            ps = con.prepareCall("ConsultaStock");
            rs = ps.executeQuery();

            rsMd = rs.getMetaData();
            int cantidadColumna = rsMd.getColumnCount();

            modelo.addColumn("Cod.Prod");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            modelo.addColumn("Tipo");
            modelo.addColumn("Color");
            modelo.addColumn("Talle");
            modelo.addColumn("Stock");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumna];

                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
            jStock.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
}

    //metodo de busqueda
public void buscar() {
    String buscar = jBusqueda.getText();
    
    if (buscar.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe colocar el valor a buscar");
        return;
    }

    String sql = "{call BuscarStock(?)}";

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
            modelo.addColumn("Cod.Prod");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            modelo.addColumn("Tipo");
            modelo.addColumn("Color");
            modelo.addColumn("Talle");
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
            jStock.setModel(modelo);
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
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jStock;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
