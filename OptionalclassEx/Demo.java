package OptionalclassEx;
import java.util.Optional;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<String>name=Arrays.asList("raj","om","rahul");
        List<String> name2=new ArrayList<>();
        Optional<String> name3=name.stream();
        Optional<String> name3=name3.stream().filter(n->n.contains("raj")).toString();
        System.out.println(name3);

        







        
    }

}
