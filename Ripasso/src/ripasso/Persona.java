package ripasso;


public class Persona {
 
    //attributi privati per incapsulamento
    
    private String nome ;
    private String cognome;
    private int eta ;

    //TASTO DESTRO >INSERT CODE > CONSTRUCTOR e ti fa il costruttore da solo per ogni variabile selezionata
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
// IL GETTER E IL SETTER SI FA ALLO STESSO MODO COL TASTO DESTRO
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // SEMPRE IN GENERATE CODE SI METTE IL TO STRING che serve per stampare i dati tutti insieme
    @Override
    public String toString() {
        return  "nome " + nome + ", cognome " + cognome + "  eta " + eta ;
    }
    
    //GETTER E SETTER, TO STRING E CONSTRUCTOR SI FANNO SEMPRE
    //sono la base per poter iniziare a fare la classe
    
    void  mangia (String cibo){
        System.out.println("sto mangiando " + cibo);
    }
    
        void dorme (){
            System.out.println("ZZZZZZZZZZZZZZ");
        }
    
    
    
    
    
    
    
    
}
