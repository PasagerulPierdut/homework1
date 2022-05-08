package week1.req8;

public class Dog implements Animal {

    private int legs;

    private String head;

    private String tail;

    public Dog() {
    }

    public Dog(int legs, String head, String tail) {
        this.legs = legs;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public String walk() {
        return "Dog walking";
    }

    @Override
    public String talk() {
        return "Woof";
    }

    @Override
    public String eat() {
        return "Dog eating";
    }
}
