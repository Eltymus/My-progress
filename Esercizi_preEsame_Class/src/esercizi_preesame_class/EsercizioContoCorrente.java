package esercizi_preesame_class;



public class EsercizioContoCorrente {
  
    
public void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Mario Rossi", 1000);
        conto1.riepilogo();

        conto1.versa(500);
        conto1.visualizzaSaldo();

        conto1.preleva(2000); // Dovrebbe dare errore
        conto1.preleva(300);
        conto1.visualizzaSaldo();
        
       
        
        }
        public class ContoCorrente {
    // Attributo di classe per generare numeri di conto progressivi
    public static int contatoreConti = 0;

    // Attributi di istanza
    public String nomeCliente;
    public double saldo;
    public int numeroConto;

    // Costruttore
    public ContoCorrente(String nomeCliente, double depositoIniziale) {
        this.nomeCliente = nomeCliente;
        this.saldo = depositoIniziale;
        contatoreConti++;
        this.numeroConto = contatoreConti;
    }

    // Metodo per prelevare
    public void preleva(double importo) {
        if (importo > saldo) {
            System.out.println("Saldo insufficiente. Impossibile prelevare.");
        } else {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " eseguito correttamente. Saldo attuale: " + saldo);
        }
    }

    // Metodo per versare
    public void versa(double importo) {
        saldo += importo;
        System.out.println("Versamento di " + importo + " eseguito correttamente. Saldo attuale: " + saldo);
    }

    // Metodo per visualizzare il saldo
    public void visualizzaSaldo() {
        System.out.println("Saldo attuale: " + saldo);
    }

    // Metodo per visualizzare il riepilogo
    public void riepilogo() {
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Numero Conto: " + numeroConto);
        System.out.println("Saldo Attuale: " + saldo);
    }

    }
}


