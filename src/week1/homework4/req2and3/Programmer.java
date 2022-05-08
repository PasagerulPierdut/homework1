package week1.homework4.req2and3;

import java.time.LocalDate;

public class Programmer extends Employee {

    private String language;

    public Programmer(String firstName, String lastName, LocalDate birthDay, String address, LocalDate dateOfEmployment, String position, String language) {
        super(firstName, lastName, birthDay, address, dateOfEmployment, position);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
