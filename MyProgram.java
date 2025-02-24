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