/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9_cj;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Actividad9_CJ {

    //Metodo para imprimir el menú
    public static int showMenu() {
        System.out.println("Bienvenidos a PokerManía");
        System.out.println("##########Menú##########");
        System.out.println("# 1. Barajear          #");
        System.out.println("# 2. Ver primera carta #");
        System.out.println("# 3. Jugar carta       #");
        System.out.println("# 4. Repartir mano     #");
        System.out.println("# 5. Salir             #");
        System.out.println("########################");
        
        //Seleccionar opción del menú
        Scanner sc = new Scanner(System.in);
        int opcion;
        try{
            opcion = sc.nextInt();
        }catch(Exception e){
            System.out.println("Ingresa una opción valida del menú.");
            return showMenu();
        }
        
        if(opcion<1 || opcion>5){
            System.out.println("Ingresa una opción valida del menú.");
            return showMenu();
        }else{
            return opcion;
        }
        
    }
    
    public static void main(String[] args) {
        
        //Variables
        boolean salir = false;
        int opcion;
        
        //Objetos
        Deck baraja = new Deck();
        
        do{
            
            opcion = showMenu();
            
            switch(opcion){
                case 1:
                    baraja.shuffle();
                    break;
                case 2:
            
                    try {
                        baraja.head();
                    } catch (Exception ex) {
                        System.out.println("Se han acabado las cartas.");
                        System.out.println("El juego se cerrará.");
                        salir = true;
                    } 
            
                    break;
                case 3:
                    try {
                        baraja.pick();
                    } catch (Exception ex) {
                        System.out.println("Se han acabado las cartas.");
                        System.out.println("El juego se cerrará.");
                        salir = true;
                    } 
                    
                    break;
                case 4:
                    
                    try {
                        baraja.hand();
                    } catch (Exception ex) {
                        System.out.println("Se han acabado las cartas.");
                        System.out.println("El juego se cerrará.");
                        salir = true;
                    } 
                    
                    break;
                case 5:
                    salir = true;
                    break;
            }
            
        System.out.println("");
        }while(salir == false);
        
        System.out.println("Gracias por jugar!");
        
    }
    
}
