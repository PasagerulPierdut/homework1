package week1.req1to5;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Requirement no. 2

        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 30;
        person1.married = true;

        Person person2 = new Person();
        person2.name = "James Bond";
        person2.age = 35;
        person2.married = false;

        Person person3 = new Person();
        person3.name = "Pink Panther";
        person3.age = 21;
        person3.married = false;

        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.isMarried());
        System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.isMarried());
        System.out.println(person3.getName() + " " + person3.getAge() + " " + person3.isMarried());

        // Requirement no. 4

        Product product1 = new Product();
        product1.name = "Sponge Bath";
        product1.price = new BigDecimal("5.50");
        product1.quantity = 60;
        product1.category = "Self Care";

        Product product2 = new Product();
        product2.name = "Wallet";
        product2.price = new BigDecimal("10.20");
        product2.quantity = 100;
        product2.category = "Personal Items";

        Product product3 = new Product();
        product3.name = "Stool";
        product3.price = new BigDecimal("25.30");
        product3.quantity = 0;
        product3.category = "Furniture";

        System.out.println(product1.hasStock());
        System.out.println(product1.isCategory("Self Care"));
        //TODO getters
        System.out.println(product2.hasStock());
        System.out.println(product2.isCategory("Personal Items"));

        System.out.println(product3.hasStock());
        System.out.println(product3.isCategory("Kitchen"));

        // Requirement no. 5
        Bottle testBottle = new Bottle();
        testBottle.totalCapacity = 10.0;
        testBottle.availableLiquid = 9.0;
        testBottle.isOpen = false;

        testBottle.drinkSpecifiedAmount(3.0);
        testBottle.openBottle();
        testBottle.drinkSpecifiedAmount(2.0);
        testBottle.drinkSpecifiedAmount(12.0);
        testBottle.openBottle();
        testBottle.closeBottle();
    }


}
