
import java.util.Scanner;
public class Root_Quadratic {

    int x=5;
    int y=5;


    static void Eq1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st equation");
        String eq1 = sc.nextLine();

        // String[] eq1 = new String[];
        // char[] array = eq1.toCharArray();

        System.out.println("value of a is "+eq1.substring(0, eq1.indexOf('x')));
        System.out.println("value of b is "+eq1.substring(eq1.indexOf('+')+1, eq1.indexOf('y')));
        
        String coeffX = eq1.substring(0, eq1.indexOf('x'));
        String coeffY = eq1.substring(eq1.indexOf('+')+1, eq1.indexOf('y'));

        int a = Integer.parseInt(coeffX);
        int b = Integer.parseInt(coeffY);

        // System.out.println("A is =>"+a+" "+"B is =>"+b);
    }

    static void Eq2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2nd equation");
        String eq2 = sc.nextLine();

        System.out.println("value of c is "+eq2.substring(0, eq2.indexOf('x')));
        System.out.println("value of d is "+eq2.substring(eq2.indexOf('+')+1, eq2.indexOf('y')));

        String coeffX = eq2.substring(0, eq2.indexOf('x'));
        String coeffY = eq2.substring(eq2.indexOf('+')+1, eq2.indexOf('y'));

        int c = Integer.parseInt(coeffX);
        int d = Integer.parseInt(coeffY);

        // System.out.println();
    }

    // public float nonLinear(int x,int y){
    //     x=this.x;
    //     y=this.y;
    //     int sum=x+y;
    //     System.out.println(sum);
    //     return 0;
    // }

    public static void main(String[] args) {
        Root_Quadratic ob = new Root_Quadratic();
        //ob.nonLinear(4,4);
        Eq1();
        Eq2();
    }
}
