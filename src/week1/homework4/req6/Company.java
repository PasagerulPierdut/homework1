package week1.homework4.req6;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Company {

    private static final String MANAGER = "manager";
    private List<Person> employees;

    public Company(List<Person> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }

    public Person getManager() throws NoSuchElementException {
        return employees.stream()
                .filter(person -> person.getPosition().equals(MANAGER))
                .findFirst().orElseThrow(() -> new NoSuchElementException("Not hired yet."));
    }

    public List<Person> getPersons(String profession) {
        return employees.stream()
                .filter(employee -> employee.getPosition().equals(profession))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonsOlder(int age) {
        return employees.stream()
                .filter(person -> person.getAge() > age)
                .collect(Collectors.toList());
    }

    public List<Person> getPerson(String filterName) {
        return employees.stream()
                .filter(person -> person.getName().contains(filterName))
                .collect(Collectors.toList());
    }

    public void employ(Person person) {
        if (managerExists()) {
            System.out.println("We already have a " + MANAGER);
        } else {
            employees.add(person);
        }
    }

    private boolean managerExists() {
        var managerCheck = employees.stream()
                .filter(employee -> employee.getPosition().equals(MANAGER))
                .collect(Collectors.toList());
        return !managerCheck.isEmpty();
    }
}
