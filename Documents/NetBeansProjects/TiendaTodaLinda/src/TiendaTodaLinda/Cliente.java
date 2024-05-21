package TiendaTodaLinda;

import TiendaTodaLinda.Clases.Conexion;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;


public class Cliente extends javax.swing.JPanel {

    Connection con;
    Statement st;
    DefaultTableModel modelo;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cs;
    ResultSetMetaData rsMd;
    
    public Cliente() {
        initComponents();
        consulta();
        jDniCli.setText("Escriba el DNI");
        jNombreCli.setText("Escriba el Nombre y Apellido");
        jDireccionCli.setText("Escriba la dirección");
        jEmailCli.setText("Escriba su mail");
        jTelefonoCli.setText("Escriba el Telefóno");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorCliente = new java.awt.Panel();
        CargarCli = new java.awt.Panel();
        jDniCli = new javax.swing.JTextField();
        jDni = new javax.swing.JLabel();
        jDireccion = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jNombreCli = new javax.swing.JTextField();
        jDireccionCli = new javax.swing.JTextField();
        jActualizar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jDni1 = new javax.swing.JLabel();
        jDni2 = new javax.swing.JLabel();
        jEmailCli = new javax.swing.JTextField();
        jTelefonoCli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 730));
        setMinimumSize(new java.awt.Dimension(900, 730));
        setPreferredSize(new java.awt.Dimension(900, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(183, 226, 209));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 730));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorCliente.setBackground(new java.awt.Color(254, 249, 245));
        ContenedorCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContenedorCliente.setMaximumSize(new java.awt.Dimension(700, 450));
        ContenedorCliente.setMinimumSize(new java.awt.Dimension(700, 450));
        ContenedorCliente.setPreferredSize(new java.awt.Dimension(700, 450));

        CargarCli.setBackground(new java.awt.Color(254, 255, 190));
        CargarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarCli.setForeground(new java.awt.Color(255, 255, 255));
        CargarCli.setMaximumSize(new java.awt.Dimension(610, 450));
        CargarCli.setMinimumSize(new java.awt.Dimension(610, 450));

        jDniCli.setForeground(new java.awt.Color(102, 102, 102));
        jDniCli.setToolTipText("");
        jDniCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDniCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDniCliFocusLost(evt);
            }
        });

        jDni.setBackground(new java.awt.Color(204, 204, 204));
        jDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDni.setText("D.N.I :");
        jDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jDireccion.setBackground(new java.awt.Color(204, 204, 204));
        jDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDireccion.setText("Dirección :");
        jDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jNombre.setBackground(new java.awt.Color(204, 204, 204));
        jNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNombre.setText("Nombre :");
        jNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jNombreCli.setForeground(new java.awt.Color(102, 102, 102));
        jNombreCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jNombreCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jNombreCliFocusLost(evt);
            }
        });

        jDireccionCli.setForeground(new java.awt.Color(102, 102, 102));
        jDireccionCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDireccionCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDireccionCliFocusLost(evt);
            }
        });

        jActualizar.setText("Actualizar");
        jActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jDni1.setBackground(new java.awt.Color(204, 204, 204));
        jDni1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDni1.setText("Email :");
        jDni1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jDni2.setBackground(new java.awt.Color(204, 204, 204));
        jDni2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDni2.setText("Telefono :");
        jDni2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jEmailCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jEmailCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jEmailCliFocusLost(evt);
            }
        });

        jTelefonoCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTelefonoCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTelefonoCliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout CargarCliLayout = new javax.swing.GroupLayout(CargarCli);
        CargarCli.setLayout(CargarCliLayout);
        CargarCliLayout.setHorizontalGroup(
            CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarCliLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addComponent(jDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEmailCli))
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addComponent(jDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTelefonoCli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        CargarCliLayout.setVerticalGroup(
            CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarCliLayout.createSequentialGroup()
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarCliLayout.createSequentialGroup()
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargarCliLayout.createSequentialGroup()
                        .addComponent(jGuardar)
                        .addGap(27, 27, 27)))
                .addGroup(CargarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jClientes.setModel(new javax.swing.table.DefaultTableModel(
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
                "Dni", "Nombre", "Dirección", "Email", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jClientes);
        if (jClientes.getColumnModel().getColumnCount() > 0) {
            jClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout ContenedorClienteLayout = new javax.swing.GroupLayout(ContenedorCliente);
        ContenedorCliente.setLayout(ContenedorClienteLayout);
        ContenedorClienteLayout.setHorizontalGroup(
            ContenedorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorClienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ContenedorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CargarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ContenedorClienteLayout.setVerticalGroup(
            ContenedorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 650, 540));
        ContenedorCliente.getAccessibleContext().setAccessibleName("");

        jTitulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTitulo.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 180, 70));

        add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void jDireccionCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDireccionCliFocusLost
       if(jDireccionCli.getText().equals("")) {
             jDireccionCli.setText("Escriba la dirección");
             jDireccionCli.setForeground(gray);
        }
    }//GEN-LAST:event_jDireccionCliFocusLost

    private void jDireccionCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDireccionCliFocusGained
        if (jDireccionCli.getText().equals("Escriba la dirección")) {
             jDireccionCli.setText("");
             jDireccionCli.setForeground(black);
        }
    }//GEN-LAST:event_jDireccionCliFocusGained

    private void jNombreCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNombreCliFocusLost
        if (jNombreCli.getText().equals("")) {
             jNombreCli.setText("Escriba el Nombre y Apellido");
             jNombreCli.setForeground(gray);
        }
    }//GEN-LAST:event_jNombreCliFocusLost

    private void jNombreCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNombreCliFocusGained
         if (jNombreCli.getText().equals("Escriba el Nombre y Apellido")) {
             jNombreCli.setText("");
             jNombreCli.setForeground(black);
        }
    }//GEN-LAST:event_jNombreCliFocusGained

    private void jDniCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDniCliFocusLost
        if (jDniCli.getText().equals("")) {
             jDniCli.setText("Escriba el DNI");
             jDniCli.setForeground(gray);
        }
    }//GEN-LAST:event_jDniCliFocusLost

    private void jDniCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDniCliFocusGained
         if (jDniCli.getText().equals("Escriba el DNI")) {
             jDniCli.setText("");
             jDniCli.setForeground(black);
        }
    }//GEN-LAST:event_jDniCliFocusGained

    private void jActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_jActualizarActionPerformed

    private void jEmailCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jEmailCliFocusGained
        if (jEmailCli.getText().equals("Escriba su mail")) {
             jEmailCli.setText("");
             jEmailCli.setForeground(black);
        }
    }//GEN-LAST:event_jEmailCliFocusGained

    private void jEmailCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jEmailCliFocusLost
        if (jEmailCli.getText().equals("")) {
             jEmailCli.setText("Escriba su mail");
             jEmailCli.setForeground(gray);
        }
    }//GEN-LAST:event_jEmailCliFocusLost

    private void jTelefonoCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTelefonoCliFocusGained
         if (jTelefonoCli.getText().equals("Escriba el Telefóno")) {
             jTelefonoCli.setText("");
             jTelefonoCli.setForeground(black);
        }
    }//GEN-LAST:event_jTelefonoCliFocusGained

    private void jTelefonoCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTelefonoCliFocusLost
        if (jTelefonoCli.getText().equals("")) {
             jTelefonoCli.setText("Escriba el Telefóno");
             jTelefonoCli.setForeground(gray);
        }
    }//GEN-LAST:event_jTelefonoCliFocusLost

    private void jClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jClientesMouseClicked
        if (evt.getClickCount() == 1) {
                    
                    jDniCli.setText(jClientes.getValueAt(jClientes.getSelectedRow(),0).toString());
                    jNombreCli.setText(jClientes.getValueAt(jClientes.getSelectedRow(),1).toString());
                    jDireccionCli.setText(jClientes.getValueAt(jClientes.getSelectedRow(),2).toString());
                    jEmailCli.setText(jClientes.getValueAt(jClientes.getSelectedRow(),3).toString());
                    jTelefonoCli.setText(jClientes.getValueAt(jClientes.getSelectedRow(),4).toString());
                    jGuardar.setEnabled(false);
                    jDniCli.setEnabled(false);
                    
                    
                }
    }//GEN-LAST:event_jClientesMouseClicked

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        agregar();
        consulta();
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jEliminarActionPerformed

    //metodo consulta cliente
