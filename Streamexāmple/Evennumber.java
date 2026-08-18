import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class Evennumber {
    public static void main(String[] args) {

        //filter method

        List<Integer> list=Arrays.asList(1,2,6,7,8);
        List<Integer>evennumber=list.stream().filter(n->n%2==0).toList();
        System.out.println("even number"+evennumber);

        /// only stream

        Stream<Integer> stream=list.stream();
        stream.forEach(n->System.out.println(n));


        //using map method 

        List<Integer> mul=new ArrayList<>();
        for(Integer num:list)
        {
            mul.add(num*2);
        }
        System.out.println(mul);
        


        list.stream().map(b->b*2).forEach(n->System.out.println(mul));

        

        




    }

}
