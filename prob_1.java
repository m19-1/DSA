package problems_set_2;
import java.util.Scanner;
public class prob_1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();
        System.out.println("Enter the value of y:");
        int y = scanner.nextInt();
        for (int i = 0; i < y; i++) {
            System.out.println(x);
        }

        scanner.close();
    }
}
	
	    
