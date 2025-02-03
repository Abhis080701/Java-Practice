import java.util.Iterator;
import java.util.LinkedList;

public class reverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1  = new LinkedList<>();
        l1.add("Abhis");
        l1.add("Kartik");
        l1.add("Nishant");
       // System.out.println(l1.element() +" "+l1.indexOf("Abhi"));
        l1.offer("AA");
        // l1.poll();
        // l1.pop();
        l1.removeFirstOccurrence("A");
        System.out.println(l1);
        // Iterator<String> itr = l1.descendingIterator();
        // while (itr.hasNext()) {
        //     System.out.print(itr.next()+" ");
        // }
       
        
    }
}
