package secondLesson;

public class Plate<T extends Meat, S extends Vegetables> {
    private T firstPart;
    private S secondPart;

    public Plate(T firstPart, S secondPart) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    public void showTypes() {
        System.out.println(firstPart.getClass().getSimpleName());
        System.out.println(secondPart.getClass().getSimpleName());
    }
}
