interface addition
{
    int add(int a,int b);
}
public class Exmple3 {
    public static void main(String[] args) {
        addition sum = (a, b) -> a + b;

        int result = sum.add(10, 20);

        System.out.println("Addition = " + result);
    }
    
}
