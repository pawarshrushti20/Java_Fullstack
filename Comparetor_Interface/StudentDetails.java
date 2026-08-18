package Comparetor_Interface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int id;
    String name;
    int marks;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }


    
}

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> list=new ArrayList();
        list.add(new Student(1, 78, "Rohan"));
        list.add(new Student(2, 89, "Rajesh"));
        list.add(new Student(4, 56, "Sunil"));
        list.add(new Student(3, 45, "Kartik"));

        // sorted by id 
        Comparator<Student> com=(a,b)->Integer.compare(a.id, b.id);

        Collections.sort(list,com);
        for(Object obj:list){
            System.out.println(obj);
        }

        Comparator<Student> com2;

        Collections.sort(list,(a,b)->a.name.length()>b.name.length()?1:-1);
        for(Object obj:list){
            System.out.println(obj);
        }

        // List<Integer> list2=Arrays.asList(45,32,43,21.12,65,76);
        List<Integer> listVal=Arrays.asList(23,53,23,44);
        System.out.println("Sorting integer values ");
        Comparator<Integer> com5=(a,b)->a>b?1:-1;
        Collections.sort(listVal);
        for(Integer val:listVal){
            System.out.println(val);
        }

    }

}