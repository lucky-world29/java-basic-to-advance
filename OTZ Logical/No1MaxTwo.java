import java.util.Scanner;

public class No1MaxTwo{
    public static void main(String[] args) {
        
        int num1,num2;

        String fire = "\uD83D\uDD25"; // 🔥
        System.out.println(fire);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st Number");
            num1 = sc.nextInt();

            System.out.println("Enter the 2nd Number");
            num2 = sc.nextInt();
        }
        // The main Logic
        if(num1 == num2){
            System.out.println("Number are equal");
        }else{
        if(num1>num2)
            System.out.println("The maximum between the number "+num1 +" & " + num2 +" is  " + num1+ fire);
        else
             System.out.println("The maximum between the number  "+num1 +" & "  + num2 +" is  " + num2 + fire);
            }
    }
}