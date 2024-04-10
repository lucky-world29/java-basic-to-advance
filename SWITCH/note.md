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
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)

