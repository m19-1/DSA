package math_prob;
import java.util.Scanner;
public class count_digits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        int count = 0;
        int number = n; 
        while (number != 0) {
            number = number / 10; 
            count++;
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }

}
