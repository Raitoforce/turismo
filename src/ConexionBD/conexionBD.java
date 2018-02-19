
package ConexionBD;
import sistemaevaluacionturistica.FuncionesEvaluacion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexionBD {
    
    Connection cn= null;
    FuncionesEvaluacion fe;
    
    public conexionBD(FuncionesEvaluacion fe){
        this.fe=fe;
    }

    public Connection getConexion(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/Turismo;user=admint;password=turismo");
//            JOptionPane.showMessageDialog(null,"Conexion en Linea");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
        }
        
        return cn;
    }
    
    public ResultSet consulta(String Consulta){
        ResultSet rs=null;
        try {
            PreparedStatement ps = cn.prepareStatement(Consulta);
            ps.executeQuery();
            //ps.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Fallo Consulta");
        }
        return rs;
    }
    
    public void Guardar(){
        String query="insert into TABLA_MUNICIPIOS(NOMBRE_ESTADO,MUNICIPIO," +
        "CRITERIO1_1,CRITERIO1_2,CRITERIO1_3,CRITERIO1_4,CRITERIO1_5," +
        "CRITERIO2_1,CRITERIO2_2,CRITERIO2_3,CRITERIO2_4," +
        "CRITERIO3_1,CRITERIO3_2,CRITERIO3_3,CRITERIO3_4," +
        "CRITERIO4_1,CRITERIO4_2,CRITERIO4_3,CRITERIO4_4," +
        "COMENTARIO1_1,COMENTARIO1_2,COMENTARIO1_3,COMENTARIO1_4,COMENTARIO1_5," +
        "COMENTARIO2_1,COMENTARIO2_2,COMENTARIO2_3,COMENTARIO2_4," +
        "COMENTARIO3_1,COMENTARIO3_2,COMENTARIO3_3,COMENTARIO3_4," +
        "COMENTARIO4_1,COMENTARIO4_2,COMENTARIO4_3,COMENTARIO4_4" +
        ") values(?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?)";
        PreparedStatement ps=null;
        try {
            ps = getConexion().prepareStatement(query);
            ps.setString(1,fe.estado);
            ps.setString(2,fe.municipio);
            ps.setInt(3,fe.val1_1);
            ps.setInt(4,fe.val1_2);
            ps.setInt(5,fe.val1_3);
            ps.setInt(6,fe.val1_4);
            ps.setInt(7,fe.val1_5);
            ps.setInt(8,fe.val2_1);
            ps.setInt(9,fe.val2_2);
            ps.setInt(10,fe.val2_3);
            ps.setInt(11,fe.val2_4);
            ps.setInt(12,fe.val3_1);
            ps.setInt(13,fe.val3_2);
            ps.setInt(14,fe.val3_3);
            ps.setInt(15,fe.val3_4);
            ps.setInt(16,fe.val4_1);
            ps.setInt(17,fe.val4_2);
            ps.setInt(18,fe.val4_3);
            ps.setInt(19,fe.val4_4);
            ps.setString(20,fe.comentario1_1);
            ps.setString(21,fe.comentario1_2);
            ps.setString(22,fe.comentario1_3);
            ps.setString(23,fe.comentario1_4);
            ps.setString(24,fe.comentario1_5);
            ps.setString(25,fe.comentario2_1);
            ps.setString(26,fe.comentario2_2);
            ps.setString(27,fe.comentario2_3);
            ps.setString(28,fe.comentario2_4);
            ps.setString(29,fe.comentario3_1);
            ps.setString(30,fe.comentario3_2);
            ps.setString(31,fe.comentario3_3);
            ps.setString(32,fe.comentario3_4);
            ps.setString(33,fe.comentario4_1);
            ps.setString(34,fe.comentario4_2);
            ps.setString(35,fe.comentario4_3);
            ps.setString(36,fe.comentario4_4);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Abrir(){
    }
}
