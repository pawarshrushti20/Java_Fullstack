
package Comparetor_Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
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

}

public class EmployeeDetails {
    public static void main(String[] args) {
        List emp = new ArrayList<>();
        emp.add(new Employee(3, "Kartik", 50000));
        emp.add(new Employee(4, "Sunil", 40000));
        emp.add(new Employee(2, "Rohit", 60000));
        emp.add(new Employee(1, "Sohail", 30000));
        emp.add(new Employee(5, "Vikas", 80000));

        // System.out.println(list); // prints in single line
        for (Object val : emp) {
            System.out.println(val);
        }

        /* 
        Comparator<Employee> com = new Comparator<>() {
            public int compare(Employee a, Employee b) {
                if (a.id > b.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        System.out.println("Sorting based on id ");
        Collections.sort(emp,com);
        for (Object val : emp) {
            System.out.println(val);
        }
            */

        System.out.println("Sorting based on ID ");
        Comparator<Employee> com2=(a,b)->Integer.compare(a.id, b.id);
        Collections.sort(emp,com2);
        for (Object val : emp) {
            System.out.println(val);
        }

        //write a program to sort name of employees

        Comparator<Employee> com3=new Comparator<>() {
            public int compare(Employee a,Employee b){
                if(a.name.length()>b.name.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        System.out.println("Sorting based on name length");
        Collections.sort(emp,com3);
        for (Object val : emp) {
            System.out.println(val);
        }

        Comparator<Employee> com4=new Comparator<>() {
            public int compare(Employee a,Employee b){
                if(a.sal>b.sal){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        System.out.println("Sorting based on salary");
        Collections.sort(emp,com4);
        for (Object val : emp) {
            System.out.println(val);
        }

        

    }

}