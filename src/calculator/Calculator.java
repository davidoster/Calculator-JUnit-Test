/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author George.Pasparakis
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calcs myCalcs = new Calcs();
        System.out.println("add(10,20) = " + myCalcs.add(10, 20));
        System.out.println("subtract(10,20) = " + myCalcs.subtract(10, 20));
        System.out.println("multiply(10,20) = " + myCalcs.multiply(10, 20));
        System.out.println("divide(10,20) = " + myCalcs.divide(10, 20));
    }
    
}
