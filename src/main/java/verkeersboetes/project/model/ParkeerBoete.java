package verkeersboetes.project.model;

public class ParkeerBoete extends VerkeersBoete {
    final static private double BOETE_ZONE1 = 60.0;
    final static private double BOETE_ZONE2 = 100.0;
    final static private double BOETE_ZONE3 = 180.0;

    private final int zone;

    public ParkeerBoete(String naam, String kenteken, int zone) {
        super(naam, kenteken);

        this.zone = zone;
        bepaalBedrag();
    }

    public void bepaalBedrag() {
        double bedrag;
        switch (zone) {
            case 1:
                bedrag = BOETE_ZONE1;
                break;
            case 2:
                bedrag = BOETE_ZONE2;
                break;
            case 3:
            default:
                bedrag = BOETE_ZONE3;
        }
        setBedrag(bedrag);
    }

    public String toString() {
        String returnString = super.toString();

        returnString = returnString.replace("Verkeersboete", "Parkeerboete");
        returnString += String.format(" in zone %d", zone);

        return returnString;
    }
}
