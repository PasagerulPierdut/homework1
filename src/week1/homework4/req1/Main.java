package week1.homework4.req1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Cosmetics hairPaint = new Cosmetics(new BigDecimal(10.50), "Wella brown", "A fancy hair paint", 50, "brown", 150);
        Fridge fridge = new Fridge(new BigDecimal(500.00), "Whirlpool No Frost", "No frost fridge for all family", 50, "Fridges", 500, 300, 800, 30, 6);

        System.out.println(calculateTotalValue(hairPaint));
        System.out.println(calculateVolumeInMc(fridge.getLength(), fridge.getWidth(), fridge.getHeight()));
    }

    private static BigDecimal calculateTotalValue(Product product) {
        return product.getPrice().multiply(BigDecimal.valueOf(product.getQuantity()));
    }

    private static double calculateVolumeInMc(double length, double width, double height) {
        return length * width * height / 100000000;
    }
}
