package herançaParte02;

public class Aluno extends Pessoa{
    private int _matricula;
    private String _curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do" + _nome);
    }

    public int getMatricula() {return _matricula;}

    public void setMatricula(int matricula) {_matricula = matricula;}

    public String getCurso() {return _curso;}

    public void setCurso(String curso) {_curso = curso;}
}
