package verkeersboetes.project.model;

public class TrafficFine {
    private static final String DEFAULT_PERPETRATOR_NAME = "";
    private static final String DEFAULT_LICENSE_PLATE = "";
    private static final int DEFAULT_FINE_AMOUNT = 0;

    private String perpetratorName;
    private String licensePlate;
    private double fineAmount;

    public TrafficFine() {
    }

    public TrafficFine(String perpetratorName, String licensePlate) {
    }

    private TrafficFine(String perpetratorName, String licensePlate, double fineAmount) {
    }

    public String toString() {
        return "";
    }
    public double getFineAmount() {
        return 0;
    }
}
