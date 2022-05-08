package week1.req7;

import java.math.BigDecimal;
import java.util.List;

public class RegularBank extends Bank {

    public RegularBank(String bankName, List<BankAccount> accounts) {
        super(bankName, accounts);
    }

    @Override
    public void addAccount(BankAccount account) {
        this.getAccounts().add(account);
    }

    @Override
    public void removeAccount(BankAccount account) {
        if (account.getBalance().compareTo(BigDecimal.ZERO) == 0) {
            this.getAccounts().remove(account);
            System.out.println("Account " + account.getAccountNumber() + " removed.");
        } else {
            System.out.println("Cannot delete account, balance > 0.");
        }
    }
}
