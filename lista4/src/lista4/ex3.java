package lista4;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f%n" + media);
		}
		
		sc.close();

	}

}
