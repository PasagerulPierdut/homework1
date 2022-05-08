package week1.req1to5;

import java.math.BigDecimal;

// Requirement no. 2
public class Product {

    // Requirement no. 2

    String name;
    BigDecimal price;
    int quantity;
    String category;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return (this.quantity > 0);
    }

    public boolean isCategory(String category) {
        return this.category.equals(category);
    }
}
