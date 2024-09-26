/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semplificalezion;

import java.util.Scanner;

import java.util.Calendar;

/**
 *
 * @author loren
 */
public class SemplificaLezion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int i = 3;
//
//        if (i == 0) {
//            System.out.println("I è uguale a zero");
//        } else if (i == 1) {
//            System.out.println("i è uguale ad uno");
//        } else if (i == 2) {
//            System.out.println("i è uguale a 2");
//        } else {
//            System.out.println("i è diverso da 0,1,2");
//        }
//
//////////////////////////////////////////////////// SWITCH semplifica questo codice
//        switch (i) {                      //gli dico la variabile da controllare
//            //funziona solo con = 
//            //variabili ok : string, byte, short int;
//            //variabili nok : boolean, float , double
//            case 0:
//                System.out.println("i è uguale a 0");
//                break;
//            case 1:
//                System.out.println("i è uguale ad uno");
//                break;
//            case 2:
//                System.out.println("i è uguale a 2");
//                break;
//            default:
//                System.out.println("i è diverso da 0,1,2");
//
//        }
//
//        Calendar calendario = Calendar.getInstance(); //altro modo per gestire le date
//
//        int giorno = calendario.get(Calendar.DAY_OF_WEEK); //il numero parte da 1=domenica
//
//        if (giorno == 1) {
//            System.out.println("oggi è domenica");
//        } else if (giorno == 2) {
//            System.out.println("oggi è lunedì");
//        } else if (giorno == 3) {
//            System.out.println("oggi è martedì");
//        } else if (giorno == 4) {
//            System.out.println("oggi è mercoledì");
//        } else if (giorno == 5) {
//            System.out.println("oggi è giovedì");
//        } else if (giorno == 6) {
//            System.out.println("oggi è venerdì");
//        } else {
//            System.out.println("oggi è sabato");
//        }
//
//        //////////////////////////////////////////////////////
//        switch (giorno) {
//            case 1:
//                System.out.println("oggi è domenica");
//                break;
//
//            case 2:
//                System.out.println("oggi è lunedì");
//                break;
//
//            case 3:
//                System.out.println("oggi è martedì");
//                break;
//
//            case 4:
//                System.out.println("oggi è mercoledì");
//                break;
//
//            case 5:
//                System.out.println("oggi è giovedì");
//                break;
//
//            case 6:
//                System.out.println("oggi è venerdì");
//                break;
//
//            default:
//                System.out.println("oggi è sabato");
//        }
//            
//            String lettera="i";
//           // String messaggio;
//            
//            switch(lettera){                                  //si può anche scrivere così
//                    case "a":
//                    case "e":
//                    case "i":
//                    case "o":
//                    case "u":
//                    System.out.println("è una vocale");
//                    break;
//
//                    default: 
//                        System.out.println("è una consonante");
//            }
//            
//            ////// -> operatore LAMBDA
//                
//            switch  (lettera){
//                case "a","e","i","o","u"->  System.out.println("è una vocale");
//                default ->System.out.println("è una consonante");
//            
//            }
//            
//            String messaggio=switch  (lettera){
//                                        case "a","e","i","o","u"-> "è una vocale";
//                                        default ->"è una consonante";
//            }; // il punto e virgola alla fine è importante perchè stiamo assegnando un valore alla variabile
//
//            System.out.println(messaggio);
//            
//            ////////////////////////////////////////////////////////////////////////////
//            
//            /// OPERATORE TERNARIO
//            
//            // aiuta a semplificare if
//            
//            int voto=8;
//            
//            if (voto>=6) {
//                System.out.println("promosso");
//            }else{
//                System.out.println("bocciato");
//                    }
//            
//            //operatore ternario
//            System.out.println(voto>=6 ? "promosso" : "bocciato"); // la prima è sempre quella vera
//            
//            //operatore ternario nel caso ci siano 3 variabili
//            int a=10;
//            int b=10;
//                  
//            if (a>b){
//                System.out.println("a maggiore");
//            }else if (b>a) {
//                System.out.println("b maggiore");
//        }else{ System.out.println("sono uguali");}
//            
//        String max=(a>b)?"a":(a==b)? "uguali" : "b";
//            System.out.println("il maggiore è : "+max);
//            
            /////////////////////////////////////////////////////77
            
            //esercizio  moltiplicazione
            
                    Scanner s = new Scanner(System.in);
                    
                    System.out.println("prego utente, scegli il tuo primo  numero : ");
                    double N1=s.nextDouble();
                    System.out.println("ora un secondo numero : ");
                    double N2=s.nextDouble();
                    s.nextLine();
                    
                    System.out.println("scegli l'operatore matematico che vuoi utilizzare : addizione ' + '  , sottrazione '  -  ' ,moltiplicazione ' * '  o divisione  ' : ' ");
                    
                    String operatore=s.nextLine();
                    
                    
                     switch(operatore) {
                         case "+" :
                             System.out.println(N1 + " + " + N2 + " da come risultato : "+ (N1+N2));
                             break;
                         case "-" :
                             System.out.println(N1 + " - " + N2 + " da come risultato : "+ (N1-N2));
                             break;
                         case "*" :
                             System.out.println(N1 + " * " + N2 + " da come risultato : "+ (N1*N2));
                             break;
                         case " : " :
                             double divisione=(N2==0)?-1:(N1/N2);
                             if (divisione==-1) {
                                 System.out.println("non puoi dividere per 0");
                             }else{
                                 System.out.println(divisione);
                             }
                             break;
                         default:
                             System.out.println("Operazione errata");
                     
                     }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }

}
