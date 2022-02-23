package firstlesson;

public class Bird extends Animal {
    int height;

    public Bird(String newName, String newColor, int newAge, int height) {
        super(newAge, newName, newColor);
        this.height = height;
    }

    public void voice() {
        System.out.println(name + " чирик");
    }

    public Bird getClone() throws CloneNotSupportedException {
        return (Bird) this.clone();
    }
}
