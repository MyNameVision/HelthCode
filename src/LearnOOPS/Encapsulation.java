package LearnOOPS;

public class Encapsulation {

   static class Student {
       
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
             if (age >= 0) {
            this.age = age;
        }
        }
    }
    

public static void main(String[]args){
   
    // Encapsulation = hiding data + controlling access to that data
    // We cannot change Data direclty
    Student st = new Student();
  //  st.setAge(30);
     st.age = 25;
    System.out.println("Age :"+st.getAge());

}
}
