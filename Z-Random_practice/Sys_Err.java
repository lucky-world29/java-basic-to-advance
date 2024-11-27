
public class Sys_Err {
    public static void main(String[] args) {
        System.err.println("Error message");
        /*
         * System.err.println() method to print an error message 
         * "Error: Invalid input!" to the console, 
         * and since it is a standard error stream, 
         * it will be printed to the default console error output. 
         * We can also assign System.err to a new PrintStream
         *    object to redirect the standard error output to a file or another output stream.
         */
        System.out.println('a');
    }
}