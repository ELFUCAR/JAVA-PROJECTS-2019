/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime1;


   import java.text.DateFormat;
import java.util.*;

public class DateTime1 {


   public static void main(String[] args) throws Exception {
      Date d1 = new Date();
      System.out.println("today is "+ d1.toString());    
      
      
      
      
      Locale locPolish = new Locale("pl");
      DateFormat df1 = DateFormat.getDateInstance (DateFormat.FULL, locPolish);
      System.out.println("today is in Polish Language : "+ df1.format(d1));
   
       
       
      Locale locTurkish = new Locale("tr");
      DateFormat df2 = DateFormat.getDateInstance (DateFormat.FULL, locTurkish);
      System.out.println("today is in Turkish Language : "+ df2.format(d1));
   
       
       
      Locale locSpanish = new Locale("es");
      DateFormat df3 = DateFormat.getDateInstance (DateFormat.FULL, locSpanish);
      System.out.println("today is in Spanish Language : "+ df3.format(d1));
   
   
      Locale locKorean = new Locale("kr");
      DateFormat df4 = DateFormat.getDateInstance (DateFormat.FULL, locKorean);
      System.out.println("today is in Korean Language : "+ df4.format(d1));
   
       
      Locale locChinese = new Locale("cn");
      DateFormat df5 = DateFormat.getDateInstance (DateFormat.FULL, locChinese);
      System.out.println("today is in Chinese Language : "+ df5.format(d1));
   
       
       
       
   }
}