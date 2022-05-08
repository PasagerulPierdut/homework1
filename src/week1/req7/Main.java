package week1.req7;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BankAccount test = new BankAccount(12928, new BigDecimal(25.00));
        BankAccount test2 = new BankAccount(12929, new BigDecimal(30.00));

        Customer customer1 = new Customer("John Doe");

        Bank ing = new RegularBank("ING", new ArrayList<>());
        Bank bt = new SpecialBank("BT", new ArrayList<>(), new BigDecimal(40.00));

        ing.addAccount(test);
        test.setCustomerName(customer1.getName());
        System.out.println(test);
        test.deposit(new BigDecimal(20.00));
        test.withdraw(new BigDecimal(-80.00));

        bt.addAccount(test2);
        test2.setCustomerName(customer1.getName());
        System.out.println(test);
        test.deposit(new BigDecimal(40.00));
        test.withdraw(new BigDecimal(25.00));
    }
}
