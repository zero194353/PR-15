import java.util.ArrayList;
import java.util.List;

public class ArrayListT {
    public static void main(String[] args) {
        List<Integer> arrayList = new java.util.ArrayList<>();
        if (arrayList.isEmpty()) {
            arrayList.add(56);
            arrayList.add(98);
            arrayList.add(35);
        }

        System.out.println(arrayList.isEmpty());

        java.util.ArrayList<Integer> arrayList1 = new java.util.ArrayList<>();
        arrayList1.add(12);
        arrayList1.add(13);
        arrayList.add(3, 78);
        arrayList.addAll(arrayList1);
        arrayList.addAll(1, arrayList1);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "   ");
        }

        System.out.println(arrayList.contains(new Integer(34)));

        arrayList.remove(arrayList1.size() - 1);
        arrayList.remove(4);
        arrayList.remove(5);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "   ");
        }
    }
}
