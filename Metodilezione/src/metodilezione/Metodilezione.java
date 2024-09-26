/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodilezione;

/**
 *
 * @author loren
 */
public class Metodilezione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stampa(); //sto chiamando il metodo stampa
                                                                //nome tecnico : Parametri attuali
        stampaConParametriDiIngresso("Lorenzo", "Tripodi");
        
        String valoreInUscita=stampaConParametriIngressoEuscita("Lore", "Tripodi");
        
        System.out.println(valoreInUscita);
        
        int risultato = somma(2,3);
        
        System.out.println(risultato);
        
        int risultato2=somma(2,3,4);
        
        System.out.println(risultato2);
        
        double risultato3=somma(3.34 , 5.6);
        System.out.println(risultato3);
     
        
    }
    
    
    /////////////////inizio dei metodi
    
    static void stampa(){
    
        System.out.println("ciao");
    
    }
                                                                        //nome tecnico : parametri formali
    static void stampaConParametriDiIngresso(String nome , String cognome){
    
        System.out.println("il mio nome è "+nome+", il cognome è "+cognome);
    
    }
    
    static String stampaConParametriIngressoEuscita(String nome , String cognome){
    
        return  "il mio nome è "+nome+", il cognome è "+cognome;
    
    }
    
    //firma del metodo = a nome  + parametri in ingresso
    //2 metodi non possono avere la stessa firma
    
    
    // quando si usano tante versioni dello stesso metodo si dice OVERLOAD , il fatto che ci sia un overload è positivo
    static int somma(int a, int b){
        return a+b;
    }
    
    static int somma(int a , int b , int c){
        return a+b+c;
    }
    
    static double somma(double a,double b ){
    
        return a+b;
    
    }
    
    
}
