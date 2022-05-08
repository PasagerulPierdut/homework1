package week1.homework4.req1;

import java.math.BigDecimal;

public class Cosmetics extends Product {

    private String color;
    private int weight;

    public Cosmetics(BigDecimal price, String name, String description, int quantity, String color, int weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
