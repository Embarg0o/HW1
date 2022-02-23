package firstlesson;

public class Calculator {
    public static double action(double first, double second) {
        try {
            return first / second;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
            return 0;
        }
    }
}
