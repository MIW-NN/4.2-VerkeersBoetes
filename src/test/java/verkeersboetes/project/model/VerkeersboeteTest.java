package verkeersboetes.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VerkeersboeteTest {

    // --- ParkeerBoete ---

    @Test
    void parkeerBoete_zone1_geeft60Euro() {
        ParkeerBoete boete = new ParkeerBoete("Jan Smit", "04-SPZ-8", 1);
        assertEquals(60.0, boete.getBedrag());
    }

    @Test
    void parkeerBoete_zone2_geeft100Euro() {
        ParkeerBoete boete = new ParkeerBoete("Jan Smit", "04-SPZ-8", 2);
        assertEquals(100.0, boete.getBedrag());
    }

    @Test
    void parkeerBoete_zone3_geeft180Euro() {
        ParkeerBoete boete = new ParkeerBoete("Jan Smit", "04-SPZ-8", 3);
        assertEquals(180.0, boete.getBedrag());
    }

    // --- SnelheidsBoete (tier 1: > 0 en <= 10, 10 euro per km/u) ---

    @Test
    void snelheidsBoete_tier1_6kmTeHard_geeft60Euro() {
        SnelheidsBoete boete = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 86, 80);
        assertEquals(60.0, boete.getBedrag());
    }

    @Test
    void snelheidsBoete_tier1_10kmTeHard_geeft100Euro() {
        SnelheidsBoete boete = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 90, 80);
        assertEquals(100.0, boete.getBedrag());
    }

    // --- SnelheidsBoete (tier 2: > 10 en <= 30, 15 euro per km/u) ---

    @Test
    void snelheidsBoete_tier2_20kmTeHard_geeft300Euro() {
        SnelheidsBoete boete = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 100, 80);
        assertEquals(300.0, boete.getBedrag());
    }

    // --- SnelheidsBoete (tier 3: > 30, 20 euro per km/u) ---

    @Test
    void snelheidsBoete_tier3_45kmTeHard_geeft900Euro() {
        SnelheidsBoete boete = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 125, 80);
        assertEquals(900.0, boete.getBedrag());
    }

    // --- SnelheidsBoete (maximum 1000 euro) ---

    @Test
    void snelheidsBoete_bovenMaximum_geeft1000Euro() {
        SnelheidsBoete boete = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 140, 80);
        assertEquals(1000.0, boete.getBedrag());
    }

    // --- Via VerkeersBoete-referentie (subklasse-gedrag via superklasse) ---

    @Test
    void parkeerBoete_viaVerkeersBoeteReferentie_geeftJuistBedrag() {
        VerkeersBoete boete = new ParkeerBoete("Jan Smit", "04-SPZ-8", 2);
        assertEquals(100.0, boete.getBedrag());
    }

    @Test
    void snelheidsBoete_viaVerkeersBoeteReferentie_geeftJuistBedrag() {
        VerkeersBoete boete = new SnelheidsBoete("Jan Smit", "04-SPZ-8", 86, 80);
        assertEquals(60.0, boete.getBedrag());
    }
}
