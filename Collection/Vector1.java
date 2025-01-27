import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.addElement(2);
        v.addElement(3);
        v.addFirst(0);
        v.addLast(4);

        for (int ele : v) {
            System.out.println(ele);
        }
    }
}
