package Encapsulamento;
public class aulinha {
    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto(30, false, false);
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();

    }
}