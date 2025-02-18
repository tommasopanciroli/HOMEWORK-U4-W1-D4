package tipo;

public class Dirigente extends Dipendente{
    private int euroPerVendita;
    private int venditeMensili;
    public Dirigente(Long numMatricola, int stipendioFisso, Dipartimento dipartimento, int euroPerVendita, int venditeMensili) {
        super(numMatricola, stipendioFisso, dipartimento);
        this.euroPerVendita = euroPerVendita;
        this.venditeMensili = venditeMensili;
    }

    public int getEuroPerVendita(){
        return euroPerVendita;
    }

    public int getVenditeMensili() {
        return venditeMensili;
    }

    @Override
    public void calculateSalary() {
       int stipendioDirigente = getStipendio() + (euroPerVendita * venditeMensili);
       System.out.println("Lo stipendio fisso del dirigente è: " + getStipendio() + "€." + "Al quale vanno aggiunti i premi per le vendite: " + (euroPerVendita * venditeMensili) + "€." + "Per un totale mensile di: " + stipendioDirigente + "€.");
    }

}
