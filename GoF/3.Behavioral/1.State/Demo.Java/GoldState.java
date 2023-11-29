
public class GoldState extends State {
    public GoldState(State state) {
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
        balance -= amount;
        checkState();
    }

    private void checkState() {
        if (balance < 0.0) {
            account.setState(new RedState(this));
        } else if (balance < 1000.0) {
            account.setState(new SilverState(this));
        }
    }
}