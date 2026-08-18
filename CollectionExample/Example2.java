package CollectionExample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

class Employee
{
    int id;
    String name;
    int sal;
    public Employee()
    {

    }
    public Employee(int id,String name,int sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
}



public class Example2 {
    public static void main(String[] args) {
        /*List<Integer> list=Arrays.asList(12,42,542);
        for(Integer i:list)
        {
            System.out.println(i);
        }
        
        Collections .sort(list);
        System.out.println(list);

        List<String> list2=Arrays.asList("abc","bcs","mca");
         
        for(String i:list2)
        {
            System.out.println(i);
        }
        Collections.sort(list2);
        System.out.println(list2);*/


        List emp=new ArrayList<>();
        emp.add(new Employee(1, "rahul", 13230));
        emp.add(new Employee(3, "rahul", 13230));
        emp.add(new Employee(4, "rahul", 13230));
        emp.add(new Employee(2, "rahul", 13230));


        for(int i=0;i<emp.size();i++)
        {
            System.out.println(emp);
        }





        



    }

}
