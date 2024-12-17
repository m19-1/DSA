package problems_set_2;
import java.util.Scanner;
public class prob_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();
        for (int i = 1; i <= 1000 / x; i++) {
            System.out.println(x * i);
        }

        scanner.close();
    }
}
	
	    


