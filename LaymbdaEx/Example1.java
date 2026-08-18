
interface Greeting
{
    void greet();
}
public class Example1 {
    public static void main(String[] args) {
      
        Greeting g=()->System.out.println("good morning");
        g.greet();
    }
}
