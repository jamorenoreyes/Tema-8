/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerfiprueuni;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juanan
 */
public class VendedoresTest {
    
    public VendedoresTest() {
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

    /**
     * Test of anyadir_Vendedor method, of class Vendedores.
     */
    @Test
    public void testAnyadir_Vendedor() {
        System.out.println("anyadir_Vendedor");
        Vendedores instance=new Vendedores();
        instance.cargar_datos("Alicante");
        Vendedor vend=new Vendedor(7,"Adolfo","El_rapido","Alicante","Santa Pola","calle_nueva");
        boolean expResult = true;
        boolean result = instance.anyadir_Vendedor(vend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_Vendedor_int() {
        System.out.println("buscar_Vendedor");
        int numvend = 1;
        Vendedores instance = new Vendedores();
        instance.cargar_datos("Alicante");
        Vendedor expResult = new Vendedor(1,"Pedro","Vende_todo","Alicante","elche","Avda_Libertad");
        Vendedor result = instance.buscar_Vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}
    

