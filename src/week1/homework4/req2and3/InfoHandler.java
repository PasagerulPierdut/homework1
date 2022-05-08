package week1.homework4.req2and3;

import java.time.LocalDate;
import java.time.Period;

public class InfoHandler {

    private Person person;

    public InfoHandler(Person person) {
        this.person = person;
    }

    public String getFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int getAge(Person person) {
        return Period.between(person.getBirthDay(), LocalDate.now()).getYears();
    }
}
