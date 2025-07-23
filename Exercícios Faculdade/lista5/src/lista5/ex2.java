package lista5;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("Funcionário: " + funcionario);

        System.out.print("Qual a porcentagem de aumento? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.print("Dados atualizados: " + funcionario);
		
		
		
		
		sc.close();

	}

}
