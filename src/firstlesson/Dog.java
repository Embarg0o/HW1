package firstlesson;

public class Dog extends Animal {
    public Dog(String newName, String newColor, int newAge) {
        super(newAge, newName, newColor);
    }

    public void voice() {
        System.out.println(name + " гав");
    }
}
