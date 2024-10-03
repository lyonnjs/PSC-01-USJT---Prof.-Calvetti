package PSC04;


public class Turma {

    private String sNome;
    private String sCurso;
    private int iQtdDeAlunos;
    private int iSerie;

    

    public Turma(String n, String c, int q, int s){
       this.sNome = n;
       this.sCurso = c;  
       this.iQtdDeAlunos = q;
       this.iSerie = s;


    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getsCurso() {
        return sCurso;
    }

    public void setsCurso(String sCurso) {
        this.sCurso = sCurso;
    }

    public int getiQtdDeAlunos() {
        return iQtdDeAlunos;
    }

    public void setiQtdDeAlunos(int iQtdDeAlunos) {
        this.iQtdDeAlunos = iQtdDeAlunos;
    }

    public int getiSerie() {
        return iSerie;
    }

    public void setiSerie(int iSerie) {
        this.iSerie = iSerie;
    }

}