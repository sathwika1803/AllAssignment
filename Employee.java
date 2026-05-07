public class Employee {
    String name;
    int Salary;


    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="sathwika";
        e1.Salary=2500;
        Employee e2=new Employee();
        e2.name="Rathkanthi";
        e2.Salary=2700;
        e1.display();
        e2.display();

    }
    public  void display() {
        System.out.println(name+ " "+ Salary);
    }
    
}
