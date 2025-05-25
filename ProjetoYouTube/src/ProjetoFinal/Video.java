package ProjetoFinal;

public class Video implements AcoesVideo {
    private String _titulo;
    private int _avaliacao;
    private int _views;
    private int _curtidas;
    private boolean _reproduzindo;

    public Video(String titulo) {
        _titulo = titulo;
        _avaliacao = 1;
        _views = 0;
        _curtidas = 0;
        _reproduzindo = false;
    }

    @Override
    public void play() {
        _reproduzindo = true;

    }
    @Override
    public void pause() {
        _reproduzindo = false;
    }
    @Override
    public void like() {
        _curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "_titulo='" + _titulo + '\'' +
                ", _avaliacao=" + _avaliacao +
                ", _views=" + _views +
                ", _curtidas=" + _curtidas +
                ", _reproduzindo=" + _reproduzindo +
                '}';
    }

    public String getTitulo() {return _titulo;}

    public void setTitulo(String titulo) {_titulo = titulo;}

    public int getAvaliacao() {return _avaliacao;}

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((_avaliacao + avaliacao)/_views);
        _avaliacao = nova;
    }

    public int getViews() {return _views;}

    public void setViews(int views) {_views = views;}

    public int getCurtidas() {return _curtidas;}

    public void setCurtidas(int curtidas) {_curtidas = curtidas;}

    public boolean getReproduzindo() {return _reproduzindo;}

    public void setReproduzindo(boolean reproduzindo) {_reproduzindo = reproduzindo;}
}
