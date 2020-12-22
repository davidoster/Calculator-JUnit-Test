/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;



/**
 *
 * @author George.Pasparakis
 */
public class CalcsTest {
    
    public CalcsTest() {
    }
    
   

    /**
     * Test of add method, of class Calcs.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 10;
        int b = 20;
        Calcs instance = new Calcs();
        int expResult = 30;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calcs.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 10;
        int b = 20;
        Calcs instance = new Calcs();
        int expResult = -10;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calcs.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 10;
        int b = 20;
        Calcs instance = new Calcs();
        int expResult = 200;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calcs.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 10;
        int b = 20;
        Calcs instance = new Calcs();
        double expResult = 0.5;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
