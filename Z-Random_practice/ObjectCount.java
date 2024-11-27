package Random_practice;

public class ObjectCount 
{  
static int count=0;  
public static void main(String args[])  
{  
ObjectCount c1=new ObjectCount();   
c1.count();  
ObjectCount c2=new ObjectCount();  
c2.count();  
ObjectCount c3=new ObjectCount();   
c3.count();  
System.out.println("Total Number of Objects: "+count);  
}  
static void count()  
{  
count++;
}
}