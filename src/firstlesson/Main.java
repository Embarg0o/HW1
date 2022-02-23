package firstlesson;

public class Main {
    public static void main(String[] args) {
        // восстановить int[5] = 4;
        try {
            int[] ints = new int[4];
            ints[5] = 5; // кидает ArrayIndexOutOfBoundsException
            System.out.println(ints[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int test = 1 / 0; // кидает ArithmeticException
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


        Cat cat = new Cat("Мышкин", "Белый", 10);
        Plate plate = new Plate(10);
        cat.appetite = 20;

        try {
            cat.eat(plate);
        } catch (EmptyFoodInPlate emptyFoodInPlate) {
            System.out.println(emptyFoodInPlate.getMessage());
        }
    }

}
