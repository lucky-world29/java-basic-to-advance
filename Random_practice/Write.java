import java.io.*;
import java.util.Scanner;
public class Write {
    public static void main(String[] args) {
        try{
           FileOutputStream fos = new FileOutputStream("F:\JAVA\Bubble.java");
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number");
           int num = sc.nextInt();
           fos.write(num);
           fos.close();
        }
        catch(IOException e)
        {
            System.out.println("Error"+e);

        }
    }
}
