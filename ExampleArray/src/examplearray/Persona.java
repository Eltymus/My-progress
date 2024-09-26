/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplearray;

/**
 *
 * @author loren
 */
public class Persona {
    
    //attributi
    public String nome;
    public String cognome;
    public int eta;
    public char sesso;
    public boolean maggiorenne;
    
    //metodi -> le azioni che la persona può fare
    
    public void mangia(String cibo){
    
        System.out.println("sto mangiando"+cibo);
        
    }
    public void mangia(String pranzo, String cena){
    
        System.out.println("a pranzo mangio "+pranzo+" a cena mangio "+cena);
        
    }
    
    public void dorme(){
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzz");
    } 
    
    public boolean ismaggiorenne(){
       return eta>=18;
    }
    
    public void stampaInfo(){
        System.out.println("la persona si chiama "+nome+" "+cognome+" ha età "+eta+" è di sesso "+sesso);
    }
    
    
    
    
    
}
