package aula09;

public class livro implements publicacao {

    private String _titulo;
    private String _autor;
    private int _totalPaginas;
    private int _paginaAtual;
    private boolean _aberto;
    private pessoa _leitor;

    public livro(String titulo, String autor, int totalPaginas, pessoa leitor){

        _titulo = titulo;
        _autor = autor;
        _totalPaginas = totalPaginas;
        _paginaAtual = 0;
        _aberto = false;
        _leitor = leitor;
    }

    //getters e setters
    public String getTitulo() {return _titulo;}
    public void setTitulo(String titulo) {_titulo = titulo;}

    public String getAutor() {return _autor;}
    public void setAutor(String autor) {_autor = autor;}

    public int getTotalPaginas() {return _totalPaginas;}
    public void setTotalPaginas(int totalPaginas) {_totalPaginas = totalPaginas;}

    public int getPaginaAtual() {return _paginaAtual;}
    public void setPaginaAtual(int paginaAtual) {_paginaAtual = paginaAtual;}

    public boolean getAberto() {return _aberto;}
    public void setAberto(boolean aberto) {_aberto = aberto;}

    public pessoa getLeitor() {return _leitor;}
    public void setLeitor(pessoa leitor) {_leitor = leitor;}

    public String detalhes() {
        return "livro{" +
                "\n  _titulo='" + _titulo + '\'' +
                ",\n  _autor='" + _autor + '\'' +
                ",\n  _totalPaginas=" + _totalPaginas +
                ",\n  _paginaAtual=" + _paginaAtual +
                ",\n  _aberto=" + _aberto +
                ",\n  _leitor=" + _leitor.getNome() +
                ",\n  _leitor=" + _leitor.getIdade() +
                ",\n  _leitor=" + _leitor.getSexo() +
                "\n}";
    }

    @Override
    public void abrir() {_aberto = true;}

    @Override
    public void fechar() {_aberto = false;}

    @Override
    public void folhear(int p) {_paginaAtual = p;}

    @Override
    public void avancarPag() {_paginaAtual++;}

    @Override
    public void voltarPag() {_paginaAtual--;}
}
