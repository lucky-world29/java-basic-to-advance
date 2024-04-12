

Loops
Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

Java While Loop
The while loop loops through a block of code as long as a specified condition is true:



Syntax:
while (condition) {
  // code block to be executed
}

Example 


int i = 0;
while (i < 5) {
  System.out.print(i);
  i++;
}



The Do/While Loop
The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

Syntax
do {
  // code block to be executed
}
while (condition);


Example
int i = 0;
do {
  System.out.print(i);
  i++;
}
while (i < 5);


Java Infinitive While Loop
If you pass true in the while loop, it will be infinitive while loop.


Syntax:

while(true){  
//code to be executed  
}  


WhileExample2.java


public class WhileExample2 {    
public static void main(String[] args) {   
 // setting the infinite while loop by passing true to the condition  
    while(true){    
        System.out.println("infinitive while loop");    
    }    
}    
}    
Output:

infinitive while loop
infinitive while loop
infinitive while loop
infinitive while loop
infinitive while loop
ctrl+c
In the above code, we need to enter Ctrl + C command to terminate the infinite loop.



===========================================================================================================




Java do-while Loop
The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.


Syntax:

do{    
//code to be executed / loop body  
//update statement   
}while (condition);    



The different parts of do-while loop:




1. Condition: It is an expression which is tested. If the condition is true, the loop body is executed and control goes to update expression. As soon as the condition becomes false, loop breaks automatically.

Example:

i <=100

2. Update expression: Every time the loop body is executed, the this expression increments or decrements loop variable.

Example:

i++;



===== Note: The do block is executed at least once, even if the condition is false.=====




Java Infinitive do-while Loop
If you pass true in the do-while loop, it will be infinitive do-while loop.

Syntax:

do{  
//code to be executed  
}while(true);  








=============================================================================================



Java Break Statement
When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.

The Java break statement is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.

We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.



syntax

jump-statement;    
break; 




Java Break Statement with Inner Loop
It breaks inner loop only if you use break statement inside the inner loop.



Java Break Statement with Labeled For Loop
We can use break statement with a label. The feature is introduced since JDK 1.5. So, we can break any loop in Java now whether it is outer or inner loop.