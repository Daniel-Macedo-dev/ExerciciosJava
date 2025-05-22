package PolimorfismoSobreposicao;

public abstract class Animal {
    protected float _peso;
    protected int _idade;
    protected int _membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {return _peso;}

    public void setPeso(float peso) {_peso = peso;}

    public int getIdade() {return _idade;}

    public void setIdade(int idade) {_idade = idade;}

    public int getMembros() {return _membros;}

    public void setMembros(int membros) {_membros = membros;}
}