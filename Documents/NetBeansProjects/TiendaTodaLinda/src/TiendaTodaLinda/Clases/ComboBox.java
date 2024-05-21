package TiendaTodaLinda.Clases;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JComboBox;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ComboBox {
    public static void ConsultaComboBox(String tabla, String valor, JComboBox<String> combo) {
        String sql = "SELECT " + valor + " FROM " + tabla;
        Statement st;
        Conexion cn = new Conexion();
        Connection con = null;
        
        try {
            con = cn.conectar();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
            }
        }
    }
}
