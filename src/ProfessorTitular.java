public class ProfessorTitular extends Professor{
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCas, Integer codProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCas, codProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
