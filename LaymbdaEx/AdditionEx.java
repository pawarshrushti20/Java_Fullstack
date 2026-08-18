interface add
{
    int sum(int a,int b);
}
public class AdditionEx {
    public static void main(String[] args) {
        add s=(a,b)->a+b;
        int result=s.sum(20,10);
        System.out.println("additon of number"+result);
    }

}
