package task07.Model;

public abstract class Equipment {

    private final double price;
    private final double weight;

    public Equipment(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
