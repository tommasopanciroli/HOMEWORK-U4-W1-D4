package tipo;

public class DipendentePartTime extends Dipendente{
    private int oreLavorate;
    public DipendentePartTime(Long numMatricola, int stipendio, Dipartimento dipartimento, int oreDiLavoro) {
        super(numMatricola, stipendio, dipartimento);
        this.oreLavorate = oreDiLavoro;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    @Override
    public void calculateSalary(){
        int stipendioPartTime = getStipendio() * oreLavorate;
        System.out.println("Lo stipendio di un part-time per " + oreLavorate + " ore lavorate: " + stipendioPartTime + "€");
    }

}
