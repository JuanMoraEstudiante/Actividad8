/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8_cj;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author juanc
 */
public class Deck {
    private List<Card> original = new LinkedList<Card>();
    private Queue<Card> revueltas = new LinkedList<Card>();
    private int cantidad;

    public Deck() {
        inicializarDeck();
        cantidad = 52;
    }
    
    public void inicializarDeck(){        
        inicializarDiamantes();
        inicializarCorazon();
        inicializarPicas();
        inicializarTreboles();   
    }
    
    public void inicializarDiamantes(){
        for (int i = 0; i < 13; i++) {
            Card aux;
            switch(i){
                case 0: 
                    aux = new Card("Diamantes", "Rojo", "A");
                    break;
                case 10:
                    aux = new Card("Diamantes", "Rojo", "J");
                    break;
                case 11:
                    aux = new Card("Diamantes", "Rojo", "Q");
                    break;     
                case 12:
                    aux = new Card("Diamantes", "Rojo", "K");
                    break;
                default:
                    aux = new Card("Diamantes", "Rojo", String.valueOf(i));
            }
            this.original.add(aux);
        }
    }
    
    public void inicializarCorazon(){
        for (int i = 0; i < 13; i++) {
            Card aux;
            switch(i){
                case 0: 
                    aux = new Card("Corazones", "Rojo", "A");
                    break;
                case 10:
                    aux = new Card("Corazones", "Rojo", "J");
                    break;
                case 11:
                    aux = new Card("Corazones", "Rojo", "Q");
                    break;     
                case 12:
                    aux = new Card("Corazones", "Rojo", "K");
                    break;
                default:
                    aux = new Card("Corazones", "Rojo", String.valueOf(i));
            }
            this.original.add(aux);
        }
    }
    
    public void inicializarPicas(){
        for (int i = 0; i < 13; i++) {
            Card aux;
            switch(i){
                case 0: 
                    aux = new Card("Picas", "Negro", "A");
                    break;
                case 10:
                    aux = new Card("Picas", "Negro", "J");
                    break;
                case 11:
                    aux = new Card("Picas", "Negro", "Q");
                    break;     
                case 12:
                    aux = new Card("Picas", "Negro", "K");
                    break;
                default:
                    aux = new Card("Picas", "Negro", String.valueOf(i));
            }
            this.original.add(aux);
        }
    }
    
    public void inicializarTreboles(){
        for (int i = 0; i < 13; i++) {
            Card aux;
            switch(i){
                case 0: 
                    aux = new Card("Treboles", "Negro", "A");
                    break;
                case 10:
                    aux = new Card("Treboles", "Negro", "J");
                    break;
                case 11:
                    aux = new Card("Treboles", "Negro", "Q");
                    break;     
                case 12:
                    aux = new Card("Treboles", "Negro", "K");
                    break;
                default:
                    aux = new Card("Treboles", "Negro", String.valueOf(i));
            }
            this.original.add(aux);
        }
    }
    
    public void shuffle(){
        Random randomNum = new Random();
        int index;
        while(this.original.size() > 0){
            index = randomNum.nextInt(this.original.size());
            revueltas.add(this.original.get(index));
            this.original.remove(index);
        }
        
        System.out.println("Se mezclo el Deck");
    }
    
    public void head(){
        System.out.println(this.revueltas.peek().toString());
        System.out.println("Quedan: " + this.revueltas.size());
    }
    
    public void pick(){
        System.out.println(this.revueltas.poll().toString());
        System.out.println("Quedan: " + this.revueltas.size());
    }
    
    public void hand(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.revueltas.poll().toString());
        }
        System.out.println("Quedan: " + this.revueltas.size());
    }
    
}
