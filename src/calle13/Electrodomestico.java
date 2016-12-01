/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;

/**
 *
 * @author SergioIván
 */

public abstract class Electrodomestico 
{
    private String marca;
    private String modelo;
    private String serial;
    private String entradaelectrica;
    
    abstract void enceder();
    public Electrodomestico(String marca, String entradaelectrica) {
        this.marca = marca;
        this.entradaelectrica = entradaelectrica;
    }
    
    
    
    
    
    
}
