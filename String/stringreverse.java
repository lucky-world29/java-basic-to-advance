public class stringreverse {
    // public static void main(String[] args) {
    //     String name = "Love";
    //     // Now we need to reverse the given string 
        
    //     System.out.println(name);

    //     /*
    //      * place this string to an array 
    //      * then reverse the array with for loop or for each loop 
    //      * then convert the array to string 
    //     */

    //     //to convert the string to array we have a predefined function 

    //     char[] arr = new char[name.length()];
    //     for (char c : arr) {
    //         System.out.println(arr);    
    //     }

    public static void main(String[] args) {
        String original = "Lucky";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

        
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
        


    }

