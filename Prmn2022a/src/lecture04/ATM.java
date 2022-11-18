package lecture04;

import java.util.ArrayList;
import java.util.Arrays;

public class ATM {

    ArrayList<Account> accounts = new ArrayList<>();
    Account account = new Account("吉田妃七", "1245");

    ATM() {
        accounts.add(account);
    }

    public void registerAccount(String name, String number) {
        System.out.println(name + "さんのアカウントを口座番号:" + number + "で登録しました。");
    }

    public boolean existsAccount(String name, String number) {
        if (accounts.contains(name) && accounts.contains(number)) {
            System.out.println("名前:"+name+"　口座番号:"+number+"は存在します。");
            return false;
        } else {
            System.out.println("名前:"+name+"　口座番号:"+number+"は存在しません。");
            return true;
        }
    }

    public void deposit(String number, long money) {
        if (number == account.getNumber()) {
            account.setBalance(money);
            System.out.println("口座番号:" + number + "に" + money + "円入金しました。");
        }
    }

    public long withdraw(String number, long money) {
        if (number == account.getNumber()) {
            if (money > account.getBalance()) {
                System.out.print("口座番号:" + number + "から" + money + "円引き出せませんでした。");
                System.out.println("残高:" + account.getBalance() + "円");
            } else {
                System.out.print("口座番号:" + number + "から" + money + "円引き出しました。");
                System.out.println("残高:" + (account.getBalance() - money) + "円");
            }
        }
        return account.getBalance();
    }
}

