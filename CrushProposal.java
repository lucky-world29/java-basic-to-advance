import java.util.Scanner;

public class CrushProposal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hey, I've been meaning to tell you something important...");
            System.out.println("Will you go out with me? ");
            System.out.println("Please type your response: ");
            System.out.println("1: Yes, I'd love to!");
            System.out.println("2: Maybe, let's see.");
            System.out.println("3: No, sorry.");
            
            int response = scanner.nextInt();
            
            
            switch (response) {
                case 1 -> System.out.println("Yay!  I'm so happy! Can't wait for our first date!");
                case 2 -> System.out.println("That's okay, I totally respect your pace! Let’s get to know each other better. ");
                case 3 -> System.out.println("Oh, that’s alright.  You’re amazing anyway! Wishing you the best.");
                default -> System.out.println("Oops! That’s not a valid response, but I appreciate you either way. ");
            }
        }
    }
}



