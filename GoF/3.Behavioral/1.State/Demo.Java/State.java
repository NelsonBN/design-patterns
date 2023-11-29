
public abstract class State {
    protected Account account;
    protected double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}