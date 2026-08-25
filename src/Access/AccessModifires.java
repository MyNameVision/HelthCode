package Access;
import UnderstandClass.LearnClass;
public class AccessModifires {

    /*
    public        --> Can be accessed from anywhere where the class itself is accessible.
    private       --> Same Class and Package only 
    protected     --> Same Class and Package only
    default       --> Same Class only 
     */
   public static void main(String[]args){
    LearnClass lc= new LearnClass();
    System.out.println(lc.name);
    LearnClass.number(10);
    lc.sample();
   }  
}
