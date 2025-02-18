import tipo.Dipendente;
import tipo.DipendenteFullTime;
import tipo.DipendentePartTime;
import tipo.Dirigente;


public class Main {
    public static void main(String[] args) {

        Dipendente[] dipendenti = new Dipendente[3];
        Dirigente Matteo = new Dirigente(22365L, 10000, Dipendente.Dipartimento.AMMINISTRAZIONE, 200, 17);
        DipendenteFullTime Francois = new DipendenteFullTime(33264L, 2000, Dipendente.Dipartimento.PRODUZIONE);
        DipendentePartTime Anna = new DipendentePartTime(66732L, 10, Dipendente.Dipartimento.VENDITE, 100);
        dipendenti[0] = Matteo;
        dipendenti[1] = Francois;
        dipendenti[2] = Anna;

        int sommaStipendi = 0;

        for (int i = 0; i < dipendenti.length; i++){
            System.out.println("La matricola del dipendente è " + dipendenti[i].getMatricola());
            dipendenti[i].calculateSalary();
            sommaStipendi += dipendenti[i].getStipendio();
        }

        System.out.println("La somma totale degli stipendi dei tre dipendenti è: " + sommaStipendi + "€.");

    }
}
