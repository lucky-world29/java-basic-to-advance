
import java.util.Scanner;

public class StringReverse2 {

    public static void reverseString(char[] ch, int length) {
        if(length>0){
            System.out.print(ch[length-1]);
            length--;
            reverseString(ch, length);
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String name = scanner.nextLine();

            char[] ch = name.toCharArray(); //convert string to char array
            int length = ch.length; //find length of char array


            reverseString(ch,length);
        } 

}
}