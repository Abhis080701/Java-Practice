import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue<>();
        p.add("A");
        p.add("B");
        p.add("C");
        p.add("D");
        // p.add(null);//null is not allowed in Queue.

        System.out.println("Return the Head element(): " + p.element());
        System.out.println();
        System.out.println("Peek " + p.peek());
        System.out.println();
        Iterator<String> itr = p.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
