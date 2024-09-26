
package examplearray;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ExampleArray {


    
    public static void main(String[] args) {
//        
//        
//        //I VALORI NELL'ARRAY DEVONO ESSERE TUTTI DELLO STESSO TIPO
//        //QUANDO LO CREO DEVO INDICARE LA DIMENSIONE DELL'ARRAY
//        
//        int [] unArray; //ho dichiarato un array di tipo intero
//        unArray=new int [10]; //((gli dico che può contenere 10 valori))
//        
//        int[] unaltroarray=new int[10];
//        
//        unArray[0]=1;//tutti gli array partono da 0
//        unArray[1]=2;
//        unArray[2]=3;
//        unArray[3]=4;
//        unArray[4]=5;
//                
//                
//                //se non specifico i vlaori
//                //i valori numerici valgono 0;
//                //le stringhe valgono come " "
//                //i booleani valgono falso
//                
//         System.out.println(unArray[0]);    //NON POSSO STAMPARE UN ARRAY INTERO MA SOLO LE SINGOLE POSIZIONI
//         System.out.println(unArray[8]);    //NON POSSO STAMPARE UN ARRAY INTERO MA SOLO LE SINGOLE POSIZIONI
//                       
//         String[] colori={"bianco","nero","giallo","blu"};//metodo alternativo per posizionare i valori in un array
//         System.out.println(colori[3]); // fare semore riferimento all'indice
//         System.out.println(colori[1]);
//         
//         int lunghezza=colori.length; //quanti elementi ci sono nell'array
//         System.out.println("l'array contiene "+lunghezza+" elementi ");
//         
//         //puoi stampare gli array col ciclo for
//         for (int i = 0; i < colori.length; i++) {
//             System.out.println(colori[i]);
//        }
//         
//        //versione migliorata con for 
//        for (String colore:colori) {
//            System.out.println(colore);
//        }
//         
//        //valorizzare gli elementi di un array
//         int [] Arr=new int[5]; //dichiaro un array che contiene 5 valori interi
//         for (int i = 0; i < 5; i++) {
//            Arr[i]=i;            //popolo gli elementi dell'array in base al valore dell'indice
//        }
//         
//        for (int num:Arr) {
//            System.out.println(num);
//        }
//         
//        ////////////////////////////////////////////////////////////////////////////77
//        
//        int[] mioArray=new int [5];
//        mioArray[2]=10;
//        
//        for (int i : mioArray) {
//            System.out.println(i);
//        }
//         
//         ///////////////////////////////////////////////////
//         
//         String zoom[]={"cane","gatto","topo","criceto","pesce","tricheco", "gorilla","camaleonte","triceratopo"};
//         
//         String piùlunga=zoom[0];
//         
//         for (String animale : zoom) {
//             if (animale.length()>piùlunga.length()) {
//                 piùlunga=animale;
//             }
//        }
//         
//         System.out.println(piùlunga);//mettendo il print dentro stampa ogni iterazione
//         
//         //////////////////////////////////////////////////////////
//         
//         String stringa="ciao come stai";
//         char[] lettere=stringa.toCharArray();
//         for (char let : lettere) {
//             System.out.println(let);
//        }
//         
//         ///////////////////////////////////////////////////
//        
//         int[] numeri={4,2,1,3};
//         System.out.println(numeri);//stampa l'indirizzo della memoria
//         
//         System.out.println(Arrays.toString(numeri));//stampo l'array come se fosse una stringa
//         
//         //array di n umeri casuali
         Random r=new Random();
//         
//         int[] ArrCasuali=new int[10];
//         
//         for (int i=0; i<ArrCasuali.length; i++) {
//             ArrCasuali[i]=r.nextInt(101);
//              
//    }
//         for (int elemento:ArrCasuali) {
//             System.out.println(elemento);
//        }
//         
         //////////////////////////////////////////////////////////////////////////////////////////////////////
//         
//         System.out.println("quanti elementi ha l'array ? ");
//         
       Scanner s= new Scanner(System.in);
//         
//         int quanti=s.nextInt();
//         int[] valori=new int[quanti];
//         
//         for (int i=0; i<valori.length-1;i++){
//             System.out.println("inserisci il numero :"+i);
//             valori[i]=s.nextInt(); //popolo l'array coi valori inseriti dall'utente
//         }
//           
//        // /////////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//         
//         
//         //ordinare un Array
//         //selectionsort
//         
//         for (int i = 0; i < valori.length; i++) { //prendo un valore
//             for (int j = 0; j < valori.length; j++) {  //lo confronto con tutti gli altri
//                 if (valori[i]<valori[j]) {
//                     int temp=valori[i];
//                     valori[i]=valori[j];
//                     valori[j]=temp;
//                 }
//             }
//        }
//            
//            System.out.println(Arrays.toString(valori));//stampo l'array come se fosse una stringa

         
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//            int[] [] arraMulti={    
//                
//                {1,2,3}, //Tutto l'Array in posizione 0
//                {4,5,6}//Tutto l'array è in posizione 1
//                
//            };
//                
//            System.out.println(arraMulti[1][1]);
//            System.out.println(arraMulti[0][2]);
//
//            int[][] multiplo=new int[2][3];  //dichiaro la creazione di un array 2x3 colonne
//            
//            multiplo[0][0]=1;
//            multiplo[0][1]=2;
//            multiplo[0][2]=3;
//            multiplo[1][0]=4;
//            multiplo[1][1]=5;
//            multiplo[1][2]=6;
//
////stampa con for each
//         for (int [] righe:multiplo) { //  qui prendo l'array 1,2,3, che indica le righe
//             for (int colonne : righe) {
//                 System.out.print(colonne+"\t");
//             }
//             System.out.println(" ");
//        }
//
////stampa con indice
//
//        for (int i = 0; i < multiplo.length; i++) {
//            for (int j = 0; j < multiplo[i].length; j++) {
//                System.out.print(multiplo[i][j]+"\t");
//            }
//            System.out.println(" ");
//        }
//
////stampa con la classe Arrayts
//System.out.println(Arrays.deepToString(multiplo));
//
//
//String[] frutti={"banane", "arance","limoni"};
//String[] verdure={"carote","cetrioli"," pomodori"};
//
//String[][] vegetali={frutti,verdure};  //crea un array 2X4
//
//        for (String[] righe : vegetali) {
//            for (String valori : righe) {
//                System.out.print(valori+"\t");
//            }
//            System.out.println(" ");
//        }


/////////////////////////////////////7ESERCIZI////////////////////////////////////////////////////////

//         
//         System.out.println("INSERISCI 10 NUMERI ");
//                  
//         int[] valori=new int[10];
//         
//         for (int i=0; i<valori.length;i++){
//             System.out.println("inserisci il numero :"+(i+1));
//             valori[i]=s.nextInt(); //popolo l'array coi valori inseriti dall'utente
//             }
//             
//
//             for (int num : valori) {
//                 System.out.print("\t"+num);
//             }
//             System.out.println(" ");
//
//             
//             
//             int somma=0;
//                     
//             for (int i = 0; i < valori.length; i++) {
//            somma=somma+valori[i];
//             }
//             
//          System.out.println(" ");
//             
//          System.out.println("la somma dei numeri che hai inserito è : "+ somma);
//
//          System.out.println("la media è : "+(somma/10));
//
//
//int[] minMax=new int[10];
//        System.out.println("insierisci 10 numeri positivi o negativi");
//        
//        for (int i = 0; i < minMax.length; i++) {
//            minMax[i]=s.nextInt();
//        }
//
//        
//        int min=minMax[0];
//        int max=minMax[0];
//        int posMax=0;
//        int posMin=0;
//
//        for (int i = 0; i < minMax.length; i++) {
//            if (minMax[i]<min) {
//                min=minMax[i];
//                posMin=i;
//                
//            }else if (minMax[i]>max){
//            max=minMax[i];
//            posMax=i;
//            }
//        }
//
//        System.out.println("max : "+max + " posizione :"+posMax );
//        System.out.println("max : "+min + " posizione :"+posMin );


//prova.isEmpty // lo usi per vedere se un array è vuoto , prova è il nome dell'array, esce un valore booleano che se false insica che p pieno

//prova.set(0,"w") // cambia il valore dell'elemento in quella specifica posizione dell'index

//prova.forEach // funziona come quello con fore (+tab)  ma lo può fare in una sola riga
//prova.forEach(caratteri->System.out.println(caratteri)) // stampa l'intera linea come in un for e ma in una sola riga, caratteri è la variabile in più del for

//char[] c={'x','y','z'}; // array normale di tipo char
//
//ArrayList<Character> lettere=new ArrayList (Arrays.asList(c));//trasforma un array normale in un array list
//lettere.add('w');
//
//lettere.forEach(caratteri->System.out.println(caratteri));
//
////da array list ad array normale :
//
//        System.out.println("passiamo da array list ad array normale");
//
//Character [] x=new Character[4];
//lettere.toArray(x); //trasformiamo l'array list lettere nell'array x
//
//        for (Character caratteri : x) {
//            System.out.println(caratteri);
//        }
////eliminare un elemento:
//System.out.println("eliminiamo la y");
//lettere.remove(1);//elimino l'elemento con indice 1 
//lettere.forEach(caratteri->System.out.println(caratteri));

//riepilogo metodi array
//.add aggiunge un elemento in coda
//.remove(i) , elimina un elemento in base all'indice
//.size dice quanti elementi ci sono
//.get(i) dice l'elemeto in posizione i
//.set cambia il valore dell'elemento 
//.isEmpty dice se l'arraylist è vuoto oppure no
//.foreach che cicla sugli elementi dell'array list
//gli ArrrayList si possono parametrizzare con i tipi di dato <>
//I tipi di dato devono essere classi quindi :
//Interger->int
//Double->double
//Float->float
//Character->char
//Boolean-> boolean

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//ArrayList misto=new ArrayList();
//misto.add(1);
//misto.add("ciao");
//misto.add(true);
//misto.add(3.14);
//
//        
//misto.forEach(valori->System.out.println(valori));

////////////////////////////////////
//ArrayList<String> nani=new ArrayList();
//
//nani.add("pisolo");
//nani.add("eolo");
//nani.add("gongolo");
//nani.add("brontolo");
//nani.add("mammolo");
//nani.add("cucciolo");
//nani.add("dotto");
//
//        System.out.println(nani);
//
//nani.remove("brontolo");
//
//        System.out.println(nani);
//        
//System.out.println("esiste dotto? "+nani.contains("dotto"));
//
//System.out.println(nani.get(3));
//        
//Collections.sort(nani); //ordina un ArrayList non si possono ordinare gli array con tipo misto
//System.out.println(nani);
//      
//
//ArrayList CopiaDiNani= new ArrayList(nani); //copio l'arrayList nani
//System.out.println(CopiaDiNani);



// Esercizi :

//fai array di 10 num somma index pari e index dispari e di quale è la somma più grande

 int [] dieci; //ho dichiarato un array di tipo intero
 dieci=new int [10];

 int numcas=r.nextInt(20);
    
    
 for (int i=0; i<dieci.length; i++) {
   dieci[i]=r.nextInt(11);
 }

        for (int i : dieci) {
            System.out.println(dieci[i]);
        }
 
        System.out.println("il tuo numero casuale è : "+ numcas  );
 
        for (int i : dieci) {
            if (dieci[i]==numcas) {
                System.out.println("nel array è presente il tuo numero casuale "+ numcas + " in posizione "+ i );
                    break;
            } else {
                System.out.println("il tuo numero casuale "+ numcas + " non fa parte dell'array");
            break;
            }
            
            
            
        }
 
        
    
    
}

         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    
    

         }

       
