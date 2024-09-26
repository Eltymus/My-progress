/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variabili;

/**
 *
 * @author loren
 */
public class Variabili {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b=1;//ho creato una variabile di tipo Byte, l'ho chiamata b e gli ho assegnato il valore 1, i byte sono valori che vanno da -127 a 128 (INTERI)
        b=3;
                
        final byte c=10;
        //final definisce un valore costante, che non può essere sostituito o modificato in nessun caso
        
        //le variabili non possono essere identifcate da un numero e non possono iniziare con esso (1b= sbaglaito)
        //non ci devono essere spazi fra le parole
        byte nome_cognome; //camel case, la seconda parola deve inziare con la lettera maiuscola o se devi scrivere un nome Metti la maiuscola a inzio secondo nome "nomeCognone"
        
        short sh=1; //-32768 +32767
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(sh);
        
        int primo=10;
        int secondo=5;
        int totale=primo+secondo;
        System.out.println(totale);
        System.out.println(primo+secondo);
        
        int sottrazione=primo-secondo;
        System.out.println("la sottrazione vale "+sottrazione);
        
        int moltiplicazione= primo*secondo;
        System.out.println("la moltiplicazione vale "+ moltiplicazione);

        int divisione= primo/secondo;
        System.out.println("la divisione vale "+ divisione);
        
        long l=1L; //per dichiarare un tipo di dato long bisogna aggiungere una L dopo il valore , (2 sesantaquattresimi comprendono i numeri nella categoria long)
        
//        numeri con la virgola
        float f=1.5F; //per dichiarare un tipo di dato float, bisogna aggiungere una F dopo il valore (il float vero è 128 numeri dopo la virgola)
        
        double d=2.1;
        
        //tipi di dato carattere
        char a='a';//un apice solo
        char b2='b';//b2 perchè b esiste già
         System.out.println("i caratteri sono :"+a+" "+b2);
        
         char numero='1';
         System.out.println(numero);
         
        char aMaiuscola=65;
        System.out.println(aMaiuscola);
        
        //POST INCREMENTO
        
        aMaiuscola++;//++ indica l'aggiunta di un 1, quindi da carattere ascii 65 diventa 67 che è B
        System.out.println(aMaiuscola);
        
        aMaiuscola--;// ++ funziona anche al contrario con --
        System.out.println(aMaiuscola);
       
        //PRE INCREMENTO
        int x=10;
        System.out.println(x++); //post incremento , stamperà 10 perchè lo ha già stampato e non aggiunge nulla
        System.out.println(++x); //pre incremento , stamperà 12 perchè aggiunge +1+1 prima della stampas 
      
        
        //Valori Booleani
        
        boolean vero=true;
       boolean falso=false;
        
        int età=18;
        boolean maggiorenne=età >= 18;
        System.out.println(maggiorenne);
        
        boolean falso2=!vero;
        System.out.println(falso2);
        
        //CAST IMPLICITO (con cast si intende un cambiamento di tipo di variabile)
        
        int intera=56;
        long lunga=intera;
        
        int numero2=10;
        double doppio=numero2;
        System.out.println(doppio);
        
        //CAST ESPLICITO
        long l2=56L; 
        int piccolo=(int)l2;
        
        double d3=3.9999;
        int intera3=(int)d3;
        
        int num=130;
        byte piccola=(byte)num;
        System.out.println(piccola);
        
        //Non fare tanti cast in sequenza, meglio partire da una solam variabile
        
        char numeroUno='1';//usando print trasformerei il valore in 49, valore della tabella ascii
        int numeroVero=(int)numeroUno;
        System.out.println(numeroVero);
    //NON si possono usare variabili uguali anche di diverso tipo lo darà come errore (byte non byte ecc), si possono riutilizzare in Altri Blocchi di codice rinchiusi in {} diverse         
    
    
    
    
    }
//    {
//        b=4
//    }
}
