package Comparable;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evenlist {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(2,3,4,5,6,7,8,9,10,12,13,43,14);

        List<Integer> even=new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

       for(Integer num:numbers){
        if(num%2 == 0){
            even.add(num);
        }
        else{
            odd.add(num);
        }
       }

       System.out.println("Print Even Numbers ");
       for(Integer n:even){
        System.out.print(n+" ");
       }
       System.out.println();

       System.out.println("Printing Odd Numbers ");
       for(Integer n:odd){
        System.out.print(n+" ");
       }

       List<Integer> listMul=new ArrayList<>();
       for(Integer n:numbers){
        listMul.add(n*2);
       }

       System.out.println("\nPrinting Multiplication of 2 =  ");
       for(Integer n:listMul){
        System.out.print(n+" ");
       }

       
       int sum = 0;
       for(Integer n:numbers){
        sum=sum+n;
       }
       System.out.println("\nSum of all numbers in List = "+sum);




    }

}