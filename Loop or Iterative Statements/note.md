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


----------------------------------------------  THE END -----------------------------------------------