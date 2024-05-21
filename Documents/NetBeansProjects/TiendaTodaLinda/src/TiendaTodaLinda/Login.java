package TiendaTodaLinda;


import TiendaTodaLinda.Clases.inicioSesion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Login extends JFrame {

    public Login() {
        initComponents();
        this.setSize(800,630); //metodo, que genera los cambios de parametros de la pantalla
        setLocationRelativeTo(null);// centrado de pantalla
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jbackground = new javax.swing.JPanel();
        jBanner = new javax.swing.JLabel();
        jLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TiClave = new javax.swing.JLabel();
        TiUsuario = new javax.swing.JLabel();
        jusuario = new javax.swing.JTextField();
        jclave = new javax.swing.JPasswordField();
        jingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jbackground.setBackground(new java.awt.Color(254, 249, 245));
        Jbackground.setMaximumSize(new java.awt.Dimension(800, 500));
        Jbackground.setPreferredSize(new java.awt.Dimension(800, 500));

        jBanner.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inicioApp/portada.jpeg"))); // NOI18N

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inicioApp/todaLinda.jpg"))); // NOI18N
        jLogo.setText("jLabel2");

        TiClave.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        TiClave.setForeground(new java.awt.Color(102, 102, 102));
        TiClave.setText("Contraseña");

        TiUsuario.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        TiUsuario.setForeground(new java.awt.Color(102, 102, 102));
        TiUsuario.setText("Usuario");

        jusuario.setBackground(new java.awt.Color(254, 249, 245));
        jusuario.setForeground(new java.awt.Color(204, 204, 204));
        jusuario.setText("Escriba su usuario");
        jusuario.setBorder(null);
        jusuario.setNextFocusableComponent(jclave);
        jusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jusuarioFocusLost(evt);
            }
        });

        jclave.setBackground(new java.awt.Color(254, 249, 245));
        jclave.setForeground(new java.awt.Color(204, 204, 204));
        jclave.setText("********");
        jclave.setBorder(null);
        jclave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jclaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jclaveFocusLost(evt);
            }
        });
        jclave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jclaveKeyPressed(evt);
            }
        });

        jingresar.setBackground(new java.awt.Color(183, 226, 209));
        jingresar.setText("Ingresar");
        jingresar.setBorder(null);
        jingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jingresarMouseExited(evt);
            }
        });
        jingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JbackgroundLayout = new javax.swing.GroupLayout(Jbackground);
        Jbackground.setLayout(JbackgroundLayout);
        JbackgroundLayout.setHorizontalGroup(
            JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JbackgroundLayout.createSequentialGroup()
                .addComponent(jBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JbackgroundLayout.createSequentialGroup()
                        .addGroup(JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JbackgroundLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(TiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TiClave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jusuario)
                                    .addComponent(jclave)))
                            .addGroup(JbackgroundLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JbackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        JbackgroundLayout.setVerticalGroup(
            JbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JbackgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TiClave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jclave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Jbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jingresarActionPerformed
        String usuario = jusuario.getText();
        String clave = jclave.getText();
        jingresar.getKeyListeners();
        inicioSesion init = new inicioSesion();
        init.inicio(usuario, clave);
        this.dispose();
    }//GEN-LAST:event_jingresarActionPerformed

    private void jingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jingresarMouseEntered
        //Entrada al cursor
        jingresar.setBackground(new Color(249, 231, 159));
        jingresar.setForeground(Color.black);
    }//GEN-LAST:event_jingresarMouseEntered

    private void jingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jingresarMouseExited
        //salida de cursor
        jingresar.setBackground(new Color(174, 214, 241));
        jingresar.setForeground(Color.black);
    }//GEN-LAST:event_jingresarMouseExited

    private void jusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jusuarioFocusGained
        if (jusuario.getText().equals("Escriba su usuario")) {
             jusuario.setText("");
             jusuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_jusuarioFocusGained

    private void jusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jusuarioFocusLost
         if (jusuario.getText().equals("")) {
             jusuario.setText("Escriba su usuario");
             jusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jusuarioFocusLost

    private void jclaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jclaveFocusGained
         if (String.valueOf(jclave.getPassword()).equals("********")) {
            jclave.setText("");
            jclave.setForeground(Color.black);
        }
    }//GEN-LAST:event_jclaveFocusGained

    private void jclaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jclaveFocusLost
        if (String.valueOf(jclave.getPassword()).equals("")) {
            jclave.setText("********");
            jclave.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jclaveFocusLost

    private void jclaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jclaveKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String usuario = jusuario.getText();
        String clave = jclave.getText();
        jingresar.getKeyListeners();
        inicioSesion init = new inicioSesion();
        init.inicio(usuario, clave);
        this.dispose();
        }
    }//GEN-LAST:event_jclaveKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jbackground;
    private javax.swing.JLabel TiClave;
    private javax.swing.JLabel TiUsuario;
    private javax.swing.JLabel jBanner;
    private javax.swing.JLabel jLogo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jclave;
    private javax.swing.JButton jingresar;
    private javax.swing.JTextField jusuario;
    // End of variables declaration//GEN-END:variables

    private void dispone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
