package lecture04;

public class Kadai2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("吉田妃七", "1245");

        if (atm.existsAccount(account.getName(), account.getNumber())) {
            atm.registerAccount(account.getName(), account.getNumber());
        }

        atm.deposit(account.getNumber(), 1000);
        atm.withdraw(account.getNumber(), 2000);
        atm.withdraw(account.getNumber(), 500);
    }
}
