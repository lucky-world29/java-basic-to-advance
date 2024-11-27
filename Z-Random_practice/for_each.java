package Random_practice;

public class for_each {
    static String[] str1 = new String[5];
    

    static public void aa(){
        str1[0]="a";
        System.out.println(str1);
    }

    // String[] str2 = { "Ani", "Sam", " Joe" };
    // String[] strAr = new String[] { "Ani", "Sam", "Joe" }; // inline initialization
    public static void main(String[] args) {
        aa();
        System.out.println("main() ");
    }
}

