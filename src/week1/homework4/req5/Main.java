package week1.homework4.req5;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Bouquet myBouquet = new Bouquet(new HashSet<>());
        myBouquet.add("Rose");
        myBouquet.add("Rose");
        myBouquet.add("Lilly");

        System.out.println(myBouquet.getAll());

        myBouquet.remove("Lilly");
        System.out.println(myBouquet.getAll());
    }
}
