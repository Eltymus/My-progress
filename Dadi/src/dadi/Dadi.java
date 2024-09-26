/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dadi;
import java.util.Random;

/**
 *
 * @author loren
 */
public class Dadi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Random r=new Random(); //questo genera un  numero casuale

        int dado1=r.nextInt(1,7); //numero casuale fino a 6
        int dado2=r.nextInt(1,7); //numero casuale fino a 6
        
        int totale=dado1+dado2;

        System.out.println(dado1+" "+dado2);
        System.out.println("la somma dei dadi è "+totale);
    
        // TODO code application logic here
    }
    
}
