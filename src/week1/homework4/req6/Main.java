package week1.homework4.req6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(new ArrayList<>());

        company.employ(new Person("James", 22, "carpenter"));
        company.employ(new Person("Dave", 34, "welder"));
        company.employ(new Person("Cameron", 29, "carpenter"));
        company.employ(new Person("Jasmin", 47, "plummer"));
        company.employ(new Person("Dorothy", 57, "carpenter"));
        company.employ(new Person("Waldo", 39, "plummer"));
        company.employ(new Person("Martin", 29, "carpenter"));
        company.employ(new Person("Justin", 47, "manager"));

        System.out.println(company.getManager());

        System.out.println(company.getPersons("carpenter"));

        System.out.println(company.getPersonsOlder(30));

        System.out.println(company.getPerson("ti"));

        company.employ(new Person("Minnie", 49, "manager"));


    }
}
