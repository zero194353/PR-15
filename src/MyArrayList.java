class Ball {
    private String color;
    private double diameter;

    Ball(String c, double d) {
        color = c;
        diameter = d;
    }

}


public class MyArrayList {

    private Ball[] items;

    private int size = 0;

    public MyArrayList(int length) {
        items = new Ball[length];
    }


    public int getSize() {
        return size;
    }

    public Ball Get(int index) {
        if (index >= size || index < 0) {
            throw new Error("Индекс находится за пределами массива.");
        }
        return items[index];
    }

    public int Find(Ball key) {
        for (int i = 0; i < size; i++) {
            if (items[i] == key) {
                return i;
            }
        }

        return -1;
    }

    private void IncreaseArray() {
        int newCount = size * 2;
        if (size == 0) {
            newCount = 4;
        }

        var newArray = new Ball[newCount];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[i];
        }

        items = newArray;
    }

    public void PushBack(Ball item) {
        if (size == items.length) {
            IncreaseArray();
        }
        items[size] = item;
        size++;
    }

    public void Insert(int index, Ball item) {
        if (index < 0 || index > size) {
            throw new Error("Выход за пределами массива");
        }
        if (size == items.length) {
            IncreaseArray();
        }

        // сдвигаем все элементы вправо до нужного индекса
        for (int i = size - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        items[index] = item;
        size++;
    }

    public void PushFront(Ball item) {
        Insert(0, item);
    }

    public void PopBack() {
        if (size == 0) {
            throw new Error("Массив пустой.");
        }
        size--;
    }

    public void PopFront() {
        RemoveByIndex(0);
    }

    public void RemoveByIndex(int index) {
        if (size == 0) {
            throw new Error("Массив пустой!");
        }
        if (index < 0 || index >= size) {
            throw new Error("Выход за пределы массива");
        }
        for (int i = index + 1; i < size; i++) {
            items[i - 1] = items[i];
        }

        size--;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(1);
        myArrayList.PushBack(new Ball("black", 2));
        myArrayList.PushBack(new Ball("red", 6));
        myArrayList.PushBack(new Ball("green", 8));
        System.out.println(myArrayList.getSize());

        myArrayList.RemoveByIndex(1);
    }
}


