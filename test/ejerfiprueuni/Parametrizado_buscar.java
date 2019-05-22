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
public class Parametrizado_buscar {
    public Vendedores todosVendedores;
    static  Vendedores VendedoresAlicante; 
    String provincia;
    @Parameterized.Parameters
    
    public static Iterable data(){
    return Arrays.asList(new Object[][]{{VendedoresAlicante,"Alicante"}});
    }
    
    public Parametrizado_buscar(Vendedores Alicante,String provincia){
    this.provincia=provincia;
    VendedoresAlicante=Alicante; 
    }
    
    @Test
    public void Prueba_Buscar_Vendedor(){
        Vendedores resultado=todosVendedores.buscar_Vendedor(provincia); 
        Assert.assertEquals(VendedoresAlicante,resultado);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    todosVendedores=new Vendedores();
    VendedoresAlicante=new Vendedores();
    Vendedor v1=new Vendedor(1,"Pedro","Vende_todo","Alicante","elche","Avda_Libertad");
    Vendedor v2=new Vendedor(2,"Antonio","Numero_uno","Valencia","Torrente","Espronceda");
    Vendedor v3=new Vendedor(3,"Luis","Charlatan","Alicante","Santa Pola","Pedro Juan");
    Vendedor v4=new Vendedor(4,"Paco","El_rapido","Alicante","Santa Pola","Torres_Quevedo");
    Vendedor v5=new Vendedor(5,"luis","Come_bolas","Valencia","Torrent","Calle_grande");
    todosVendedores.anyadir_Vendedor(v1);
    todosVendedores.anyadir_Vendedor(v2);
    todosVendedores.anyadir_Vendedor(v3);
    todosVendedores.anyadir_Vendedor(v4);
    todosVendedores.anyadir_Vendedor(v5);
    VendedoresAlicante.anyadir_Vendedor(v1);
    VendedoresAlicante.anyadir_Vendedor(v3);
    VendedoresAlicante.anyadir_Vendedor(v4);
    }
    
    @After
    public void tearDown() {
    }

  
}
