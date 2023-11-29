
public class SilverState extends State {
    public SilverState(double balance, Account account) {
        this.balance = balance;
        this.account = account;
    }

    public SilverState(State state) {
        this(state.getBalance(), state.account);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        checkState();
    }

    @Override
    public void withdraw(double amount) {
        double fee = 0.05;
        double feeAmount = amount * fee;

        balance -= amount + feeAmount;
        checkState();
    }

    private void checkState() {
        if (balance < 0) {
            account.setState(new RedState(this));
        } else if (balance >= 1000.0) {
            account.setState(new GoldState(this));
        }
    }
}