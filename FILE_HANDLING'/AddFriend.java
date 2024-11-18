import java.io.File;
import java.io.IOException;

public class AddFriend {
    public static void main(String[] args) {
        System.out.println("ji");
        
        try {
            // Calling the AA method
            AA();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    static void AA() throws IOException {
        File file = new File("abc.txt");
        
        // Attempting to create the file if it does not exist
        boolean fileCreated = file.createNewFile();
        if (fileCreated) {
            System.out.println("File created: " + file.exists());
        } else {
            System.out.println("File already exists: " + file.exists());
        }
    }
}
