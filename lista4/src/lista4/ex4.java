package lista4;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossível");
			} else {
				System.out.printf("%.1f%n", (double) x / y);
			}
		}
		
		sc.close();
	}

}
