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
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author Juanan
 */
public class Parametrizado {
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{{1,"JFJ","JJ","Alicante","elche","calle"},{2,"Antonio","JcccJ","Alicante","Alicane","Espronceda"},{3,"Luis","JcrgtyeccJ","Alicante","Santa Pola","Pedro Juan"},{6,"Leopoldo","Vende_todo","Madrid","Alconbendas","Avda.Libertad"}});
        }
    
    public Parametrizado() {
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
