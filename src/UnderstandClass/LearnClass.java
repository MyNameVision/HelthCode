package UnderstandClass;

public class LearnClass {


    /* Important notes about Class Access 
    Public class ------> same class,same package and different package 
    Default Class ------> same class and same package only
    Private and Protected ------> we use for Nested classes. 

    How To Access Class
    1. Same class ---> Create Object of class
    2. Same Package
    3. Different Package ----> import package.class
    
    */

  String name ="Sitaram";       

static void number(int n){         // N is Parameter
   for(int i =0;i<n;i++){
    System.out.print(i + " ");
   }
}

void sample(){
    System.out.println("this is non-static method");
}

public static void main (String[]args){

LearnClass lc = new LearnClass();

System.out.println(lc.name);

// Static methods we can access directly but for non-static methods we need to create object of class
number(10);  // Value of N is Argument

lc.sample();

}

}

