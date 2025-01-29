import java.util.Hashtable;
import java.util.Enumeration;

public class Enumeration1 {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("AA", 83);
        ht.put("BB",72);
        ht.put("CC",43);

  Enumeration<Integer> values = ht.elements();
  while(values.hasMoreElements())
  {
    System.out.println(values.nextElement());
  }
 
    }
    }

