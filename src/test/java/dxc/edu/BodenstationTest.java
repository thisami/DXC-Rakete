package dxc.edu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BodenstationTest {

    @Test
    void flugStartenTest(){
        //aus Daten holen
        Bodenstation bodenstation = new Bodenstation();
        Flug flug = new Flug("");

        assertFalse(bodenstation.isFlugbahnBerechnet());
        bodenstation.flugbahnBerechnen();
        assertTrue(bodenstation.isFlugbahnBerechnet());
    }

    @Test
    void flugStartenRaketeNichtVorhandenTest(){
        Bodenstation bodenstation = new Bodenstation();
        bodenstation.flugStarten("1");
        assertThrows(NullPointerException.class, () -> bodenstation.flugStarten("1"), "An dieser Stelle sollte keine Rakete vorhanden sein.");

    }

    @Test
    void flugStartenStartrampeNichtSicherTest(){

    }

    @Test
    void flugStartenFlugbahnNichtBerechnetTest(){

    }


    @Test
    void flugStartenKommunikationNichtAufgebautTest(){

    }

}
