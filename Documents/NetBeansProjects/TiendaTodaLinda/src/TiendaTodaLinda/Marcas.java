package TiendaTodaLinda;

import TiendaTodaLinda.Clases.Conexion;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Marcas extends javax.swing.JPanel {

    public Marcas() {
        initComponents();
        jMarca.setText("Escriba la Marca");
        jTipoP.setText("Escriba el tipo");
        jTalle.setText("Escriba el talle");
        jColor.setText("Escriba el color");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorMarca = new java.awt.Panel();
        Marca = new java.awt.Panel();
        jMarca = new javax.swing.JTextField();
        jMarcaNom = new javax.swing.JLabel();
        jGuardarMarca = new javax.swing.JButton();
        Tipo = new java.awt.Panel();
        jTipoP = new javax.swing.JTextField();
        jTipoNom = new javax.swing.JLabel();
        jGuardarTipo = new javax.swing.JButton();
        Color = new java.awt.Panel();
        jColorNom = new javax.swing.JLabel();
        jGuardarColor = new javax.swing.JButton();
        jColor = new javax.swing.JTextField();
        Talle = new java.awt.Panel();
        jTalleNom = new javax.swing.JLabel();
        jGuardarTalle = new javax.swing.JButton();
        jTalle = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTituloMarca = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(183, 226, 209));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 730));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorMarca.setBackground(new java.awt.Color(254, 249, 245));
        ContenedorMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContenedorMarca.setMaximumSize(new java.awt.Dimension(700, 450));
        ContenedorMarca.setMinimumSize(new java.awt.Dimension(700, 450));

        Marca.setBackground(new java.awt.Color(254, 255, 190));
        Marca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Marca.setForeground(new java.awt.Color(255, 255, 255));
        Marca.setMaximumSize(new java.awt.Dimension(610, 450));
        Marca.setMinimumSize(new java.awt.Dimension(610, 450));

        jMarca.setForeground(new java.awt.Color(102, 102, 102));
        jMarca.setToolTipText("");
        jMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMarcaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jMarcaFocusLost(evt);
            }
        });

        jMarcaNom.setBackground(new java.awt.Color(204, 204, 204));
        jMarcaNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarcaNom.setText("Nombre de Marca :");
        jMarcaNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jGuardarMarca.setText("Guardar");
        jGuardarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MarcaLayout = new javax.swing.GroupLayout(Marca);
        Marca.setLayout(MarcaLayout);
        MarcaLayout.setHorizontalGroup(
            MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarcaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jMarcaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jGuardarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        MarcaLayout.setVerticalGroup(
            MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarcaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardarMarca)
                    .addComponent(jMarcaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tipo.setBackground(new java.awt.Color(254, 255, 190));
        Tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tipo.setForeground(new java.awt.Color(255, 255, 255));
        Tipo.setMaximumSize(new java.awt.Dimension(610, 450));
        Tipo.setMinimumSize(new java.awt.Dimension(610, 450));

        jTipoP.setForeground(new java.awt.Color(102, 102, 102));
        jTipoP.setToolTipText("");
        jTipoP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTipoPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTipoPFocusLost(evt);
            }
        });

        jTipoNom.setBackground(new java.awt.Color(204, 204, 204));
        jTipoNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTipoNom.setText("Nombre de Tipo de Prenda :");
        jTipoNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jGuardarTipo.setText("Guardar");
        jGuardarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TipoLayout = new javax.swing.GroupLayout(Tipo);
        Tipo.setLayout(TipoLayout);
        TipoLayout.setHorizontalGroup(
            TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TipoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTipoNom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGuardarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        TipoLayout.setVerticalGroup(
            TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardarTipo)
                    .addComponent(jTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipoNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Color.setBackground(new java.awt.Color(254, 255, 190));
        Color.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Color.setForeground(new java.awt.Color(255, 255, 255));
        Color.setMaximumSize(new java.awt.Dimension(610, 450));
        Color.setMinimumSize(new java.awt.Dimension(610, 450));

        jColorNom.setBackground(new java.awt.Color(204, 204, 204));
        jColorNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jColorNom.setText("Nombre Color :");
        jColorNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jGuardarColor.setText("Guardar");
        jGuardarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarColorActionPerformed(evt);
            }
        });

        jColor.setForeground(new java.awt.Color(102, 102, 102));
        jColor.setToolTipText("");
        jColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jColorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout ColorLayout = new javax.swing.GroupLayout(Color);
        Color.setLayout(ColorLayout);
        ColorLayout.setHorizontalGroup(
            ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jColorNom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jGuardarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        ColorLayout.setVerticalGroup(
            ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardarColor)
                    .addComponent(jColorNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Talle.setBackground(new java.awt.Color(254, 255, 190));
        Talle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Talle.setForeground(new java.awt.Color(255, 255, 255));
        Talle.setMaximumSize(new java.awt.Dimension(610, 450));
        Talle.setMinimumSize(new java.awt.Dimension(610, 450));

        jTalleNom.setBackground(new java.awt.Color(204, 204, 204));
        jTalleNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTalleNom.setText("Tipo de Talle:");
        jTalleNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jGuardarTalle.setText("Guardar");
        jGuardarTalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarTalleActionPerformed(evt);
            }
        });

        jTalle.setForeground(new java.awt.Color(102, 102, 102));
        jTalle.setToolTipText("");
        jTalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTalleFocusLost(evt);
            }
        });

        javax.swing.GroupLayout TalleLayout = new javax.swing.GroupLayout(Talle);
        Talle.setLayout(TalleLayout);
        TalleLayout.setHorizontalGroup(
            TalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TalleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTalleNom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTalle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jGuardarTalle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        TalleLayout.setVerticalGroup(
            TalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TalleLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(TalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardarTalle)
                    .addComponent(jTalleNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTalle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorMarcaLayout = new javax.swing.GroupLayout(ContenedorMarca);
        ContenedorMarca.setLayout(ContenedorMarcaLayout);
        ContenedorMarcaLayout.setHorizontalGroup(
            ContenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Talle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        ContenedorMarcaLayout.setVerticalGroup(
            ContenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Talle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 660, 530));

        jTituloMarca.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTituloMarca.setText(" Marca - Tipo - Talle - Color");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTituloMarca)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTituloMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 520, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMarcaFocusGained
        if (jMarca.getText().equals("Escriba la Marca")) {
            jMarca.setText("");
            jMarca.setForeground(black);
        }
    }//GEN-LAST:event_jMarcaFocusGained

    private void jMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMarcaFocusLost
        if (jMarca.getText().equals("")) {
            jMarca.setText("Escriba la Marca");
            jMarca.setForeground(gray);
        }
    }//GEN-LAST:event_jMarcaFocusLost

    private void jGuardarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarMarcaActionPerformed
        guardarMarca();
    }//GEN-LAST:event_jGuardarMarcaActionPerformed

    private void jTipoPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTipoPFocusGained
        if ( jTipoP.getText().equals("Escriba el tipo")){
            jTipoP.setText("");
            jTipoP.setForeground(black);
        }
    }//GEN-LAST:event_jTipoPFocusGained

    private void jTipoPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTipoPFocusLost
        if ( jTipoP.getText().equals("")){
            jTipoP.setText("Escriba el tipo");
            jTipoP.setForeground(gray);
        }
    }//GEN-LAST:event_jTipoPFocusLost

    private void jGuardarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarTipoActionPerformed
        guardarTipo();
    }//GEN-LAST:event_jGuardarTipoActionPerformed

    private void jTalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTalleFocusGained
        if ( jTalle.getText().equals("Escriba el talle")){
            jTalle.setText("");
            jTalle.setForeground(black);
        }
    }//GEN-LAST:event_jTalleFocusGained

    private void jTalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTalleFocusLost
        if ( jTalle.getText().equals("")){
            jTalle.setText("Escriba el talle");
            jTalle.setForeground(gray);
        }
    }//GEN-LAST:event_jTalleFocusLost

    private void jGuardarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarColorActionPerformed
        guardarColor();
    }//GEN-LAST:event_jGuardarColorActionPerformed

    private void jColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jColorFocusGained
        if ( jColor.getText().equals("Escriba el color")){
            jColor.setText("");
            jColor.setForeground(black);
        }
    }//GEN-LAST:event_jColorFocusGained

    private void jColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jColorFocusLost
        if ( jColor.getText().equals("")){
            jColor.setText("Escriba el color");
            jColor.setForeground(gray);
        }
    }//GEN-LAST:event_jColorFocusLost

    private void jGuardarTalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarTalleActionPerformed
        guardarTalle();
    }//GEN-LAST:event_jGuardarTalleActionPerformed
    //metodo de guardar la marca
