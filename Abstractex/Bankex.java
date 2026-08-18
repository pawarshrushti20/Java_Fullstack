package Abstractex;

interface Bank {

    void deposit(double amount);

    void withdraw(double amount);

    default void accountType() {
        System.out.println("Saving Account");
    }
}

public class Bankex {
    public static void main(String[] args) {

        Bank b = new Bank() {

            double balance = 2000;

            public void deposit(double amount) {
                balance += amount;
                System.out.println("Balance after deposit = " + balance);
            }

            public void withdraw(double amount) {
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Balance after withdrawal = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
            }
        };

        b.accountType();
        b.deposit(2000);
        b.withdraw(100);
    }
}