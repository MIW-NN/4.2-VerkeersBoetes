package verkeersboetes.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnelheidsBoeteTest {
    private static final double DOUBLE_DELTA = 0.0001;
    private static final String NAAM = "B. Oefje";
    private static final String KENTEKEN = "AA-123-Z";

@Test
    public void getBedragVoor90InEen80Is100(){
        SnelheidsBoete snelheidsBoete = new SnelheidsBoete(NAAM,KENTEKEN, 90,80 );

        assertEquals(100, snelheidsBoete.getBedrag(), DOUBLE_DELTA);
    }


    @Test
    public void getBedragVoor90InEen70Is300(){
        SnelheidsBoete snelheidsBoete = new SnelheidsBoete(NAAM, KENTEKEN, 90,70 );

        assertEquals(300, snelheidsBoete.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void getBedragVoor90InEen55Is700(){
        SnelheidsBoete snelheidsBoete = new SnelheidsBoete(NAAM, KENTEKEN, 90,55 );

        assertEquals(700, snelheidsBoete.getBedrag(), DOUBLE_DELTA);
    }

    @Test
    public void getBedragVoor90InEen30Is1000(){
        SnelheidsBoete snelheidsBoete = new SnelheidsBoete(NAAM, KENTEKEN, 90,30 );

        assertEquals(1000, snelheidsBoete.getBedrag(), DOUBLE_DELTA);
    }
}