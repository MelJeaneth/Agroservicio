
package clases;

import clases.Conexion;
import java.sql.ResultSet;


public class Tipos {
  
     Conexion cn = new Conexion();
     
    public ResultSet llenarTipos(){
        return cn.getValores("SELECT * from tipo"); 
    } 
    
    
}
