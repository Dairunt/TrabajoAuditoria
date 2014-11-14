/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pruebas;

import Bean.beanEquipo;
import Bean.beanLiga;
import Model.Equipo;
import Model.Liga;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author FrancoSebastian
 */
public class Pruebas {
    
    public Pruebas() {
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
     @Test
     public void hello() {

        beanLiga liga1 = new beanLiga();
        List<Liga> ligaList= liga1.Listar();
         for (int i = 0; i < ligaList.size(); i++) 
             System.out.println(ligaList.get(i).getNombre());
         //  assertEquals(1, 0);}
         }
       
}
