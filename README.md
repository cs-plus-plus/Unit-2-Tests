# CS++ Java — Unit 2: Using Objects

> **Unit 2** | 100 Points | 10 Autograded Tests

In this assignment you will call methods on `String` and `Math` objects. You will practice using method signatures, parameters, and return values — the building blocks of working with objects in Java.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### String Methods

A `String` is an object with built-in methods:

```java
String word = "Hello";

word.length()              // 5
word.toUpperCase()         // "HELLO"
word.toLowerCase()         // "hello"
word.substring(1, 3)       // "el" (from index 1 up to but not including 3)
word.contains("ell")       // true
word.replace('l', 'r')     // "Herro"
word.indexOf("ll")         // 2 (position of first occurrence)
```

**String concatenation** joins strings together:

```java
String first = "Hello";
String second = "World";
String result = first + " " + second;  // "Hello World"
```

### Math Class Methods

The `Math` class provides static methods for common math operations:

```java
Math.sqrt(16)        // 4.0 (square root)
Math.abs(-7)         // 7 (absolute value)
Math.max(3, 9)       // 9 (larger of two values)
Math.min(3, 9)       // 3 (smaller of two values)
Math.pow(2, 3)       // 8.0 (2 raised to the power of 3)
Math.round(4.6)      // 5 (rounds to nearest integer, returns long)
```

### Method Signatures

A method signature includes the return type, name, and parameters:

```java
public static double calculateSquareRoot(double number)
//     ^^^^^^ ^^^^^^                      ^^^^^^
//     static return                      parameter
//            type                        type
```

- **Return type** tells you what the method gives back
- **Parameters** tell you what the method needs as input
- **static** means you call it on the class, not an object

---

## Project Overview

You will implement ten methods in `Unit2.java`. Each method is a one-line (or two-line) call to a `String` or `Math` method. The goal is to get comfortable reading method signatures and knowing which built-in method to use.

---

## Methods to Implement

### 1. concatenateStrings(String str1, String str2)
Return the two strings joined with a space between them.

```java
concatenateStrings("Hello", "World")   // returns "Hello World"
concatenateStrings("AP", "CSA")        // returns "AP CSA"
```

### 2. calculateSquareRoot(double number)
Return the square root of the number using `Math.sqrt()`.

```java
calculateSquareRoot(16.0)   // returns 4.0
calculateSquareRoot(25.0)   // returns 5.0
calculateSquareRoot(2.0)    // returns 1.4142135623730951
```

### 3. toUpperCase(String str)
Return the string converted to all uppercase using `str.toUpperCase()`.

```java
toUpperCase("hello")    // returns "HELLO"
toUpperCase("Java")     // returns "JAVA"
```

### 4. findMax(int num1, int num2)
Return the larger of the two integers using `Math.max()`.

```java
findMax(3, 7)    // returns 7
findMax(10, 2)   // returns 10
findMax(5, 5)    // returns 5
```

### 5. getStringLength(String str)
Return the length of the string using `str.length()`.

```java
getStringLength("Hello")   // returns 5
getStringLength("")        // returns 0
getStringLength("AP CSA")  // returns 6
```

### 6. roundValue(double value)
Round the double to the nearest integer and return it as an `int`. Use `Math.round()` and cast the result.

```java
roundValue(4.6)    // returns 5
roundValue(4.4)    // returns 4
roundValue(-2.7)   // returns -3
```

### 7. getSubstring(String str, int beginIndex, int endIndex)
Return the substring from `beginIndex` (inclusive) to `endIndex` (exclusive).

```java
getSubstring("Hello", 1, 3)      // returns "el"
getSubstring("Computer", 0, 4)   // returns "Comp"
```

### 8. getAbsoluteValue(int number)
Return the absolute value using `Math.abs()`.

```java
getAbsoluteValue(-5)   // returns 5
getAbsoluteValue(3)    // returns 3
getAbsoluteValue(0)    // returns 0
```

