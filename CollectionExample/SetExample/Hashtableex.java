package CollectionExample.SetExample;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Hashtable;

public class Hashtableex {
    public static void main(String[] args) {
        
        
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(101, "Pooja");
        ht.put(102, "Rahul");
        ht.put(103, "Amit");
        // Throw nullpointer exception 
        //    ht.put(null, "om");
        //       ht.put(103, "null");

        System.out.println(ht);

       boolean check= ht.contains("Rahul");
       System.out.println(check);
    }


    }


