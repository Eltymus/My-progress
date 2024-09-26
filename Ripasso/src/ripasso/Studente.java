
package ripasso;

public class Studente extends Persona { // Quindi se si basa su un altra classe SI METTE EXTENDS QUI
    //lo studente appartiene alla classe persona ma ha una cosa in più
    
    private String materia;

    public Studente(String materia, String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString()+"Studio " + materia ; //  con SUPER richiamo il tostring di persona e lo unisco a studio + materia
    }
    
    void studio(String materia){
        System.out.println(" studio  :"+ materia);
    }

    
    
    
    
    
    
    
    
}
