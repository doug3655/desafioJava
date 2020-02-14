import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer qtdMaxAluno;
    private List<Aluno> listAluno;

    public Curso(String nome, Integer codCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer qtdMaxAluno, List<Aluno> listAluno) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdMaxAluno = qtdMaxAluno;
        this.listAluno = listAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codCurso, curso.codCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public Integer getQtdMaxAluno() {
        return qtdMaxAluno;
    }

    public void setQtdMaxAluno(Integer qtdMaxAluno) {
        this.qtdMaxAluno = qtdMaxAluno;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public List<Aluno> getListAluno() {
        return listAluno;
    }
}
