/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_1;
import java.util.Scanner;

/**
 *
 * @author ltmer
 */
public class Lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner UserIn = new Scanner(System.in);
        
        System.out.println("Enter first number"); //asking for first number
        double num1 = UserIn.nextDouble(); //User input
        
        System.out.println("Add (+), Subtract (-), Multiply (*), or Divide (/), "); //Asking for operator
        String opr = UserIn.next(); //User input
        if(opr.equals("+")||opr.equals("-")||opr.equals("*")||opr.equals("/")){ //checking if operator is valid
            
        }else{
            System.out.println("This Operator is Invalid"); //telling user their input is wrong
                    System.exit(0); //ending
        }
        
        System.out.println("Enter second number"); //asking for second number
        double num2 = UserIn.nextDouble(); //User input
        
        if(opr.equals("/")&num2==0){  //checking if its deviding by zero
            System.out.println("CANNOT DIVIDE BY ZERO"); //telling user that its a mistake
            System.exit(0);
        }
        Calculations cal = new Calculations(num1, opr, num2);
         double ans = cal.math();
        System.out.printf("Answer: %.2f", ans);//printing answer
        System.out.println();//creating a space
        }
}
    

