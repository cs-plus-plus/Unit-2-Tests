package unit2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Unit2Test {

    @Test
    public void testConcatenateStrings() {
        assertEquals("Hello World", Unit2.concatenateStrings("Hello", "World"));
    }

    @Test
    public void testCalculateSquareRoot() {
        assertEquals(5.0, Unit2.calculateSquareRoot(25.0), 0.001);
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", Unit2.toUpperCase("hello"));
    }

    @Test
    public void testFindMax() {
        assertEquals(10, Unit2.findMax(10, 5));
        assertEquals(15, Unit2.findMax(10, 15));
    }

    @Test
    public void testGetStringLength() {
        assertEquals(5, Unit2.getStringLength("Hello"));
    }

    @Test
    public void testRoundValue() {
        assertEquals(7, Unit2.roundValue(7.4));
        assertEquals(8, Unit2.roundValue(7.5));
    }

    @Test
    public void testGetSubstring() {
        assertEquals("ell", Unit2.getSubstring("Hello", 1, 4));
    }

    @Test
    public void testGetAbsoluteValue() {
        assertEquals(10, Unit2.getAbsoluteValue(-10));
        assertEquals(5, Unit2.getAbsoluteValue(5));
    }

    @Test
    public void testReplaceCharacter() {
        assertEquals("Hezzo", Unit2.replaceCharacter("Hello", 'l', 'z'));
    }

    @Test
    public void testPowerOf() {
        assertEquals(16.0, Unit2.powerOf(2.0, 4.0), 0.001);
    }
}