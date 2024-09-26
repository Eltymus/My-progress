/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eserciz;

import java.util.Scanner;
import java.util.Random;


public class Eserciz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //esercizio dopo imput per sapere se il numero è positivo e se è negativo e  se è dispari o pari ( n=%2)
//        
         Scanner s = new Scanner(System.in);
//
//         System.out.println("Scrivere il numero da analizzare :");
//         int N=s.nextInt();
//         
//        if ( N%2==0){
//            System.out.println("il numero è pari");}
//            else{
//            System.out.println("il numero è dispari");
//            }
//        
//        if (N>0){
//            System.out.println("ed è positivo");
//        }else{
//            System.out.println("ed è negativo");
//        }
//        
//        
//        ////////////////////////////////////////////////////////////////////////////////////////////
//        
//        //Scrivere un programma che chieda 2 numeri interi A e B in input.Se B è pari scambia il valore delle variabili, altrimenti li somma
//
//        System.out.println("Scrivere il primo numero :");
//         int A=s.nextInt();
//         System.out.println("Scrivere il secondo numero :");
//         int B=s.nextInt();
//         int C=0;
//         
//         System.out.println("i tuoi numeri sono : A=: "+A+"e B = " +B);
//         
//         System.out.println("MAGIA");
//         
//         System.out.println("i tuoi numeri sono : A=: "+B+"e B = " +A);
//
//        
//        /////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        System.out.println("Scrivi un numero e ti dirò se è pari e piccolo :");
//        int Npiccolo=s.nextInt();
//        
//        if (Npiccolo>=0 && Npiccolo<=100 && Npiccolo%2==0){
//            System.out.println("Il numero è pari e Piccolo");
//        }else if (Npiccolo>=0 && Npiccolo<=100) {
//            System.out.println("il numero è solo piccolo");
//        }else{
//            System.out.println("il numero non è ne grande nè piccolo.");
//        }
//        
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        System.out.println("scrivi una parola e conterò le lettere che la compongono");
//        String parola=s.nextLine();
//        
//       int stringLength = parola.length();
//
//        System.out.println("La parola che hai messo è composta da : " + stringLength +" lettere. ");
//        
//        Random r = new Random();
//        
//        System.out.println("vediamo chi ha il numero più grande: ");
//                int rand = r.nextInt(0, 11);
//                
//         System.out.println("il mio numero è : " +rand+ "  il tuo è "+ stringLength);
//
//        if (stringLength==rand) {
//            System.out.println("pareggio carino.");
//        }else if (stringLength>rand) {
//            System.out.println("ma che bravo hia vinto.");
//        }else {
//            System.out.println("è stata una sfida leale");
//        }  
//        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        System.out.println("Ciao utente, Inserisci 3 valori e ti dirò quale è il più grande : ");
//        System.out.println("Numero 1 : ");
//        double N1=s.nextDouble();
//        System.out.println("Numero 2 :");
//        double N2=s.nextDouble();
//        System.out.println("Numero 3 :");
//        double N3=s.nextDouble();
//
//        if (N1>N2 && N1>N3) {
//            System.out.println("Il numero più grande è : " +N1);
//              
//        }else if (N2>N1 && N2>N3) {
//            System.out.println("Il numero più grande è : " +N2);
//                   
//        }else if (N3>N1 && N3>N2) {
//            System.out.println("Il numero più grande è : " +N3);
//
//        }else {
//            System.out.println("Tutti i numeri sono uguali");
//        }
//        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Inserisci il mese:");
        String mese = s.nextLine();

        int giorni;
        switch (mese.toLowerCase()) {
            case "gennaio":
            case "marzo":
            case "maggio":
            case "luglio":
            case "agosto":
            case "ottobre":
            case "dicembre":
                giorni = 31;
                System.out.println(mese + " ha "+ giorni +" giorni");
                break;
            case "aprile":
            case "giugno":
            case "settembre":
            case "novembre":
                giorni = 30;
                System.out.println(mese + " ha "+ giorni +" giorni");
                break;
            case "febbraio":
                giorni = 28;
                System.out.println(mese + " ha "+ giorni +" giorni");
                break;
            default:
                System.out.println("Mese non valido.");
                return;
        
        
        
        
        
        
        
        
        
        
        
        

        
        }
        
        
        
        
        
        
        
        
        
    }
    
}
