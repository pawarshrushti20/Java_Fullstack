package CollectionExample.Arraylist;

import java.util.ArrayList;
import java.util.List;
public class Ex2
{
    public static void main(String[] args) {
        /* 
        List<Integer> list=Arrays.asList(12,42,32,42,3,3243,42);

        System.out.println("Printing values ");
        for(Integer i:list){
            System.out.println(i);
        }

        Collections.sort(list);
        System.out.println(list);

        System.out.println("Printing names ");
        List<String> list2=Arrays.asList("Abc","Rajesh","Sunil","Om","Kartik");
        for(String i:list2){
            System.out.println(i);
        }

        Collections.sort(list2)
        System.out.println(list2);
        */

        List emp=new ArrayList<>();
        emp.add(new Employee(1, "Suresh", 30_000));
        emp.add(new Employee(3, "Rohit", 40000));
        emp.add(new Employee(4, "Rajes", 50_000));
        emp.add(new Employee(2, "Sharma", 20000));
        emp.add(new Employee(5, "Mohan", 25_000));
        emp.add(new Employee(6, "Mohit", 15000));
        
        for(int i=0;i<emp.size();i++){
            System.out.println(emp);
        }
    }
}
