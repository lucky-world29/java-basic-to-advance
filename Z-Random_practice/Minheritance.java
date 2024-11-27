package Random_practice;

import java.util.*;
class A{
Scanner sc;
float phy,chem,math;
void read(){
sc=new Scanner(System.in);
System.out.println("Enter physics mark: ");
phy=sc.nextFloat();
System.out.println("Enter chemistry mark: ");
chem=sc.nextFloat();
System.out.println("Enter mathematics mark: ");
math=sc.nextFloat();
}
}
class B extends A{
float per;
void calculate(){
per=((phy+chem+math)/300)*100;
}
}
class Minheritance extends B{
void display(){
if(per>=90)
System.out.println("Excellent");
else if(per>70&&per<89)
System.out.println("Qualified");
else
System.out.println("Not Qualified");
}
 
public static void main(String a[]){
Minheritance mi=new Minheritance();
mi.read();
mi.calculate();
mi.display();
}
}