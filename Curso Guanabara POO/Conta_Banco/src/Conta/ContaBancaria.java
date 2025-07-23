package Conta;
public class ContaBancaria {
    public static void main(String[] args) {
        Estrutura_Conta p1 = new Estrutura_Conta(1111, "CC", "Jubileu");
        Estrutura_Conta p2 = new Estrutura_Conta(2222, "CP", "Creuza");

        p1.abrirConta("CC");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.estadoConta();
        p2.estadoConta();

        p1.pagarMensalidade();
        p2.pagarMensalidade();

        p1.fecharConta();
        p2.fecharConta();

        p1.estadoConta();
        p2.estadoConta();
    }
}