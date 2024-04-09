Java If-else Statement
The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in Java.

if statement
if-else statement
if-else-if ladder
nested if statement
Java if Statement


The 

Java if statement 

tests the condition. It executes the if block if condition is true.
1:->
Syntax:

if(condition){  
//code to be executed  
}  

Example:


//Java Program to demonstrate the use of if statement.  


public class IfExample {  
public static void main(String[] args) {  
      //defining an 'age' variable  
    int age=20;  
          //checking the age  
    if(age>18){  
        System.out.print("Age is greater than 18");  
    }  
}  
}  

Output:

Age is greater than 18


2:->


Java if-else Statement


The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.

Syntax:

if(condition){  
//code if condition is true  
}else{  
//code if condition is false  
}  
if-else statement in java
Example:

//A Java Program to demonstrate the use of if-else statement.  



//It is a program of odd and even number.


public class IfElseExample {  
public static void main(String[] args) {  
    //defining a variable  
    int number=13;  
    //Check if the number is divisible by 2 or not  
    if(number%2==0){  
        System.out.print("even number");  
    }else{  
        System.out.print("odd number");  
    }  
}  
}  
Test it Now
Output:

odd number

/*
package IF_ELSE;

public class LeapYear {    
    public static void main(String[] args) {    
        int year=2020;    
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
            System.out.print("LEAP YEAR");  
        }  
        else{  
            System.out.print("COMMON YEAR");  
        }  
    }    
    }    
*/


Using Ternary Operator

We can also use ternary operator (? :) to perform 

->The conditional (ternary) operator is the only Java operator that takes "three operands":

   1. a condition followed by a question mark (?),
   2. then an expression to execute if the condition is truthy followed by a colon (:), 
   3. and finally the expression to execute if the condition is falsy. 

This operator is frequently used as an alternative to an if...else statement.

Syntax

condition ? exprIfTrue : exprIfFalse

java =>
   
    variable = Expression1 ? Expression2: Expression3


// Java Program for Implementing 
// Ternary operator on Boolean values

// Driver Class
public class TernaryOperatorExample {
      // main function
    public static void main(String[] args)
    {
        boolean condition = true;
        String result = (condition) ? "True" : "False";
      
        System.out.print(result);
    }
}


Advantages of Java Ternary Operator

Compactness: The ternary operator allows you to write simple if-else statements in a much more concise way, making the code easier to read and maintain.

Improved readability: When used correctly, the ternary operator can make the code more readable by making it easier to understand the intent behind the code.

Increased performance: Since the ternary operator evaluates a single expression instead of executing an entire block of code, it can be faster than an equivalent if-else statement.

Simplification of nested if-else statements: The ternary operator can simplify complex logic by providing a clean and concise way to perform conditional assignments.

Easy to debug: If a problem occurs with the code, the ternary operator can make it easier to identify the cause of the problem because it reduces the amount of code that needs to be examined.