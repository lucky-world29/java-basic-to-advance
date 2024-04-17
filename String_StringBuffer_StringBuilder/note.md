Java String
In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string.

    -String is set of characters
    -In java string is a predefined class which consist predefined methods and constructors 


 For example:

char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch);  

is same as:

String s="javatpoint"; 


Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.


serializable          comparable            charSequence
    ^                      ^                      ^
    |                      |                      | 
    |                      |                      |
    |                      |                      |
<implements>          <implements>            <implements>        
  String                 String                  String



  

  ========================================================================================================


CharSequence Interface
The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. It means, we can create strings in Java by using these three classes.

 charSequence          charSequence           charSequence
    ^                      ^                      ^
    |                      |                      | 
    |                      |                      |
    |                      |                      |
<implements>          <implements>           <implements> 
  String               String Buffer        String Builder


The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.

We will discuss immutable string later. Let's first understand what String in Java is and how to create the String object.\


######  #####


What is String in Java?
Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:

1.By string literal
2.By new keyword



1) String Literal
Java String literal is created by using double quotes.

 For Example:

 String s="welcome";  

 Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  


In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome" in string constant pool that is why it will create a new object. After that it will find the string with the value "Welcome" in the pool, it will not create a new object but will return the reference to the same instance.

Note: String objects are stored in a special memory area known as the "string constant pool".
Why Java uses the concept of String literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).




2) By new keyword
String s=new String("Welcome");//creates two objects and one reference variable  
In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).



Java String Example
StringExample.java

public class StringExample{    
public static void main(String args[]){    
String s1="java";//creating string by Java string literal    
char ch[]={'s','t','r','i','n','g','s'};    
String s2=new String(ch);//converting char array to string    
String s3=new String("example");//creating Java string by new keyword    
System.out.print(s1);    
System.out.print(s2);    
System.out.print(s3);    
}}    

The above code, converts a char array into a String object. And displays the String objects s1, s2, and s3 on console using println() method.




1          	char charAt(int index)	                It returns char value for the particular index







================================================



Java String startsWith() and endsWith() method
The method startsWith() checks whether the String starts with the letters passed as arguments and endsWith() method checks whether the String ends with the letters passed as arguments.

example 

   

    
 public class Stringoperation3  
{  
public static void main(String ar[])  
{  
String s="Love";    
 System.out.println(s.startsWith("Sa"));//true    
 System.out.println(s.endsWith("n"));//true    
}  
}  



Java String charAt() Method
The String class charAt() method returns a character at specified index.


public class Stringoperation4  
{  
public static void main(String ar[])  
{  
String s="Love";    
System.out.println(s.charAt(0));//S    
System.out.println(s.charAt(3));//h    
}  
}




Java String length() Method
The String class length() method returns length of the specified String.