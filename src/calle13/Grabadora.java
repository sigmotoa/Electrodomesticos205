/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;

/**
 *
 * @author ANDRES
 */
public class Grabadora extends Electrodomestico
{
    
    
    
    boolean encendido;
    int volumen;
    int voltemp;
    boolean mute;
    double frecuencia;
    boolean modulacion;
    boolean unidad;
    boolean reproduccion;
    boolean pausada;
    int cancion;
    boolean bandeja;

    public Grabadora(String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
    }
    
    
    @Override
    void enceder() {
        if (encendido != true) {
            encendido = true;
        } else {
            encendido = false;
        }
    }

    
      
       
}
