interface maxmin
{
    int findmax(int a,int b);
}
public class Example4 {
    public static void main(String[] args) {
        maxmin m=(a,b)->
        {
            if(a>b)
            {
                return a;
            }
            else{
                return b;
            }
        };
        maxmin max = (a, b) -> (a > b) ? a : b;
        System.out.println(max.findmax(52, 12));

    }
    
}
