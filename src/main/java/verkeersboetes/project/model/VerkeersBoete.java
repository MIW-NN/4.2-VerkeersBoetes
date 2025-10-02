package verkeersboetes.project.model;

public class VerkeersBoete {
    private static final double DEFAULT_BEDRAG = 0.0;
    private static final String DEFAULT_KENTEKEN = "Onbekend";
    private static final String DEFAULT_NAAM_DADER = "Onbekend";
    private final String naamDader;
    private final String kenteken;
    private double bedrag;

    private VerkeersBoete(String naamDader, String kenteken, double bedrag) {
        this.naamDader = naamDader;
        this.kenteken = kenteken;
        this.bedrag = bedrag;
    }

    public VerkeersBoete(String naamDader, String kenteken) {
        this(naamDader, kenteken, DEFAULT_BEDRAG);
    }

    public VerkeersBoete() {
        this(DEFAULT_NAAM_DADER, DEFAULT_KENTEKEN);
    }

    public String toString() {
        return String.format("Verkeersboete voor %s, kenteken %s, %s euro", naamDader, kenteken, bedrag);
    }

    public double getBedrag() {
        return bedrag;
    }

    protected void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }
}
