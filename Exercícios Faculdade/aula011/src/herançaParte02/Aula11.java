package herançaParte02;

public class Aula11 {
    public static void main(String[] args) {
       /*Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(15);
        v1.setSexo("M");
        System.out.println(v1.toString()); */

        Aluno a1 = new Aluno();
        a1.setNome("Rogério");
        a1.setMatricula(166);
        a1.setCurso("informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1123);
        b1.setNome("João");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();



    }
}