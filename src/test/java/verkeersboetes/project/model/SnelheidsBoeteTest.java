package verkeersboetes.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnelheidsBoeteTest {
    private static final double DOUBLE_DELTA = 0.0001;

@Test
    public void whenCreatingSpeedingFineWithLowSpeeding_expectFineToHaveTheRightFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,80 );

        assertEquals(100, speedingFine.getBedrag(), DOUBLE_DELTA);
    }


    @Test
    public void whenCreatingSpeedingFineWithMediumSpeeding_expectFineToHaveTheRightFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,70 );

        assertEquals(300, speedingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingSpeedingFineWithHighSpeeding_expectFineToHaveTheRightFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,55 );

        assertEquals(700, speedingFine.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void whenCreatingSpeedingFineWithMAximumFineAmount_expectFineToHaveMaximumFineAmout(){
        var speedingFine = new SnelheidsBoete("name","license-plate", 90,30 );

        assertEquals(1000, speedingFine.getBedrag(), DOUBLE_DELTA);
    }
}