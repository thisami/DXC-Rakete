package dxc.edu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BodenstationTest {

    @Test
    void flugStartenTest(){
        Bodenstation bodenstation = Daten.bodenstation;
        bodenstation.flugStarten("tilosFlug");
    }

    @Test
    void flugStartenRaketeNichtVorhandenTest(){
        Bodenstation bodenstation = Daten.bodenstation;
        bodenstation.flugStarten("tilosFlug");
        assertThrows(NullPointerException.class, () -> bodenstation.flugStarten(""), "An dieser Stelle sollte keine Rakete vorhanden sein.");

    }

    @Test
    void flugStartenStartrampeNichtSicherTest(){
        Bodenstation bodenstation = Daten.bodenstation;
        assertFalse(bodenstation.isStartrampeSicher());
        bodenstation.flugStarten("tilosFlug");

    }

    @Test
    void flugStartenFlugbahnNichtBerechnetTest(){
        Bodenstation bodenstation = Daten.bodenstation;
        assertFalse(bodenstation.isFlugbahnBerechnet());
        bodenstation.flugStarten("tilosFlug");

    }


    @Test
    void flugStartenKommunikationNichtAufgebautTest(){
        Bodenstation bodenstation = Daten.bodenstation;
        assertFalse(bodenstation.isKommunikationAufgebaut());
        bodenstation.flugStarten("tilosFlug");
    }

}
