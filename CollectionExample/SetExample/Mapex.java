package CollectionExample.SetExample;

import java.util.HashMap;
import java.util.Map;

public class Mapex {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put(1, "rahul");

        map.put(2, "rahul");

        map.put(null, "rahul");
        System.out.println(map);

        System.out.println(map.get(null));

          map.put(2, "hello");
          System.out.println(map.get(2));
          map.keySet();

          
         







        
    }

}