public void guardarMarca(){
    String marca = jMarca.getText().toUpperCase().trim();
    
    if(marca.equals("")){
        JOptionPane.showMessageDialog(null, "Coloque la marca, por favor.");
    }
    
    String sqlConsulta = "{call ConsultaMarca(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, marca);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Ya existe la marca");
        } else {
            String sql = "{call CrearMarca(?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, marca);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo Marca agregada");
            }
            jMarca.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
public void guardarTipo(){
    String tipo = jTipoP.getText().toUpperCase().trim();
    
    if(tipo.equals("")){
        JOptionPane.showMessageDialog(null, "Coloque el tipo de prenda, por favor.");
    }
    
    String sqlConsulta = "{call ConsultaTipoP(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, tipo);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Ya existe el tipo de prenda");
        } else {
            String sql = "{call CrearTipo(?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, tipo);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo tipo agregado");
            }
            jTipoP.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
public void guardarColor(){
    String color = jColor.getText().toUpperCase().trim();
    
    if(color.equals("")){
        JOptionPane.showMessageDialog(null, "Coloque el color, por favor.");
    }
    
    String sqlConsulta = "{call ConsultaColor(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, color);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Ya existe el color");
        } else {
            String sql = "{call CrearColor(?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, color);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo color agregado");
            }
            jColor.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
