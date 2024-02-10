package verkeersboetes.project.model;

public class SpeedingFine extends TrafficFine {
    private int measuredSpeed;
    private int maximumSpeed;
    final static private int LIMIT_FINE_LOW = 10;
    final static private int LIMIT_FINE_HIGH = 30;
    final static private int FINE_PER_KM_LOW = 10;
    final static private int FINE_PER_KM_MEDIUM = 15;
    final static private int FINE_PER_KM_HIGH = 20;
    final static private int MAXIMUM_FINE = 1000;


    public SpeedingFine(String name, String licensePlate, int measuredSpeed, int maximumSpeed) {
        super(name, licensePlate);
        this.measuredSpeed = measuredSpeed;
        this.maximumSpeed = maximumSpeed;
        determineFine();
    }

    public void determineFine() {
        int speedDifference = this.measuredSpeed - this.maximumSpeed;
        double fineAmount;
        if (speedDifference <= LIMIT_FINE_LOW) {
            fineAmount = speedDifference * FINE_PER_KM_LOW;
        } else if (speedDifference <= LIMIT_FINE_HIGH) {
            fineAmount = speedDifference * FINE_PER_KM_MEDIUM;
        } else {
            fineAmount = speedDifference * FINE_PER_KM_HIGH;
        }
        if (fineAmount > MAXIMUM_FINE) {
            fineAmount = MAXIMUM_FINE;
        }
        super.setFineAmount(fineAmount);
    }

    public String toString() {
        return super.toString().replace("Verkeersboete", "Snelheidsboete") + String.format(" voor %d km/u waar %d km/u is toegestaan",
                this.measuredSpeed, this.maximumSpeed);
    }
}
