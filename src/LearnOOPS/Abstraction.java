package LearnOOPS;

/*
 Abstaction we achive Using two Methods :
 1. Abstract Class --> Create class and method using abstract keyword and without implimentation
                   --> Override the parent class in child class
                   --> at least one abstract method in abstract class

 2. Interface      --> Create Class using interface keyword
                   --> Impliment the parent class into child 
                   --> Override the method 

                   We accsses Abstract methods using reference object

*/
public class Abstraction {

    static abstract class animal{
        abstract void sound();
        void eating(){
            System.out.println("Eating....");
        }
    }

    static class dog extends animal{
        @Override
        void sound(){
            System.out.println("dog Barks");
        }
         void play(){
            System.out.println("Playing games");
         }
    }

    
   public interface Payments {
    void payusing();  // implicitly public abstract, no need to write it
}

static class Paymethods implements Payments {
    @Override
    public void payusing() {   // ✅ same name, public modifier
        System.out.println("PayUsing UPI");
    }
}
    public static void main(String[]args){
       animal an = new dog();
       an.sound();
       an.eating();

       dog d = new dog();
       d.play();
 
       Payments pay = new Paymethods();
       pay.payusing();
      
    }
}
