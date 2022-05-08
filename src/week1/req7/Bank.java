package week1.req7;

import java.util.List;

public abstract class Bank {

    private String bankName;
    private List<BankAccount> accounts;

    public Bank(String bankName, List<BankAccount> accounts) {
        this.bankName = bankName;
        this.accounts = accounts;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public abstract void addAccount(BankAccount account);

    public abstract void removeAccount(BankAccount account);
}