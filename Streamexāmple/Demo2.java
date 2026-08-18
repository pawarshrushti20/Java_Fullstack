import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,20,14,05);

        // withou using stream api

        List<Integer> listeven=new ArrayList<>();
        System.out.println("without stream");
        for(Integer val:list)
        {
            if(val%2==0)
            {
                listeven.add(val);
            }
        }
        System.out.println("even number"+listeven);

        Stream<Integer> Streamlist=list.stream();
        List<Integer> streameven = Streamlist.filter(n -> n % 2 == 0).toList();
        System.out.println(streameven);

        Stream<Integer> streamlist=list.stream();
        List<Integer> streamodd= streamlist.filter(n->n%2!=0?true:false).toList();
        System.out.println(streamodd);


        // in one line laymbda exprestion 

        list.stream().filter(n->n%2==0).forEach(n->System.out.println(n+" "));

        

        // 










    }

}
