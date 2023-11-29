
public class RedState extends State {
    public RedState(State state) {
        this.balance = state.getBalance();
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        checkState();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("### NO FUNDS AVAILABLE FOR WITHDRAWAL! ###");
    }

    private void checkState() {
        if (balance >= 0) {
            account.setState(new SilverState(this));
        }
    }
}