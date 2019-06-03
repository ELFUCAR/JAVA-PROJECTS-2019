
package factorial1;


public class Factorial1 {

    
    
   public static void main(String args[])
   
   {
      for (int counter = 0; counter <= 10; counter++) 
      {
         System.out.printf("%d! = %d\n", counter, factorial1(counter));
         
         
      }
      
      System.out.println("--------------------------");
      for (int counter = 0; counter <= 10; counter++) 
      {
         System.out.printf("%d! = %d\n", counter, factorial2(counter));
         
         
      }
   }
  
   public static long factorial1(long number)
   
   {
      if (number <= 1) return 1;
      else return number * factorial1(number - 1);
   
   }
   

   public static long factorial2(int number)
   
   {
      
      int factorial = number;
      
      for(int i = (number - 1); i > 1; i--)
      {
         factorial = factorial * i;
      } 
      
   return factorial;
  
   } 
    
}
