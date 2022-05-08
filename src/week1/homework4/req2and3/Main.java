package week1.homework4.req2and3;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Person x = new DatabaseAdmin("Ion", "Ilie", LocalDate.of(1995, Month.AUGUST, 3),
                "Republicii nr. 25, Costinesti", LocalDate.of(2009, Month.DECEMBER, 4), "db admin", "Java");

        InfoHandler infoHandler = new InfoHandler(x);
        System.out.println(infoHandler.getFullName(x));
        System.out.println(infoHandler.getAge(x) + " years.");

    }
}
