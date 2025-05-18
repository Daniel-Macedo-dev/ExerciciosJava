package aula09;

public class pessoa {

    private String _nome;
    private int _idade;
    private String _sexo;

    public pessoa(String nome, int idade, String sexo){
        _nome = nome;
        _idade = idade;
        _sexo = sexo;
    }

    //getters e setters

    public String getNome() {return _nome;}
    public void setNome(String nome) {_nome = nome;}

    public int getIdade() {return _idade;}
    public void setIdade(int idade) {_idade = idade;}

    public String getSexo() {return _sexo;}
    public void setSexo(String sexo) {_sexo = sexo;}

    public void fazerAniversario(){
        _idade = _idade + 1;
    }
}
