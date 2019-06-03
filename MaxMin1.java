
package max.min.pkg1;

public class MaxMin1 {

   public static void main(String[] args) {
       
       
      int[] a = { 6,7,1,5,12,32};
      int max=a[0];
      int min=a[0];
      
      
        for (int i = 0; i < a.length; i++)
      
      {
          if(a[i]>max)
          {
              max=a[i];
              
          }
          
      }   
      
      
      
        for (int i = 0; i < a.length; i++)
        {
          
          if(a[i]<min)
          {
              
             min=a[i];
              
          }
          
          
         
      } 
       System.out.println( "max:"+max+"\nmin:"+min); 
   }}