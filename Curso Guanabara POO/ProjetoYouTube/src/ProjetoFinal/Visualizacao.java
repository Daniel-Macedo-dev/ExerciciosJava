package ProjetoFinal;

public class Visualizacao {
    private Gafanhoto _espectador;
    private Video _filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        _espectador = espectador;
        _filme = filme;
        _espectador.setTotalAssistido(_espectador.getTotalAssistido() + 1);
        _filme.setViews(_filme.getViews() + 1);
    }

    public void avaliar(){
        _filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        _filme.setAvaliacao(nota);

    }
    public void avaliar(float porcentagem){
        int total = 0;
        if (porcentagem <= 0){
            total = 3;
        }else if (porcentagem <= 50){
            total = 5;
        }else if (porcentagem <= 90){
            total = 8;
        }else{
            total = 10;
        }
        _filme.setAvaliacao(total);
    }

    public Gafanhoto getEspectador() {return _espectador;}

    public void setEspectador(Gafanhoto espectador) {_espectador = espectador;}

    public Video getFilme() {return _filme;}

    public void setFilme(Video filme) {_filme = filme;}

    @Override
    public String toString() {
        return "Visualizacao{" +
                "_espectador=" + _espectador +
                ", _filme=" + _filme +
                '}';
    }
}
