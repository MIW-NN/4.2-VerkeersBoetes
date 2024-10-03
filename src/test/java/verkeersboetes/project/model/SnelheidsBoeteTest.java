package verkeersboetes.project.model;


import org.junit.Assert;
import org.junit.Test;

public class SnelheidsBoeteTest {
    private static final double DOUBLE_DELTA = 0.0001;

@Test
    public void whenCreatingSpeedingFineWithLowSpeeding_expectFineToHaveTheRightFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,80 );

        Assert.assertEquals(100, speedingFine.getBedrag(), DOUBLE_DELTA);
    }


    @Test
    public void whenCreatingSpeedingFineWithMediumSpeeding_expectFineToHaveTheRightFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,70 );

        Assert.assertEquals(300, speedingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingSpeedingFineWithHighSpeeding_expectFineToHaveTheRightFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,55 );

        Assert.assertEquals(700, speedingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingSpeedingFineWithMAximumFineAmount_expectFineToHaveMaximumFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,30 );

        Assert.assertEquals(1000, speedingFine.getBedrag(), DOUBLE_DELTA);
    }
}