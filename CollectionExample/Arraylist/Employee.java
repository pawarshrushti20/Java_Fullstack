package CollectionExample.Arraylist;

import java.util.ArrayList;
import java.util.List;

class Employee{
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
