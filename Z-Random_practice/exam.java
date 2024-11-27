
import java.util.*;

class student {
   int roll;
   String name;
}

class exam extends student {
   int mark1;
   int mark2;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      exam e = new exam();
      System.out.print("\n Enter Roll No.");
      e.roll = sc.nextInt();
      System.out.print("Enter Name ");
      e.name = sc.next();
      System.out.print("Enter Marks in first subject:");
      e.mark1 = sc.nextInt();
      System.out.print("Enter marks In second Subject: ");
      e.mark2 = sc.nextInt();
      System.out.print("Student details are: ");
      System.out.println("Roll no.: " + e.roll);
      System.out.println("Name :" + e.name);
      System.out.println("Marks obtained for 1st subjct is :" + e.mark1);
      System.out.println("Marks Obtained For Second SubjecT Is:" + e.mark2);

   }
}