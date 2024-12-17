package problems_set_1;
import java.util.Scanner;

public class problem_1 {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        System.out.print("Enter a string: ");
	        String string = scanner.next();
	        System.out.print("Enter a character: ");
	        char character = scanner.next().charAt(0);

	        System.out.println(number);
	        System.out.println(string);
	        System.out.println(character);

	        scanner.close();
	    
	}
}



