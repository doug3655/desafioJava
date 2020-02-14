public class ProfessorAdjunto extends Professor {
    private String horasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCas, Integer codProfessor, String horasMonitoria) {
        super(nome, sobrenome, tempoDeCas, codProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public String getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(String horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
