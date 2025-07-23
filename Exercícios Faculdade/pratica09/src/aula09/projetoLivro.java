package aula09;
public class projetoLivro {
    public static void main(String[] args) {
        pessoa[] p = new pessoa[2];
        livro[] l = new livro[3];

        p[0] = new pessoa("Pedro", 22, "M");
        p[1] = new pessoa("Maria", 25, "F");

        l[0] = new livro("Java zueiro", "Carlinhos", 350, p[0]);
        l[1] = new livro("Java na prática", "Rogério", 200, p[1]);
        l[2] = new livro("Python é difícil", "Daniel", 100, p[0]);

        //teste
        System.out.println(l[0].detalhes());

    }
}