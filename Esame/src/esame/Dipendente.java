/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esame;

/**
 *
 * @author loren
 */
public class Dipendente extends Persona {
    
   private double stipendio ;

    public Dipendente(int Stipendio, String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        this.stipendio = Stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(int Stipendio) {
        this.stipendio = Stipendio;
    }

    @Override
    public String toString() {
        return  "Stipendio :" + stipendio ;
    }
   
   
    
}
