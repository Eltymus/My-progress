/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ripasso1806;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author loren
 */
public class Ripasso1806 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date oggi=new Date();
        System.out.println("data di oggi :"+oggi);
        
        LocalDate data=LocalDate.now();
        System.out.println("data di oggi: "+data);
        
        LocalDateTime dataConOra=LocalDateTime.now();
        System.out.println("data con ora : "+dataConOra);
        
        
        
        // TODO code application logic here
    }
    
}
