package CollectionExample.Arraylist;



import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add("Hello");
        list.add(true);
        list.add(23.54);
        list.add('C');

        System.out.println(list);
        int res =(int) list.get(1);
        System.out.println(res);
        String str=(String)list.get(6);
        System.out.println(str);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(Object val:list){
            System.out.println(val);
        }

        list.add(2, 80);
        System.out.println(list);
        list.add(0, 100);
        System.out.println(list);

        list.addFirst(2000);
        System.out.println(list);

        list.addLast(200);
        System.out.println(list);

        boolean b=list.contains(2000);
        System.out.println(list.contains(200));

        list.add(Integer.valueOf(30));

        list.contains(Integer.valueOf(30));
        System.out.println("Using for each method");
        
        list.forEach((o)->System.out.println(o));

        int size1=list.size();
        System.out.println(size1);

        Object ob=list.getFirst();
        System.out.println(ob);

        System.out.println(list.getClass());

        int hashcode = list.hashCode();
        System.out.println(hashcode);
    
        boolean check = list.isEmpty();
        System.out.println(check);

        System.out.println(list.indexOf(10)); // 2 or true

        list.remove(10);
        System.out.println(list);
        list.remove("Hello");
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }

}