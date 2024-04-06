// 8th june 2023  */
class  A{
    int a=20;
    A(){
        System.out.println("Im in class A");
    }

    void f1()
    {
        System.out.println("Hello");
    }

}

class B extends A{
    int a=30;
    B(int x){

    }

    B(){
        System.out.println("Im in B");  //#3  
    }
     void f1(){
        super.f1();
        System.out.println("World");
        System.out.println("a="+a);  //30
        System.out.println("a="+super.a);   //20


    }
 //The parent class Cant be accessed
    //The child class will show
    public static void main(String[] args) {
        B ob = new B();

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
class C extends B{
    C(){
        super(40);  //parametrised cojnstructo of class B
        System.out.println("IN claas C");
    }
    // Try this with main method in it  // it will move to default constructor of class B
    
}