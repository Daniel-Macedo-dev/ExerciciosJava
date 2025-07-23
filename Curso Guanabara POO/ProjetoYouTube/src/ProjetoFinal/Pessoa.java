package ProjetoFinal;

public abstract class Pessoa {
    protected String _nome;
    protected int _idade;
    protected String _sexo;
    protected float _experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        _nome = nome;
        _idade = idade;
        _sexo = sexo;
        _experiencia = 0;
    }

    public String getNome() {return _nome;}

    public void setNome(String nome) {_nome = nome;}

    public int getIdade() {return _idade;}

    public void setIdade(int idade) {_idade = idade;}

    public String getSexo() {return _sexo;}

    public void setSexo(String sexo) {_sexo = sexo;}

    public float getExperiencia() {return _experiencia;}

    public void setExperiencia(float experiencia) {_experiencia = experiencia;}

    @Override
    public String toString() {
        return "Pessoa{" +
                "_nome='" + _nome + '\'' +
                ", _idade=" + _idade +
                ", _sexo='" + _sexo + '\'' +
                ", _experiencia=" + _experiencia +
                '}';
    }
}
