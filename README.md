# Unit 2: Using Objects

AP Computer Science A

## Overview

This project covers **Unit 2: Using Objects** concepts including calling methods on `String` and `Math` objects, method signatures, parameters, and return values. Implement the 10 methods in `Unit2.java` and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/unit2/Unit2.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit2Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit2Test#testConcatenateStrings test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `concatenateStrings(String, String)` | 10 | String concatenation |
| 2 | `calculateSquareRoot(double)` | 10 | `Math.sqrt()` |
| 3 | `toUpperCase(String)` | 10 | `String.toUpperCase()` |
| 4 | `findMax(int, int)` | 10 | `Math.max()` |
| 5 | `getStringLength(String)` | 10 | `String.length()` |
| 6 | `roundValue(double)` | 10 | `Math.round()`, casting |
| 7 | `getSubstring(String, int, int)` | 10 | `String.substring()` |
| 8 | `getAbsoluteValue(int)` | 10 | `Math.abs()` |
| 9 | `replaceCharacter(String, char, char)` | 10 | `String.replace()` |
| 10 | `powerOf(double, double)` | 10 | `Math.pow()` |
| | **Total** | **100** | |

## Method Details

### 1. `concatenateStrings(String str1, String str2)` — 10 points
Joins two strings with a space in between.
- `concatenateStrings("Hello", "World")` → `"Hello World"`

### 2. `calculateSquareRoot(double number)` — 10 points
Returns the square root using `Math.sqrt()`.
- `calculateSquareRoot(25.0)` → `5.0`

### 3. `toUpperCase(String str)` — 10 points
Converts a string to all uppercase letters.
- `toUpperCase("hello")` → `"HELLO"`

### 4. `findMax(int num1, int num2)` — 10 points
Returns the larger of two integers using `Math.max()`.
- `findMax(10, 5)` → `10`

### 5. `getStringLength(String str)` — 10 points
Returns the number of characters in a string.
- `getStringLength("Hello")` → `5`

### 6. `roundValue(double value)` — 10 points
Rounds a double to the nearest integer using `Math.round()`.
- `roundValue(7.4)` → `7`
- `roundValue(7.5)` → `8`

### 7. `getSubstring(String str, int beginIndex, int endIndex)` — 10 points
Returns a portion of the string from beginIndex (inclusive) to endIndex (exclusive).
- `getSubstring("Hello", 1, 4)` → `"ell"`

### 8. `getAbsoluteValue(int number)` — 10 points
Returns the absolute (non-negative) value using `Math.abs()`.
- `getAbsoluteValue(-10)` → `10`

### 9. `replaceCharacter(String str, char oldChar, char newChar)` — 10 points
Replaces all occurrences of a character in a string.
- `replaceCharacter("Hello", 'l', 'z')` → `"Hezzo"`

### 10. `powerOf(double base, double exponent)` — 10 points
Raises a base to a power using `Math.pow()`.
- `powerOf(2.0, 4.0)` → `16.0`

## Common Mistakes

- Forgetting that `String.substring()` end index is **exclusive** (e.g., `substring(1, 4)` gives characters at indices 1, 2, 3)
- Confusing `String.length()` (a method with parentheses) with array `.length` (a field without parentheses)
- Not casting `Math.round()` result to `int` (it returns a `long`)
- Forgetting the space when concatenating strings
- Using `==` instead of `.equals()` to compare String contents

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each method is tested independently — you earn points for each method you complete correctly.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
