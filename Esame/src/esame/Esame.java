package esame;

import esame.Dipendente;
import esame.Persona;

public class  Esame {

    public static void main(String[] args) {
   
     Persona[]  dipendenti={new Dipendente(1200, "gino", "Corradino", 67),
                                            new Dipendente(1500, "Fausta" , "Monica", 58),
                                            new Dipendente(1500, "Carmela" , "Pirinno", 50),
                                            new Dipendente(1000, "Bignè" , "Salamandra", 40),
                                            new Dipendente(1500, "Cody" , "Mondique", 20)
                                            };


//Mi ha fatto danni una lampadina e mi sono fatto fare in automatico qualcosa che riguardava dei test e non mi è più andata la parte finale    
//spero che questo pseudocodice sia abbastanza :(

           for (Persona persona : dipendenti) {
            double totaleStipendi=0;
               scattonziano(eta, stipendio);
            totaleStipendi+= dipendenti.getstipendio ;
            
        }
      
             
        }
    
    
    
    
    }
    // fine del MAIN
    
    // creazione metodo per scatto anzianità sopra i 50 anni
    static double scattonziano (int eta , double stipendio){
 
        if (eta>50) {
            
            stipendio = stipendio + ((stipendio/100)*5);
            
        }else{
            
                 System.out.println("non abbastanza anziano per scatto anzianità");
        }
    return stipendio;
    }
    






        
    
    

