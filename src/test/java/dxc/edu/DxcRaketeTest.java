package dxc.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DxcRaketeTest {

    @Test
    void multiplyTest() {
        assertEquals(0, DxcRakete.multiply(0, 5));
        assertEquals(0, DxcRakete.multiply(7, 0));
    }

    @Test
    void divideTest() {
    }

}