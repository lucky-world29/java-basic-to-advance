import java.util.Scanner;

public class No4DivisibleBy5_11 {

    static String divisible(int num) {
        if (num % 5 == 0 && num % 11 == 0) {
            return num + " is divisible by both 5 and 11.";
        } else if (num % 5 == 0) {
            return num + " is divisible by only 5.";
        } else if (num % 11 == 0) {
            return num + " is divisible by only 11.";
        } else {
            return num + " is not divisible by either 5 or 11.";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            try {
                int num = scanner.nextInt();
                System.out.println(divisible(num));
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }
}
