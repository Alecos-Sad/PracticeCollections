package task08.model.parent;

public abstract class CargoWagon {

    private boolean open;

    public CargoWagon(boolean open) {
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
