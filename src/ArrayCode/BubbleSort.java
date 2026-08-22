package ArrayCode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BubbleSort {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        // Sorting Numeric Elements
        int arr[] ={10,30,50,40,20};
       
        System.out.println("Array Element Before Sorting : ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array Elements after Sorting : ");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] >arr[j]){
                   int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
             }
            } 
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

     System.out.println();
     // Sorting String Elements 

      String name[] = {"Sitaram","Vishal","Suhas","Vaibhav","Chaitan"};
      
      System.out.println("Array Element Before Sorting : ");

        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }

        System.out.println();
        System.out.println("Array Elements after Sorting : ");

        for(int i=0;i<name.length;i++){
            for(int j=i+1;j<name.length;j++){
                if(name[i].compareTo(name[j])>0){
                  String temp = name[i];
                  name[i] = name[j];
                  name[j] = temp;
                }
            } 
        }

        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
      
         System.out.println();
        //  Find duplicate elements

          System.out.println("Please Enter The String");
          String str = sc.nextLine();

          char[] ch = str.toCharArray();

          System.out.println("Duplicate Characters From String are:");

          for (int i = 0; i < ch.length; i++) {

            boolean isDupli = false;

          for (int j = i + 1; j < ch.length; j++) {

         if (ch[i] == ch[j]) {
            isDupli = true;
            break;
        }
    }

        if (isDupli) {
        System.out.print(ch[i] + " ");
    }
}

               System.out.println();
               
             //     Remove duplicates String
              System.out.print("Duplicate Removed String are :");
              String names[] = {"Sitaram","Vishal","Vaibhav","Sitaram","Vaibhav"};
                   
              for (int i = 0; i < names.length; i++) {

              boolean isDuplicate = false;

             for (int j = 0; j < i; j++) {

             if (names[i].equals(names[j])) {
             isDuplicate = true;
             break;
        }
    }

             if (!isDuplicate) {
             System.out.print(names[i] + ", ");
    }
   }
             System.out.println();
          // Remove using hashSet
             System.out.println("Remove the Strings Using HashSet");
             Set<String> uniqueNames = new LinkedHashSet<>();

             for (String n : names) {
                 uniqueNames.add(n);
}

             System.out.println(uniqueNames);

             System.out.println();

       // Find Maximum element //Find maximum element

            int [] number = {70,40,45,101,23,45};
            int max =number[0];
            int min = number[0];

            for(int i=0;i<number.length;i++){
               if(number[i]>max){
                max = number[i];
               }
            }
            for(int i=0;i<number.length;i++){
               if(number[i]<min){
                min= number[i];
               }
            }
             System.out.println("Max Number is :" + max);
             System.out.println("Min Number is :" + min);
 
             // Second Largest
             Arrays.sort(number);
             int secondLargest = number[number.length - 2];
             System.out.println("Second Largest: " + secondLargest);

             // Second Smallest
             int secondSmallest = number[1];
             System.out.println("Second Smallest :"+ secondSmallest);
    
       sc.close();
    }
}
