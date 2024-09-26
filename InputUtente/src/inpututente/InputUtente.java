
 package inpututente;

import java.util.Scanner;

public class InputUtente {

    public static void main(String[] args) {
        
        //tipo di dato // nome variabile//=//new scanner
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("come ti chiami?");
        String nome = input.nextLine();
        System.out.println("hai inserito: "+nome);
        
        System.out.println("colore preferito?");
        String colore= input.nextLine();
        System.out.println("hai inserito: "+colore);
       
        System.out.println("Quanti anni hai?");
        int anni= input.nextInt();
        System.out.println("hai inserito: "+anni);
       
        System.out.println("Quanto sei alto?");
        double altezza= input.nextDouble();   //coi valori decimali la virgola va fatta CON LA VIRGOLA NON CL PUNTO
        input.nextLine(); //METTERE UN NEXTLINE VUOTO PERCHè L'ENTER VALE COME CARATTERE
        System.out.println("hai inserito: "+altezza);
        
        System.out.println("cognome?");
        String cognome=input.nextLine();
        System.out.println("hai inserito "+cognome);
        
        //////////////////////////////////////////////////////////////////////
        
       
        
        
    }
    
}
