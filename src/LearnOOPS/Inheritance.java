package LearnOOPS;

import LearnOOPS.Abstraction.animal;

/*
Single Inheritance - Parent --> Child
Multilevel Inheritance - Chain of Inheritance {  GrandFather --> Father ---> Child }
Hierarchical Inheritance - Parent --> Child, Parent --> Another Child, Parent --> Another Child
Multiple Inheritance - Child extends multiple parents. Dog extends pet(parent), Animal(Parent)


*/
public class Inheritance {

// Single Inheritance
   class Animal{
        void  sound(){
            System.out.println("Animal Sound");
        }
    }
   class dog extends Animal{
       void eat(){
        System.out.println("Eating");
       }
   }

   
public static void main(String[]args){

}
}
