/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perarrettangolo;

/**
 *
 * @author loren
 */
public class PerArRettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
       
     double base = 5.5 ;
     double altezza = 6.5 ;
                
       double perimetro =2*base+altezza*2 ;
       double area = base*altezza ;
       
        System.out.println("area = "+area+" "+"perimetro= "+perimetro);
        
        //////////////////////////////////////////////////Per scambiare i valori delle variabili senza toccarle//////////////////////////////////////////////////////////
        
        int var1= 3;
        int var2 = 8 ;
        
        int temp = var1;
        var1=var2;
        var2=temp;
        
        System.out.println(var1+" "+var2);
                
                
    }
    
}
