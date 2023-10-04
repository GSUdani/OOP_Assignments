
public class Main {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Test the overloaded add methods
        int result1 = calculator.add(5, 10);
        int result2 = calculator.add(3, 7, 12);
        double result3 = calculator.add(2.5, 3.5);

        // Display the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
