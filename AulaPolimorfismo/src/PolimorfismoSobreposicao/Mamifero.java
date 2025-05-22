package PolimorfismoSobreposicao;

public class Mamifero extends Animal {
    private String _corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");

    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");

    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {return _corPelo;}

    public void setCorPelo(String corPelo) {_corPelo = corPelo;}
}