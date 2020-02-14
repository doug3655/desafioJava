public class ProfessorAdjunto extends Professor {
    private Integer horasMonitoria;

    public ProfessorAdjunto(){

    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCas, Integer codProfessor, Integer horasMonitoria) {
        super(nome, sobrenome, tempoDeCas, codProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
