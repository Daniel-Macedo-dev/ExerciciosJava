//1. Pacote e imports
package Lutas;

//2. Declaração de classe
public class Lutador {
    //. 3 Atributos
    private String _nome;
    private String _nacionalidade;
    private int _idade;
    private float _altura;
    private float _peso;
    private String _categoria;
    private int _vitorias, _derrotas, _empates;

    //4. Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
                   int vitorias, int derrotas, int empates) {
        _nome = nome;
        _nacionalidade = nacionalidade;
        _idade = idade;
        _altura = altura;
        setPeso(peso);
        _vitorias = vitorias;
        _derrotas = derrotas;
        _empates = empates;
    }

    //5. Metodos públicos
    public void apresentar() {
        System.out.println("Apresentando o lutador: " + getNome());
        System.out.println("Vindo da: " + getNacionalidade());
        System.out.println("com " + getIdade() + "anos e " + getAltura());
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println(getVitorias() + "Vitórias");
        System.out.println(getDerrotas() + "Derrotas");
        System.out.println(getEmpates() + "Empates");
    }

    public void status() {
        System.out.println(getNome() + "é um peso peso " + getCategoria());
        System.out.println("Ganhou " + getVitorias() + "vezes");
        System.out.println("Perdeu " + getDerrotas() + "vezes");
        System.out.println("Empatou " + getEmpates() + "vezes");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);

    }

    //getters e setters

    public String getNome() {return _nome;}

    public void setNome(String nome) {_nome = nome;}

    public String getNacionalidade() {return _nacionalidade;}

    public void setNacionalidade(String nacionalidade) {_nacionalidade = nacionalidade;}

    public int getIdade() {return _idade;}

    public void setIdade(int idade) {_idade = idade;}

    public float getAltura() {return _altura;}

    public void setAltura(float altura) {_altura = altura;}

    public float getPeso() {return _peso;}

    public void setPeso(float peso) {_peso = peso;setCategoria();}

    public String getCategoria() {return _categoria;}

    private void setCategoria() {
        if (_peso < 52.2) {
            _categoria = "Inválido";
        } else if (_peso <= 70.3) {
            _categoria = "Leve";
        } else if (_peso <= 83.9) {
            _categoria = "Médio";
        } else if (_peso <= 120.2) {
            _categoria = "Pesado";
        } else {
            _categoria = "Inválido";
        }
    }

    public int getVitorias() {return _vitorias;}

    public void setVitorias(int vitorias) {_vitorias = vitorias;}

    public int getDerrotas() {return _derrotas;}

    public void setDerrotas(int derrotas) {_derrotas = derrotas;}

    public int getEmpates() {return _empates;}

    public void setEmpates(int empates) {_empates = empates;}
}
