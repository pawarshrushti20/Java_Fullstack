
package Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employee implements Comparable<Employee>{
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Employee that){
        if(this.id>that.id){
            return 1;

        }
        else{
            return -1;
        }

    }
}
public class EmployeeDetails1 {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(3, "Rajesh", 50000));
        emp.add(new Employee(1, "Khan", 30000));
        emp.add(new Employee(4, "Sharma", 60000));
        emp.add(new Employee(2, "Wasim", 45000));

        Collections.sort(emp);
        for(Object ob:emp){
            System.out.println(ob);
        }
    }

}