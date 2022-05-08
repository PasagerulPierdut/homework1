package week1.req1to5;

public class Bottle {

    double totalCapacity;
    double availableLiquid;
    boolean isOpen;

    public boolean hasMoreLiquid() {
        return this.availableLiquid > 0.0;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public void openBottle() {
        if (this.isOpen) {
            System.out.println("The bottle is already open.");
        } else {
            this.isOpen = true;
            System.out.println("Bottle opened.");
        }
    }

    public void closeBottle() {
        this.isOpen = false;
        System.out.println("Bottle is closed.");
    }

    public void drinkSpecifiedAmount(double quantity) {
        if (!isOpen) {
            System.out.println("Bottle is closed! Open it first.");
        } else if (getAvailableLiquid() < quantity) {
            System.out.println("Not enough liquid. The remaining quantity is: " + getAvailableLiquid());
        } else {
            this.availableLiquid -= quantity;
            System.out.println("You have drunk " + quantity);
        }
    }
}

