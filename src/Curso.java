import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codCurso;

    public Curso(String nome, Integer codCurso) {
        this.nome = nome;
        this.codCurso = codCurso;
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
}
