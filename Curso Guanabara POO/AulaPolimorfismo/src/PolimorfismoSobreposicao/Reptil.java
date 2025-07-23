package PolimorfismoSobreposicao;

public class Reptil extends Animal{
    private String _corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");

    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");

    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {return _corEscama;}

    public void set_corEscama(String corEscama) {_corEscama = corEscama;}
}