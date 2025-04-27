package Conta_Banco;
import java.util.Scanner;
import Entities.Estrutura_conta;

public class Conta_Bancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        
        System.out.println("Digite o titular da conta: ");
        String titular = sc.nextLine();
        
        System.out.println("Realizar depósito inicial? (s/n): ");
        char resp = sc.next().charAt(0);  //primeira letra
        
        Estrutura_conta Conta; // Estrutura conta: classe, Conta: variável guardar objetos
        
        if (resp == 's' || resp == 'S') {
            System.out.println("Valor do depósito inicial: ");
            double DepositoInicial = sc.nextDouble();
            Conta = new Estrutura_conta(numeroConta, titular, DepositoInicial); //crio obejto da classe Estrutura_conta dentro da variável Conta
        } else {
            Conta = new Estrutura_conta(numeroConta, titular); //crio obejto da classe Estrutura_conta dentro da variável Conta
        }
        
        Conta.ExibirDados();
        
        System.out.println("Digite valor a ser depositado: ");
        double deposito = sc.nextDouble();
        Conta.depositar(deposito); // conta. para acessar os métodos em entities
        Conta.ExibirDados();
        
        System.out.println("Digit valor a ser sacado: ");
        double saque = sc.nextDouble();
        Conta.sacar(saque);
        Conta.ExibirDados();

		sc.close();

	}

}
