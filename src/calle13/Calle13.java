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
public class Calle13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Televisor tv1=new Televisor(35.0, 65.5, "LG","120VAC");
        
        System.out.println(tv1.encendido);
        tv1.enceder();
        System.out.println(tv1.encendido);
        for (int i = 0; i < 110; i++) {
            tv1.subirVol();
            System.out.println(tv1);
            
        }
        for (int i = 0; i < 30; i++) {
            tv1.bajarCanal();
            System.out.println(tv1);
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
