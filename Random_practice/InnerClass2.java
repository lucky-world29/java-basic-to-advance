package Random_practice;

public class InnerClass2 {
    public static void main(String[] args) {
        
    }
}
///================================**=================================
class OuterClass{


    private void priMeth(){
        System.out.println("priMeth() is called");
    }

    class InnerClass1{
        public void InnMethClass1(){
            System.out.println("InnMethClass1() is called");
        }
    }

    class InnerClass2{
        public void InnMethClass2(){
            System.out.println("InnMethClass2() is called");
        }
    }


    // OuterClass outObj  = new OuterClass(); 
    // OuterClass.InnerClass1 innObj = outObj.new InnerClass1();

}
