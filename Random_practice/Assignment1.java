package Random_practice;

import java.util.Scanner;
class Assignment1 {
   
  static void even_odd(int x){
    if(x%2==0){
       System.out.println("number is even");
    }else{
       System.out.println("number is odd");
     }  
   }
 
static void negative_positive(int x){
   
    if(x>0){
  System.out.println("number is positive");

}else if(x<0){
   System.out.println("number is negative");
}else{
 System.out.println("number is zero");
}

      }
   

static void find_prime(int x){
     boolean isPrime = true;
     
     if(x<1){
    System.out.println("number is zero or negative.please enter another number");
 }else{
  for(int i=2;i<x;i++){
   if(x%i==0){
      isPrime = false;
}
  }if (isPrime){
 System.out.println("given number is prime");
} else{
 System.out.println("given number is not prime");
}
 }

}
  public static void main(String args[]){
    
      Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
      int num1=sc.nextInt();
         even_odd(num1);
         negative_positive(num1);
         find_prime(num1);
    }
  }

