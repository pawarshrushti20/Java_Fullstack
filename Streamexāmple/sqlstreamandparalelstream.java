import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sqlstreamandparalelstream {

    public static void main(String[] args) {
         int size = 1000;
        List<Integer> numbers = new ArrayList<>(size);

        Random random=new Random();
        for(int i=0;i<size;i++){
            numbers.add(random.nextInt(100));
        }

        // for(Integer val:numbers){
        //     System.out.println(val);
        // }

        long seqStart= System.currentTimeMillis();
        int result = numbers.stream().map(n->n*2).mapToInt(n-> n).reduce(0,(a,b)->a+b);
        long seqEnd =System.currentTimeMillis();


        long parStart= System.currentTimeMillis();
        int result2 = numbers.parallelStream().map(n->n*2).mapToInt(n->n).reduce(0,(a,b)->a+b);
        long parEnd =System.currentTimeMillis();

        System.out.println(result + " "+result2);
        System.out.println("seq stream time = "+(seqEnd-seqStart));
        System.out.println("Parallel stream time = "+(parEnd-parStart));
    }
}
