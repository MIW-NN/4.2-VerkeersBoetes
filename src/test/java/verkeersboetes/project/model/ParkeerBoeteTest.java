package verkeersboetes.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkeerBoeteTest {
    private static final double DOUBLE_DELTA = 0.0001;
    private static final String NAAM = "B. Oefje";
    private static final String KENTEKEN = "AA-123-Z";

    @Test
    public void getBedragVoorBoeteInZone1geeft60(){
        ParkeerBoete parkeerBoete = new ParkeerBoete(NAAM, KENTEKEN, 1);

        assertEquals(60, parkeerBoete.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void getBedragVoorBoeteInZone2geeft100(){
        ParkeerBoete parkeerBoete = new ParkeerBoete(NAAM, KENTEKEN, 2);

        assertEquals(100, parkeerBoete.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void getBedragVoorBoeteInZone3geeft180(){
        ParkeerBoete parkeerBoete = new ParkeerBoete(NAAM, KENTEKEN, 3);

        assertEquals(180, parkeerBoete.getBedrag(), DOUBLE_DELTA);
    }
}