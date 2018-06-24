
package clases;

import java.sql.ResultSet;


public class Tipos {
  
     Conexion cn = new Conexion();
     
    public ResultSet llenarTipos(){
        return cn.getValores("SELECT * from tipo"); 
    } 
    
    public ResultSet llenarTipoDependiendoProducto(int idproducto){
        return cn.getValores("SELECT tipo.idtipo, tipo.tipo, producto.idproducto, producto.producto FROM tipo INNER JOIN producto ON tipo.idtipo = producto.idtipo WHERE (((producto.idproducto)='"+idproducto+"'))");
    }
    
}
