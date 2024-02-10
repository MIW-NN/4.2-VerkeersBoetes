package verkeersboetes.project.model;

import org.junit.Assert;
import org.junit.Test;

public class ParkingFineTest {
    private static final double DOUBLE_DELTA = 0.0;

    @Test
    public void whenCreatingParkingFineForZone1_expectRightFineAmount(){
        var parkingFine = new ParkingFine("name", "licensePlate", 1);

        Assert.assertEquals(60,parkingFine.getFineAmount(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingParkingFineForZone2_expectRightFineAmount(){
        var parkingFine = new ParkingFine("name", "licensePlate", 2);

        Assert.assertEquals(100,parkingFine.getFineAmount(),DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingParkingFineForZone3_expectRightFineAmount(){
        var parkingFine = new ParkingFine("name", "licensePlate", 3);

        Assert.assertEquals(180,parkingFine.getFineAmount(),DOUBLE_DELTA);
    }
}