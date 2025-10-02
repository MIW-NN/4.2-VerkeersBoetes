package verkeersboetes.project.model;

public class SnelheidsBoete extends VerkeersBoete {
    final static private int SNELHEIDSGRENS_LAGE_BOETE = 10;
    final static private int SNELHEIDSGRENS_MEDIUM_BOETE = 30;
    final static private int BOETEBEDRAG_PER_KM_LAAG = 10;
    final static private int BOETEBEDRAG_PER_KM_MEDIUM = 15;
    final static private int BOETEBEDRAG_PER_KM_HIGH = 20;
    final static private int MAXIMUM_BOETE = 1000;

    private int gemetenSnelheid;
    private int maximumSnelheid;

    public SnelheidsBoete(String naam, String kenteken, int gemetenSnelheid, int maximumSnelheid) {
        super(naam, kenteken);

        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBedrag();
    }

    public void bepaalBedrag() {
        int kmsTeHard = gemetenSnelheid - maximumSnelheid;
        double bedrag;

        if (kmsTeHard <= 0) {
            bedrag = 0;
        } else if (kmsTeHard <= SNELHEIDSGRENS_LAGE_BOETE) {
            bedrag = kmsTeHard * BOETEBEDRAG_PER_KM_LAAG;
        } else if (kmsTeHard <= SNELHEIDSGRENS_MEDIUM_BOETE) {
            bedrag = kmsTeHard * BOETEBEDRAG_PER_KM_MEDIUM;
        } else {
            bedrag = kmsTeHard * BOETEBEDRAG_PER_KM_HIGH;
        }

        if (bedrag > MAXIMUM_BOETE) {
            bedrag = MAXIMUM_BOETE;
        }

        setBedrag(bedrag);
    }

    public String toString() {
        String returnString = super.toString();

        returnString = returnString.replace("Verkeersboete", "Parkeerboete");
        returnString += String.format(" voor %d km/u waar %d km/u is toegestaan",
                gemetenSnelheid, maximumSnelheid);

        return returnString;
    }
}
