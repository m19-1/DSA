package problems_set_2;
import java.util.Scanner;
public class prob_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter the number of times to print full name:");
        int n = scanner.nextInt();
        String fullName = firstName + lastName;

        for (int i = 0; i < n; i++) {
            System.out.println(fullName);
        }
        
        scanner.close();
    }
}
	    