package week1.req8;

public class Cat implements Animal {

    private String name;
    private int legs;

    private String head;

    private String tail;

    public Cat(String name, int legs, String head, String tail) {
        this.name = name;
        this.legs = legs;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public String walk() {
        return "Cat walking";
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cat chewing";
    }
}
