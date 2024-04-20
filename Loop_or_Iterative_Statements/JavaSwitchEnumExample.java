package Loop_or_Iterative_Statements;

public class JavaSwitchEnumExample {
    public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    
    public static void main(String args[])    
    {    
      Day[] DayNow = Day.values();    
        for (Day Now : DayNow)    
        {    
             switch (Now)    
             {    
                 case Sun:    
                     System.out.println("Sunday");    
                     break;    
                 case Mon:    
                     System.out.println("Monday");    
                     break;    
                 case Tue:    
                     System.out.println("Tuesday");    
                     break;         
                 case Wed:    
                     System.out.println("Wednesday");    
                     break;    
                 case Thu:    
                     System.out.println("Thursday");    
                     break;    
                 case Fri:    
                     System.out.println("Friday");    
                     break;    
                 case Sat:    
                     System.out.println("Saturday");    
                     break;    
             }    
         }    
     }    
}
