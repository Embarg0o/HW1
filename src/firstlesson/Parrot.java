package firstlesson;

public class Parrot extends Bird {
    public Parrot(String newName, String newColor, int newAge, int height) {
        super(newName, newColor, newAge, height);
    }

    public void speak() {
        System.out.println(name + " хочет крекер!");
    }
}
