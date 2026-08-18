package Comparetor_Interface;

import java.util.*;
public class Demo2
{
    public static void main(String[] args) {
         List<Integer> list=Arrays.asList(23,24,12,1,2);
         Comparator<Integer> com=(Integer b,Integer c)->c<b?-1:1;
         Collections.sort(list,com);
         System.out.println(list);

         Collections.sort(list,(b,c)->Integer.compare(b,c));
         System.out.println(list);
    }

}

