package dxc.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FlugTest {

    Rakete rakete = new Rakete();
    Flug flug = new Flug(rakete);
    LocalDateTime zeit = LocalDateTime.of(2024, 2, 2, 14, 20);
    @BeforeEach
    void setUp() {
        flug.setGeplanteAbflugzeit(zeit);

    }

    @Test
    void flugzeitVerzoegernUeberStunde() {
        LocalDateTime neueZeit = LocalDateTime.of(2024, 2, 2, 15, 30);
        flug.flugzeitVerzoegern(70);

        assertEquals(neueZeit, flug.getGeplanteAbflugzeit());
    }

    @Test
    void flugzeitVerzoegernMitNegativerZahl() {
        flug.flugzeitVerzoegern(-7);

        assertEquals(zeit, flug.getGeplanteAbflugzeit());
    }
    @Test
    void astronautAustauschen() {
        flug = Daten.fluege.get("rubensFlug");
        flug.astronautAustauschen("ruben", "tilo");

        assertTrue(flug.getAstronauten().contains(Daten.astronauten.get("tilo")));
    }

    @Test
    void flugbereit() {
        Astronaut astronaut = new Astronaut("", "", Erfahrung.ERFAHREN, "", "");
        astronaut.setNuechtern(false);
        assertFalse(flug.isFlugbereit());
    }
}