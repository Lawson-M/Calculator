/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_1;

/**
 *
 * @author ltmer
 */
public class Calculations {

    private double x;
    private String sign;
    private double y;
    private double ans;
    

    public Calculations(double num1, String s, double num2){
    this.x=num1;
    this.sign = s;
    this.y = num2;
    
}
    double math(){ //Finding sign
        switch (sign) {
            case "+" -> //check if addition
                this.ans = add(x,y);
            case "-" -> //check if subtraction
                this.ans = sub(x,y);
            case "*" -> // check if multiplication
                this.ans = mult(x,y);
            case "/" -> // check if division
                this.ans = div(x,y);
            default -> {
            }
        }
        return this.ans;
    }
    
    private double add(double x,double y){ //find addition answer
        ans = x+y;
        return ans; //return to main
    }
    private double sub(double x,double y){ //find subtraction answer
        ans = x-y;
        return ans; //return to main
    }
    private double mult(double x,double y){ // find multiplication answer
        ans = x*y;
        return ans; //return to main
    }
    private double div(double x,double y){ // find division answer
        ans = x/y;
        return ans; //return to main
    }
}
