import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer qtdMaxAluno;
    private List<Aluno> listAluno;

    public Curso(String nome, Integer codCurso, Integer qtdMaxAluno) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.qtdMaxAluno = qtdMaxAluno;
    }

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

    public Boolean adicionarUmAluno(Aluno umAluno){
        if(this.listAluno.size()<qtdMaxAluno){
            this.listAluno.add(umAluno);
            System.out.println("Aluno inserido no curso");
            return true;
        }else {
            System.out.println("Aluno não inserido no curso,a turma esta cheia");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        int tamanho=this.listAluno.size();
        for (int i = 0; i < this.listAluno.size(); i++) {
            if (umAluno.equals(listAluno.get(i))){
                listAluno.remove(i);
                System.out.println("Aluno removido do curso");
                break;
            }
        }
        if (tamanho==this.listAluno.size()){
            System.out.println("Aluno não foi removido do curso pois não esta cadastrado no curso");
        }
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
