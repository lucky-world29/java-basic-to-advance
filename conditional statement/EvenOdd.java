package IF_ELSE;
import java.util.*;

;
public class EvenOdd {
    @SuppressWarnings("resource")  //it is used to hide yhe warnings in code
    public static void main(String aa[]){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println(num+"is even ");
        }
        else
        System.out.println(num+"Is an odd number");
    }
}
