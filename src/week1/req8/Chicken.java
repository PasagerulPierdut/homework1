package week1.req8;

public class Chicken implements Animal {

    private int legs;

    private String beak;

    private String wings;

    private String color;

    public Chicken() {
    }

    public Chicken(int legs, String beak, String wings, String color) {
        this.legs = legs;
        this.beak = beak;
        this.wings = wings;
        this.color = color;
    }

    @Override
    public String walk() {
        return "Chicken walks";
    }

    @Override
    public String talk() {
        return "chicken makes noise";
    }

    @Override
    public String eat() {
        return "Chicken pecks";
    }
}
