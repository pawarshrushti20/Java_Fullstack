package Comparetor_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listofstring {
    public static void main(String[] args) {

        List<String> str=Arrays.asList("shrushti","rakshaa","pooja");
        System.out.println(str);
        Collections.sort(str);
        System.out.println("sorted String="+str);

        // sort base on letter of string 
       
        Comparator <String>com =new Comparator<>() {
            public int compare(String a,String b)
            {
                if(a.length()>b.length())
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        };
        Collections.sort(str,com);

        System.out.println("sorting string based on length"+str);

        // laymbda Expretion

        Comparator<String> com2=(String a,String b)->Integer.compare(a.length(),b.length());
        Collections.sort(str,com2);
        System.out.println("sorting based on integer class compre method ="+str);
        










        
    }

}

