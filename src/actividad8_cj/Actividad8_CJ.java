/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8_cj;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class Actividad8_CJ {

    public static int elegir(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        try{
            opcion = sc.nextInt();
        }catch(Exception e){
            return elegir();
        }
        if(opcion<1 || opcion>4){
            return elegir();
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
            
            System.out.println("##########Menú##########");
            System.out.println("# 1. Barajear          #");
            System.out.println("# 2. Ver primera carta #");
            System.out.println("# 3. Jugar carta       #");
            System.out.println("# 4. Repartir mano     #");
            System.out.println("# 5. Salir             #");
            System.out.println("########################");
            
            opcion = elegir();
            
            switch(opcion){
                case 1:
                    baraja.shuffle();
                    break;
                case 2:
                    baraja.head();
                    break;
                case 3:
                    baraja.pick();
                    break;
                case 4:
                    baraja.hand();
                    break;
                case 5:
                    salir = true;
            }
            
        }while(salir == false);
        
    }
    
}
