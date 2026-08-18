package CollectionExample;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Demo {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add("hello");
        list.add('a');
        System.out.println(list);
        int res=(int) list.get(1);
        System.out.println(res);
        String str=(String)list.get(2);
        System.out.println(str);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        for(Object val:list)
        {
            System.out.println(val);
        }
        list.add(2,20);
        System.out.println(list);
        list.addFirst(2000);
        System.out.println(list);
        boolean b=list.contains(22220);
        System.out.println(b);
        
        // wrapper class is used to converiting boxing 
        /*list.add(Integer.valueOf(30));
        list.contains(Integer.valueOf(30));


        // consumer is interface used for laybda expretion and annomus class
        Consumer  consumer=new Consumer<>() {
            public void accept(Object a)
            {
                System.out.println(a);
            }
        };

        list.forEach(consumer);
        int size1=list.size();
        System.out.println(size1);
        /* */
        Object obj=list.getFirst();
        System.out.println(obj);
    
        System.out.println(list.getClass());

        int hashcode=list.hashCode();
        System.out.println(hashcode);

        boolean check=list.isEmpty();
        System.out.println(check);

        System.out.println(list.indexOf(10));

        list.remove(10);
        System.out.println(list);

        list.clear();
        System.out.println(list);









    }

}
