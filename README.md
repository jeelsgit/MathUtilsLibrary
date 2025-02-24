# MathUtilsLibrary
1. Overview
MathUtilsLibrary is a Java library that provides essential mathematical operations such as addition, subtraction, multiplication, and division. This library is designed for easy integration into Java projects.
2. Features
•	Addition of two numbers
•	Subtraction of two numbers
•	Multiplication of two numbers
•	Division of two numbers with error handling
3. Installation Instructions
Using JAR File
1.	Download the JAR: 
o	Download MathUtilsLibrary.jar and MyProgram.java from the repository: 
https://github.com/jeelsgit/MathUtilsLibrary.git 
2.	Add the JAR to Your Project: 
o	Create a new directory for your project. 
o	Place MyProgram.java in the root of your project directory. 
o	Create a subdirectory named libs (or lib, either is fine, but be consistent). 
o	Place MathUtilsLibrary.jar into the libs subdirectory.
3.	Compile the Java Program:
•	Open a command prompt or terminal and navigate to your project directory.
•	Compile MyProgram.java using the following command: 
o	javac -cp libs/MathUtilsLibrary.jar MyProgram.java
o	Note: Ensure you are in the directory that contains MyProgram.java when running this command.
 
4.	Run the Java Program:
•	After successful compilation, run the program using the following command: 
o	Windows: java -cp libs/MathUtilsLibrary.jar;. MyProgram
o	Linux/macOS: java -cp libs/MathUtilsLibrary.jar:. MyProgram
o	Explanation: 
	-cp libs/MathUtilsLibrary.jar tells the JVM to include the library in the classpath.
	;. (Windows) or :. (Linux/macOS) adds the current directory to the classpath, allowing the JVM to find MyProgram.class.
Using Git
1.	Clone the Repository: 
git clone https://github.com/jeelsgit/MathUtilsLibrary.git
2.	Navigate to the Project Directory: 
cd MathUtilsLibrary
3.	Compile and Package the JAR: 
javac -d bin -sourcepath src src/com/example/mathutils/MathUtils.java
jar cvf MathUtilsLibrary.jar -C bin .
Using Maven (If Deployed to Maven Central)
Add the following dependency to your pom.xml:
<dependency>
    <groupId>com.example</groupId>
    <artifactId>mathutils</artifactId>
    <version>1.0.0</version>
</dependency>
 
4. Usage Examples
Example Java Code
import com.example.mathutils.MathUtils;

    public class MyProgram {
        public static void main(String[] args) {
            try {
                int resultAdd = MathUtils.add(5, 3);
                int resultSub = MathUtils.subtract(10, 4);
                int resultMul = MathUtils.multiply(2, 6);
                double resultDiv = MathUtils.divide(15, 3);

                System.out.println("Addition: " + resultAdd);
                System.out.println("Subtraction: " + resultSub);
                System.out.println("Multiplication: " + resultMul);
                System.out.println("Division: " + resultDiv);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e);
            }
        }
    }
 
5. Contribution Guidelines
1.	Fork the repository and create a new branch.
2.	Make modifications and test your changes.
3.	Submit a pull request with a detailed explanation of your changes.
6. License
This project is licensed under the MIT License.
7. Contact
For any questions or issues, open a GitHub issue or contact: tand0019@algonquinlive.com
