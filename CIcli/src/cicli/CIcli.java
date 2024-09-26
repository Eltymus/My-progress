/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cicli;

import java.util.Scanner;
import  java.util.Random;
/**
 *
 * @author loren
 */
public class CIcli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ciclo FOR , fatto da 3 parti
//        for (int i = 0; i < 10; i++) {
//            System.out.println("ciao");
//            System.out.println(i);
//        }
//        
//        for (int i = 0; i  > 10; i--) {
//            System.out.println(i);
//        }
//        
//        System.out.println("solo pari");
//        for (int i = 0; i < 10; i+=2) {
//            System.out.println(i);
//        }
//        
//        System.out.println("caratteri");
//        for (int i = 32; i < 256; i++) {
//            System.out.println((char)i);
//        }
//        
//        FOR destrutturato
//        int contatore=0;
//        for (; contatore < 10; ) {
//            System.out.println(contatore);
//            contatore++;
//        }
//        
//        System.out.println("FOR con 2 indici : ");
//        for (int i = 0 ,  j = 10; i < 10; i++, j--) {
//         System.out.println("i = "+i+" j = "+j);   
//        }
//        
//        //stampa Verticale
//        
//        String a="ciao a tutti";
//        
//        for (int i = 0; i < a.length(); i++) {
//            System.out.println(a.charAt(i));
//        }
//        
        //calcolare automaticamente il numero di spazi
        
        
        //Chiedere a Davide, mi sono fatto aiutare da chat gpt a chiudere questo esercizio
        //non ho capito perchè mi ha correrro così
        //int coint = 0 come variabile non ho pensato a metterla perchè esterna a ciclo for
        // chat got ha risolto il problema MA togliendo da ciclo for il print del count.
        
//        String frase="ciao a tutti oggi è una bella gioranta";
//        int count = 0;
//        
//        for (int i = 0 ; i <frase.length(); i++) {
//            if(frase.charAt(i)==' ') {
//               count++;
//            }
//        }    
//            System.out.println("numero spazi : " + count);
            
            Scanner s=new Scanner(System.in);
            
//            System.out.println("inserisci un numero : ");
//            int numero=s.nextInt();
//            
//            if (numero<0){
//                System.out.println("errore , numero negativo");
//            }else{
//                for (int i = 0; i <= numero; i++) {
//                    System.out.println(i);;
//                }
//            }
//           
//            System.out.println("quanti numeri vuoi sommare ?");
//            int quanti=s.nextInt();
//            
//            int somma=0;
//            
//            for (int i = 0; i < quanti; i++) {
//                System.out.println("scrivi il "+ (i+1) +" numero");
//            int numero=s.nextInt();
//            somma+=numero;
//        }
//            System.out.println("la somma è :" + somma);
//            

            Random  r=new Random();
            
//            int n =r.nextInt(101);
//            int dispari=0;
//            int pari=0;
//    
//            for (int i = 0; i < n; i++) {
//            if (i%2==0){
//                pari++;
//            }else{
//                dispari++;
//            }
//        }
//            
//            System.out.println("numero casuale : "+n);
//                        System.out.println("numeri dispari : "+dispari);
//                        System.out.println("numeri pari : "+pari);

            
//            int n=r.nextInt(1,21);
//            System.out.println("numero casuale n : "+ n);
//            boolean trovato =false;
//            
//            for (int i = 1; i <= 10; i++) {
//                if (n==i ) {
////                    System.out.println("il numero è stato trovato");
//                    trovato = true;
//                     break;
//                }                                
//        }
//            
//                if (trovato==true) {
//                    System.out.println("il numero è stato trovato.");
//                }else{
//                    System.out.println("il numero non è stato trovato.");
//                }            
//            
            
//            String frase="Tanto va la gatta al lardo";
//            
//                        String pari=" ";
//                        String dispari=" ";
//
//                for (int i = 0; i < frase.length(); i++) {
//                    
//                    if (frase.charAt(i)==' ') {
//                        continue; //continue salta un giro del for
//                    }
//                    
//                    if (i%2==0) {
//                        //System.out.println(frase.charAt(i));
//                        pari+=frase.charAt(i);
//                    }else  {
////                        System.out.println(frase.charAt(i));
//                        dispari+=frase.charAt(i);
//
//                    }
//        }
//                System.out.println("lettere posizione pari : "+pari);
//                System.out.println("lettere posizione dispari : " + dispari);
//            
//            int numMisterioso=r.nextInt(11);
//            for (int i = 10; i > 0; i--) {
//                System.out.println("prova a indovinare il numero :");
//                int mioNumero=s.nextInt();
//                
//                if (mioNumero==numMisterioso){
//                    System.out.println("hai indovinato!");
//                    break;
//                }else{
//                    System.out.println("Sbagliato");
//                    if (numMisterioso<mioNumero){
//                        System.out.println("il numero misterioso è più piccolo , rimangono "+(i-1)+" tentativi. ");
//                    }else{
//                        System.out.println("il numero misterioso è più grande , rimangono "+(i-1)+" tentativi. ");
//                    }
//                }
//        }

                //    for dentro a un for serve a moltiplicare le volte in cui il ciclo viene ripetuto
                // '/t' serve fare una distanza di un tab in una stampa di terminale
                    
                
                /////////////////////////////////////////////////////////////////WHILE E DO///////////////////////////////////////////////////////////////////
//                
//                int contatore=0;
//                while (contatore <10){
//                    System.out.println(contatore);
//                    contatore++;
//                }
//                System.out.println(contatore);
//                
//                
//                int contatore2 =0;
//                do{
//                
//                    System.out.println(contatore2);
//                    contatore2++;
//                
//                }while (contatore2 < 10);
//                
//                System.out.println(contatore2);
//
//                
///////////////////////////////////////////////////////////////////////////////////////

            int i=0;
            do {
                System.out.println("inserisci un numero, 0 per uscire");
        } while (s.nextInt()!=0);
                    










    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
                
    
    
    
    }
           
            
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

