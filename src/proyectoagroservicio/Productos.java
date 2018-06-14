
package proyectoagroservicio;

import java.sql.ResultSet;


public class Productos {
  Conexion cn = new Conexion();
     
    public ResultSet llenarProductos(int idtipo){
       
   
     return cn.getValores("SELECT * FROM producto WHERE producto='"+idtipo+"'");
    } 
    
    
    
}
