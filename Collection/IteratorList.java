import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(9);
        li.set(4, null);
        li.add(8);
        li.add(1);
      

        Iterator<Integer> itr = li.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Index of unpresent element in arrayList"+li.indexOf(2));
        System.out.println("Index of Present Element is: "+li.indexOf(1));
        System.out.println("Last Index of Present element is: "+li.lastIndexOf(1));
        System.out.println(li.get(li.lastIndexOf(1)));
        System.out.println(li.hashCode());

        List<Integer> li1 = new ArrayList<>();
        li1.add(1);
        li1.add(3);
        System.out.println(li.containsAll(li1));
       


    }
}
