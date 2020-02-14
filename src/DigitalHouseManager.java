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
