/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author markn
 */ 
public class JavaApplication1 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        factorialCalcu calculator = new factorialCalcu();
        System.out.print("enter the number :");
        int number = input.nextInt(); // Example number
        calculator.setNum(number);      
        System.out.println("the number is:"+calculator.getNum());
        int result = calculator.calculateFactorial();
        System.out.println("The factorial of " + number + " is: " + result);

}
        
    
}
