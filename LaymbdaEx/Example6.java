
@FunctionalInterface
interface Result {
    void displayResult(int marks);
}


public class Example6 {
    public static void main(String[] args) {

        Result result = (marks) -> {
            if (marks >= 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        };

        result.displayResult(40); // Pass
        // result.displayResult(30); // Fail
    }
}
