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
    public ArrayList<Vendedor> todosVendedores=new ArrayList<Vendedor>();
    static Vendedores vendeProv=new Vendedores(); 
    @Parameterized.Parameters
    public static Iterable data(){
    return Arrays.asList(new Object[][]{{"Alicante",vendeProv}});
    }
    private int numvend;
    private String nomvend,nombrecomer,provincia,localidad,direccion;
    
    public Parametrizado(int numvend,String nomvend,String nombrecomer,String provincia,String localidad,String direccion) {
    this.numvend=numvend;
    this.nomvend.equals(nomvend);
    this.nombrecomer.equals(nombrecomer);
    this.provincia.equals(provincia);
    this.localidad.equals(localidad);
    this.direccion.equals(direccion);
    }
    @Test
    public void Eliminar_vendedor(){
      vendeProv.eliminar_Vendedor(numvend);    
        //double nivel=tank.getTankLevel();
        //Assert.assertEquals(esperado,nivel,0.0);
    }
    
    public void Buscar_Vendedor(){
      todosVendedores v=vendeProv.buscar_Vendedor(provincia); 
      Assert.assertArrayEquals(numvend,todosVendedores);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    Vendedor v1=new Vendedor(1,"Pedro","Vende_todo",provincia,"elche","Avda_Libertad");
    Vendedor v2=new Vendedor(2,"Antonio","Numero_uno",provincia,"Alicane","Espronceda");
    Vendedor v3=new Vendedor(3,"Luis","Charlatan",provincia,"Santa Pola","Pedro Juan");
    Vendedor v4=new Vendedor(4,"Paco","El_rapido",provincia,"Sant","Torres_Quevedo");
    Vendedor v5=new Vendedor(5,"luis","Come_bolas","Valencia","Torrent","Calle_grande");
    todosVendedores.add(v1);
    todosVendedores.add(v2);
    todosVendedores.add(v3);
    todosVendedores.add(v4);
    todosVendedores.add(v5);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
