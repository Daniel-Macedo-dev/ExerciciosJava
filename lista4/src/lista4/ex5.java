package lista4;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();	
		int fatorial = 1;
		
		for(int i = num; i > 0; i--) {
			fatorial *= i;  //fatorial = fatorial * i
		}
		System.out.println(fatorial);
		sc.close();

	}

}
