public class LowerUpperDemo {
        public static void main(String args[]) {
                String input = "java is best";
                System.out.println("Lower case string is : " + input);
                char strArr[] = input.toCharArray();
                for (int i = 0; i < strArr.length; i++) {
                        // here is the actual logic
                        if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                                strArr[i] = (char) ((int) strArr[i] - 32);
                        }
                }
                System.out.print("Upper case string is : ");
                // print the string array
                for (int i = 0; i < strArr.length; i++) {
                        System.out.print(strArr[i]);
                }
        }
}