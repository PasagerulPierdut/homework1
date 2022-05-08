package week1.req7;

import java.math.BigDecimal;
import java.util.List;

public class SpecialBank extends Bank {

    private BigDecimal joinBonus;

    public SpecialBank(String bankName, List<BankAccount> accounts, BigDecimal joinBonus) {
        super(bankName, accounts);
        this.joinBonus = joinBonus;
    }

    public BigDecimal getJoinBonus() {
        return joinBonus;
    }

    public void setJoinBonus(BigDecimal joinBonus) {
        this.joinBonus = joinBonus;
    }

    @Override
    public void addAccount(BankAccount account) {
        this.getAccounts().add(account);
        account.setBalance(account.getBalance().add(joinBonus));
        System.out.println("You received " + joinBonus + " for becoming our customer");
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
