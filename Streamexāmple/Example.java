import java.util.ArrayList;
import java.util.random.*;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        int size=1000;
         List<Integer> number=new ArrayList<>(size);
         long parStream=System.currentTimeMillis();
        int result=number.parallelStream().map(n->n*2).reduce(0,(a,b)->a+b);
        long parend=System.currentTimeMillis();

        long seqStream=System.currentTimeMillis();
        int result1=number.stream().map(n->n*2).reduce(0,(a,b)->a+b);
        long seqEnd=System.currentTimeMillis();


    }


}
