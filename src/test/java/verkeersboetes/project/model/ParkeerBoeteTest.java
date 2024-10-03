package verkeersboetes.project.model;

import org.junit.Assert;
import org.junit.Test;

public class ParkeerBoeteTest {
    private static final double DOUBLE_DELTA = 0.0001;

    @Test
    public void whenCreatingParkingFineForZone1_expectRightFineAmount(){
        var parkingFine = new ParkeerBoete("name", "licensePlate", 1);

        Assert.assertEquals(60, parkingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingParkingFineForZone2_expectRightFineAmount(){
        var parkingFine = new ParkeerBoete("name", "licensePlate", 2);

        Assert.assertEquals(100, parkingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingParkingFineForZone3_expectRightFineAmount(){
        var parkingFine = new ParkeerBoete("name", "licensePlate", 3);

        Assert.assertEquals(180, parkingFine.getBedrag(), DOUBLE_DELTA);
    }
}