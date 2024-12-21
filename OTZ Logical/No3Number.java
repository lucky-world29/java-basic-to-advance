import java.util.Scanner;

public class No3Number {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number");
            try {
                int num = scanner.nextInt();

                if (num == 0) {
                    System.out.println("Number is Zero");
                } else if (num > 0) {
                    System.out.println(num + " is a +ve Number ");
                } else {
                    System.out.println(num + " is a -ve Number");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }
}
