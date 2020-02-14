import java.util.Objects;

public class Professor {
    private String nom;
    private String sobrenome;
    private Integer tempoDeCas;
    private Integer codProfessor;

    public Professor(String nom, String sobrenome, Integer tempoDeCas, Integer codProfessor) {
        this.nom = nom;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
