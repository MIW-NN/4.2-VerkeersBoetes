package verkeersboetes.project.model;

public class SnelheidsBoete {
    final static private int SNELHEIDSGRENS_LAGE_BOETE = 10;
    final static private int SNELHEIDSGRENS_MEDIUM_BOETE = 30;
    final static private int BOETEBEDRAG_PER_KM_LAAG = 10;
    final static private int BOETEBEDRAG_PER_KM_MEDIUM = 15;
    final static private int BOETEBEDRAG_PER_KM_HIGH = 20;
    final static private int MAXIMUM_BOET = 1000;

    private int gemetenSnelheid;
    private int maximumSnelheid;

    public SnelheidsBoete(String naam, String kenteken, int gemetenSnelheid, int maximumSnelheid) {
        // TODO
    }

    public void bepaalBoete() {
        // TODO
    }

    public String toString() {
        // TODO
        return "";
    }
}
