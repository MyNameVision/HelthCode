package StringsCode;

import java.util.Scanner;

public class pelindrome {
public static void main(String[]args){


    Scanner sc = new Scanner (System.in);
    System.out.println("Please Enter String :");
    String pelin = sc.nextLine();

    // Using String Buffer 
    StringBuffer sb = new StringBuffer(pelin);
   String rev = sb.reverse().toString();

   if(rev.equals(pelin)){
    System.out.println("StringBuilder :"+ "String is Pelindrome");

   }
   else {
         System.out.println("StringBuilder :"+"String is not Pelindrom!!");
     }
    
     
   // Using String Buffer
   StringBuilder sbn = new StringBuilder(pelin);
   String revString = sbn.reverse().toString();

     if(revString.equals(pelin)){
    System.out.println("StringBuffer :"+ "String is Pelindrome");
     }
   else {
         System.out.println("StringBuffer:"+"String is not Pelindrom!!");
     }

     sc.close();
}
}
