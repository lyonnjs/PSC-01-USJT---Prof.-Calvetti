package PSC04.EX3;
public class Disciplina {
    private String sNome;
    private String  sProfessor;
    private int iSemestre;
    private boolean bOfertada;

    public Disciplina(String n, String p, int s, boolean o){
        this.sNome = n;
        this.sProfessor = p;
        this.iSemestre = s;
        this.bOfertada = false;

    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getsProfessor() {
        return sProfessor;
    }

    public void setsProfessor(String sProfessor) {
        this.sProfessor = sProfessor;
    }

    public int getiSemestre() {
        return iSemestre;
    }

    public void setiSemestre(int iSemestre) {
        this.iSemestre = iSemestre;
    }

    public boolean isbOfertada() {
        return bOfertada;
    }

    public void setbOfertada(boolean bOfertada) {
        this.bOfertada = bOfertada;
    }

}
