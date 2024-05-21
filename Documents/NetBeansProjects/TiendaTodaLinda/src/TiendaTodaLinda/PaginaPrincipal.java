package TiendaTodaLinda;

import TiendaTodaLinda.Clases.setColor;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PaginaPrincipal extends javax.swing.JFrame {

    public PaginaPrincipal() {
        initComponents();
        
        this.setSize(1000,730);
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jbackground = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jcliente = new javax.swing.JPanel();
        jIcliente = new javax.swing.JLabel();
        jclientelabel = new javax.swing.JLabel();
        jmarca = new javax.swing.JPanel();
        jImarca = new javax.swing.JLabel();
        jmarcalabel = new javax.swing.JLabel();
        jproducto = new javax.swing.JPanel();
        jIproducto = new javax.swing.JLabel();
        jproductolabel = new javax.swing.JLabel();
        jarticulo = new javax.swing.JPanel();
        jIprenda = new javax.swing.JLabel();
        jarticulolabel = new javax.swing.JLabel();
        jstock = new javax.swing.JPanel();
        jIstock = new javax.swing.JLabel();
        jstocklabel = new javax.swing.JLabel();
        jventa = new javax.swing.JPanel();
        jIventa = new javax.swing.JLabel();
        jventalabel = new javax.swing.JLabel();
        jinforme = new javax.swing.JPanel();
        jIinforme = new javax.swing.JLabel();
        jinformelabel = new javax.swing.JLabel();
        jsalir = new javax.swing.JPanel();
        jIinforme1 = new javax.swing.JLabel();
        jsalirlabel1 = new javax.swing.JLabel();
        jcontenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 730));
        setMinimumSize(new java.awt.Dimension(900, 730));
        setPreferredSize(new java.awt.Dimension(900, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jbackground.setBackground(new java.awt.Color(254, 249, 245));
        Jbackground.setMaximumSize(new java.awt.Dimension(1150, 730));
        Jbackground.setMinimumSize(new java.awt.Dimension(1150, 730));
        Jbackground.setPreferredSize(new java.awt.Dimension(1150, 730));

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inicioApp/todaLinda.jpg"))); // NOI18N
        jLogo.setText("jLabel2");

        jcliente.setBackground(new java.awt.Color(254, 252, 231));
        jcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jclienteMousePressed(evt);
            }
        });

        jIcliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/cliente.png"))); // NOI18N

        jclientelabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jclientelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jclientelabel.setText("Clientes");

        javax.swing.GroupLayout jclienteLayout = new javax.swing.GroupLayout(jcliente);
        jcliente.setLayout(jclienteLayout);
        jclienteLayout.setHorizontalGroup(
            jclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jclienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jclientelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jclienteLayout.setVerticalGroup(
            jclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jclienteLayout.createSequentialGroup()
                        .addComponent(jclientelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jmarca.setBackground(new java.awt.Color(254, 252, 231));
        jmarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jmarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmarcaMousePressed(evt);
            }
        });

        jImarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/marca.png"))); // NOI18N

        jmarcalabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jmarcalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmarcalabel.setText("Marca-Tipo-Talle-Color");

        javax.swing.GroupLayout jmarcaLayout = new javax.swing.GroupLayout(jmarca);
        jmarca.setLayout(jmarcaLayout);
        jmarcaLayout.setHorizontalGroup(
            jmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmarcaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jImarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmarcalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jmarcaLayout.setVerticalGroup(
            jmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jImarca, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jmarcaLayout.createSequentialGroup()
                        .addComponent(jmarcalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jproducto.setBackground(new java.awt.Color(254, 252, 231));
        jproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jproductoMousePressed(evt);
            }
        });

        jIproducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/prenda.png"))); // NOI18N

        jproductolabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jproductolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproductolabel.setText("Producto");

        javax.swing.GroupLayout jproductoLayout = new javax.swing.GroupLayout(jproducto);
        jproducto.setLayout(jproductoLayout);
        jproductoLayout.setHorizontalGroup(
            jproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jproductoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jproductolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jproductoLayout.setVerticalGroup(
            jproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jproductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jproductoLayout.createSequentialGroup()
                        .addComponent(jproductolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jarticulo.setBackground(new java.awt.Color(254, 252, 231));
        jarticulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jarticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jarticuloMousePressed(evt);
            }
        });

        jIprenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIprenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/articulo.png"))); // NOI18N

        jarticulolabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jarticulolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jarticulolabel.setText("Articulo");

        javax.swing.GroupLayout jarticuloLayout = new javax.swing.GroupLayout(jarticulo);
        jarticulo.setLayout(jarticuloLayout);
        jarticuloLayout.setHorizontalGroup(
            jarticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jarticuloLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jarticulolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jarticuloLayout.setVerticalGroup(
            jarticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jarticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jarticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIprenda, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jarticuloLayout.createSequentialGroup()
                        .addComponent(jarticulolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jstock.setBackground(new java.awt.Color(254, 252, 231));
        jstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jstockMousePressed(evt);
            }
        });

        jIstock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/inventario.png"))); // NOI18N

        jstocklabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jstocklabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jstocklabel.setText("Stock");

        javax.swing.GroupLayout jstockLayout = new javax.swing.GroupLayout(jstock);
        jstock.setLayout(jstockLayout);
        jstockLayout.setHorizontalGroup(
            jstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jstockLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIstock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstocklabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jstockLayout.setVerticalGroup(
            jstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jstockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIstock, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jstockLayout.createSequentialGroup()
                        .addComponent(jstocklabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jventa.setBackground(new java.awt.Color(254, 252, 231));
        jventa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jventaMousePressed(evt);
            }
        });

        jIventa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/informeVenta.png"))); // NOI18N

        jventalabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jventalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jventalabel.setText("Ventas");

        javax.swing.GroupLayout jventaLayout = new javax.swing.GroupLayout(jventa);
        jventa.setLayout(jventaLayout);
        jventaLayout.setHorizontalGroup(
            jventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jventaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIventa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jventalabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jventaLayout.setVerticalGroup(
            jventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIventa, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jventaLayout.createSequentialGroup()
                        .addComponent(jventalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jinforme.setBackground(new java.awt.Color(254, 252, 231));
        jinforme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jinforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jinformeMousePressed(evt);
            }
        });

        jIinforme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIinforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/detalle.png"))); // NOI18N

        jinformelabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jinformelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jinformelabel.setText("Informe");

        javax.swing.GroupLayout jinformeLayout = new javax.swing.GroupLayout(jinforme);
        jinforme.setLayout(jinformeLayout);
        jinformeLayout.setHorizontalGroup(
            jinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jinformeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIinforme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jinformelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jinformeLayout.setVerticalGroup(
            jinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jinformeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIinforme, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jinformeLayout.createSequentialGroup()
                        .addComponent(jinformelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jsalir.setBackground(new java.awt.Color(254, 252, 231));
        jsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jsalirMousePressed(evt);
            }
        });

        jIinforme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIinforme1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonera/Salir.png"))); // NOI18N

        jsalirlabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jsalirlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jsalirlabel1.setText("Salir");

        javax.swing.GroupLayout jsalirLayout = new javax.swing.GroupLayout(jsalir);
        jsalir.setLayout(jsalirLayout);
        jsalirLayout.setHorizontalGroup(
            jsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jsalirLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jIinforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsalirlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jsalirLayout.setVerticalGroup(
            jsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jsalirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIinforme1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jsalirLayout.createSequentialGroup()
                        .addComponent(jsalirlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout JbackgroundLayout = new javax.swing.GroupLayout(Jbackground);
        Jbackground.setLayout(JbackgroundLayout);
        JbackgroundLayout.setHorizontalGroup(
            JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JbackgroundLayout.createSequentialGroup()
                .addGroup(JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JbackgroundLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jmarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jinforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JbackgroundLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JbackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(928, Short.MAX_VALUE))
        );
        JbackgroundLayout.setVerticalGroup(
            JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(JbackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jinforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Jbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 700));

        jcontenedor.setBackground(new java.awt.Color(183, 226, 209));
        jcontenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        jcontenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        jcontenedor.setPreferredSize(new java.awt.Dimension(900, 730));

        javax.swing.GroupLayout jcontenedorLayout = new javax.swing.GroupLayout(jcontenedor);
        jcontenedor.setLayout(jcontenedorLayout);
        jcontenedorLayout.setHorizontalGroup(
            jcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jcontenedorLayout.setVerticalGroup(
            jcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jcontenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 750, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Panel(JPanel p) {
    // Configurar el tamaño y la posición del panel
    p.setSize(700, 800);
    p.setLocation(0, 0);

    // Establecer el layout del contenedor si no está establecido
    if (!(jcontenedor.getLayout() instanceof BorderLayout)) {
        jcontenedor.setLayout(new BorderLayout());
    }

    // Limpiar el contenedor y agregar el nuevo panel
    jcontenedor.removeAll();
    jcontenedor.add(p, BorderLayout.CENTER);

    // Validar y repintar el contenedor
    jcontenedor.revalidate();
    jcontenedor.repaint();
}

    private void jsalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsalirMousePressed
        //Accion de cierre de sesion
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jsalirMousePressed

    private void jinformeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jinformeMousePressed
        setColor sc = new setColor();
        sc.colorSet(jinforme);
        sc.colorReset(jcliente);
        sc.colorReset(jmarca);
        sc.colorReset(jproducto);
        sc.colorReset(jarticulo);
        sc.colorReset(jstock);
        sc.colorReset(jventa);
    }//GEN-LAST:event_jinformeMousePressed

    private void jclienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jclienteMousePressed
        setColor sc = new setColor();
        sc.colorSet(jcliente);
        sc.colorReset(jmarca);
        sc.colorReset(jproducto);
        sc.colorReset(jarticulo);
        sc.colorReset(jstock);
        sc.colorReset(jventa);
        sc.colorReset(jinforme);
        
        Cliente cli = new Cliente();
        Panel(cli);
        
    }//GEN-LAST:event_jclienteMousePressed

    private void jmarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmarcaMousePressed
        setColor sc = new setColor();
        sc.colorSet(jmarca);
        sc.colorReset(jcliente);
        sc.colorReset(jproducto);
        sc.colorReset(jarticulo);
        sc.colorReset(jstock);
        sc.colorReset(jventa);
        sc.colorReset(jinforme);
        
        Marcas mar = new Marcas();
        Panel(mar);
    }//GEN-LAST:event_jmarcaMousePressed

    private void jproductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jproductoMousePressed
        setColor sc = new setColor();
        sc.colorSet(jproducto);
        sc.colorReset(jcliente);
        sc.colorReset(jmarca);
        sc.colorReset(jarticulo);
        sc.colorReset(jstock);
        sc.colorReset(jventa);
        sc.colorReset(jinforme);
        
        Productos prod = new Productos();
        Panel(prod);
    }//GEN-LAST:event_jproductoMousePressed

    private void jarticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jarticuloMousePressed
        setColor sc = new setColor();
        sc.colorSet(jarticulo);
        sc.colorReset(jcliente);
        sc.colorReset(jmarca);
        sc.colorReset(jproducto);
        sc.colorReset(jstock);
        sc.colorReset(jventa);
        sc.colorReset(jinforme);
        
        Articulos art = new Articulos();
        Panel(art);
    }//GEN-LAST:event_jarticuloMousePressed

    private void jstockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstockMousePressed
        setColor sc = new setColor();
        sc.colorSet(jstock);
        sc.colorReset(jcliente);
        sc.colorReset(jmarca);
        sc.colorReset(jproducto);
        sc.colorReset(jarticulo);
        sc.colorReset(jventa);
        sc.colorReset(jinforme);
        
    Stock stock = new Stock();
    Panel(stock);
    }//GEN-LAST:event_jstockMousePressed

    private void jventaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jventaMousePressed
        setColor sc = new setColor();
        sc.colorSet(jventa);
        sc.colorReset(jcliente);
        sc.colorReset(jmarca);
        sc.colorReset(jproducto);
        sc.colorReset(jarticulo);
        sc.colorReset(jstock);
        sc.colorReset(jinforme);
    }//GEN-LAST:event_jventaMousePressed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PaginaPrincipal().setVisible(false);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jbackground;
    private javax.swing.JLabel jIcliente;
    private javax.swing.JLabel jIinforme;
    private javax.swing.JLabel jIinforme1;
    private javax.swing.JLabel jImarca;
    private javax.swing.JLabel jIprenda;
    private javax.swing.JLabel jIproducto;
    private javax.swing.JLabel jIstock;
    private javax.swing.JLabel jIventa;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jarticulo;
    private javax.swing.JLabel jarticulolabel;
    private javax.swing.JPanel jcliente;
    private javax.swing.JLabel jclientelabel;
    private javax.swing.JPanel jcontenedor;
    private javax.swing.JPanel jinforme;
    private javax.swing.JLabel jinformelabel;
    private javax.swing.JPanel jmarca;
    private javax.swing.JLabel jmarcalabel;
    private javax.swing.JPanel jproducto;
    private javax.swing.JLabel jproductolabel;
    private javax.swing.JPanel jsalir;
    private javax.swing.JLabel jsalirlabel1;
    private javax.swing.JPanel jstock;
    private javax.swing.JLabel jstocklabel;
    private javax.swing.JPanel jventa;
    private javax.swing.JLabel jventalabel;
    // End of variables declaration//GEN-END:variables
}
