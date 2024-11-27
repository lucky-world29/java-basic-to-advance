


class a{

    a(){

        System.out.println("In class a");

    }

    void f1(){

        System.out.println("hello world");

    }

}

class b extends a{

    b( int x){

        System.out.println("in class b"+x);




    }

}

class practice extends b {

   

    practice(){

        super(40);

        System.out.println("In class practice");

    }

    public static void main(String[] args) {

        practice ob = new practice();

    ob.f1();

    }

}