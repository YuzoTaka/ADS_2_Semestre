
import java.util.ArrayList;
import java.util.List;


public class Faculdade {
    private String nome;
    
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return String.format("Nome da faculdade: %s "
                + "\nAluno: %s",
                nome, alunos);
    }

    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }
   
    public void cancelarMatricula(String ra){
        for (Aluno aluno : alunos) {
            if(aluno.getRa().equals(ra)){
                aluno.setAtivo(false);
            }
        }
    }
    
    public void exibirAluno(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    public void exibirAlunoPorSemestre(Integer semestre){
        for (Aluno aluno : alunos) {
            if(aluno.getSemestre() == semestre){
                System.out.println(aluno);
            }
        }
    }
    
    public void exibirCancelados(){
        for (Aluno aluno : alunos) {
            if(!aluno.getAtivo()){
                System.out.println(aluno);
            }
        }
    }
}
