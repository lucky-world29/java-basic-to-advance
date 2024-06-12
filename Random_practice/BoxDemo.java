// This is still pending . Need to complete this code .......



package Random_practice;

// class Box{
//     double width;
//     double height;
//     double depth;
// }

class A{
    int b;
    int c;
}

class B{
    public void innerB(){
        A a = new A();
        a.b=9;
        a.c=12;
    }
}

class C {

}


public class BoxDemo { 

    // public static void main(String[] args) {
    //     Box x = new Box();
    //     double vol;

    //     x.width = 10;
    //     x.height = 20;
    //     x.depth = 15;

    //     vol = x.width* x.height * x.depth;

    //     System.out.println("Vol is " +vol);
    // }
    
    public static void main(String[] args) {
        B obj = new B();
        obj.innerB();
        BoxDemo obj1 = new BoxDemo();
        
    }
}
