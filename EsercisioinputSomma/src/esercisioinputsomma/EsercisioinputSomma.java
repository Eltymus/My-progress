/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esercisioinputsomma;

import java.util.Scanner;
/**
 *
 * @author loren
 */
public class EsercisioinputSomma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner calcolo = new Scanner(System.in); 
        
//        System.out.println("scelgi il primo numero da sommare :");
//        double numero1=calcolo.nextDouble();
//       
//        System.out.println("scelgi il secondo numero da sommare :");
//       double numero2=calcolo.nextDouble();
//       
//       System.out.println("il tuo primo numero è "+numero1);
//       System.out.println("il tuo secondo numero è "+numero2);
//       
//       double risultato = numero1+numero2;
//       
//       System.out.println("la somma dei 2 numeri è: "+risultato);
//        
//        System.out.println("aggiungi un altro numero alla somma:");
//        double numero3=calcolo.nextDouble();
//        
//        double somma2=risultato+numero3;
//        System.out.println("la somma più il terzo numero è: "+ somma2);

////// con una sola variabile fai una somma
//        int somma=0;
//        System.out.println("inserisci orimo numero ");
//        somma+=calcolo.nextint();
//creare un convertitore C in K kelvin
////K=C+273.5
//        final double kelvindiff=273.5;
//        
//        System.out.println("converitore C, Celsius, in K , Kelvin. Inserire la temperatura in Celsius:");
//        double K=calcolo.nextDouble();
//        System.out.println("la temperatura che cercavi in Kelvin è: "+(K+kelvindiff));
         
        ////////////////////////////////////////////////////////////////////////////////////////////
        
        //chiedere all'utente un numero con la virgola che rappresenta il tempo speso in  ore (3.5 = 3 ore e mezza)
        //il programma deve stampare il lumero di minuti corrispindenti ( 3.5*60)
        //il risultato deve essere espresso come numero intero , non con la virgola. (cast)
        
        System.out.println("inserire il numero di ore trascorse: ");
        double time=calcolo.nextDouble();
        double timeInt=time*60;
        System.out.println("hai trascorso :"+ (int)timeInt +" minuti in questo task");
        
                
    
    }
    
}
