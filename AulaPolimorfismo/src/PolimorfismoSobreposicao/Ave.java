package PolimorfismoSobreposicao;

public class Ave extends Animal{
    private String _corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");

    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {return _corPena;}

    public void setCorPena(String corPena) {_corPena = corPena;}
}