public void guardarTalle(){
    String talle = jTalle.getText().toUpperCase().trim();
    
    if(talle.equals("")){
        JOptionPane.showMessageDialog(null, "Coloque el talle, por favor.");
    }
    
    String sqlConsulta = "{call ConsultaTalle(?)}";

    try (Connection con = new Conexion().conectar();
         CallableStatement csc = con.prepareCall(sqlConsulta)) {

        csc.setString(1, talle);
        ResultSet rs = csc.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Ya existe el talle.");
        } else {
            String sql = "{call CrearTalle(?)}";

            try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, talle);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nuevo talle agregado");
            }
            jTalle.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Color;
    private java.awt.Panel Contenedor;
    private java.awt.Panel ContenedorMarca;
    private java.awt.Panel Marca;
    private java.awt.Panel Talle;
    private java.awt.Panel Tipo;
    private javax.swing.JTextField jColor;
    private javax.swing.JLabel jColorNom;
    private javax.swing.JButton jGuardarColor;
    private javax.swing.JButton jGuardarMarca;
    private javax.swing.JButton jGuardarTalle;
    private javax.swing.JButton jGuardarTipo;
    private javax.swing.JTextField jMarca;
    private javax.swing.JLabel jMarcaNom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTalle;
    private javax.swing.JLabel jTalleNom;
    private javax.swing.JLabel jTipoNom;
    private javax.swing.JTextField jTipoP;
    private javax.swing.JLabel jTituloMarca;
    // End of variables declaration//GEN-END:variables
}
