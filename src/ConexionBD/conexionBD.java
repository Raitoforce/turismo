
package ConexionBD;
import sistemaevaluacionturistica.FuncionesEvaluacion;

import java.sql.*;
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
    
    public void Guardar(){
        String query="insert into TABLA_MUNICIPIOS(NOMBRE_ESTADO,MUNICIPIO," +
        "CRITERIO1_1,CRITERIO1_2,CRITERIO1_3,CRITERIO1_4,CRITERIO1_5," +
        "CRITERIO2_1,CRITERIO2_2,CRITERIO2_3,CRITERIO2_4," +
        "CRITERIO3_1,CRITERIO3_2,CRITERIO3_3,CRITERIO3_4," +
        "CRITERIO4_1,CRITERIO4_2,CRITERIO4_3,CRITERIO4_4," +
        "COMENTARIO1_1,COMENTARIO1_2,COMENTARIO1_3,COMENTARIO1_4,COMENTARIO1_5," +
        "COMENTARIO2_1,COMENTARIO2_2,COMENTARIO2_3,COMENTARIO2_4," +
        "COMENTARIO3_1,COMENTARIO3_2,COMENTARIO3_3,COMENTARIO3_4," +
        "COMENTARIO4_1,COMENTARIO4_2,COMENTARIO4_3,COMENTARIO4_4,"+ 
        "CRITERIO1_41,CRITERIO1_42,CRITERIO1_43,CRITERIO1_44,CRITERIO1_45," +
        "CRITERIO1_46,CRITERIO1_47,CRITERIO1_48,CRITERIO1_49,CRITERIO1_410," +
        "CRITERIO1_51,CRITERIO1_52,CRITERIO1_53,CRITERIO1_54,CRITERIO1_55," +
        "CRITERIO1_56,CRITERIO1_57,CRITERIO1_58,CRITERIO1_59,CRITERIO1_510" +
        ") values(?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,?"
                + ")";
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
            ps.setInt(37,fe.val1_41);
            ps.setInt(38,fe.val1_42);
            ps.setInt(39,fe.val1_43);
            ps.setInt(40,fe.val1_44);
            ps.setInt(41,fe.val1_45);
            ps.setInt(42,fe.val1_46);
            ps.setInt(43,fe.val1_47);
            ps.setInt(44,fe.val1_48);
            ps.setInt(45,fe.val1_49);
            ps.setInt(46,fe.val1_410);
            ps.setInt(47,fe.val1_51);
            ps.setInt(48,fe.val1_52);
            ps.setInt(49,fe.val1_53);
            ps.setInt(50,fe.val1_54);
            ps.setInt(51,fe.val1_55);
            ps.setInt(52,fe.val1_56);
            ps.setInt(53,fe.val1_57);
            ps.setInt(54,fe.val1_58);
            ps.setInt(55,fe.val1_59);
            ps.setInt(56,fe.val1_510);
            
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Municipio Guardado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Abrir(String estado,String municipio){
       ResultSet rs=null;
        try{
            PreparedStatement ps=getConexion().prepareStatement("select * from TABLA_MUNICIPIOS where nombre_estado=? and municipio=?");
            ps.setString(1,estado);
            ps.setString(2,municipio);
            rs=ps.executeQuery();
            rs.next();
                    
            fe.estado=rs.getString(2);
            fe.municipio=rs.getString(3);
            
            fe.val1_1=rs.getInt(5);
            fe.val1_2=rs.getInt(6);
            fe.val1_3=rs.getInt(7);
            fe.val1_4=rs.getInt(8);
            fe.val1_5=rs.getInt(9);
            fe.val2_1=rs.getInt(10);
            fe.val2_2=rs.getInt(11);
            fe.val2_3=rs.getInt(12);
            fe.val2_4=rs.getInt(13);
            fe.val3_1=rs.getInt(14);
            fe.val3_2=rs.getInt(15);
            fe.val3_3=rs.getInt(16);
            fe.val3_4=rs.getInt(17);
            fe.val4_1=rs.getInt(18);
            fe.val4_2=rs.getInt(19);
            fe.val4_3=rs.getInt(20);
            fe.val4_4=rs.getInt(21);
            
            fe.comentario1_1=rs.getString(22);
            fe.comentario1_2=rs.getString(23);
            fe.comentario1_3=rs.getString(24);
            fe.comentario1_4=rs.getString(25);
            fe.comentario1_5=rs.getString(26);
            fe.comentario2_1=rs.getString(27);
            fe.comentario2_2=rs.getString(28);
            fe.comentario2_3=rs.getString(29);
            fe.comentario2_4=rs.getString(30);
            fe.comentario3_1=rs.getString(31);
            fe.comentario3_2=rs.getString(32);
            fe.comentario3_3=rs.getString(33);
            fe.comentario3_4=rs.getString(34);
            fe.comentario4_1=rs.getString(35);
            fe.comentario4_2=rs.getString(36);
            fe.comentario4_3=rs.getString(37);
            fe.comentario4_4=rs.getString(38);
            fe.val1_41=rs.getInt(39);
            fe.val1_42=rs.getInt(40);
            fe.val1_43=rs.getInt(41);
            fe.val1_44=rs.getInt(42);
            fe.val1_45=rs.getInt(43);
            fe.val1_46=rs.getInt(44);
            fe.val1_47=rs.getInt(45);
            fe.val1_48=rs.getInt(46);
            fe.val1_49=rs.getInt(47);
            fe.val1_410=rs.getInt(48);
            fe.val1_51=rs.getInt(49);
            fe.val1_52=rs.getInt(50);
            fe.val1_53=rs.getInt(51);
            fe.val1_54=rs.getInt(52);
            fe.val1_55=rs.getInt(53);
            fe.val1_56=rs.getInt(54);
            fe.val1_57=rs.getInt(55);
            fe.val1_58=rs.getInt(56);
            fe.val1_59=rs.getInt(57);
            fe.val1_510=rs.getInt(58);
            
            ps.close();
                
        }catch(SQLException e){System.out.println(e.getMessage());}
    }
    
    public void BorrarBD(){
        try{
            Statement ps=getConexion().createStatement();
            ps.clearBatch();
            ps.execute("TRUNCATE TABLE TABLA_MUNICIPIOS");
            ps.close();
            JOptionPane.showMessageDialog(null,"Base de datos Eliminada");
        }catch(SQLException e){System.out.println(e.getMessage());}
    }
    
    public boolean inTable(String estado, String municipio){
        boolean band=false;
        ResultSet rs=null;
        try{
            PreparedStatement ps=getConexion().prepareStatement("select * from TABLA_MUNICIPIOS where nombre_estado=? and municipio=?");
            ps.setString(1,estado);
            ps.setString(2,municipio);
            rs=ps.executeQuery();
            rs.next();
                    
            String aux=rs.getString(2);
            String aux2=rs.getString(3);
            band=true;
            ps.close();
        }catch(SQLException e){//System.out.println(e.getMessage());
        }
        return band;
    }
    
    public void Actualizar(String estado, String municipio){
             String query="UPDATE TABLA_MUNICIPIOS SET NOMBRE_ESTADO=?,MUNICIPIO=?," +
        "CRITERIO1_1=?,CRITERIO1_2=?,CRITERIO1_3=?,CRITERIO1_4=?,CRITERIO1_5=?," +
        "CRITERIO2_1=?,CRITERIO2_2=?,CRITERIO2_3=?,CRITERIO2_4=?," +
        "CRITERIO3_1=?,CRITERIO3_2=?,CRITERIO3_3=?,CRITERIO3_4=?," +
        "CRITERIO4_1=?,CRITERIO4_2=?,CRITERIO4_3=?,CRITERIO4_4=?," +
        "COMENTARIO1_1=?,COMENTARIO1_2=?,COMENTARIO1_3=?,COMENTARIO1_4=?,COMENTARIO1_5=?," +
        "COMENTARIO2_1=?,COMENTARIO2_2=?,COMENTARIO2_3=?,COMENTARIO2_4=?," +
        "COMENTARIO3_1=?,COMENTARIO3_2=?,COMENTARIO3_3=?,COMENTARIO3_4=?," +
        "COMENTARIO4_1=?,COMENTARIO4_2=?,COMENTARIO4_3=?,COMENTARIO4_4=?,"
        +"CRITERIO1_41=?,CRITERIO1_42=?,CRITERIO1_43=?,CRITERIO1_44=?,CRITERIO1_45=?,"
        +"CRITERIO1_46=?,CRITERIO1_47=?,CRITERIO1_48=?,CRITERIO1_49=?,CRITERIO1_410=?,"
        +"CRITERIO1_51=?,CRITERIO1_52=?,CRITERIO1_53=?,CRITERIO1_54=?,CRITERIO1_55=?,"
        +"CRITERIO1_56=?,CRITERIO1_57=?,CRITERIO1_58=?,CRITERIO1_59=?,CRITERIO1_510=?"
                     + "where NOMBRE_ESTADO=? and MUNICIPIO=?";
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
            ps.setInt(37,fe.val1_41);
            ps.setInt(38,fe.val1_42);
            ps.setInt(39,fe.val1_43);
            ps.setInt(40,fe.val1_44);
            ps.setInt(41,fe.val1_45);
            ps.setInt(42,fe.val1_46);
            ps.setInt(43,fe.val1_47);
            ps.setInt(44,fe.val1_48);
            ps.setInt(45,fe.val1_49);
            ps.setInt(46,fe.val1_410);
            ps.setInt(47,fe.val1_51);
            ps.setInt(48,fe.val1_52);
            ps.setInt(49,fe.val1_53);
            ps.setInt(50,fe.val1_54);
            ps.setInt(51,fe.val1_55);
            ps.setInt(52,fe.val1_56);
            ps.setInt(53,fe.val1_57);
            ps.setInt(54,fe.val1_58);
            ps.setInt(55,fe.val1_59);
            ps.setInt(56,fe.val1_510);
     
            ps.setString(57, estado);
            ps.setString(58, municipio);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
   public void BorrarM(String estado, String municipio){
        try{
            PreparedStatement ps=getConexion().prepareStatement("DELETE FROM TABLA_MUNICIPIOS where nombre_estado=? and municipio=?");
            ps.setString(1, estado);
            ps.setString(2,municipio);
            ps.execute();
            JOptionPane.showMessageDialog(null,municipio+" Ha sido Eliminado con Exito");
        }catch(SQLException e){System.out.println(e.getMessage());}
   }
}
