import tipo.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Checkable> lavoratori = new ArrayList<>();
        Dirigente Matteo = new Dirigente(22365L, 10000, Dipendente.Dipartimento.AMMINISTRAZIONE, 200, 17);
        DipendenteFullTime Francois = new DipendenteFullTime(33264L, 2000, Dipendente.Dipartimento.PRODUZIONE);
        DipendentePartTime Anna = new DipendentePartTime(66732L, 10, Dipendente.Dipartimento.VENDITE, 100);
        Volontario Tommaso = new Volontario("Tommaso", 21, "Ho lavorato come bar-tender");

        lavoratori.add(Matteo);
        lavoratori.add(Francois);
        lavoratori.add(Anna);
        lavoratori.add(Tommaso);


        for (Checkable lavoratore : lavoratori) {
            lavoratore.checkIn();
            if (lavoratore instanceof Dipendente){
                Dipendente dipendente = (Dipendente) lavoratore;
                System.out.println("La matricola del dipendente è " + dipendente.getMatricola());
                dipendente.calculateSalary();
            }

        }


    }
}
