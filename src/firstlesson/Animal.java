package firstlesson;

public abstract class Animal implements Movable {
    // firstLesson.Animal this = *адрес_объекта*
    protected int age;
    protected String name;
    protected String color;

    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void move() {
        System.out.println(name + " идет на лапках");
    }

    public abstract void voice();
}
