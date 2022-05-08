package week1.homework4.req5;

import java.util.Set;

public class Bouquet {

    private Set<String> flowers;

    public Bouquet(Set<String> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }

    public Set<String> getAll() {
        return flowers;
    }

    public void add(String flower) {
        if (!flowers.contains(flower)) {
            flowers.add(flower);
        } else {
            System.out.println("Duplicate flowers not allowed.");
        }
    }

    public void remove(String flower) {
        if (flowers.contains(flower)) {
            flowers.remove(flower);
        } else {
            System.out.println("The bouquet doesn' t contain specified flower.");
        }
    }
}
