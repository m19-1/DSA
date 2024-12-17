package problems_set_1;
import java.util.Scanner;

public class problem_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter angle 2: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter angle 3: ");
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle cannot be formed");
        }

        scanner.close();
    }

}
