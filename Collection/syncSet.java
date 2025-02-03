import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class syncSet {
    public static void main(String[] args) {
      Set<String> s = Collections.synchronizedSet(new HashSet<>()); 
      for (int i = 1; i <=20; i++) {
        s.add(""+i);
      }
      System.out.println(s.contains("2"));
     Iterator<String> itrSet = s.iterator();
     while (itrSet.hasNext()) {
        System.out.print(" "+itrSet.next());
     }

       
    }
}