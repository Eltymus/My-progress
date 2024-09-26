
package ripasso;

import java.util.ArrayList;
import java.util.Scanner;

public class Ripasso {

    public static void main(String[] args) { //il metodo main è statico e statico vuol dire che non devi creare l'istanza per avviare il programma
        
        //VARIABILI , CONTENITORI DI INFORMAZIONI  
        int numero = 10;
        double virgola = 3.14;
        boolean VeroFalso= true; //o false
        char carattere = '0' ;
        String parola ="Ciao";
        
        System.out.println(numero);
        System.out.println(virgola);
        System.out.println(VeroFalso);
        System.out.println(carattere);
        System.out.println(parola);
        
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        if (numero>5 ) { //Condizione Booleana
            
            System.out.println("fa qualcosa se più grande di 5"); //se la condizione è vera va qua altrimenti va in else
               
        }else{
        
            System.out.println("fa qualcosa se più piccolo di 5");// condizione falsa
        
        }
                
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        if (numero>5) {
            
            System.out.println("maggiore");
            
        }else if (numero <5) {
            
            System.out.println("minore");
            
        }else{
        
            System.out.println("uguale a 5");
            
        }
    
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int temperatura = 30;
boolean sole=true;

        if (temperatura <30 && sole == false ) { //tutte e 2 devono essere vere per passare da qua
            
            System.out.println("esco");
            
        }else{
            
            System.out.println("sto a casa , troppo caldo");
            
        }

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        if (temperatura <=30 || sole == false ) { //una delle 2 deve essere vera per passare da qua
            
            System.out.println("esco");
            
        }else{
            
            System.out.println("sto a casa , troppo caldo");
            
        }
        
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        if (temperatura <30 || sole != false ) { //operatore di negazione
            
            System.out.println("esco");
            
        }else{
            
            System.out.println("sto a casa , troppo caldo");
            
        }
        
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

              for (int i = 0; i < 10; i++) { //le volte in cui lo voglio ripetere
                  
                  System.out.println("ciao");  //quello che voglio ripetere 
                  
        }
    
              for (int i = 5; i < 16; i++) {
            
                  System.out.println("ciao2");
                  
        }
    
    
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int i=0;
        
        while(i<10){
                
            System.out.println("ciao");
            
            i++;   
            
           }
    
    int y = 0;
    
    while (true){ //cicla per sempre
    
        System.out.print(" "+y);
        
    if (y==100){
        break;
    }
    
    y++;
    
    }
    
//  CICLO INFINITO CHE NON SI USA          
//        for ( ;  ; ) { 
//            
//        }
//    

int var=10;
switch(var){

    case 1 -> System.out.println("var = "+var);
        
    case 2 -> System.out.println("var = "+ var );
        
    case 3 -> System.out.println("var = "+var);
        
    case 4 -> System.out.println("var = "+ var );
        
    case 5 -> System.out.println("var = "+var);
        
    case 6 -> System.out.println("var = "+ var );
        
    default -> //l'else delllo switch
        System.out.println("var vale altro");
    
}

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
        Scanner s=new Scanner(System.in);
//        
//        System.out.println("inserisci il tuo nome");
//        String nome = s.nextLine();
//        System.out.println("hai scritto "+ nome);
//        
//        System.out.println("inserisci l'età");
//        int eta = s.nextInt();              // dopo gli int serve un next line vuoto così non fa il bug che non chiede il nextline dopo
//        s.nextLine();
//        System.out.println("hai "+ eta + " anni");
//        
//        System.out.println("inserisci il cognome ");
//        String cognome = s.nextLine();
//        System.out.println(" il cognome è "+ cognome );
//    
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    int[] valori= new int [3]; //array di 3 valori interi
    
    valori[0]=35; // metto i valori per index
    
    valori[1]=99;
    
    valori[2]=13;
    
        for (int j = 0; j < valori.length; j++) {
            System.out.println(valori[j]); // stampo i valori con l'indice
        }
    
        for (int elemento : valori) {
            System.out.println(elemento); //stampo senza usare l'indice
        }
    
        //array di elementi di tipo stringa
        String[] nomi = { "gino" ,  "pino"  ,  "lino"  , "fino" ,  "mino" , "tino" };
        System.out.println(nomi[3]);
        
        //array list sono array dinamici
        
        // ho creato un array dinamico che accetta valori di tipo diverso (integer serve a quello)
        // si deve prima importare ArrayList 
        ArrayList <Integer> lista=new ArrayList();
    
        lista.add(10);
        lista.add(45);
        lista.add(99);
        lista.add(33);
        lista.add(12);
    
        for (int j = 0; j < lista.size(); j++) { //uso size perchè non è un tipo primitivo list
            System.out.print(" " + lista.get(j)); // stampa la posizione dell'indice
        }
        
        // stampo senza indice
        for (Integer valore : lista) {
            System.out.println(valore);
        }
    
    lista.forEach(valore->System.out.println(valore));
    
    ///metodi da creare FUORI DAL METODO MAIN 
    //METODI
    
    //richiamo il metodo definito sotto
    stampa();
    
    //richiamo il metodo e gli  passo il nome
    stampaNome("Lorenzo");
    
    //stampo 2 numeri e metto in riultato il return
    int risultato = somma(5,3);
    
    //OVERLOAD stesso nome per più parametri
    // la firma del metodo è Nome + Variabili
    
    int risultato2 = somma(1, 2, 3);
        System.out.println(risultato2);
    
    // gli oggetti si creano nel main 
    Persona p=new Persona("mario","rossi",90);
        System.out.println(p); // stampo direttamente l'oggetto grazie al tostring
        
        p.mangia("pizza");
        p.dorme();
    
    Persona[]  pArr={p , //primo elemento che abbiamo messo prima
        new Persona("giuseppe", "verdi", 11),  // secondo e 3 elemento creati nell'array scrivendo new Persona ctrl + spazio e aggiungere i dati corretti
        new Persona("luca", "Bianchi", 30)
    };
    
        for (Persona persona : pArr) { // P maiscola INDICA LA CLASSE p minuscola INdica LA VARIABILE
            System.out.println(persona );
            persona.mangia("sushi");
            persona.dorme();
        }
    
    Studente stud=new Studente (" java ","mario", "rossi", 20);
    
        System.out.println(stud);
    
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// QUI FUORI
    
    
    //metodi fuori dal main
    //Inizio METODI
    static void stampa(){
        System.out.println("ciao");
    }
    
    //metodo che stampa il nome passato in input
    static void stampaNome(String nome){
        System.out.println("ciao "+ nome );
    }
    
    static int somma(int num1 , int num2){
    
     return num1+num2; //return serve per le assegnazioni 
    
    }
    
    
    static int somma(int num1 , int num2, int num3){
        return num1+num2+num3;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
