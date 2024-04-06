import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Take input from user ");

        Scanner ab = new Scanner(System.in);   //Take input from user 

        System.out.println("Enter 1st number");
        int x = ab.nextInt();

        System.out.println("Enter 2nd number");
        int y =ab.nextInt();

        int sum = x+y;
        System.out.println("sum is \n"+sum);
    }
}
