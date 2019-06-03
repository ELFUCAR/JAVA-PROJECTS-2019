/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17052019examples1;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws Exception {
        
        
  //--------FIRST EXAMPLE----------------
      int array[] = { 2, 5, -2,2, 6, -3, 8, 0, -7, -9, 4 };
      Arrays.sort(array);
      printArray("Sorted array", array);
      
      
      int looking = 2;
      int index = Arrays.binarySearch(array, looking);
      
      if (index<0){
          
          System.out.println(looking+" not found");
     }
     else{
       System.out.println("Found "+looking+" at position " + index);
     }
   }
   private static void printArray(String message, int array[]) {
      System.out.println(message + ": [length: " + array.length + "]");
      
      for (int i = 0; i < array.length; i++) {
         if(i != 0) {
            System.out.print(", ");
         }
         System.out.print(array[i]);                     
      }
      System.out.println();
      
    //--------SECOND EXAMPLE--------------- 
      
      
      
      
      
      
   }
}