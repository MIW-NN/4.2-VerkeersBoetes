package verkeersboetes.project.model;

public class TrafficFine {
    private static final String DEFAULT_PERPETRATOR_NAME = "";
    private static final String DEFAULT_LICENSE_PLATE = "";
    private static final int DEFAULT_FINE_AMOUNT = 0;

    private String perpetratorName;
    private String licensePlate;
    private double fineAmount;

    public TrafficFine() {
        this(DEFAULT_PERPETRATOR_NAME,DEFAULT_LICENSE_PLATE);
    }

    public TrafficFine(String perpetratorName, String licensePlate) {
        this(perpetratorName, licensePlate, DEFAULT_FINE_AMOUNT);
    }

    private TrafficFine(String perpetratorName, String licensePlate, double fineAmount) {
        this.perpetratorName = perpetratorName;
        this.licensePlate = licensePlate;
        this.fineAmount = fineAmount;
    }

    public String toString() {
        return String.format("Verkeersboete voor %s, kenteken %s, boete %.2f euro", this.perpetratorName, this.licensePlate, this.fineAmount);
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }
    public double getFineAmount() {
        return this.fineAmount;
    }
}
