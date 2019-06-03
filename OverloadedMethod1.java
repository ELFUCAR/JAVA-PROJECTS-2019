
package overloadedmethod1;


public class OverloadedMethod1 {

class MyClass {
    
    
   int height;
   
   
   MyClass() {
      System.out.println("bricks");
      height = 0;
   }
   
   
   
   MyClass(int i) {
      System.out.println("Building new House that is " + i + " feet tall");
      height = i;
   }
   
   
  void info()
   {
      System.out.println("House is " + height + " feet tall");
      
   }
   
   
   
  void info(String s)
   {
      System.out.println(s + ": House is " + height + " feet tall");
   }
   
   
    String info(String s1,String s2)
   {
       return s1+s2;
   }
 
}



   public static void main(String[] args) {
      MyClass t = new MyClass(0);
      t.info();
      t.info("overloaded method");
      System.out.println(t.info("Today ","is Friday."));
      
      //Overloaded constructor:
      new MyClass();
   }
}