package verkeersboetes.project.model;

public class ParkingFine extends TrafficFine {

    private int zone;
    final static private double FINE_ZONE1 = 60.0;
    final static private double FINE_ZONE2 = 100.0;
    final static private double FINE_ZONE3 = 180.0;

    public ParkingFine(String name, String licensePlate, int zone) {
        super(name, licensePlate);
        this.zone = zone;
        determineFine();
    }

    public void determineFine() {
        switch (this.zone) {
            case 1 :
                super.setFineAmount(FINE_ZONE1);
                break;
            case 2:
                super.setFineAmount(FINE_ZONE2);
                break;
            case 3:
                super.setFineAmount(FINE_ZONE3);
                break;
        }
    }

    public String toString() {
        return super.toString().replace("Verkeersboete", "Parkeerboete") + String.format(" in zone %d", this.zone);
    }
}
