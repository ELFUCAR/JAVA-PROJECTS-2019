//DERS ÖRNEKLER DEVAMI-1
package pkg14052019example2;
public class Main {

    public static void main(String[] args) {
        
//--------FIRST EXAMPLE---------
     String word1 = "wtorek";
      String word2 = "wtorek";
      
      String s="Todat is wtorek.Tomorrow is sroda.";
      System.out.println(s);
                
      
      
      int i1=s.indexOf(word1);
      int i2=s.indexOf(word2);
    

    if(i1==-1)
    {
         System.out.println(word1 +"Not Found");
                }
        else{   
                System.out.println("Found "+ word1 +" at index "+i1);
            }

    
    System.out.println("-----------");
    
  //---------SECOND EXAMPLE-----------
  
        String word11 = "wtorek";
      String word22 = "wtorek";
      String word33="Tuesday";
 
      
      String ss="Today is wtorek.Tomorrow is sroda.";
      System.out.println(ss);
  
      int i11=ss.indexOf(word11);
      int i22=ss.indexOf(word22);
      
    if(i11==-1||i22==-1)
    {
         System.out.println(word11 +"Not Found");
                }
        else{   
            
                System.out.println(ss.replace(word11,word33));
        }
 //-----------THIRD EXAMPLE------------------
 
 
 
 
 
 
 
    
   }

}

