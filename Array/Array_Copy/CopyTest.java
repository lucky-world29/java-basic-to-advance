public class CopyTest {
    public static void main(String[] args) {
        // System.out.println("love");

        int[] array = { 23, 43, 55 };
        int[] copiedArray = new int[3];

        System.arraycopy(array, 2, copiedArray, 0, 3);
    }
}
