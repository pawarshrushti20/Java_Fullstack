package Comparetor_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(23,24,12,1,2);
        System.out.println("orignal list"+list);
        System.out.println();
        Collections.sort(list);
        System.out.println("sorted list"+list);


        Comparator<Integer> com=new Comparator<>() {
            public int compare(Integer a,Integer b)
            {
                // asending order
                if(a%10>b%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            

            
        };

        Collections.sort(list,com);
        System.out.println(list);
        

        //laymbda Expretion
        
      Comparator<Integer> com2=(Integer c,Integer d)->
      {
        if(c%10>d%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
      };
      
        Collections.sort(list,com2);
        System.out.println("sorted bsed on laymbda Expretion "+list);

        Collections.sort(list,com2);
        System.out.println("Sorted list based on lamda excpressions = "+list);
    

        //lamda expression bitwise op
        Comparator<Integer> com3=(Integer a,Integer b)->a<b?-1:1;
        Collections.sort(list,com3);
        System.out.println("Using Lamda expression and bitwise op sorting based on value "+list);

        Comparator<Integer> com4=(a,b)->Integer.compare(a, b);
        Collections.sort(list,com4);
        System.out.println("Using Lamda expression and Integer class compare method sorting based on value "+list);


        Collections.sort(list,(a,b)->Integer.compare(a, b));
        System.out.println("Sorting list while writing in sort method ="+list);

        Collections.sort(list,(a,b)->a>b?1:-1);
        System.out.println("Sorting list while writing in sort method using bitwise op ="+list);

        Comparator<Integer> desc = new Comparator<>() {
            public int compare(Integer a, Integer b) {
                if(a%10>b%10){
                    return -1;
                } 
                else {
                    return 1;
                }
            }
        };
        Collections.sort(list,desc);
        System.out.println("Descending order based on second digit = "+list);

        int max = Integer.compare(30, 20);
        System.out.println( max);
    }

}
        