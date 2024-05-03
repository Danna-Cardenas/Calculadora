/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DANNA
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testGetSigno() {
        System.out.println("getSigno");
        Calculadora instance = new Calculadora();
        char expResult = '+';
        char result = instance.getSigno();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testSetSigno() {
        System.out.println("setSigno");
        char signo = '-';
        Calculadora instance = new Calculadora();
        instance.setSigno(signo);
       
    }

    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.getResultado();
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        double resultado = 1.0;
        Calculadora instance = new Calculadora();
        instance.setResultado(resultado);
        
    }

    @Test
    public void testOperation() {
        System.out.println("operation");
        String cadena = "+";
        Calculadora instance = new Calculadora();
        String expResult = "-";
        String result = instance.operation(cadena);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Calculadora instance = new Calculadora();
        String expResult = "/";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
