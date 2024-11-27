
class Final {
    final int c = 34;
 //ERROR
 //ERROR

 //ERROR
    void x() {
       // c = 45;
        System.out.println("value=" + c);
    }
 
    public static void main(String[] args) {
        Final ob = new Final();
        ob.x();
 
    }
}