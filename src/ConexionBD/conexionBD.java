
package ConexionBD;
import sistemaevaluacionturistica.FuncionesEvaluacion;

import java.sql.*;
import javax.swing.JOptionPane;
import sistemaevaluacionturistica.Recursos;

public class conexionBD {
    
    Connection cn= null;
    FuncionesEvaluacion fe;
    
    public conexionBD(FuncionesEvaluacion fe){
        this.fe=fe;
    }

    public Connection getConexion(){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //cn = DriverManager.getConnection("jdbc:derby://localhost:1527/Turismo;user=admint;password=turismo");
            cn = DriverManager.getConnection("jdbc:derby:.\\Turismo;user=admint;password=turismo");
//            JOptionPane.showMessageDialog(null,"Conexion en Linea");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
        }
        
        return cn;
    }
    
    public void Guardar(){
        String query="insert into TABLA_MUNICIPIOS(NOMBRE_ESTADO,MUNICIPIO,IMAGEN," +
        "CRITERIO1_1,CRITERIO1_2,CRITERIO1_3,CRITERIO1_4,CRITERIO1_5," +
        "CRITERIO2_1,CRITERIO2_2,CRITERIO2_3,CRITERIO2_4," +
        "CRITERIO3_1,CRITERIO3_2,CRITERIO3_3,CRITERIO3_4," +
        "CRITERIO4_1,CRITERIO4_2,CRITERIO4_3,CRITERIO4_4," +
        "COMENTARIO1_1,COMENTARIO1_2,COMENTARIO1_3,COMENTARIO1_4,COMENTARIO1_5," +
        "COMENTARIO2_1,COMENTARIO2_2,COMENTARIO2_3,COMENTARIO2_4," +
        "COMENTARIO3_1,COMENTARIO3_2,COMENTARIO3_3,COMENTARIO3_4," +
        "COMENTARIO4_1,COMENTARIO4_2,COMENTARIO4_3,COMENTARIO4_4"+ 
        ") values(?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?,"
                + "?,?,?,?"
                + ")";
        PreparedStatement ps=null;
        try {
            ps = getConexion().prepareStatement(query);
            ps.setString(1,fe.estado);
            ps.setString(2,fe.municipio);
            ps.setString(3,fe.img);
            ps.setInt(4,fe.val1_1);
            ps.setInt(5,fe.val1_2);
            ps.setInt(6,fe.val1_3);
            ps.setInt(7,fe.val1_4);
            ps.setInt(8,fe.val1_5);
            ps.setInt(9,fe.val2_1);
            ps.setInt(10,fe.val2_2);
            ps.setInt(11,fe.val2_3);
            ps.setInt(12,fe.val2_4);
            ps.setInt(13,fe.val3_1);
            ps.setInt(14,fe.val3_2);
            ps.setInt(15,fe.val3_3);
            ps.setInt(16,fe.val3_4);
            ps.setInt(17,fe.val4_1);
            ps.setInt(18,fe.val4_2);
            ps.setInt(19,fe.val4_3);
            ps.setInt(20,fe.val4_4);
            ps.setString(21,fe.comentario1_1);
            ps.setString(22,fe.comentario1_2);
            ps.setString(23,fe.comentario1_3);
            ps.setString(24,fe.comentario1_4);
            ps.setString(25,fe.comentario1_5);
            ps.setString(26,fe.comentario2_1);
            ps.setString(27,fe.comentario2_2);
            ps.setString(28,fe.comentario2_3);
            ps.setString(29,fe.comentario2_4);
            ps.setString(30,fe.comentario3_1);
            ps.setString(31,fe.comentario3_2);
            ps.setString(32,fe.comentario3_3);
            ps.setString(33,fe.comentario3_4);
            ps.setString(34,fe.comentario4_1);
            ps.setString(35,fe.comentario4_2);
            ps.setString(36,fe.comentario4_3);
            ps.setString(37,fe.comentario4_4);
           
            ps.executeUpdate();
            ps.close();
           //GuardarRecursos
           query="INSERT INTO RECURSOCULTURAL("
                   + "NOMBRE,TIPO,"
                   + "CRITERIO1,CRITERIO2,CRITERIO3,CRITERIO4,CRITERIO5,"
                   + "CRITERIO6,CRITERIO7,CRITERIO8,CRITERIO9,CRITERIO10,"
                   + "IDMUNICIPIO)"
                   + "VALUES("
                   + "?,?,"
                   + "?,?,?,?,?,"
                   + "?,?,?,?,?,"
                   + "?)";
            for (Recursos recurso : fe.recursosNaturales) {
                ps=getConexion().prepareStatement(query);
                ps.setString(1,recurso.getNombre());
                ps.setInt(2,1);
                ps.setInt(3,recurso.getCriterio1());
                ps.setInt(4,recurso.getCriterio2());
                ps.setInt(5,recurso.getCriterio3());
                ps.setInt(6,recurso.getCriterio4());
                ps.setInt(7,recurso.getCriterio5());
                ps.setInt(8,recurso.getCriterio6());
                ps.setInt(9,recurso.getCriterio7());
                ps.setInt(10,recurso.getCriterio8());
                ps.setInt(11,recurso.getCriterio9());
                ps.setInt(12,recurso.getCriterio10());
                ps.setInt(13,index(fe.estado,fe.municipio));
                ps.executeUpdate();
            }
            for (Recursos recurso : fe.recursosCulturales) {
                ps=getConexion().prepareStatement(query);
                ps.setString(1,recurso.getNombre());
                ps.setInt(2,2);
                ps.setInt(3,recurso.getCriterio1());
                ps.setInt(4,recurso.getCriterio2());
                ps.setInt(5,recurso.getCriterio3());
                ps.setInt(6,recurso.getCriterio4());
                ps.setInt(7,recurso.getCriterio5());
                ps.setInt(8,recurso.getCriterio6());
                ps.setInt(9,recurso.getCriterio7());
                ps.setInt(10,recurso.getCriterio8());
                ps.setInt(11,recurso.getCriterio9());
                ps.setInt(12,recurso.getCriterio10());
                ps.setInt(13,index(fe.estado,fe.municipio));
                ps.executeUpdate();
            }
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
            fe.img=rs.getString(4);
            
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
            ps.close();
            
            fe.recursosCulturales.clear();
            fe.recursosNaturales.clear();
            ps=getConexion().prepareStatement("select * from RECURSOCULTURAL where idmunicipio=?");
            ps.setInt(1,index(fe.estado, fe.municipio));
            rs=ps.executeQuery();
            Recursos recurso;
            while(rs.next()){
                recurso=new Recursos();
                recurso.setNombre(rs.getString(2));
                recurso.setCriterio1(rs.getInt(4));
                recurso.setCriterio2(rs.getInt(5));
                recurso.setCriterio3(rs.getInt(6));
                recurso.setCriterio4(rs.getInt(7));
                recurso.setCriterio5(rs.getInt(8));
                recurso.setCriterio6(rs.getInt(9));
                recurso.setCriterio7(rs.getInt(10));
                recurso.setCriterio8(rs.getInt(11));
                recurso.setCriterio9(rs.getInt(12));
                recurso.setCriterio10(rs.getInt(13));
                if(rs.getInt(3)==1)fe.recursosNaturales.add(recurso);
                else fe.recursosCulturales.add(recurso);
            }
            ps.close();
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
    
    public int index(String estado, String municipio){
        int index=-1;
        ResultSet rs=null;
        try{
            PreparedStatement ps=getConexion().prepareStatement("select ID from TABLA_MUNICIPIOS where nombre_estado=? and municipio=?");
            ps.setString(1,estado);
            ps.setString(2,municipio);
            rs=ps.executeQuery();
            rs.next();
                    
            index=rs.getInt(1);
            ps.close();
        }catch(SQLException e){//System.out.println(e.getMessage());
        }
        return index;
    }
    
    public void Actualizar(String estado, String municipio){
             String query="UPDATE TABLA_MUNICIPIOS SET NOMBRE_ESTADO=?,MUNICIPIO=?,IMAGEN=?," +
        "CRITERIO1_1=?,CRITERIO1_2=?,CRITERIO1_3=?,CRITERIO1_4=?,CRITERIO1_5=?," +
        "CRITERIO2_1=?,CRITERIO2_2=?,CRITERIO2_3=?,CRITERIO2_4=?," +
        "CRITERIO3_1=?,CRITERIO3_2=?,CRITERIO3_3=?,CRITERIO3_4=?," +
        "CRITERIO4_1=?,CRITERIO4_2=?,CRITERIO4_3=?,CRITERIO4_4=?," +
        "COMENTARIO1_1=?,COMENTARIO1_2=?,COMENTARIO1_3=?,COMENTARIO1_4=?,COMENTARIO1_5=?," +
        "COMENTARIO2_1=?,COMENTARIO2_2=?,COMENTARIO2_3=?,COMENTARIO2_4=?," +
        "COMENTARIO3_1=?,COMENTARIO3_2=?,COMENTARIO3_3=?,COMENTARIO3_4=?," +
        "COMENTARIO4_1=?,COMENTARIO4_2=?,COMENTARIO4_3=?,COMENTARIO4_4=?"
                     + "where NOMBRE_ESTADO=? and MUNICIPIO=?";
        PreparedStatement ps=null;
        try {
            ps = getConexion().prepareStatement(query);
            ps.setString(1,fe.estado);
            ps.setString(2,fe.municipio);
            ps.setString(3,fe.img);
            ps.setInt(4,fe.val1_1);
            ps.setInt(5,fe.val1_2);
            ps.setInt(6,fe.val1_3);
            ps.setInt(7,fe.val1_4);
            ps.setInt(8,fe.val1_5);
            ps.setInt(9,fe.val2_1);
            ps.setInt(10,fe.val2_2);
            ps.setInt(11,fe.val2_3);
            ps.setInt(12,fe.val2_4);
            ps.setInt(13,fe.val3_1);
            ps.setInt(14,fe.val3_2);
            ps.setInt(15,fe.val3_3);
            ps.setInt(16,fe.val3_4);
            ps.setInt(17,fe.val4_1);
            ps.setInt(18,fe.val4_2);
            ps.setInt(19,fe.val4_3);
            ps.setInt(20,fe.val4_4);
            ps.setString(21,fe.comentario1_1);
            ps.setString(22,fe.comentario1_2);
            ps.setString(23,fe.comentario1_3);
            ps.setString(24,fe.comentario1_4);
            ps.setString(25,fe.comentario1_5);
            ps.setString(26,fe.comentario2_1);
            ps.setString(27,fe.comentario2_2);
            ps.setString(28,fe.comentario2_3);
            ps.setString(29,fe.comentario2_4);
            ps.setString(30,fe.comentario3_1);
            ps.setString(31,fe.comentario3_2);
            ps.setString(32,fe.comentario3_3);
            ps.setString(33,fe.comentario3_4);
            ps.setString(34,fe.comentario4_1);
            ps.setString(35,fe.comentario4_2);
            ps.setString(36,fe.comentario4_3);
            ps.setString(37,fe.comentario4_4);
     
            ps.setString(38, estado);
            ps.setString(39, municipio);
            
            ps.executeUpdate();
            ps.close();
            //System.out.println("GuardadoM");
            //Recursos
            
            query="UPDATE RECURSOCULTURAL SET "+
            "CRITERIO1=?,CRITERIO2=?,CRITERIO3=?,CRITERIO4=?,CRITERIO5=?," +
            "CRITERIO6=?,CRITERIO7=?,CRITERIO8=?,CRITERIO9=?,CRITERIO10=? "
                     + "where IDMUNICIPIO=? and NOMBRE=? and TIPO=?";
            
            for (Recursos recurso : fe.recursosNaturales){
                ps = getConexion().prepareStatement(query);
                ps.setInt(1,recurso.getCriterio1());
                ps.setInt(2,recurso.getCriterio2());
                ps.setInt(3,recurso.getCriterio3());
                ps.setInt(4,recurso.getCriterio4());
                ps.setInt(5,recurso.getCriterio5());
                ps.setInt(6,recurso.getCriterio6());
                ps.setInt(7,recurso.getCriterio7());
                ps.setInt(8,recurso.getCriterio8());
                ps.setInt(9,recurso.getCriterio9());
                ps.setInt(10,recurso.getCriterio10());
                ps.setInt(11,index(fe.estado,fe.municipio));
                ps.setString(12,recurso.getNombre());
                ps.setInt(13,1);
                ps.executeUpdate();
                ps.close();
                //System.out.println("GuardadoRN");
            }
            
            for (Recursos recurso : fe.recursosCulturales){
                ps = getConexion().prepareStatement(query);
                ps.setInt(1,recurso.getCriterio1());
                ps.setInt(2,recurso.getCriterio2());
                ps.setInt(3,recurso.getCriterio3());
                ps.setInt(4,recurso.getCriterio4());
                ps.setInt(5,recurso.getCriterio5());
                ps.setInt(6,recurso.getCriterio6());
                ps.setInt(7,recurso.getCriterio7());
                ps.setInt(8,recurso.getCriterio8());
                ps.setInt(9,recurso.getCriterio9());
                ps.setInt(10,recurso.getCriterio10());
                ps.setInt(11,index(estado, municipio));
                ps.setString(12,recurso.getNombre());
                ps.setInt(13,2);
                ps.executeUpdate();
                ps.close();
                //System.out.println("GuardadoRC");
            }
            
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
            
            ps=getConexion().prepareStatement("DELETE FROM RECURSOCULTURAL where idmunicipio=?");
            ps.setInt(1,index(fe.estado, fe.municipio));
            ps.execute();
            
            JOptionPane.showMessageDialog(null,municipio+" Ha sido Eliminado con Exito");
        }catch(SQLException e){System.out.println(e.getMessage());}
   }
}
