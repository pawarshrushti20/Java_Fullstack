
@FunctionalInterface
interface StringLength {
    int findLength(String text);
}

public class Exaple8 {
    public static void main(String[] args) {

        StringLength length = (text) -> text.length();

        String str = "Hello World!";
        System.out.println("Length = " + length.findLength(str));
    }
}
