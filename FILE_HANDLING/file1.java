import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class file1 /*throws IOException*/ {
    public static void main(String[] args) throws IOException {

        //create a new file 
      /*   try {
            File f = new File("hello.txt");    
            f.createNewFile();
            System.out.println("Hello new txt file");
            System.out.println(f.getAbsolutePath()); 

        } catch (IOException e) {
            
            System.out.println(e);
        }
        */

        FileWriter fw = new FileWriter("fwhello.txt");
        fw.write("hello this is ");
        fw.close();

        FileReader fr = new FileReader("fwhello.txt");
        
        
    }
    
}
