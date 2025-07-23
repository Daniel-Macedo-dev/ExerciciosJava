package lista5;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Digite as 3 notas: ");
		aluno.nota1= sc.nextDouble();
		aluno.nota2= sc.nextDouble();
		aluno.nota3= sc.nextDouble();
		
		System.out.printf("Nota final = %.2f%n", aluno.calcularNotaFinal());
		
		if (aluno.aprovado()) {
			System.out.println("Aprovado");
		}else {
			System.out.println("REPROVADO");
			System.out.printf("Faltaram %.2f pontos%n", aluno.pontosFaltam());
		}
		
		
		sc.close();

	}

}
