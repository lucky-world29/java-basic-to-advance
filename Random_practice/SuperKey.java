package Random_practice;

public class SuperKey {
    public static void main(String[] args) {
        
    }
}

class Parent extends SuperKey{
    
}

class Child1 extends Parent{
    void CMeth1(){
        System.out.println("1");
    }
}

class Child2 extends Child1{
    void CMeth2(){
        System.out.println("2");
    }
}
