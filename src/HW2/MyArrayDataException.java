package HW2;

public class MyArrayDataException extends Exception{
    private int row;
    private int column;

    public MyArrayDataException(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String getMessage() {
        return "Некоторые данные в массиве: х = " + row + " y = " + column;
    }
}
