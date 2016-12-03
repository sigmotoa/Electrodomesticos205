/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;

import java.util.Scanner;

/**
 *
 * @author SergioIván
 */
public class Calle13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        System.out.println("Ingrese alto, ancho, marca y entrada electrica del televisor");
//        Televisor tv2 = new Televisor(read.nextDouble(),read.nextDouble(),read.next(),read.next());
        Televisor tv1=new Televisor(35.0, 65.5, "LG","120VAC");//Instancia del televisor
//        
int opcion;
System.out.println("Seleccione una opcion");
tv1.mostrarMenuElectro();
opcion = read.nextInt();
    switch  (opcion){
                
                case 1:
                    do {
            System.out.println("Ingrese 1 para encender el televisor");
            opcion = read.nextInt();
            if (opcion==1) {
              tv1.enceder();  
            }
        } while (opcion!=1);
        
        
        do {
            System.out.println("Seleccione una opcion");
            tv1.mostrarMenu();
            opcion = read.nextInt();
            
            switch  (opcion){
                
                case 1:
                    tv1.enceder();
                    break;
                    
                case 2:
                    tv1.subirVol();
                    break;
                    
                case 3:
                    tv1.bajarVolumen();
                    break;
                    
                case 4:
                    tv1.subirCanal();
                    break;
                    
                case 5:
                    tv1.bajarCanal();
                    break;
                    
                case 6:
                    tv1.silenciar();
                    break;
                    
                case 7:
                    System.out.println("Ingrese el canal");
                    tv1.cambiarCanal(read.nextInt());
                    break;              
            }
            System.out.println(tv1);
        } while (opcion!=1);
        
                    break;
                    
                case 2:
                    tv1.subirVol();
                    break;
                    
                case 3:
                    tv1.bajarVolumen();
                    break;
                    
                case 4:
                    tv1.subirCanal();
                    break;
                    
                case 5:
                    tv1.bajarCanal();
                    break;
                    
                case 6:
                    tv1.silenciar();
                    break;
                    
                case 7:
                    System.out.println("Ingrese el canal");
                    tv1.cambiarCanal(read.nextInt());
                    break;              
            }




        
        
        
       
    }
    
}
