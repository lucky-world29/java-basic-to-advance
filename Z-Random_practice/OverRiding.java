package Random_practice;

public class OverRiding {
    void f1()
    {
        System.out.println("Hello");
    }

}

class A extends OverRiding{
    void f1(){
        super.f1();
        System.out.println("World");

    }
 //The parent class Cant be accessed
    //The child class will show
    public static void main(String[] args) {
        OverRiding ob = new OverRiding();

       // OverRiding ob1 = new OverRiding();

        ob.f1();    //world

        /* ob1.f1();  //world
        A obj=new A();
        obj.f1();   //Hello
              */

    }
}
 //Super key word
///it always Indicate or acess Parent class