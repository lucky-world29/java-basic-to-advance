package Random_practice;

class parent {
void eat() {
     System.out.println("Eat vegetable");
}
}
 
 
class child extends parent {
 
void eat() {
     
     System.out.println("I want to eat chocolate");
}
}
 
 
public class overridingExample {
public static void main(String[] args) {
     parent p = new parent();
     System.out.println("Parent says : ");
     p.eat();
 
     
     
     child c = new child();
     System.out.println("Child says : ");
     
     c.eat();  
}
}