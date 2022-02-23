package firstlesson;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }
}
