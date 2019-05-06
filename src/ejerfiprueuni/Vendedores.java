package ejerfiprueuni;
import java.util.ArrayList;
public class Vendedores {
protected ArrayList vende = new ArrayList();  

public Vendedores(){

 }

public boolean anyadir_Vendedor(Vendedor vend){
Vendedor temp;
    for(int x=0;x<vende.size();x++)
        {
        temp=(Vendedor) vende.get(x);
        if(vend.getNumvend()==temp.getNumvend())
            return false;
        }
    vende.add(vend);
    return true;
 }

public Vendedor buscar_Vendedor(int numvend){
    Vendedor temp;
    for(int x=0;x<vende.size();x++)
        {
        temp=(Vendedor) vende.get(x);
        if(temp.getNumvend()==numvend)
            return temp;
        }
    return null;
}

public boolean eliminar_Vendedor(int numvend){
Vendedor temp;
    for(int x=0;x<vende.size();x++) 
        {
        temp=(Vendedor) vende.get(x);
        if(temp.getNumvend()==numvend)
            {
            vende.remove(x);
            return true;
            }
        }
    return false;
  }
  
public ArrayList buscar_Vendedor(String provincia){
    ArrayList vende1 = new ArrayList();  
   
    Vendedor temp;
    for(int x=0;x<vende.size();x++)
        {
        temp=(Vendedor) vende.get(x);
        if(temp.getProvincia().equals(provincia)) 
            {
            vende1.add(temp);
            }
        }

    return vende1;
  }

public void cargar_datos(String provincia){

    Vendedor v1=new Vendedor(1,"JFJ","Vende_todo",provincia,"elche","Avda_Libertad");
    Vendedor v2=new Vendedor(2,"Antonio","Numero_uno",provincia,"Alicane","Espronceda");
    Vendedor v3=new Vendedor(3,"Luis","Charlatan",provincia,"Santa Pola","Pedro Juan");
    Vendedor v4=new Vendedor(4,"Paco","El_rapido",provincia,"Sant","Torres_Quevedo");
    Vendedor v5=new Vendedor(5,"luis","Come_bolas","Valencia","Torrent","Calle_grande");
    vende.add(v1);
    vende.add(v2);
    vende.add(v3);
    vende.add(v4);
    vende.add(v5);
  }
}
