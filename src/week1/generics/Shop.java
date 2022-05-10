package week1.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {

    private List<T> list;

    public Shop(List<T> list) {
        this.list = list;
    }

    void addItem(T item) {
        if (item instanceof Fruits && !item.category().equals(Category.NEW)) {
            System.out.println("Add only new fruits, or else our customers would be angry. Item " + item + " not added!");
        } else if (item.price() > 0 && (item.name() != null && !item.name().equals(""))) {
            list.add(item);
        } else {
            System.out.println("Check again.");
        }
    }

    List<T> findAll() {
        return list;
    }

    List<T> findByCategory(Category category) {
        List<T> filteredByCategory = new ArrayList<>();
        for (T item : list) {
            if (item.category().equals(category)) {
                filteredByCategory.add(item);
            }
        }
        return filteredByCategory;
    }

    List<T> findWIthLowerPrice(int maxPrice) {
        List<T> itemsWithLowerPriceThanGiven = new ArrayList<>();
        for (T item : list) {
            if (item.price() < maxPrice) {
                itemsWithLowerPriceThanGiven.add(item);
            }
        }
        return itemsWithLowerPriceThanGiven;
    }

    Optional<T> findByName(String name) {
        for (T item : list) {
            if (item.name().equals(name)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    Optional<T> removeItem(String name) {
        for (T item : list) {
            if (item.name().equals(name)) {
                list.remove(item);
                return Optional.of(item);
            }
        }
        System.out.println("Item not found!");
        return Optional.empty();
    }
}
