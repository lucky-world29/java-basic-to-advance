package Random_practice;

public class InnerClass {
    class A{
        public void meth(){
            System.out.println("class A --> mth() ");
        }
    }
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        // A a = new A();
        // obj.A.meth();
    }
}
