 //DERS ÖRNEKLERİ 
package pkg14052019example1;

public class Main {

    public static void main(String []args){
        
 //------FIRST EXAMPLE-------
      String s11 = "tutorialspoint";
      String s2 = "tutorialspoint";
      String s3 = new String ("Tutorials Point");
      System.out.println(s11==(s2));
      System.out.println(s2.equals(s3));
      
//-------SECOND EXAMPLE--------      
      String str = "Hello World Hello World";
      System.out.println( str.replace( 'H','W' ) );
      System.out.println( str.replaceFirst("He", "Wa") );
      System.out.println( str.replaceAll("He", "Ha") ); 
      
//-------THİRD EXAMPLE----------
       
      String s = "Elif Uçar";
      String s1= s.substring(0,2)+s.substring(5,7);
    
      System.out.println(s+"--->"+s1);
    
      System.out.println(s.substring(0,2));
      System.out.println(s.substring(5,7));
      
      //  System.out.println( removeCharAt( str,3 ) );
    //  System.out.println( removeCharAt( str,2) );
    //  System.out.println( removeCharAt( "ELİF",3 ) );
      //}
     
     // public static String removeCharAt(String s,int pos){
        //  return s.substring(0,pos)+s.substring(pos+1);
    
///---------FOURTH EXAMPLE------
    
      
      String word = "İstanbul";
      String strOrig="This city is called İstanbul.It is a big city";
      
      int intindex=strOrig.indexOf("İstanbul");

        if(intindex==-1)
            {
                System.out.println(word +"Not Found");
            }
            else{
             System.out.println("Found "+word+" at index "+intindex);
}
  
   }
}