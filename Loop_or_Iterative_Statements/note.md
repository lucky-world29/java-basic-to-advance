Java Switch Statements

Instead of writing many if..else statements, you can use the switch statement.

The switch statement selects one of many code blocks to be executed:

SyntaxGet your own Java Server
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
This is how it works:

The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter
The example below uses the weekday number to calculate the weekday name:

Example
int day = 4;
switch (day) {
  case 1:
    System.out.print("Monday");
    break;
  case 2:
    System.out.print("Tuesday");
    break;
  case 3:
    System.out.print("Wednesday");
    break;
  case 4:
    System.out.print("Thursday");
    break;
  case 5:
    System.out.print("Friday");
    break;
  case 6:
    System.out.print("Saturday");
    break;
  case 7:
    System.out.print("Sunday");
    break;
}
// Outputs "Thursday" (day 4)




The break Keyword 
When Java reaches a break keyword, it breaks out of the switch block.

This will stop the execution of more code and case testing inside the block.

When a match is found, and the job is done, it's time for a break. There is no need for more testing.

A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.



The default Keyword

example : =>


int day = 4;
switch (day) {
  case 6:
    System.out.print("Today is Saturday");
    break;
  case 7:
    System.out.print("Today is Sunday");
    break;
  default:
    System.out.print("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"




============================================================================



Java Switch Statement is fall-through

=>The Java switch statement is fall-through. It means it executes all statements after the first match if a    break statement is not present.



==>>> ???

Java Switch Statement with String
Java allows us to use strings in switch expression since Java SE 7. The case statement should be string literal.


Java Nested Switch Statement ===>>>

We can use switch statement inside other switch statement in Java. It is known as nested switch statement.



Java Enum in Switch Statement

Java allows us to use enum in switch statement. Java enum is a class that represent the group of constants. (immutable such as final variables). We use the keyword enum and put the constants in curly braces separated by comma.





Java Wrapper in Switch Statement
Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement.






===============================================================================================

Java For Loop
Java For Loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

SyntaxGet your own Java Server
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:

Example
for (int i = 0; i < 5; i++) {
  System.out.print(i);
}

Example explained
Statement 1 sets a variable before the loop starts (int i = 0).

Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 increases a value (i++) each time the code block in the loop has been executed.

Another Example
This example will only print even values between 0 and 10:

Example
for (int i = 0; i <= 10; i = i + 2) {
  System.out.print(i);
}

Nested Loops
It is also possible to place a loop inside another loop. This is called a nested loop.

The "inner loop" will be executed one time for each iteration of the "outer loop":

Example
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.print("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.print(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 





======JAVA T POINT=============================


Loops in Java
The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

There are three types of for loops in Java.

Loops in Java
Simple for Loop
For-each or Enhanced for Loop
Labeled for Loop
Java Simple for Loop
A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:

Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
Statement: The statement of the loop is executed each time until the second condition is false.
Syntax:


for(initialization; condition; increment/decrement){    
//statement or code to be executed    
}    
Flowchart:

for loop in java flowchart
Example:

ForExample.java

//Java Program to demonstrate the example of for loop  
//which prints table of 1  
public class ForExample {  
public static void main(String[] args) {  
    //Code of Java for loop  
    for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
}  
}  
Test it Now
Output:

1
2
3
4
5
6
7
8
9
10
Java Nested for Loop
If we have a for loop inside the another loop, it is known as nested for loop. The inner loop executes completely whenever outer loop executes.

Example:


NestedForExample.java

public class NestedForExample {  
public static void main(String[] args) {  
//loop of i  
for(int i=1;i<=3;i++){  
//loop of j  
for(int j=1;j<=3;j++){  
        System.out.println(i+" "+j);  
}//end of i  
}//end of j  
}  
}  
Output:

1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
Pyramid Example 1:

PyramidExample.java

public class PyramidExample {  
public static void main(String[] args) {  
for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  
}  
}  
Output:

* 
* * 
* * * 
* * * * 
* * * * * 
Pyramid Example 2:

PyramidExample2.java


public class PyramidExample2 {  
public static void main(String[] args) {  
int term=6;  
for(int i=1;i<=term;i++){  
for(int j=term;j>=i;j--){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  
}  
}  
Output:

* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*  
Java for-each Loop
The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

It works on the basis of elements and not the index. It returns element one by one in the defined variable.


Syntax:

for(data_type variable : array_name){    
//code to be executed    
}    
Example:

ForEachExample.java


//Java For-each loop example which prints the  
//elements of the array  
public class ForEachExample {  
public static void main(String[] args) {  
    //Declaring an array  
    int arr[]={12,23,44,56,78};  
    //Printing array using for-each loop  
    for(int i:arr){  
        System.out.print(i);  
    }  
}  
}  
Test it Now
Output:

12
23
44
56
78
Java Labeled For Loop
We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful while using the nested for loop as we can break/continue specific for loop.

Note: The break and continue keywords breaks or continues the innermost for loop respectively.
Syntax:


for(initialization; condition; increment/decrement){    
//code to be executed    
}    
Example:

LabeledForExample.java

//A Java program to demonstrate the use of labeled for loop  
public class LabeledForExample {  
public static void main(String[] args) {  
    //Using Label for outer and for loop  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.print(i+" "+j);  
                }  
        }  
}  
}  
Output:


1 1
1 2
1 3
2 1
If you use break bb;, it will break inner loop only which is the default behaviour of any loop.

LabeledForExample2.java

public class LabeledForExample2 {  
public static void main(String[] args) {  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break bb;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
}  
}  
Output:

1 1
1 2
1 3
2 1
3 1
3 2
3 3
Java Infinitive for Loop
If you use two semicolons ;; in the for loop, it will be infinitive for loop.

Syntax:

for(;;){  
//code to be executed  
}  
Example:


ForExample.java

//Java program to demonstrate the use of infinite for loop  
//which prints an statement  
public class ForExample {  
public static void main(String[] args) {  
    //Using no condition in for loop  
    for(;;){  
        System.out.println("infinitive loop");  
    }  
}  
}  
Output:

infinitive loop
infinitive loop
infinitive loop
infinitive loop
infinitive loop

Now, you need to press ctrl+c to exit from the program.

Java for Loop vs while Loop vs do-while Loop
Comparison	for loop	while loop	do-while loop
Introduction	The Java for loop is a control flow statement that iterates a part of the programs multiple times.	The Java while loop is a control flow statement that executes a part of the programs repeatedly on the basis of given boolean condition.	The Java do while loop is a control flow statement that executes a part of the programs at least once and the further execution depends upon the given boolean condition.
When to use	If the number of iteration is fixed, it is recommended to use for loop.	If the number of iteration is not fixed, it is recommended to use while loop.	If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use the do-while loop.
Syntax	for(init;condition;incr/decrement){
// code to be executed
}	while(condition){
//code to be executed
}	do{
//code to be executed
}while(condition);
Example	//for loop
for(int i=1;i<=10;i++){
System.out.println(i);
}	//while loop
int i=1;
while(i<=10){
System.out.println(i);
i++;
}	//do-while loop
int i=1;
do{
System.out.println(i);
i++;
}while(i<=10);
Syntax for infinitive loop	for(;;){
//code to be executed
}	while(true){
//code to be executed
}	do{
//code to be executed
}while(true);





----------------------------------------------  THE END -----------------------------------------------
