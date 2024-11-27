


import java.util.*;

class gd

{

float chem,phy,math;

Scanner sc;

void read()

{

    sc=new Scanner(System.in);

    System.out.println("Enter the Physics mark : ");

    phy=sc.nextFloat();

    System.out.println("Enter the Chemistry mark : ");

    chem=sc.nextFloat();

    System.out.println("Enter the Math mark : ");

    math=sc.nextFloat();

}

}

class grade extends gd

{

    float per;

    void calculate()

    {

        per=((phy+chem+math)/300)*100;

    }

    char grade;

    void grad()

    {

        if(per>=90)

        grade='O';

        else if(per>=80&&per<90)

        grade='E';

        else if(per>=70&&per<80)

        grade='A';

        else

        grade='F';

        System.out.println("Grade = "+grade);

    }

}

class Grades extends grade {

    public static void main(String a[])

    {

       Grades ob=new Grades();

       ob.read();

       ob.calculate();

       ob.grad();

    }

}