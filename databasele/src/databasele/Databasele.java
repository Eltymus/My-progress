/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databasele;

import java.sql.*;

/**
 *
 * @author loren
 */
public class Databasele {

    
    
    public static void main(String[] args) {
    
       String indirizzo="jdbc:mysql://localhost:3306/corsosql";//indirizzo dove si trova il database
       //String indirizzo="jdbc:mysql://localhost:3306/corsosql?zeroDateTimeBehavior=CONVERT_TO_NULL";//indirizzo dove si trova il database
       String utente="root";//utente
       String password="";
       String query ;
       
       try {  //gestione eventuali errori
       Connection conn=DriverManager.getConnection(indirizzo, utente, password);
       Statement st=conn.createStatement();//creo un istruzione da lanciare
       
       query="select * from utente";//istruzione per selezionare tutte le colonne e le righe della tabella persona
       
       ResultSet rs=st.executeQuery(query);
       
       while(rs.next()){
           System.out.print(rs.getInt("id")+" ");
           System.out.print(rs.getString("nome")+" ");
           System.out.print(rs.getString("sesso")+" ");
           System.out.println(rs.getString("patentato")+" ");
   
       }
       
       st.close();//chiudo l'istruzione
       conn.close();//mi sconnetto dal database
       
       }catch(SQLException ex){
        
                System.out.println("errore db "+ex.getMessage ());
               
               
       }
               
               
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    

