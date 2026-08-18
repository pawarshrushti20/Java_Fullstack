package CollectionExample.SetExample;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set set=new TreeSet<>();
        set.add(10);
        set.add(300);
        set.add(100);
        set.add(30);
        set.add(60);
        set.add(40);
        set.add(70);
        set.add(400);
        // set.add(null); // throw run time exceptions
        // set.add(null); //// throw run time exceptions
        set.add(10);
        System.out.println(set);
        
    }
}