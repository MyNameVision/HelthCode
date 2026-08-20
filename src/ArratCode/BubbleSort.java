package ArratCode;

public class BubbleSort {

    public static void main(String[] args) {
     
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


        /*
          Find duplicate elements
          Remove duplicates
          Find maximum element
          Find minimum element
          Find second largest element
          Find second smallest element
        */
    }
}
