/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morracineseesercizio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class MorraCineseEsercizio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        System.out.println("Giochiamo alla morra cinese , il tuo avversario : *_* ");
        System.out.println("*_* : 'per te è la fine umano' ");
        System.out.println("Scegli : Carta (0) , Sasso (1)  o Forbice (2) ? ");

        int C = 0; //Carta
        int S = 1; //Sasso
        int F = 2;  //Forbice

        int robot = r.nextInt(0, 3);
        int utente = s.nextInt();

        // esplicitare la scelta dell'utente e del robot
        if (utente == 0 && robot == 0) {
            System.out.println("Carta");
        } else if (utente == 1 && robot == 1) {
            System.out.println("Sasso");
        } else if (utente == 2 && robot == 2) {
            System.out.println("Forbice");
        } else {
            System.out.println("valore non valido");
        }

        //partita e i vari output
        if (utente < 0 || utente > 2) {
            System.out.println("robot : " + robot);
            System.out.println(" *_* : Codardo! Scegli un valore valido.");

        } else if (utente == 0 && robot == 0 || utente == 1 && robot == 1 || utente == 2 && robot == 2) {
            System.out.println("robot : " + robot);
            System.out.println("*_* : Non mi accontenterò di un pareggio! Affrontami ancora!");

        } else if (utente == 0 && robot == 1 || utente == 1 && robot == 2 || utente == 2 && robot == 0) {
            System.out.println("robot : " + robot);
            System.out.println("*_* : ERRORE, SCONFITTA IMPOSSIBILE *esplosione");

        } else if (utente == 1 && robot == 0 || utente == 2 && robot == 1 || utente == 0 && robot == 2) {
            System.out.println("robot : " + robot);
            System.out.println("*_* : le macchine vincono ancora una volta debole umano.");

        } else if (utente == robot) {
            System.out.println("robot : " + robot);
            System.out.println("*_* : copiarmi non ti aiuterà, ANCORA");

        } else {
            System.out.println("robot : " + robot);
            System.out.println("*_* : attendo un altra partita, la mia vittoria si avvicina");
        }

    }

}
