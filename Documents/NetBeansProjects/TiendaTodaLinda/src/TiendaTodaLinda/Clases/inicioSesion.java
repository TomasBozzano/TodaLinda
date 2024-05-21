package TiendaTodaLinda.Clases;

import TiendaTodaLinda.Login;
import TiendaTodaLinda.PaginaPrincipal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class inicioSesion{
    String usuario;
    String clave;

    public void inicio(String usuario, String clave) {
        Connection con;
        Statement stmt;//procesar una sentencia en SQL
        ResultSet rs; //Obtencion de datos
    
        try {
            if(usuario.equals("") || clave.equals("")){
                JOptionPane.showMessageDialog(null ,"Deberá ingresar los datos solicitados");
                new Login().setVisible(true);
            }else{
              Conexion cn = new Conexion();
              con = cn.conectar();
              stmt = con.createStatement();
              rs = stmt.executeQuery("SELECT * FROM usuario WHERE nombreUs='" + usuario + "' and claveUs='" + clave + "' ");
              
                if (rs.next()) {
                    new PaginaPrincipal().setVisible(true);
                } else {
                 JOptionPane.showMessageDialog(null ,"Usuario o clave incorrectas, intente nuevamente.");
                 new Login().setVisible(true);
                }
                con.close();
            }
        } catch (SQLException ex) {
            System.err.print(ex.toString());
            JOptionPane.showMessageDialog(null,"Ocurrio un error inesperado. Por favor, intente nuevamente.");
        }
    }
}
