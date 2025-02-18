package tipo;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(Long numMatricola, int stipendio, Dipartimento dipartimento) {
        super(numMatricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio full-time è: " + getStipendio() + "€");
    }
}

