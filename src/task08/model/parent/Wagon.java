package task08.model.parent;

public abstract class Wagon {

    private final String number;

    public Wagon(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number;
    }
}
