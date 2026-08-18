
@FunctionalInterface
interface Bonus {
    double calculateBonus(double salary);
}

public class Example7  {
    public static void main(String[] args) {

        Bonus bonus = (salary) -> salary * 0.10;

        double salary = 50000;
        System.out.println("Bonus = " + bonus.calculateBonus(salary));
    }
}