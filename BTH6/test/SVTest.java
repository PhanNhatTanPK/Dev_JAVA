/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phan Nhat Tan
 */
public class SVTest {
    
    public SVTest() {
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
     * Test of hienthi method, of class SV.
     */
    @Test
    public void testHienthi() {
        System.out.println("hienthi");
        SV instance = null;
        instance.hienthi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of layhoten method, of class SV.
     */
    @Test
    public void testLayhoten() {
        System.out.println("layhoten");
        SV instance = null;
        String expResult = "";
        String result = instance.layhoten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loaisv method, of class SV.
     */
    @Test
    public void testLoaisv() {
        System.out.println("loaisv");
        SV instance = null;
        String expResult = "";
        String result = instance.loaisv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dctn method, of class SV.
     */
    @Test
    public void testDctn() {
        System.out.println("dctn");
        SV instance = null;
        boolean expResult = false;
        boolean result = instance.dctn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SV.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object sv = null;
        SV instance = null;
        boolean expResult = false;
        boolean result = instance.equals(sv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
