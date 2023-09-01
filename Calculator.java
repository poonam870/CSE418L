/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package CalculatorWebService;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author _San__
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * This is a sample web service operation
     */
   @WebMethod
public int add(int num1, int num2) {
    return num1 + num2;
}

@WebMethod
public int subtract(int num1, int num2) {
    return num1 - num2;
}

@WebMethod
public int multiply(int num1, int num2) {
    return num1 * num2;
}

@WebMethod
public double divide(double num1, double num2) {
    if (num2 == 0) {
        // Handle division by zero error
        throw new ArithmeticException("Division by zero is not allowed.");
    }
    return num1 / num2;
}

}
