package week1.homework4.req1;

import java.math.BigDecimal;

public class Fridge extends Electronics {

    private int temperature;

    public Fridge(BigDecimal price, String name, String description, int quantity, String type, int length, int width, int height, int weight, int temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "temperature=" + temperature +
                '}';
    }
}