public void consulta() {
        try {
            modelo = new DefaultTableModel();

            Conexion cn = new Conexion();
            con = cn.conectar();
            ps = con.prepareCall("ConsultaClientes");
            rs = ps.executeQuery();

            rsMd = rs.getMetaData();
            int cantidadColumna = rsMd.getColumnCount();

            modelo.addColumn("Dni");
            modelo.addColumn("Nombre");
            modelo.addColumn("Dirección");
            modelo.addColumn("Email");
            modelo.addColumn("Telefono");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumna];

                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
            jClientes.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    //metodo agregar cliente
public void agregar() {
    String dni = jDniCli.getText();
    String nombre = jNombreCli.getText();
    String direccion = jDireccionCli.getText();
    String email = jEmailCli.getText();
    String telefono = jTelefonoCli.getText();

    if (dni.equals("") || nombre.equals("") || direccion.equals("") || email.equals("") || telefono.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
        return;
    }

    String sqlConsulta = "{call ExisteCliente(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, dni);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            habilitar();
            JOptionPane.showMessageDialog(null, "El cliente ya existia y ha sido habilitado");
        } else {
            String sql = "{call CrearCliente(?, ?, ?, ?, ?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, dni);
                cs.setString(2, nombre);
                cs.setString(3, direccion);
                cs.setString(4, email);
                cs.setString(5, telefono);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo cliente agregado");
            }
        }
        consulta();
        limpiar();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
    //metodo limpiar campos
