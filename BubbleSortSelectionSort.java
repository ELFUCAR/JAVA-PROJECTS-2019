/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort.selection.sort;

/**
 *
 * @author Lenovo
 */
public class BubbleSortSelectionSort {
 static void bubbleSort(int[] arr) {
      int n = arr.length;
      int temp = 0;
      for(int i = 0; i < n; i++) {
         for(int j=1; j < (n-i); j++) {
            if(arr[j-1] > arr[j]) { 
               temp = arr[j-1]; 
               arr[j-1] = arr[j];
               arr[j] = temp;
            } 
         } 
      } 
   }  
   
   //--------------
   static int getMin(int[] arr, int start)
        {
            int min = arr[start];
            int minIndex = start;
            for (int i = start+1; i < arr.length; i++)
                if (arr[i] < min)
                { 
                    min = arr[i];
                    minIndex = i;
                }
            return minIndex;
        }
   
   //--------------
   
   static void selectionSort(int[] tab) {
      for (int i=0; i<tab.length; i++)
            {
                int tmp = tab[i];
                int  minIndex = getMin(tab, i);
                if(i != minIndex)
                {
                    tab[i] = tab[minIndex];
                    tab[minIndex] = tmp;
                }
                
            }
       }
   
   
   
   //----------------
   
   public static void main(String[] args) {
      int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 }; 
      System.out.println("Array Before Sort");
      
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      } 
      System.out.println();
      //bubbleSort(arr);
      selectionSort(arr);
      System.out.println("Array After Sort");
      
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      } 
   }  
}
