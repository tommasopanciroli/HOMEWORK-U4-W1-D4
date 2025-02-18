package tipo;

public abstract class Dipendente {
    private Long matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    public enum Dipartimento {
        AMMINISTRAZIONE, PRODUZIONE, VENDITE
    }

    public Dipendente(Long numMatricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = numMatricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public Long getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento(){
        return dipartimento;
    }

    public Dipartimento setDipartimento(Dipartimento dipartimento){
        return this.dipartimento = dipartimento;
    }

    public void calculateSalary(){}

}
