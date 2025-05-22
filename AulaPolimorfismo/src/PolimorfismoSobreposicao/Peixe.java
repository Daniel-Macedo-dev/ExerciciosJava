package PolimorfismoSobreposicao;

public class Peixe extends Animal{
    private String _corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");

    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");

    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {return _corEscama;}

    public void setCorEscama(String corEscama) {_corEscama = corEscama;}
}