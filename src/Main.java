import tipo.Dipendente;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dipendente tommaso = new Dipendente(23456L, 24000, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente anna = new Dipendente(22447L, 30000, Dipendente.Dipartimento.VENDITE);
        Dipendente francois = new Dipendente(34653L, 27000, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = tommaso;
        dipendenti[1] = anna;
        dipendenti[2] = francois;
        for (int i = 0; i < dipendenti.length; i++){
            System.out.println("La matricola del dipendente è " + dipendenti[i].getMatricola());

        }
    }
}