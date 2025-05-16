package Lutas;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador _desafiado;
    private Lutador _desafiante;
    private int _rounds;
    private boolean _aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&&l1 != l2){
            _aprovada = true;
            _desafiado = l1;
            _desafiante = l2;
        } else {
            _aprovada = false;
            _desafiado = null;
            _desafiante = null;
        }
    }
    public void lutar(){
        if(_aprovada){
            System.out.println("DESAFIADO");
            _desafiado.apresentar();
            System.out.println("DESAFIANTE");
            _desafiante.apresentar();

            Random qualquer = new Random();
            int vencedor = qualquer.nextInt(3);
            switch (vencedor){
                case 0: // Empate
                    _desafiado.empatarLuta();
                    _desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("Vitória vai para " + _desafiado.getNome());
                    _desafiado.ganharLuta();
                    _desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("Vitória vai para " + _desafiante.getNome());
                    _desafiante.ganharLuta();
                    _desafiado.perderLuta();
                    break;
            }
        }
    }

    public Lutador getDesafiado() {return _desafiado;}

    public void setDesafiado(Lutador desafiado) {_desafiado = desafiado;}

    public Lutador getDesafiante() {return _desafiante;}

    public void setDesafiante(Lutador desafiante) {_desafiante = desafiante;}

    public int getRounds() {return _rounds;}

    public void setRounds(int rounds) {_rounds = rounds;}

    public boolean isAprovada() {return _aprovada;}

    public void setAprovada(boolean aprovada) {_aprovada = aprovada;}
}