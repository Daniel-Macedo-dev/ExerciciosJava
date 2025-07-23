package ProjetoFinal;

public class YouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 5 de POO");
        v[1] = new Video("Aula 7 de POO");
        v[2] = new Video("Aula 10 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Pedro", 14, "M", "Pedrin");
        g[1] = new Gafanhoto("Ana", 21, "F", "Aninha");

        Visualizacao vis[] = new Visualizacao[5]; //Pedro assite aula 10
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); //Pedro assiste aula 7
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
    }
}