package lista5;

import java.util.Locale;

import java.util.Scanner;

import entities.Retangulo;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a largura e altura do retângulo");
		retangulo.largura = sc.nextDouble();
		retangulo.altura= sc.nextDouble();
		
		System.out.printf("Área = %.2f%n", retangulo.area());
		System.out.printf("Perímetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		
		sc.close();

	}

}
