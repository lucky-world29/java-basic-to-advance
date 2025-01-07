
import java.util.Scanner;

public class No5EvenOdd {
    

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {  // Try-with-resources for auto-closing
             System.out.println("Enter the number ");
            int num = sc.nextInt();

            if(num%2 ==0)
            System.out.println(num+" is an Even Number ");
            else
            System.out.println(num+" is an Odd Number");

        } catch (Exception e) {
            System.out.println("Invalid Input ! Please enter a valid number ");
        }

    }
    
}
