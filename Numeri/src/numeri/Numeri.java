/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeri;
import java.text.DecimalFormat;
import java.util.Random;
/**
 *
 * @author loren
 */
public class Numeri {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int massimo=Math.max(5, 10);

        int minimo=Math.min(5 , 10);

        double radice=Math.sqrt(8);

        double potenza=Math.pow(2, 3);

        System.out.println(Math.round(5.5));  //arrotonda per eccesso

        double numero=3.57869;
        DecimalFormat df=new DecimalFormat("0.00"); //scelgo come visualizzare i decimali
        System.out.println(df.format(numero));

        System.out.println(Math.ceil(5.4));//ceiling quindi diventa 6
        System.out.println(Math.floor(5.8));//fllor quindi diventa 5

        Random r=new Random(); //questo genera un  numero casuale
        int casuale=r.nextInt();//genera un numero casuale da 0 a un numero elevato alla 32 positivo o negativo
        System.out.println(casuale);
    
        int limite=r.nextInt(6); //numero casuale fino a 5
        System.out.println(limite);
    
        int estremi=r.nextInt(2,11); //numero casuale da 2 a 10
        System.out.println(estremi);
        
        double virgola=r.nextDouble(2,11.00);
        System.out.println(virgola);
        System.out.println(df.format(virgola));
        
        System.out.println(r.nextBoolean());//randomico o falso
        
        //random non genera valori di tipo char o valori di tipo stringa
        
        int minuscole=r.nextInt(97,123);
        int maiuscole=r.nextInt(65,90);
        int ascii=r.nextInt(maiuscole,minuscole);
        
        System.out.println((char)ascii);
    }
    
}
