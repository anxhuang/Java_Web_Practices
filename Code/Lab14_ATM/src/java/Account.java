
public class Account {

    private long balance = 5000;

    public long getBalance() {
        return balance;
    }

    public synchronized void deposit(long amount) {

        //模擬交易
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        balance += amount;
    }

    public synchronized void withdraw(long amount) {

        //模擬交易
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        balance -= amount;
    }

}
