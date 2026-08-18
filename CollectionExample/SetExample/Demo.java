package CollectionExample.SetExample;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
         
        Set set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        
        //same value can not be add only unique value is added
        set.add(10);
        System.out.println(set);
        

    }

}
