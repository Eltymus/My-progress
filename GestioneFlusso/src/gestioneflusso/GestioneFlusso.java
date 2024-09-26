
package gestioneflusso;
import java.util.Scanner;
import java.time.LocalTime;
import java.util.Random;


public class GestioneFlusso {


    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
//        System.out.println("inserisci la tua età:");
//        
//        int età=s.nextInt();
//        
//        if (età>=18){  //la condizione va in mezzo alle parentesi tonde , in questo caso booleana perchè vero o falsa
//            System.out.println("sei maggiorenne puoi entrare.");
//            System.out.println("posso aggiungere quello che voglio");
//        }        
//        else{System.out.println("non sei maggiorenne vai via.");
//        }
//        
//        System.out.println("che temperatura c'è?");
//        double temp=s.nextDouble();
//        if (temp>=30){
//            System.out.println("fa caldo");
//        }
//        else if (temp<=10){
//            System.out.println("fa freddo");
//        }
//        else{
//            System.out.println("si sta bene");
//        }
//////////////////////////////////////////////////////////////////////////////////////777
         //chiedere all'utente 2 numeri e fare la divisione fra di loro
         //controllare che il secondo numero dia diverso da 0
         //Se è 0 comunicare che non si può dividere per 0
         //comunicare il risualtato della divisione
//        System.out.println("dammi 2 numeri con cui fare la divisione : ");
//        
//        System.out.println("Dividendo :");
//        double Dividendo=s.nextDouble();
//        
//        System.out.println("divisore :");
//        double divisore=s.nextDouble();
//        
//        double risultato=Dividendo/divisore;
//        
//        if (divisore==0){   
//            System.out.println("non puoi dividere un numero per 0, scrivi un altro divisore");}
//        else{
//            System.out.println("la divisione fra :"+Dividendo+" e "+divisore+" è : "+ risultato);}
//        
//        
        /////////////////////////////////////////////////////////////////////////////////77
        
        //opratore modulo : % ritorna il resto della divisione
        
//        System.out.println("inserisci il numero: ");
//        int paridispari=s.nextInt();
//        if (paridispari%2==0){
//            System.out.println("il numero è pari");}
//        else{
//            System.out.println("il numero è dispari");}
//        
//        LocalTime ora=LocalTime.now();
//        int orario=ora.getHour();
//        System.out.println(orario);
//        
//        if (orario<12){
//            System.out.println("Buon Giorno");}
//            else if (orario<18){
//                System.out.println("buon pomeriggio");}
//                else{
//                System.out.println("Buona notte");}
//                

                //simulare il lancio di 2 dadi, se la somma è maggiore di 10 si vince altrimenti si perde.
                
//         Random r=new Random(); //questo genera un  numero casuale
//
//        int dado1=r.nextInt(1,7); //numero casuale fino a 6
//        int dado2=r.nextInt(1,7); //numero casuale fino a 6
//        
//        int totale=dado1+dado2;
//         
//        System.out.println("TENTA LA FORTUNA, lancia i DADI DEL DESTINO");
//        
//        s.nextLine();
//        
//        if (totale>=10){
//            System.out.println("Congratulazioni hai vinto! Sei troppo forte!");}
//        else
//            System.out.println("scarso,skill issue,disinstalla.");
//        
        //dati 2 numeri A  e B inseriti dall'utente
        //il programma stampa "uguale" se A==B
        //e fare anche maggiore e minore
//        System.out.println("inserisci 2 numeri per sapere se uno è più grande dell'altro.");
//        System.out.println("Primo numero : ");
//        int A=s.nextInt();
//        System.out.println("Secondo numero : ");
//        int B=s.nextInt();
//        
//        if (A==B){
//            System.out.println("i numeri che hai messo sono uguali."+A+" e "+B);
//        }
//        else if (A>B) {
//            System.out.println(A+"è maggiore di "+B);
//        }
//        else{
//            System.out.println(B+" è maggiore di "+A);
//        }        
//        
//            System.out.println("Benvenuto, nel calcolo di indice di massa corporea, inserisci i seguenti dati per conoscere il tuo indice :");
//            System.out.println("inserisci il tuo peso in Kg :");
//            double p=s.nextDouble();
//            System.out.println("inserisci la tua altezza in m : ");
//            double h=s.nextDouble();
//            
//            double BMI=p/(h*h);
//                    
//            if (BMI>25) {
//                System.out.println("il valore riscontrato è:"+(int)BMI+" sei al di sopra del limite consigliato, se possibile, migliora la tua alimentazione");
//        }
//            else if (BMI<20) {
//                System.out.println("il valore riscontrato è:"+(int)BMI+" sei al di sotto della media, dovresti , se possibile, mangiare di più o più spesso");
//        }
//            else{
//                System.out.println("il valore riscontrato è:"+(int)BMI+"Bravo, hai una forma fisica invidiabile.");
//            }
//            
            /////////////////////////////////////////////////////////////////////////////////
            ///OPERATORI LOGICI///
            
            // && = "e", "anche"
            // || = "or" "oppure"
//        
//            int ore=0;
//            int minuti=0;
//            
//            System.out.println("inserisci le ore : ");
//            ore=s.nextInt();
//            System.out.println("inserisci minuti : ");
//            minuti=s.nextInt();
//            
//            if (ore<0 || ore>23|| minuti<0 || minuti>59) {
//                System.out.println("non è un ora valida");}
//            else { 
//                    System.out.println("è un ora valida");}
////            
//            boolean ore_ok=(ore>=0 && ore <24);
//            boolean minuti_ok=(minuti>=0 && minuti<60);
//            if (ore_ok && minuti_ok){
//                System.out.println("orario corretto");
//            }else {
//                System.out.println("orario non corretto");
//        }
            
//        
//        System.out.println("inserisci il voto della prova : ");    
//       int  giudizio=s.nextInt();
//       
//        if (giudizio>30 || giudizio<0) {
//            System.out.println("Voto non valido reinserire il vero valore");
//        }
//        else if (0>=giudizio || giudizio<=17) {
//            System.out.println("Esame non superato");
//        }
//        else if (giudizio>=18 && giudizio<=24) {
//            System.out.println("giudizio : Sufficiente");
//            System.out.println("Vuoi registrare e confermare il voto?Se si ,premi il tasto 1 sul tuo terminale, se no premi il tasto 0.");
//            
//                   int  registrazione=s.nextInt();
//                     if (registrazione==1) {
//                        System.out.println("La valutazione è stata registrata, congratulazioni.");
//                                                       }
//                                else{
//                                System.out.println("messaggio ricevuto, decisione comunicata all'insegnante attraverso il terminale.");  
//                                 } 
//        }   
//        else {
//            System.out.println("Giudizio : Buono");
//            System.out.println("Vuoi registrare e confermare il voto? Se si ,premi il tasto 1 sul tuo terminale, se no premi il tasto 0.");
//            
//            int  registrazione=s.nextInt();
//                     if (registrazione==1) {
//                        System.out.println("La valutazione è stata registrata, congratulazioni!");
//                                                       }
//                                                         else{
//                                System.out.println("messaggio ricevuto, decisione comunicata all'insegnante attraverso il terminale.");  
//                                                                 } 
                //MORRA CINESE//
//             
//          System.out.println("Giochiamo alla morra cinese , il tuo avversario : *_* ");
//          System.out.println("*_* : 'per te è la fine umano' ");
//          System.out.println("Scegli : Carta (C) , Sasso (S)  o Forbice (F) ? ");
//                
//                char C=67;
//                char S=83;
//                char F=70; 
        }
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
   
}
            
        
        
            
      

