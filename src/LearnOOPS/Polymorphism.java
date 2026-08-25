package LearnOOPS;

public class Polymorphism {

    int add(int a,int b){
        return a+b;
    }
     int add(int a, int b,int c){
        return a+b+c;
    }

    static class animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }
    static class dog extends animal{
       @Override
        void sound(){
            System.out.println("Dog barks !!!");
        }
    }
public static void main(String []args){
    /*
    Polymorphism = One Thing Many Forms
    -------------------------------------------------
    Compile-time polymorphism → Method Overloading
    Runtime polymorphism → Method Overriding
    --------------------------------------------------
    Method Overloading : How to achive Method Overloading 
                         1.Number of parameters
                         2.Data types of parameters
                         3.Order of parameter data types

    Method Overriding  : How to achive Method Overriding
                         1. Child Extends Parent Class
                         2. Same Method and Parameters
                         3. Different Implimentation
     */
       Polymorphism pl = new Polymorphism();
     System.out.println("First add a+b = "+pl.add(10,20));
     System.out.println("Second add a+b+c = "+pl.add(10,20,30));
     
     animal a = new dog();
      a.sound();
}
}