public void limpiar() {
        jDniCli.setText("");
        jNombreCli.setText("");
        jDireccionCli.setText("");
        jEmailCli.setText("");
        jTelefonoCli.setText("");
    }
    //metodo actualizar cliente
public void actualizar() {
    String dni = jDniCli.getText();
    String nombre = jNombreCli.getText();
    String direccion = jDireccionCli.getText();
    String email = jEmailCli.getText();
    String telefono = jTelefonoCli.getText();

    if (dni.equals("") || nombre.equals("") || email.equals("") || telefono.equals("") || direccion.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan ingresar datos para modificarse el cliente");
        return;
    }

    String sql = "{call ModificarCliente(?, ?, ?, ?, ?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, dni);
        cs.setString(2, nombre);
        cs.setString(3, direccion);
        cs.setString(4, email);
        cs.setString(5, telefono);

        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cliente actualizado");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    limpiar();
}
    //metodo eliminar cliente
public void eliminar(){
    String dni = jDniCli.getText();
    
    if (dni.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan ingresar datos para elimiinar el cliente");
        return;
    }

    String sql = "{call DesactivarCliente(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, dni);

        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cliente eliminado");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    limpiar();
}
    //metodo habilitar cliente
public void habilitar(){
    String dni = jDniCli.getText();
    
    if (dni.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan ingresar dato dni para habilitar el cliente");
        return;
    }

    String sql = "{call ActivarCliente(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement cs = con.prepareCall(sql)) {

        // Establecer los parámetros del stored procedure
        cs.setString(1, dni);

        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cliente habilitado");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
    consulta();
    limpiar();
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel CargarCli;
    private java.awt.Panel Contenedor;
    private java.awt.Panel ContenedorCliente;
    private javax.swing.JButton jActualizar;
    private javax.swing.JTable jClientes;
    private javax.swing.JLabel jDireccion;
    private javax.swing.JTextField jDireccionCli;
    private javax.swing.JLabel jDni;
    private javax.swing.JLabel jDni1;
    private javax.swing.JLabel jDni2;
    private javax.swing.JTextField jDniCli;
    private javax.swing.JButton jEliminar;
    private javax.swing.JTextField jEmailCli;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jNombre;
    private javax.swing.JTextField jNombreCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTelefonoCli;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
