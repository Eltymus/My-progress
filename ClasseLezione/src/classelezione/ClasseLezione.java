/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classelezione;

/**
 *
 * @author loren
 */
public class ClasseLezione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //qui usaremo la classe persona
        
        Persona persona1=new Persona(); //persona 1 è un oggetto della classe persona
        
        persona1.cognome="rossi";
        persona1.cognome="mario";
        persona1.eta=30;
        persona1.sesso='m';
        
              
        persona1.stampaInfo();
        System.out.println(persona1.ismaggiorenne());
        
        persona1.dorme();
        
        Persona persona2=new Persona();
        persona2.cognome="verdi";
        persona2.nome="Giuseppe";
        persona2.eta=15;
        persona2.sesso='f';
        
        persona2.stampaInfo();
        
        persona1.mangia("canederli");
        persona2.mangia("pasta", "carne");
                
    }
    
}
