/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog02.cuentas;

/**
 * Clase cuenta 
 * 
 * Contiene información de cada cuenta
 * 
 * @author Angel 
 * @version 1.0 
 */
public class CCuenta {
/**
 * propiedades de CCuenta:
 * nombre  nombre de la cuenta
 * cuenta  numero de la cuenta
 * saldo  saldo de la cuenta
 * tipoInterés  tipo de interes aplicado en la cuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor Cuenta
     * @param nom the nombreCuenta to set
     * @param cue the numeroCuenta to set
     * @param sal the saldoCuenta to set
     * @param tipo the tipoInteresCuenta to set
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

     /**
     * @return the saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
    * Metodo ingresar saldo en la cuenta. 
    * @param cantidad la cantidad a ingresar
    * @throws java.lang.Exception  mensaje al usuario en caso de que la cantidad a ingresar sea menor a 0 
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
    * Metodo retirar. 
    * @param cantidad la cantidad a retirar
    * @throws java.lang.Exception mensaje al usuario en caso de que la cantidad a retirar sea menor/igual a 0 
    * o mayor que el sado de la cuenta
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
