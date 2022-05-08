package week1.homework4.req1;

import java.math.BigDecimal;

public class Electronics extends Product {

    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(BigDecimal price, String name, String description, int quantity, String type, int length, int width, int height, int weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
