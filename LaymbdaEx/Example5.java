

interface Square {
    int square(int number);
}

public class Example5 {

    public static void main(String[] args) {

        Square s = (number) -> number * number;

        System.out.println("Square = " + s.square(12));
    }
}