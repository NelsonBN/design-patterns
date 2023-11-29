
public class Account {
    private String owner;
    private State state;

    public Account(String owner) {
        this.owner = owner;
        this.state = new SilverState(0.0, this);

        System.out.println("Created account for " + owner);
        System.out.println("\tBalance = " + state.getBalance());
        System.out.println("\tStatus  = " + state.getClass().getSimpleName());
    }

    public void deposit(double amount) {
        state.deposit(amount);

        System.out.println("Deposited " + amount);
        System.out.println("\tBalance = " + state.getBalance());
        System.out.println("\tStatus  = " + state.getClass().getSimpleName());
    }

    public void withdraw(double amount) {
        state.withdraw(amount);

        System.out.println("Withdrew " + amount);
        System.out.println("\tBalance = " + state.getBalance());
        System.out.println("\tStatus  = " + state.getClass().getSimpleName());
    }

    public String getOwner() {
        return owner;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getBalance() {
        return state.getBalance();
    }
}