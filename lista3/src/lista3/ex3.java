package lista3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (x == 0 || y == 0) {
                break;
            }
            
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }
        
        sc.close();
    }
}