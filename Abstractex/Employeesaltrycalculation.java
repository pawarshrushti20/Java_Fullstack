package Abstractex;

abstract class Manager
{
    int id;
    String name;
    double salary;
   Manager(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
 abstract public void  showdetails();
 abstract void calculatesalary();


}
class Employee extends Manager
{
    int bonus;
    Employee(int id,String name,double salary,int bonus)
    {
        super(id, name, salary);
        this.bonus=bonus;
       
    }
    public void showdetails()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }
    public void calculatesalary()
    {
        salary=salary+bonus;
        System.out.println("employee salary="+salary);
    }

}
public class Employeesaltrycalculation {
     public static void main(String[] args) {
        Employee e=new Employee(1, "rahul", 20000, 200);
        e.showdetails();
        e.calculatesalary();
        
    }

}
