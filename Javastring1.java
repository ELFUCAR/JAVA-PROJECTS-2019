
package javastring1;


public class Javastring1 {

   
    public static void main(String[] args) {
    
            String stringDeger = new String("Merhaba,Benim Adım Elifoo Uçar");
 
                char charDeger = stringDeger.charAt(9);
 
                String substringDeger = stringDeger.substring(8);
                System.out.println(substringDeger);

                String subStringDeger = stringDeger.substring(8,18);
                System.out.println(substringDeger);

        
                
                
                
            String stringDeger3 = "\n My name is Elif Uçar.";
            System.out.println(stringDeger3.toUpperCase());

            System.out.println(stringDeger3.toLowerCase());
            
            
            
            
           
String stringDeger4 = "ı am from Turkey\n";
System.out.println(stringDeger4.toUpperCase());
System.out.println(stringDeger4.toLowerCase());


         


String stringDeger5 = "I am from Sivas";
boolean even1 = stringDeger5.equals("I am from Sivas.");
System.out.println(even1);

boolean even2 = stringDeger5.equals("i am from Sivas.");
System.out.println(even2);

boolean even3 = stringDeger5.equalsIgnoreCase("i am from Sivas."); 
System.out.println(even3);





            
            

        
    }
    
}
