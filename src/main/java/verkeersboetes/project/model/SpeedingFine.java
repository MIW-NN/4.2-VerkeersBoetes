package verkeersboetes.project.model;

public class SpeedingFine {
    private int measuredSpeed;
    private int maximumSpeed;
    final static private int LIMIT_FINE_LOW = 10;
    final static private int LIMIT_FINE_HIGH = 30;
    final static private int FINE_PER_KM_LOW = 10;
    final static private int FINE_PER_KM_MEDIUM = 15;
    final static private int FINE_PER_KM_HIGH = 20;
    final static private int MAXIMUM_FINE = 1000;


    public SpeedingFine(String name, String licensePlate, int measuredSpeed, int maximumSpeed) {
    }

    public void determineFine() {
    }

    public String toString() {
        return "";
    }
}
