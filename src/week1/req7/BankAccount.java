package week1.req7;

import java.math.BigDecimal;

public class BankAccount {

    private final String INSUFFICIENT_FUNDS = "Please insert a positive value. Thank you!";

    private String customerName;
    private int accountNumber;
    private BigDecimal balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String customerName, int accountNumber, BigDecimal balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.setBalance(balance.add(amount));
            System.out.println("New account balance is: " + balance);
        } else {
            System.out.println(INSUFFICIENT_FUNDS);
        }
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal result = balance.subtract(amount);
        if ((amount.compareTo(BigDecimal.ZERO) > 0) && result.compareTo(BigDecimal.ZERO) > 0) {
            this.setBalance(balance.subtract(amount));
            System.out.println("New account balance is: " + balance);
        } else if (amount.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println(INSUFFICIENT_FUNDS);
            System.out.println("Insufficient funds. Maximum withdrawal amount is: " + balance + ".");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                ", customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
