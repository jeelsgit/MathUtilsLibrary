# MathUtilsLibrary

This is a small Java library that provides simple math functions like adding, subtracting, multiplying, and dividing numbers. It's designed to be easy to use in your Java projects.

## Features

* **Addition:** Add two numbers together.
* **Subtraction:** Subtract one number from another.
* **Multiplication:** Multiply two numbers.
* **Division:** Divide one number by another (with error handling to prevent crashes if you try to divide by zero).

## How to Use

### 1. Download

* Download the `MathUtilsLibrary.jar` and `MyProgram.java` files from this GitHub repository: [https://github.com/jeelsgit/MathUtilsLibrary.git](https://github.com/jeelsgit/MathUtilsLibrary.git)

### 2. Set Up

* Create a new folder for your project.
* Put `MyProgram.java` directly in this folder.
* Create a subfolder named `libs`.
* Put `MathUtilsLibrary.jar` into the `libs` subfolder.

### 3. Compile

* Open your command prompt/terminal.
* Go to your project folder.
* Type in this command and press Enter: `javac -cp libs/MathUtilsLibrary.jar MyProgram.java`

### 4. Run

* After compiling, type in this command and press Enter:
    * **Windows:** `java -cp libs/MathUtilsLibrary.jar;. MyProgram`
    * **Linux/macOS:** `java -cp libs/MathUtilsLibrary.jar:. MyProgram`

## Using Git (for developers)

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/jeelsgit/MathUtilsLibrary.git](https://github.com/jeelsgit/MathUtilsLibrary.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd MathUtilsLibrary
    ```
3.  **Compile and package the JAR:**
    ```bash
    javac -d bin -sourcepath src src/com/example/mathutils/MathUtils.java
    jar cvf MathUtilsLibrary.jar -C bin .
    ```
    The jar file will now be located in the main project directory.

## Using Maven (If Deployed to Maven Central)

Add this to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>mathutils</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Example Code (Java)

```java
import com.example.mathutils.MathUtils;

public class MyProgram {
    public static void main(String[] args) {
        try {
            int additionResult = MathUtils.add(5, 3);
            int subtractionResult = MathUtils.subtract(10, 4);
            int multiplicationResult = MathUtils.multiply(2, 6);
            double divisionResult = MathUtils.divide(15, 3);

            System.out.println("Addition: " + additionResult);
            System.out.println("Subtraction: " + subtractionResult);
            System.out.println("Multiplication: " + multiplicationResult);
            System.out.println("Division: " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}
```

## License

This project is licensed under the MIT License.

## Contact

If you have questions, please open a GitHub issue or contact: tand0019@algonquinlive.com
