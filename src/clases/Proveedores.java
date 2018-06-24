
package clases;
import java.sql.ResultSet;
public class Proveedores {
  Conexion cn= new Conexion(); 
  public ResultSet llenarProveedores(){
      return cn.getValores("SELECT * FROM proveedores");
  }
  public void nuevoproveedor(int idproveedor, String proveedor){
      cn.UID("INSERT INTO proveedores(idproveedor, proveedor) VALUES('"+idproveedor+"','"+proveedor+"')");
  }
      public ResultSet cuantosProveedores(){
          return cn.getValores("SELECT MAX(idproveedor) FROM proveedores");
      }
}
