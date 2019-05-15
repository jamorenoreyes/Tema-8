package ejerfiprueuni;

import ejerfiprueuni.Vendedor;
import ejerfiprueuni.Vendedores;
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
public class Parametrizadoentero {
    Vendedores todosVendedores;
    String provincia;
    int resultado;
    
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {"Alicante",1},{"Madrid",0}
        });
    }
    
    public Parametrizadoentero(String parametro, int resultado) {
        this.provincia = parametro;
        this.resultado = resultado;
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
     @Before
    public void setUp() {
        todosVendedores = new Vendedores();
        todosVendedores.anyadir_Vendedor(new Vendedor(0, "Pedro", "nombrecomercial", "Alicante", "Elche", "Avda.Libertad"));
        todosVendedores.anyadir_Vendedor(new Vendedor(1, "Luis", "nombre", "Valencia", "Torrente", "calle nueva"));
    }
    
    @After
    public void tearDown() {       
    }

    /**
     * Test of buscar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_Vendedor_String() {
        System.out.println("buscar_Vendedor");
        ArrayList<Vendedor> result = todosVendedores.buscar_Vendedor(provincia);
        int b = result.size();
        Assert.assertEquals(resultado, b);
        // TODO review the generated test code and remove the default call to fail.
    }
}
