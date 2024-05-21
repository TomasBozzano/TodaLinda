package TiendaTodaLinda.Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection con;
    private String url;
    private String usuario;
    private String clave;

    public Conexion() {
        // Cambiar la URL, el usuario y la clave para SQL Server
        this.url = "jdbc:sqlserver://localhost:1433;databaseName=TiendaTodaLinda";
        this.usuario = "sa";
        this.clave = "admin1317";
    }

    public Connection conectar() {
        try {
            // Cargar el controlador JDBC de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + ex.toString());
            ex.printStackTrace(); // Imprimir la pila de excepciones
            return null; // Devolver null en caso de error
        }
        return con;
    }

    public void cerrarConexion() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.toString());
            ex.printStackTrace(); // Imprimir la pila de excepciones
        }
    }
}
