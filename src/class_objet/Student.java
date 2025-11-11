package class_objet;

public class Student {
   String  name;
   int age;
   String grade;
   public Student(String name,int age,String grade){
       this.age=age;
       this.name=name;
       this.grade=grade;
   }
   public void displayInfo(){
       System.out.println(name + age +grade);
   }

}
