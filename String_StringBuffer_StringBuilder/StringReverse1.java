public class StringReverse1 {
    public static void main(String[] args) {
        String name = "Lucky";
        // System.out.println(name);
        String reverse = "";

        for(int i = name.length()-1;i>=0;i--){
            reverse  += name.charAt(i);
        }
        System.out.println("Reverse of "+name+" is "+reverse);
    }
}
