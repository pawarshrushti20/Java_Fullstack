
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceExample {
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(11,14,45,2);
        list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        System.out.println();

        System.out.println("odd number");

        list.stream().filter(n->n%2==1).forEach(n->System.out.println(n));

       //using map
        System.out.println("multiply by 2");
        list.stream().map(n->n*2).forEach(n->System.out.println(n));

        // reduce method 

       int sum= list.stream().reduce(0,(a,b)->a+b);
       System.out.println("sum of number="+sum);

       // using binaryopertor 
       BinaryOperator<Integer> bi=(a,b)->a+b;
       int result=list.stream().reduce(0,bi);
       System.out.println(result);

       //parallelstream



    }

}
