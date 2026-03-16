package unit2;

public class Unit2 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
        // Example: test concatenateStrings
        System.out.println("concatenateStrings(\"Hello\", \"World\") = " + concatenateStrings("Hello", "World"));  // Expected: Hello World
    }

    /**
     * Concatenates two strings with a space in between.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>concatenateStrings("Hello", "World") returns "Hello World"</li>
     *   <li>concatenateStrings("AP", "CSA") returns "AP CSA"</li>
     * </ul>
     *
     * <p>Hint: Use the + operator to join strings. Don't forget the space between them!</p>
     *
     * @param str1 the first string
     * @param str2 the second string
     * @return the concatenated string with a space in between
     */
    public static String concatenateStrings(String str1, String str2) {
        // TODO: Implement this method using String concatenation
        return null;
    }

    /**
     * Returns the square root of a given number using the Math class.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>calculateSquareRoot(25.0) returns 5.0</li>
     *   <li>calculateSquareRoot(100.0) returns 10.0</li>
     * </ul>
     *
     * <p>Hint: Use Math.sqrt(number) to calculate the square root.</p>
     *
     * @param number the number to find the square root of
     * @return the square root of the number
     */
    public static double calculateSquareRoot(double number) {
        // TODO: Implement this method using Math.sqrt
        return 0.0;
    }

    /**
     * Converts a string to uppercase.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>toUpperCase("hello") returns "HELLO"</li>
     *   <li>toUpperCase("Java") returns "JAVA"</li>
     * </ul>
     *
     * <p>Hint: Call the toUpperCase() method on the String object: str.toUpperCase()</p>
     *
     * @param str the string to convert
     * @return the string in uppercase
     */
    public static String toUpperCase(String str) {
        // TODO: Implement this method using String.toUpperCase
        return null;
    }

    /**
     * Returns the maximum of two integers using the Math class.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>findMax(10, 5) returns 10</li>
     *   <li>findMax(10, 15) returns 15</li>
     *   <li>findMax(7, 7) returns 7</li>
     * </ul>
     *
     * <p>Hint: Use Math.max(num1, num2) to find the larger value.</p>
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the maximum of the two integers
     */
    public static int findMax(int num1, int num2) {
        // TODO: Implement this method using Math.max
        return 0;
    }

    /**
     * Returns the length of a string.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>getStringLength("Hello") returns 5</li>
     *   <li>getStringLength("") returns 0</li>
     *   <li>getStringLength("Hello World") returns 11</li>
     * </ul>
     *
     * <p>Hint: Call the length() method on the String: str.length()</p>
     *
     * @param str the string to check
     * @return the length of the string
     */
    public static int getStringLength(String str) {
        // TODO: Implement this method using String.length
        return 0;
    }

    /**
     * Rounds a double value to the nearest integer using the Math class.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>roundValue(7.4) returns 7 (rounds down)</li>
     *   <li>roundValue(7.5) returns 8 (0.5 rounds up)</li>
     * </ul>
     *
     * <p>Hint: Use Math.round(value). Note that Math.round returns a long,
     * so you will need to cast it to int: (int) Math.round(value)</p>
     *
     * @param value the value to round
     * @return the rounded integer
     */
    public static int roundValue(double value) {
        // TODO: Implement this method using Math.round
        return 0;
    }

    /**
     * Returns a substring of the given string from beginIndex (inclusive)
     * to endIndex (exclusive).
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>getSubstring("Hello", 1, 4) returns "ell"</li>
     *   <li>getSubstring("Hello", 0, 3) returns "Hel"</li>
     * </ul>
     *
     * <p>Hint: Use str.substring(beginIndex, endIndex). Remember that
     * beginIndex is inclusive and endIndex is exclusive.</p>
     *
     * @param str the original string
     * @param beginIndex the beginning index, inclusive
     * @param endIndex the ending index, exclusive
     * @return the specified substring
     */
    public static String getSubstring(String str, int beginIndex, int endIndex) {
        // TODO: Implement this method using String.substring
        return null;
    }

    /**
     * Returns the absolute value of an integer using the Math class.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>getAbsoluteValue(-10) returns 10</li>
     *   <li>getAbsoluteValue(5) returns 5</li>
     *   <li>getAbsoluteValue(0) returns 0</li>
     * </ul>
     *
     * <p>Hint: Use Math.abs(number) to get the absolute value.</p>
     *
     * @param number the number to find the absolute value of
     * @return the absolute value of the number
     */
    public static int getAbsoluteValue(int number) {
        // TODO: Implement this method using Math.abs
        return 0;
    }

    /**
     * Replaces all occurrences of a specified character in a string.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>replaceCharacter("Hello", 'l', 'z') returns "Hezzo"</li>
     *   <li>replaceCharacter("Java", 'a', 'e') returns "Jeve"</li>
     * </ul>
     *
     * <p>Hint: Use str.replace(oldChar, newChar) to replace all
     * occurrences of a character.</p>
     *
     * @param str the original string
     * @param oldChar the character to be replaced
     * @param newChar the character to replace with
     * @return the string with replaced characters
     */
    public static String replaceCharacter(String str, char oldChar, char newChar) {
        // TODO: Implement this method using String.replace
        return null;
    }

    /**
     * Returns the result of raising a base to a power using the Math class.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>powerOf(2.0, 4.0) returns 16.0</li>
     *   <li>powerOf(5.0, 0.0) returns 1.0</li>
     *   <li>powerOf(3.0, 3.0) returns 27.0</li>
     * </ul>
     *
     * <p>Hint: Use Math.pow(base, exponent) to calculate the result.</p>
     *
     * @param base the base value
     * @param exponent the exponent value
     * @return the result of base raised to the power of exponent
     */
    public static double powerOf(double base, double exponent) {
        // TODO: Implement this method using Math.pow
        return 0.0;
    }
}
