package ejerfiprueuni;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DB_Tabla_Vendedores {

protected String conexion;
protected ArrayList vende = new ArrayList();  

public DB_Tabla_Vendedores(String conexion) {
this.conexion = conexion;
    }


public boolean anyadir_Vendedor(Vendedor vend){
boolean interruptor=true;
return interruptor;
  }

public boolean modificar_Vendedor(int numvend,Array datosModificar){
boolean interruptor=true;

return interruptor;   
  }

public boolean borrar_Vendedor(int numvend){
boolean interruptor=true;
return interruptor;
  }

public ArrayList buscar_Vendedor(String provincia){

return vende;
  }

public void Desconectar(){
    
  }
}
