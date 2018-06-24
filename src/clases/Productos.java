
package clases;

import java.sql.ResultSet;


public class Productos {
  Conexion cn = new Conexion();
     public ResultSet llenarProductos(){
         return cn.getValores("SELECT * FROM producto");
     }
    public ResultSet llenarProductosDependiendoTipo(int idtipo){
   return cn.getValores("SELECT * FROM producto WHERE producto='"+idtipo+"'");
    } 
    
    
    
}
