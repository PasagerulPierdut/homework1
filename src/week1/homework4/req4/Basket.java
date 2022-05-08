package week1.homework4.req4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Basket {

    private List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = fruits;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        boolean isPresent;
        if (!fruits.contains(fruit)) {
            isPresent = false;
        } else {
            isPresent = true;
        }
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(fruit)) {
                fruits.remove(fruit);
            }
        }
        return isPresent;
    }

    public int position(String fruit) {
        int position = 0;
        for (String s : fruits) {
            if (s.equals(fruit)) {
                position = fruits.indexOf(s) + 1;
            }
        }
        return position;
    }

    public Set<String> distinct() {
        return fruits.stream()
                .collect(Collectors.toSet());
    }

    public String add(String fruit) {
        fruits.add(fruit);
        return fruit;
    }

    public int count() {
        return (int) fruits.stream().count();
    }

    public int customCount() {
        int counter = 0;
        for (String fruit : fruits) {
            counter += 1;
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruits=" + fruits +
                '}';
    }
}
