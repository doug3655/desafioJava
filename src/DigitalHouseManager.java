import java.util.List;

public class DigitalHouseManager {
    private List<Aluno>listAluno;
    private List<Professor>listProfessor;
    private List<Curso>listCurso;
    private List<Matricula>listMatricula;

    public DigitalHouseManager(List<Aluno> listAluno, List<Professor> listProfessor, List<Curso> listCurso, List<Matricula> listMatricula) {
        this.listAluno = listAluno;
        this.listProfessor = listProfessor;
        this.listCurso = listCurso;
        this.listMatricula = listMatricula;
    }

    public void registrarCurso(String nome, Integer codigoCurso,Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        this.listCurso.add(curso);
    }

    public void excluirCurso(Integer codigoCurso){
        int tamanho=this.listCurso.size();
        for (int i = 0; i < this.listCurso.size(); i++) {
            if (codigoCurso == listCurso.get(i).getCodCurso()){
                listCurso.remove(i);
                System.out.println("Curso removido");
                break;
            }
        }
        if (tamanho>this.listCurso.size()){
            System.out.println("Curso não foi removido pois não esta cadastrado");
        }
    }

    public List<Aluno> getListAluno() {
        return listAluno;
    }

    public List<Professor> getListProfessor() {
        return listProfessor;
    }

    public List<Curso> getListCurso() {
        return listCurso;
    }

    public List<Matricula> getListMatricula() {
        return listMatricula;
    }
}
