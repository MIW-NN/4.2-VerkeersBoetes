package verkeersboetes.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkeerBoeteTest {
    private static final double DOUBLE_DELTA = 0.0001;

    @org.junit.jupiter.api.Test
    public void whenCreatingParkingFineForZone1_expectRightFineAmount(){
        var parkingFine = new ParkeerBoete("name", "licensePlate", 1);

        assertEquals(60, parkingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingParkingFineForZone2_expectRightFineAmount(){
        var parkingFine = new ParkeerBoete("name", "licensePlate", 2);

        assertEquals(100, parkingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingParkingFineForZone3_expectRightFineAmount(){
        var parkingFine = new ParkeerBoete("name", "licensePlate", 3);

        assertEquals(180, parkingFine.getBedrag(), DOUBLE_DELTA);
    }
}