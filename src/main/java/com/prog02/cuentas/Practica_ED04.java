/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prog02.cuentas;

import com.prog02.cuentas.CCuenta;

/**
 * @author Angel FV
 * @version 1.0
 */
public class Practica_ED04 {

    /**
    * Metodo main Se crea la cuenta y se llama al metodo de realizar las operaciones sobre ella
    * @param args  public static void main(String[] args)                    ^
    */
    public static void main(String[] args) {
        CCuenta cuenta1;
      
        System.out.println("inicio del programa");
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
              
        operativa_cuenta(cuenta1, 100d);
    }
    
    /**
    * Metodo operativa_cuenta para realizar las operaciones sobre una cuenta 
    * @param cuenta1 la cuenta sobre la que operar
    * @param cantidad la cantidad a ingresar y la cantidad a retirar
    */
    public static void operativa_cuenta(CCuenta cuenta1, double cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
