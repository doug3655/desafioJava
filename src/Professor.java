import java.util.Objects;

public class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoDeCas;
    private Integer codProfessor=0;

    public Professor(){

    }

    public Professor(String nome, String sobrenome, Integer tempoDeCas, Integer codProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCas = tempoDeCas;
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codProfessor, professor.codProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProfessor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCas() {
        return tempoDeCas;
    }

    public void setTempoDeCas(Integer tempoDeCas) {
        this.tempoDeCas = tempoDeCas;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }
}
