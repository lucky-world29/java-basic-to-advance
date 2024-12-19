
import java.util.Scanner;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st Number: ");
            num1 = sc.nextInt();

            System.out.println("Enter the 2nd Number: ");
            num2 = sc.nextInt();

            System.out.println("Enter the 3rd Number: ");
            num3 = sc.nextInt();
        }

        // Check for equality
        if (num1 == num2 && num2 == num3) {
            System.out.println("All three numbers are equal.");
        } else {
            // Find the maximum number
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("The maximum among " + num1 + ", " + num2 + ", and " + num3 + " is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The maximum among " + num1 + ", " + num2 + ", and " + num3 + " is: " + num2);
            } else {
                System.out.println("The maximum among " + num1 + ", " + num2 + ", and " + num3 + " is: " + num3);
            }
        }
    }
}
