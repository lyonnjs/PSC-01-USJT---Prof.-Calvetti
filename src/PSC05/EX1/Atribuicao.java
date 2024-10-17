package PSC05.EX1;

public class Atribuicao {
    private Professor professor;
    private Disciplina disciplina;

    public Atribuicao(Professor professor, Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;

        
    }

    

    public String getdadoS(){
        return professor.getDados() + disciplina.getdadoS();
    }

}