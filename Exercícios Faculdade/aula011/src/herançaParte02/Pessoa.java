package herançaParte02;

public abstract class Pessoa {
    protected String _nome;
    protected int _idade;
    protected String _sexo;

    public void fazerAniversario(){
        _idade++;
    }

    public String getNome() {return _nome;}

    public void setNome(String nome) {_nome = nome;}

    public int getIdade() {return _idade;}

    public void setIdade(int idade) {_idade = idade;}

    public String getSexo() {return _sexo;}

    public void setSexo(String sexo) {_sexo = sexo;}

    @Override
    public String toString() {
        return "Pessoa{" +
                "_nome='" + _nome + '\'' +
                ", _idade=" + _idade +
                ", _sexo='" + _sexo + '\'' +
                '}';
    }
}
