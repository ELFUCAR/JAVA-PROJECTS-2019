/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse1;

/**
 *
 * @author Lenovo
 */
public class Reverse1 {

 public static void main(String[] args) {
       
       
      int[] numbers = { 1,3,2,5};
      System.out.println("Array before reverse:");
      
      
        for (int i = 0; i < numbers.length; i++)
      
      {
         System.out.print(numbers[i] + " ");
      } 
      
      
       System.out.println("\n");
      
    /*  for(int i=0;i<numbers.length;i++)
      {
           numbers[i]=numbers[i]*numbers[i];
          
      }  */
      
      
      
   /*   for (int i = 0; i < numbers.length; i++)
      
      {
         System.out.print(numbers[i] + " ");
      } 
     */ 
      
      for (int i = 0; i < numbers.length / 2; i++) 
      
      {
         int temp = numbers[i];
         numbers[i] = numbers[numbers.length - 1 - i];
         numbers[numbers.length - 1 - i] = temp;
      } 
      
      
      
      System.out.println("\nArray after reverse:");
      
      
     for (int i = 0; i < numbers.length; i++)
      
      {
         System.out.print(numbers[i] + " ");
      }
      
      
      
   }
}