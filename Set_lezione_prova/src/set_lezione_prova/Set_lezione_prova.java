/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set_lezione_prova;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author loren
 */
public class Set_lezione_prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //HASH SET toglie i duplicati ma non li ordina
        // TREE SET toglie i duplicati e li ordina
        
        HashSet hash=new HashSet(); //non ammette duplicati e non è ordinato
        
        hash.add("c");
        hash.add("y");
        hash.add("e");
        hash.add("d");
        hash.add("a");
        hash.add("a");
        hash.add("a");


        System.out.println(hash); //scarta i duplicati
        
        System.out.println(hash.size());
        
        hash.forEach(lettere->System.out.println(lettere));
        
        String[] animali ={"cane","cane","gatto","topo","cane"};
        
        HashSet<String> animaliNoDuplicati=new HashSet(Arrays.asList(animali));// abbiamo creato un hashset da un array esistente
        
        System.out.println(animaliNoDuplicati);
        
        //TreeSet è ordinato e non ammette duplicati
        
        TreeSet ts=new TreeSet();
        
        ts.add(9);
        ts.add(5);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(1);
        ts.add(4);
        ts.add(7);
        ts.add(8);
        ts.add(9);
        ts.add(6);
        ts.add(8);

        System.out.println(ts);
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
