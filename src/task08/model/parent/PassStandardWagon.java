package task08.model.parent;

public class PassStandardWagon extends PassengerWagon {

    private static final int COMFORT_LEVEL = 3;

    public PassStandardWagon(String number) {
        super(number,3, 30);
    }
}
