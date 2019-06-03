/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci1;

/**
 *
 * @author Lenovo
 */
public class Fibonacci1 {


   public static long fibonacci(long number) {
      if ((number == 0) || (number == 1)) return number;
      else return fibonacci(number - 1) + fibonacci(number - 2);
   }

   public static long fibonacci2(int number) {
      
      long result=0;
      
          
      long a=1;
      long b=1;
      
      
      if (number == 0) 
      
         result=0;
         
      if ((number == 1)|| number==2) 
      
       result= 1;
      
 
      for(int i=3;i<=number;i++)
      {
          
          
          result=a+b;
          b=a;
          a=result;
          
          
      }
      
    return result;  
   }
   

   
   public static void main(String[] args) {
       
      for (int counter = 0; counter <= 10; counter++){
         System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
      }
       
      System.out.println("\n--------------------------------------------------");
      for (int counter = 0; counter <= 10; counter++){
         System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci2(counter));
      }
      
   
      
   }
}