### 9. replaceCharacter(String str, char oldChar, char newChar)
Return the string with all occurrences of `oldChar` replaced by `newChar`.

```java
replaceCharacter("Hello", 'l', 'r')    // returns "Herro"
replaceCharacter("banana", 'a', 'o')   // returns "bonono"
```

### 10. powerOf(double base, double exponent)
Return `base` raised to the power of `exponent` using `Math.pow()`.

```java
powerOf(2.0, 3.0)    // returns 8.0
powerOf(5.0, 2.0)    // returns 25.0
powerOf(10.0, 0.0)   // returns 1.0
```

---

## File Structure

```
Unit-2-Tests/
├── pom.xml                                <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/unit2/
│   │   └── Unit2.java                     <-- YOUR CODE GOES HERE
│   └── test/java/unit2/
│       └── Unit2Test.java                 <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                  <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit2.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testConcatenateStrings | Joins two strings with a space | 10 |
| testCalculateSquareRoot | `Math.sqrt()` of a number | 10 |
| testToUpperCase | Converts string to uppercase | 10 |
| testFindMax | Returns the larger of two ints | 10 |
| testGetStringLength | Returns string length | 10 |
| testRoundValue | Rounds double to nearest int | 10 |
| testGetSubstring | Extracts a substring by indices | 10 |
| testGetAbsoluteValue | Returns absolute value | 10 |
| testReplaceCharacter | Replaces all occurrences of a character | 10 |
| testPowerOf | Raises base to exponent | 10 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — String methods:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        String name = "Computer Science";
        System.out.println("Length: " + name.length());              // 16
        System.out.println("Upper: " + name.toUpperCase());          // COMPUTER SCIENCE
        System.out.println("Sub(0,8): " + name.substring(0, 8));    // Computer
        System.out.println("Replace: " + name.replace('e', '3'));    // Comput3r Sci3nc3
        System.out.println("Concat: " + "AP" + " " + "CSA");        // AP CSA
    }
}
```

**Example 2 — Math methods:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        System.out.println("sqrt(144): " + Math.sqrt(144));   // 12.0
        System.out.println("abs(-42): " + Math.abs(-42));      // 42
        System.out.println("max(8, 3): " + Math.max(8, 3));   // 8
        System.out.println("pow(3, 4): " + Math.pow(3, 4));   // 81.0
        System.out.println("round(7.6): " + Math.round(7.6)); // 8
    }
}
```

**Example 3 — Combining methods:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        String word = "Hello World";
        // Get the uppercase version of a substring
        String result = word.substring(6, 11).toUpperCase();
        System.out.println(result);  // WORLD

        // Chain math operations
        double hypotenuse = Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
        System.out.println("Hypotenuse: " + hypotenuse);  // 5.0
    }
}
```

---

## Tips for Success

1. Most of these methods are a single `return` statement calling a built-in method
2. `Math.round()` returns a `long`, so cast it to `int`: `return (int) Math.round(value);`
3. String methods do not modify the original string — they return a new one
4. `substring(beginIndex, endIndex)` includes `beginIndex` but excludes `endIndex`
5. Use `+` to concatenate strings: `str1 + " " + str2`
6. Run `mvn test` after each method to catch mistakes early

---

## FAQ

**Q: Why does `Math.round()` return `long` instead of `int`?**
Because doubles can be very large numbers that do not fit in an `int`. For this assignment, the test values fit in an `int`, so just cast the result: `(int) Math.round(value)`.

**Q: What is the difference between `replace(char, char)` and `replace(String, String)`?**
Both replace all occurrences. `replace('a', 'b')` works with single characters. `replace("abc", "xyz")` works with strings. This assignment uses the `char` version.

**Q: Can I use `Math.max()` and `Math.min()` with doubles?**
Yes. Both methods are overloaded to work with `int`, `long`, `float`, and `double`. This assignment uses the `int` version.

**Q: What happens if `beginIndex` equals `endIndex` in `substring()`?**
It returns an empty string `""`.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
