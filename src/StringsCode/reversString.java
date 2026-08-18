package StringsCode;

import java.util.Scanner;

public class reversString {

public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
     System.out.println("Please Enter input String : ");
    String name = sc.nextLine();
    
    String reverse ="";
    // Using for loop
    for(int i=name.length()-1;i>=0;i--){
         reverse = reverse + name.charAt(i);
    }  
    System.out.println("Reverse the string Using For LooP: "+ reverse);  

    // Using String Builder
    StringBuilder sb = new StringBuilder(name);
    System.out.println("Print the reverse string using Stringbuilder :"+sb.reverse());

    // Using String Buffer
    StringBuffer sbn = new StringBuffer(name);
    System.out.println("Print Reverse String Using String Buffer : "+sbn.reverse());

    // By Using Array
    char arr[] = name.toCharArray();
    int start=0;;
    int end= arr.length-1;

    while (start<end){
        char temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;

        start ++;
        end --;
    }
    System.out.println("Reverse the string using Array : "+new String(arr));
    sc.close();
}
}
