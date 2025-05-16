package encapsulamento;
public class ControleRemoto implements encapsulamento.Controlador {

    //atributos
    private int _volume;
    private boolean _ligado;
    private boolean _tocando;

    //Construtor
    public ControleRemoto(int volume, boolean ligado, boolean tocando){
        _volume = volume;
        _ligado = ligado;
        _tocando = tocando;
    }

    //getters e setters

    private int getVolume() {
        return _volume;
    }

    private void setVolume(int volume) {
        _volume = volume;
    }

    private boolean getLigado() {
        return _ligado;
    }

    private void setLigado(boolean ligado) {
        _ligado = ligado;
    }

    private boolean getTocando() {
        return _tocando;
    }

    private void setTocando(boolean tocando) {
        _tocando = tocando;
    }

    //Metodos

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.println("Volume: " + getVolume());
        for(int i = 0; i <= getVolume(); i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(getLigado()) {
            setVolume(getVolume() + 1);
        } else{
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()) {
            setVolume(getVolume() -1);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume()>0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && getTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()){
            setTocando(false);
        }
    }
}
