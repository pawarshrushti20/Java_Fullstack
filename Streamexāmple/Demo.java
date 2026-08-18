import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,45,10,15);
        Stream<Integer> stream;
        List<Integer> even=new ArrayList<>();
        for(Integer i:list)
        {
            if(i%2==0)
            {
                even.add(i);
            }

        }
        for( Integer i: even)
        {
            System.out.println(i);
        }
        List<Integer> streameven=new ArrayList<>();

        Stream<Integer> Stream=list.stream();
        Predicate<Integer> p= b->b%2==0?true:false;
        Stream.filter(p);
        System.out.println(streameven);
    }

}
