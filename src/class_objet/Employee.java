package class_objet;

public class Employee {
    String name;
    double salary;
    public  Employee(String n,double s){
      name=n;
      salary=s;
    }
    public double annualSalary(){
       return  salary*12;
    }
    public  void display(){
        System.out.println("name: "+name);
        System.out.println("salary: "+ salary);
        System.out.println("annualSalary: "+annualSalary());
    }
}
