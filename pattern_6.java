package pattern_prob;
import java.util.Scanner;
public class pattern_6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
