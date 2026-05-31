// Practical 7 - Method Overloading and Overriding (Calculator)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        int sum = a + b;
        System.out.println("Advanced Add: The sum of " + a + " and " + b + " is " + sum);
        return sum;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add two integers: " + calc.add(10, 20));
        System.out.println("Add two floats: " + calc.add(5.5f, 2.5f));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));

        AdvancedCalculator advCalc = new AdvancedCalculator();
        advCalc.add(15, 25);
    }
}
