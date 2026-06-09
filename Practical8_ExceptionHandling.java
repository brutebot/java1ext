// Practical 8 - Exception Handling
class ExceptionDemo {
    void divideNumbers() {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero..!!");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();
        obj.divideNumbers();
    }
}
