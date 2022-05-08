package week1.req8;

public class Mouse implements Animal {

    private int legs;

    private String head;

    private String tail;

    public Mouse(int legs, String head, String tail) {
        this.legs = legs;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public String walk() {
        return "mouse walks";
    }

    @Override
    public String talk() {
        return "Chitz";
    }

    @Override
    public String eat() {
        return "Mouse eats";
    }
}
