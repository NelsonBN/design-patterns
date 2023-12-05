public class Program {
    public static void main(String[] args) {
        // Create a new account
        Account account = new Account("Nelson Nobre");

        // Perform some operations
        account.deposit(500.0);
        account.withdraw(100.0);

        account.deposit(300.0);
        account.deposit(550.0);

        account.withdraw(2000.00);
        account.withdraw(1100.00);
    }
}
