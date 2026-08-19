package StringsCode;

import java.util.Scanner;

public class duplicateString {
public static void main(String[]args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter input : ");
     String name = sc.nextLine();

    // Remove Duplicate Characters from String
    String duplicate ="";
    for(int i=0;i< name.length();i++){
        char ch = name.charAt(i);
        if(duplicate.indexOf(ch)==-1){
            duplicate = duplicate+ch;
        }
       
    }
     System.out.println("String After Removing Duplicates :"+ duplicate);
   

     // Calculate the Vowels and Consonants
     int vowels = 0;
     int consonant = 0;
     int dupli = 0;
for(int i=0;i<name.length();i++){
    char ch = name.charAt(i);

    if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
        vowels ++;

    }
    else{
        consonant ++;
    }
    
}
     System.out.println("Count of Vowels : "+ vowels);
     System.out.println("Count of Consonents : "+consonant);

     // Calculate the Duplicate count of characters from String
    for(int k=0;k<name.length();k++){
        for(int j=k+1;j<name.length();j++){
            
            if(name.charAt(k)==name.charAt(j)){
                dupli ++;
            }

        }
       
    }
     System.out.println("Count of Duplicate Characters : "+dupli);

sc.close();
}   
}
