package secondLesson;

// T, S, U, V и так далее - тип данных
// K - key - ключ
// V - value - значение
// E - element - элемент
// N - зарезервировано

public class Cup<T extends Liquid> {
    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public T getLiquid() {
        return liquid;
    }

    public void compareLiquids(Cup<?> another) {
        // do smth...
    }
}
