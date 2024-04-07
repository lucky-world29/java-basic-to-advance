package Random_practice;

public class Lect_7_1 {

   
    static {
        System.out.println("Hello");
    }

    {
        System.out.println("Lucky");   //IN this case the (non static Block) ==:> Block without Any name
    }                                   // not running [[ONLY when there is a default constructor]]

    public static void main(String[] args) {
        System.out.println("Dream");
    }


}


/*
 
public class Lect_7_1 {

   
    {
        System.out.println("Hello");
    }

   static {
        System.out.println("Lucky");   // This is running As there is a Default Constructor [  text()  ]
    }

    void text(){
        System.out.println("C++");
    }

    public static void main(String[] args) {
        System.out.println("Dream");
        Lect_7_1 ob = new Lect_7_1();
        ob.text();
    }


}

 */

 