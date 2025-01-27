import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> li1 = new LinkedList<>();
        li1.add(1);
        li1.add(3);
        li1.add(5);
        li1.add(6);
       li1.offer(7);
       li1.offerFirst(0);
       li1.offerLast(8);
       
        Iterator<Integer> itr = li1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n After Invoking the offer() offerFirst() offerLast() method ");
        System.out.println("Getting the First Element from the LinkedList: " + li1.getFirst());
        System.out.println("Getting the Last Element from the LinkedList: " + li1.getLast());
         System.out.println("Top Element in the Linked List:"+li1.peek());
         System.out.println("First Element From the LinkedList: "+li1.peekFirst());
         System.out.println("Last Element From the List: "+li1.peekLast());
         System.out.println("poll() it retrieves the first Element from the head and remove it: "+li1.poll());
         System.out.println("pop():it retrieves the first Element from the head and remove it "+li1.pop());
        System.out.println();
        System.out.println();

        System.out.println("Iteratoring the Elements thr List Iterator: ");
        ListIterator<Integer> listItr = li1.listIterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next()+" ");
        }
    }
}
