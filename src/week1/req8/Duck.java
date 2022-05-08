package week1.req8;

public class Duck implements Animal {

    private int legs;

    private String name;

    private String wings;

    public Duck() {
    }

    public Duck(int legs, String name, String wings) {
        this.legs = legs;
        this.name = name;
        this.wings = wings;
    }

    @Override
    public String walk() {
        return "Duck walks";
    }

    @Override
    public String talk() {
        return "mac mac";
    }

    @Override
    public String eat() {
        return "Duck pecks";
    }
}
