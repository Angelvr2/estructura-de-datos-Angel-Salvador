/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumnog
 */
import java.util.Stack;
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> pila = new Stack();
        //push: aplicar elementos
        Pila.push("Fresa");
        Pila.push("Mango");
        Pila.push("Manzana");
        Pila.push("Mango");
        Pila.push("Ciruela");
        Pila.push("Tamarindo");
        //peek: ver la cima sin retirarlo
         System.out.println("Cima: "+Pila.peek());
        //pop: desapilar
         System.out.println("retirado: "+Pila.pop());
         System.out.println("Nueva cima: "+Pila.peek());
         
         System.out.println("---hay "+pila.rise()+"frutas en la pila ---");
         while(!pila.isEmpty()) {
             System.out.println("Procesando "+pila.pop());
         System.out.println("Ya no hay nada en la pila!!!");
         }
    }
    
}
