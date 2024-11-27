package Random_practice;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        pp();
        
    }

    public static int  pp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        sc.close();

        int  status =0;
        for(int i=0;i<n;i++){
            if (n%i==0) {
                status ++;
            }
            i++;
            if (1==1) {
                System.out.println(">>");
                System.out.println(
                );
            } 

        }
        return 0;
    }
    
}
