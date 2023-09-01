/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorWebService;

/**
 *
 * @author _San__
 */
public class ClientCalculatorApp {
    public static void main(String[] args) {
      Calculator client=new Calculator();
      int res=client.add(5,4);
      System.out.println("Result of addition: " + res);
      int s=client.subtract(9,6);
      System.out.println("Result of addition: " + s);
      int m=client.multiply(3,2);
      System.out.println("Result of addition: " + m);
      double d=client.divide(4,2);
      System.out.println("Result of addition: " + d);
      //client.close();
      
    } 
}
