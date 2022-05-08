package week1.homework4.req2and3;

import java.time.LocalDate;

public class Employee implements Person {

    private String firstName;

    private String lastName;

    private LocalDate birthDay;

    private String address;

    private LocalDate dateOfEmployment;
    private String position;

    public Employee(String firstName, String lastName, LocalDate birthDay, String address, LocalDate dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }
}
