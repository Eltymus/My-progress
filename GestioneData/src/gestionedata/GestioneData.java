/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionedata;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author loren
 */
public class GestioneData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Date oggi=new Date();
//        
//        System.out.println("oggi è "+ oggi);
//        
//        //////////
//        
//      LocalDate data=LocalDate.now(); //giorno / mese anno
//      
//        System.out.println("oggi è: "+ data);
//        
        LocalDateTime dataconora=LocalDateTime.now(); //data con ora
//        System.out.println("data con ora: "+dataconora);
//        
        
//       LocalTime ora=LocalTime.now(); //ora , minuti secondi e millsecondi
//       System.out.println("sono le" +ora);
//         
//       DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss  'giorno dell anno ' D'  setimana dell anno' w ' settimana del mese 'W ");
//       
//       System.out.println(dataconora.format (formato));//applico il formato data con ora
//       
       //stampare la data di oggi on formato:
       //Oggi è il gg/mm/yyyy sono le ore HH:mm.ss di lunedì
//       
       DateTimeFormatter formato=DateTimeFormatter.ofPattern("'oggi è il: 'dd/MM/yyyy' sono le ore:' HH:mm:ss' di ' EEEE ");
       
       System.out.println(dataconora.format (formato));
    }
    
}
