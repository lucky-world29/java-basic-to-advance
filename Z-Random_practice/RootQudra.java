package Random_practice;
import java.util.Scanner;

public class RootQudra {
    public static void main(String[] args) {
        double firstroot = 0;
        double secondroot = 0;

        Scanner sc  = new Scanner(System.in);

        System.out.println("enter the value of a");
        double a = sc.nextDouble();

        System.out.println("enter the value of b");
        double b = sc.nextDouble();

        System.out.println("enter the value of c");
        double c = sc.nextDouble();

        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);

        if (determinant>0) {
            firstroot = (-b+sqrt)/(2*a);
            secondroot = (-b-sqrt)/(2*a);
            System.out.println("roots are "+"1st root :"+firstroot+"/n"+"2nd root :"+secondroot); 
        }else if(determinant==0){
            System.out.println("root is "+(-b+sqrt)/(2*a));
        }
    }
}