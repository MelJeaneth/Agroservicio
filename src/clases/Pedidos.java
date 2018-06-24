package clases;
import java.sql.ResultSet;
public class Pedidos {
  Conexion cn = new Conexion();
  public ResultSet CuantosPedidos(){
      return cn.getValores("SELECT MAX(idpedido) FROM pedidos");
  }
}
