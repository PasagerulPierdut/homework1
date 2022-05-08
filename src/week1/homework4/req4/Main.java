package week1.homework4.req4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket(new ArrayList<>());
        basket.add("Pear");
        basket.add("Apple");
        basket.add("Avocado");
        basket.add("Banana");
        basket.add("Orange");
        basket.add("Banana");
        basket.add("Apple");
        basket.add("Avocado");
        System.out.println(basket);

        System.out.println(basket.find("Banana"));

        System.out.println(basket.remove("Avocado"));
        System.out.println(basket);

        System.out.println(basket.position("Pear"));
        System.out.println(basket.distinct());
        System.out.println(basket.add("Avocado"));
        System.out.println(basket);
        System.out.println(basket.count());
        System.out.println(basket.customCount());
    }
}
