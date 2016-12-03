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
public class Televisor extends Electrodomestico {

    double alto;  //cm
    double ancho; //cm
    int diagonal; //inches

    byte volumen=0;
    byte numerocanal=2;//[];
    //String nombrecanal[];

    boolean mute;
    boolean encendido = false;

    @Override
    void enceder() {
        if (encendido != true) {
            encendido = true;
        } else {
            encendido = false;
        }

    }

    public void calcularDiagonal() {
        diagonal = (byte) 47;//Es ejemplo..No sea perezoso, calcules
    }

    public void subirVol() {
        if (volumen == 100) {
            volumen = 100;
        } else {
            volumen++;
        }
    }

    public void bajarVolumen() 
    {
        if(volumen==0)
        {
            volumen=0;}
        else{
        volumen--;
        }
        
    }

    public void subirCanal() 
    {   if(numerocanal==120)
    {
        numerocanal=2;
    }
    else{
        numerocanal++;
    }
        
        
    }

    public void bajarCanal() 
    {
        if(numerocanal==2)
            numerocanal=120;
        else
            numerocanal--;
    }

    public void silenciar() {
    }

    public void cambiarCanal(int siguientecanal)
    {
        
    }

    public Televisor(double alto, double ancho, String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
        this.alto = alto;
        this.ancho = ancho;
        calcularDiagonal();
    }

    @Override
    public String toString() {
        return "------------------\n"+
                "Estado: "+encendido+"\n"+
                "Vol: "+ ""+volumen+
                "\n"+"Can: "+numerocanal+
                "\n------------------"
                ;
    }
    
    
    
    
    
    
}
