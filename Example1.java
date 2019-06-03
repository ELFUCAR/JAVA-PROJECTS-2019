/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

class Countries {
   enum SelectionCountry{ TURKEY,SPAIN,ITALY,FRANCE }
   SelectionCountry country;
}

public class Example1 {

   public static void main(String args[]) {
      Countries igo = new Countries();
      igo.country=Countries.SelectionCountry.TURKEY ;
      
      Countries C1 = new Countries();
      C1.country=Countries.SelectionCountry.SPAIN ;
      
      
      
      System.out.println("I WILL GO TO  " + igo.country);
      System.out.println("I WILL GO TO  " + C1.country);
   }
}