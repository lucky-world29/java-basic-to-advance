
import java.util.Scanner;

public class vowel_Check {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a String");
            String str = sc.nextLine(); 
            // System.out.println(str);
            char ch[] = str.toCharArray();
            for(int i =0;i<ch.length;i++){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                    System.out.println("Present ");
                    
                }
                
            }
        }

    }
}
