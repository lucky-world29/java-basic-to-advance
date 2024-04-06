import java.util.Scanner;

class wek{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  x;
        System.out.println("Enter a number ");
        x=sc.nextInt();

        // if(x==0){
        //     System.out.println("Sunday");
        // }

        switch(x){
            case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("saturday");
            break;

            default:System.out.println("Enter a valid number ");

        }
   }
}