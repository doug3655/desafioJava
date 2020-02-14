import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno>listAluno;
    private List<Professor>listProfessor;
    private List<Curso>listCurso;
    private List<Matricula>listMatricula;

    public DigitalHouseManager(List<Aluno> listAluno, List<Professor> listProfessor, List<Curso> listCurso,
                               List<Matricula> listMatricula) {
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
        if (tamanho==this.listCurso.size()){
            System.out.println("Curso não foi removido pois não esta cadastrado");
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor,
                                          Integer quantidadeDeHoras){

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome,sobrenome,0,
                codigoProfessor,quantidadeDeHoras);

        listProfessor.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){

        ProfessorTitular professorTitular = new ProfessorTitular(nome,sobrenome,0,codigoProfessor,especialidade);

        listProfessor.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor){
        int tamanho=this.listProfessor.size();
        for (int i = 0; i < this.listProfessor.size(); i++) {
            if (codigoProfessor == listProfessor.get(i).getCodProfessor()){
                listProfessor.remove(i);
                System.out.println("Professor removido");
                break;
            }
        }
        if (tamanho==this.listProfessor.size()){
            System.out.println("Professor não foi removido pois não esta cadastrado");
        }
    }

    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);
        listAluno.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        for (int i = 0; i < listCurso.size(); i++) {//percorre a lista de cursos
            if (codigoCurso==listCurso.get(i).getCodCurso()){//procura aonde esta a turma(e se ela existe)
                List<Aluno>verificaTamanho = new ArrayList<>(listCurso.get(i).getListAluno());//gera uma copia da lista de alunos para ver qtd de alunos nela
                if(verificaTamanho.size()<listCurso.get(i).getQtdMaxAluno()){//verifica se a turma esta cheia
                    for (int j = 0; j < listAluno.size(); j++) {//percorre a lista de alunos
                        if (codigoAluno==listAluno.get(j).getCodAluno()){//procura aonde esta o aluno(e se ele existe)
                            listCurso.get(i).adicionarUmAluno(listAluno.get(j));//adiciona o aluno na turma
                            Matricula matricula = new Matricula(listAluno.get(j),listCurso.get(i));//gera uma nova matricula
                            listMatricula.add(matricula);//adiciona a matricula na lista de matriculas
                            System.out.println("Aluno cadastrado no curso com sucesso");
                        }
                    }
                    if(verificaTamanho.size()==listCurso.get(i).getListAluno().size()){//localiza a turma;pega a lista de alunos no curso selecionado;verifica o tamanho da lista de aluno
                        //verifica se a lista de alunos copiada tem o tamanho da lista atualizada,se tiver é porque o aluno não foi cadastrado
                        System.out.println("Aluno não cadastrado no sistema");
                    }
                }else {
                    System.out.println("Curso cheio!");
                }
            }
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
