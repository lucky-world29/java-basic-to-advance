public class kthNonRepeatingTerm {


    public static char kthNonRepeatingChar(String str,int k)
    {
        int count = 0;
        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            boolean repeating = false;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    repeating = true;
                    break;
                }
            }

            if (!repeating) {
                count++;
                if (count == k) {
                    result = str.charAt(i);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        
        String str = "geeksforgeeks";
        int k = 3;
        char result = kthNonRepeatingChar(str, k);

        if (result == '\0') {
            System.out.println(
                "There is no kth non-repeating character "
                + "in the string.");
        }
        else {
            System.out.println(
                "The " + k
                + "th non-repeating character in the string "
                + "is " + result + ".");
        }
    }
}
