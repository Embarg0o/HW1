package firstlesson;

public class Snake extends Animal {
    public Snake(int age, String name, String color) {
        super(age, name, color);
    }

    @Override
    public void move() {
        System.out.println(name + " ползёт");
    }

    public void voice() {
        System.out.println(name + " псссс");
    }

}
