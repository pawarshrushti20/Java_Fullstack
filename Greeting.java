
interface greet
{
    void greeting();
}
public class Greeting {

    public static void main(String[] args) {
        greet g=()->System.out.println("good morning");
        g.greeting();
    }

}
