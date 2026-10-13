package exercise;

public class BankAccount {
    double balance = 150.50;

    void deposit(double amount){
        balance = amount + balance;
        System.out.println("New Balance: " + balance);
    }
}
