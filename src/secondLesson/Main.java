package secondLesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"1", "2"};
        System.out.println(Arrays.toString(strings));
        changeArrayElements(strings, 0, 1);
        System.out.println(Arrays.toString(strings));

        Cup<Water> waterCup = new Cup<>(new Water());
        Cup<Tea> teaCup = new Cup<>(new Tea());
    }

    public static <T>void changeArrayElements(T[] array, int firstIndex, int secondIndex) {
        T arrayElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = arrayElement;
    }
}
