package lista3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int tentativa = sc.nextInt();

		while (tentativa != senha); {
			System.out.println("Senha errada");
			tentativa = sc.nextInt();
		}
		
		System.out.println("Acesso liberado");
		sc.close();

	}

}
