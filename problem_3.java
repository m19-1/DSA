package problems_set_1;
import java.util.Scanner;

public class problem_3 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the mark of the student: ");
	        int mark = scanner.nextInt();

	        if (mark >= 90) {
	            System.out.println("Grade A");
	        } else if (mark >= 80) {
	            System.out.println("Grade B");
	        } else if (mark >= 60) {
	            System.out.println("Grade C");
	        } else if (mark >= 35) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Fail");
	        }

	        scanner.close();
	    }
	}