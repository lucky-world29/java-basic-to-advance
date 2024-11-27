
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
        InnerClass outerObject = new InnerClass();
        InnerClass.A innerObject = outerObject.new A();
        innerObject.meth();


        /*
         * Formula for calling InnerClass object ...===>> 
         */
        // OuterClass outerObject = new OuterClass();
        // OuterClass.InnerClass innerObject = outerObject.new InnerClass();
    }
}

