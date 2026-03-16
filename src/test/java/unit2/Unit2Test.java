package unit2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Unit2Test {

    // ── Method 1: concatenateStrings (10 points) ────────────────────────────

    @Test
    @DisplayName("concatenateStrings: Join two strings with a space (10 points)")
    public void testConcatenateStrings() {
        assertAll("concatenateStrings",
            () -> assertEquals("Hello World", Unit2.concatenateStrings("Hello", "World"),
                "concatenateStrings(\"Hello\", \"World\") should return \"Hello World\" — join with a space"),
            () -> assertEquals("AP CSA", Unit2.concatenateStrings("AP", "CSA"),
                "concatenateStrings(\"AP\", \"CSA\") should return \"AP CSA\""),
            () -> assertEquals(" test", Unit2.concatenateStrings("", "test"),
                "concatenateStrings(\"\", \"test\") should return \" test\" (empty string + space + \"test\")")
        );
    }

    // ── Method 2: calculateSquareRoot (10 points) ───────────────────────────

    @Test
    @DisplayName("calculateSquareRoot: Square root using Math.sqrt (10 points)")
    public void testCalculateSquareRoot() {
        assertAll("calculateSquareRoot",
            () -> assertEquals(5.0, Unit2.calculateSquareRoot(25.0), 0.001,
                "calculateSquareRoot(25.0) should return 5.0 — use Math.sqrt()"),
            () -> assertEquals(0.0, Unit2.calculateSquareRoot(0.0), 0.001,
                "calculateSquareRoot(0.0) should return 0.0"),
            () -> assertEquals(10.0, Unit2.calculateSquareRoot(100.0), 0.001,
                "calculateSquareRoot(100.0) should return 10.0")
        );
    }

    // ── Method 3: toUpperCase (10 points) ───────────────────────────────────

    @Test
    @DisplayName("toUpperCase: Convert string to uppercase (10 points)")
    public void testToUpperCase() {
        assertAll("toUpperCase",
            () -> assertEquals("HELLO", Unit2.toUpperCase("hello"),
                "toUpperCase(\"hello\") should return \"HELLO\" — use String.toUpperCase()"),
            () -> assertEquals("JAVA", Unit2.toUpperCase("Java"),
                "toUpperCase(\"Java\") should return \"JAVA\" (mixed case input)"),
            () -> assertEquals("", Unit2.toUpperCase(""),
                "toUpperCase(\"\") should return \"\" (empty string stays empty)")
        );
    }

    // ── Method 4: findMax (10 points) ───────────────────────────────────────

    @Test
    @DisplayName("findMax: Maximum of two integers using Math.max (10 points)")
    public void testFindMax() {
        assertAll("findMax",
            () -> assertEquals(10, Unit2.findMax(10, 5),
                "findMax(10, 5) should return 10 — use Math.max()"),
            () -> assertEquals(15, Unit2.findMax(10, 15),
                "findMax(10, 15) should return 15"),
            () -> assertEquals(0, Unit2.findMax(0, -5),
                "findMax(0, -5) should return 0 (0 is greater than -5)"),
            () -> assertEquals(7, Unit2.findMax(7, 7),
                "findMax(7, 7) should return 7 (both values equal)")
        );
    }

    // ── Method 5: getStringLength (10 points) ───────────────────────────────

    @Test
    @DisplayName("getStringLength: Get length of a string (10 points)")
    public void testGetStringLength() {
        assertAll("getStringLength",
            () -> assertEquals(5, Unit2.getStringLength("Hello"),
                "getStringLength(\"Hello\") should return 5 — use String.length()"),
            () -> assertEquals(0, Unit2.getStringLength(""),
                "getStringLength(\"\") should return 0 (empty string has length 0)"),
            () -> assertEquals(11, Unit2.getStringLength("Hello World"),
                "getStringLength(\"Hello World\") should return 11 (spaces count as characters)")
        );
    }

    // ── Method 6: roundValue (10 points) ────────────────────────────────────

    @Test
    @DisplayName("roundValue: Round a double to nearest int using Math.round (10 points)")
    public void testRoundValue() {
        assertAll("roundValue",
            () -> assertEquals(7, Unit2.roundValue(7.4),
                "roundValue(7.4) should return 7 — rounds down"),
            () -> assertEquals(8, Unit2.roundValue(7.5),
                "roundValue(7.5) should return 8 — 0.5 rounds up"),
            () -> assertEquals(-3, Unit2.roundValue(-3.2),
                "roundValue(-3.2) should return -3 — negative rounding")
        );
    }

    // ── Method 7: getSubstring (10 points) ──────────────────────────────────

    @Test
    @DisplayName("getSubstring: Extract substring with begin and end index (10 points)")
    public void testGetSubstring() {
        assertAll("getSubstring",
            () -> assertEquals("ell", Unit2.getSubstring("Hello", 1, 4),
                "getSubstring(\"Hello\", 1, 4) should return \"ell\" — use String.substring(begin, end)"),
            () -> assertEquals("Hel", Unit2.getSubstring("Hello", 0, 3),
                "getSubstring(\"Hello\", 0, 3) should return \"Hel\" (indices are 0-based, end is exclusive)"),
            () -> assertEquals("World", Unit2.getSubstring("Hello World", 6, 11),
                "getSubstring(\"Hello World\", 6, 11) should return \"World\"")
        );
    }

    // ── Method 8: getAbsoluteValue (10 points) ──────────────────────────────

    @Test
    @DisplayName("getAbsoluteValue: Absolute value using Math.abs (10 points)")
    public void testGetAbsoluteValue() {
        assertAll("getAbsoluteValue",
            () -> assertEquals(10, Unit2.getAbsoluteValue(-10),
                "getAbsoluteValue(-10) should return 10 — use Math.abs()"),
            () -> assertEquals(5, Unit2.getAbsoluteValue(5),
                "getAbsoluteValue(5) should return 5 (already positive)"),
            () -> assertEquals(0, Unit2.getAbsoluteValue(0),
                "getAbsoluteValue(0) should return 0")
        );
    }

    // ── Method 9: replaceCharacter (10 points) ──────────────────────────────

    @Test
    @DisplayName("replaceCharacter: Replace all occurrences of a char (10 points)")
    public void testReplaceCharacter() {
        assertAll("replaceCharacter",
            () -> assertEquals("Hezzo", Unit2.replaceCharacter("Hello", 'l', 'z'),
                "replaceCharacter(\"Hello\", 'l', 'z') should return \"Hezzo\" — use String.replace()"),
            () -> assertEquals("banana", Unit2.replaceCharacter("banana", 'x', 'y'),
                "replaceCharacter(\"banana\", 'x', 'y') should return \"banana\" (char not found, no change)"),
            () -> assertEquals("Jeve", Unit2.replaceCharacter("Java", 'a', 'e'),
                "replaceCharacter(\"Java\", 'a', 'e') should return \"Jeve\" (replaces ALL occurrences)")
        );
    }

    // ── Method 10: powerOf (10 points) ──────────────────────────────────────

    @Test
    @DisplayName("powerOf: Base raised to a power using Math.pow (10 points)")
    public void testPowerOf() {
        assertAll("powerOf",
            () -> assertEquals(16.0, Unit2.powerOf(2.0, 4.0), 0.001,
                "powerOf(2.0, 4.0) should return 16.0 — use Math.pow()"),
            () -> assertEquals(1.0, Unit2.powerOf(5.0, 0.0), 0.001,
                "powerOf(5.0, 0.0) should return 1.0 (anything to the power of 0 is 1)"),
            () -> assertEquals(27.0, Unit2.powerOf(3.0, 3.0), 0.001,
                "powerOf(3.0, 3.0) should return 27.0 (3³ = 27)")
        );
    }
}
