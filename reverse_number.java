package math_prob;
import java.util.Scanner;
public class reverse_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;     
            reversed = reversed * 10 + digit; 
            n = n / 10;             
        }
        System.out.println("Reversed number: " + reversed);
        scanner.close();
	}

}
