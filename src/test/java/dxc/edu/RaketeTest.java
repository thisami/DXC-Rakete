package dxc.edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RaketeTest {

    @Test
    void testMotorenStarten(){
        Rakete rakete = new Rakete();
        assertFalse(rakete.getMotorenLaufen());
        rakete.motorenStarten();
        assertTrue(rakete.getMotorenLaufen());
        assertThrows(IllegalStateException.class, ()->rakete.motorenStarten());
    }
}
