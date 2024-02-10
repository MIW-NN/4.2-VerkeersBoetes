package verkeersboetes.project.model;

public class ParkingFine {

    private int zone;
    final static private double FINE_ZONE1 = 60.0;
    final static private double FINE_ZONE2 = 100.0;
    final static private double FINE_ZONE3 = 180.0;

    public ParkingFine(String name, String licensePlate, int zone) {
    }

    public void determineFine() {
    }

    public String toString() {
        return "";
    }
}
