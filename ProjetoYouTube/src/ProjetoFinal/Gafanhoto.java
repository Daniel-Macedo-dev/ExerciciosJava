package ProjetoFinal;

public class Gafanhoto extends Pessoa{
    private String _login;
    private int _totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        _login = login;
        _totalAssistido = 0;
    }

    public String getLogin() {return _login;}

    public void setLogin(String login) {_login = login;}

    public int getTotalAssistido() {return _totalAssistido;}

    public void setTotalAssistido(int totalAssistido) {_totalAssistido = totalAssistido;}

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "_login='" + _login + '\'' +
                ", _totalAssistido=" + _totalAssistido +
                '}';
    }
}

