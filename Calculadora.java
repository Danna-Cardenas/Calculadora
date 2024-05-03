/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;


/**
 *
 * @author DANNA
 */
public class Calculadora {

    private char signo;
    private double resultado;

    public Calculadora(char signo, double resultado) {
        this.signo = signo;
        this.resultado = resultado;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public Calculadora() {
       
    }
    
    public String operation(String cadena){
        this.resultado = 0;
        this.signo = '+';
        StringBuilder numeros = new StringBuilder();
        for(char c : cadena.toCharArray())
        {
            
            if(Character.isDigit(c))
            {
                numeros.append(c);
            }
            else{
                
                String miCadena = numeros.toString();
                double num2 = Double.parseDouble(miCadena);
                
                if(this.signo == '+')
                {
                    this.resultado += num2;
                }
                else if(this.signo == '-')
                {
                    this.resultado -= num2;
                }
                else if(this.signo == '*')
                {
                    this.resultado *= num2;
                }
                else if(this.signo == '/')
                {
                    this.resultado /= num2;
                }
                
                this.signo = c;
                numeros.setLength(0);
            }
        }
        return String.valueOf(this.resultado);
    }

    @Override
    public String toString() {
        return "Calculadora{" + "signo=" + signo + ", resultado=" + resultado + '}';
    }
    
    
    
}





    
