/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerfiprueuni;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.Parameterized;

/**
 *
 * @author Juanan
 */
public class Parametrizado {
    @Parameterized.Parameters
    //¿Tengo que crear un objeto vendedor?
    public static Iterable data(){
        return Arrays.asList(new Object[][]{{1,"Pedro","Vende_todo","Alicante","elche","Avda_Libertad"},{2,"Antonio","Numero_uno","Alicante","Alicante","Espronceda"},{3,"Luis","Charlatan","Alicante","Santa Pola","Pedro Juan"},{6,"Leopoldo","Vende_todo","Madrid","Alconbendas","Avda.Libertad"}});
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
      // Vendedores.eliminar_Vendedor(numvend);    // tank.fill(relleno);
        //double nivel=tank.getTankLevel();
        //Assert.assertEquals(esperado,nivel,0.0);
    }
    
    public void Buscar_Vendedor(){
       // Assert.assertArrayEquals(expecteds, actuals);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
