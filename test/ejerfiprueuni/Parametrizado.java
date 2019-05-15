package ejerfiprueuni;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/**
 *
 * @author Juan Antonio Moreno Reyes
 */
@RunWith(Parameterized.class)
public class Parametrizado {
    public Vendedores todosVendedores;
    static   ArrayList <Vendedor>  VendedoresAlicante; 
    String provincia;
    @Parameterized.Parameters
    public static Iterable data(){
    return Arrays.asList(new Object[][]{{"Alicante",VendedoresAlicante}});
    }
    private int numvend;
    
    
    public Parametrizado(String provincia, ArrayList <Vendedor>  VendedoresAlicante) {
     this.provincia=provincia;
    }
    @Test
    public void Eliminar_vendedor(){
     VendedoresAlicante.remove(numvend);    
    }
    
    public void Buscar_Vendedor(){
      ArrayList esperado= todosVendedores.buscar_Vendedor(provincia); 
      Assert.assertEquals(VendedoresAlicante,esperado);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    Vendedor v1=new Vendedor(1,"Pedro","Vende_todo","Alicante","elche","Avda_Libertad");
    Vendedor v2=new Vendedor(2,"Antonio","Numero_uno", "Valencia","Alicante","Espronceda");
    Vendedor v3=new Vendedor(3,"Luis","Charlatan","Alicante","Santa Pola","Pedro Juan");
    Vendedor v4=new Vendedor(4,"Paco","El_rapido","Alicante","Santa Pola","Torres_Quevedo");
    Vendedor v5=new Vendedor(5,"luis","Come_bolas","Valencia","Torrent","Calle_grande");
    todosVendedores.anyadir_Vendedor(v1);
    todosVendedores.anyadir_Vendedor(v2);
    todosVendedores.anyadir_Vendedor(v3);
    todosVendedores.anyadir_Vendedor(v4);
    todosVendedores.anyadir_Vendedor(v5);
    VendedoresAlicante.add(v1);
    VendedoresAlicante.add(v3);
    VendedoresAlicante.add(v4);
    
    }
    
    @After
    public void tearDown() {
    }

  
}
