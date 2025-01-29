import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class synchronizedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> hm = Collections.synchronizedMap(new HashMap<>());
        hm.put("Abhishek", 12);
        hm.put("Kartik", 43);
        hm.put("Nishant", 54);
        
        for(Map.Entry<String,Integer> e:hm.entrySet())
        {
            Integer value = e.getValue();
            if(value>30)
            {
            System.out.println(e.getKey()+" "+e.getValue());
            }
        }
System.out.println();
        System.out.println("Using ForEach Loop: ");
        hm.entrySet().stream().filter(x->x.getValue()>=30).forEach(e->System.out.println(e.getKey()+" "+e.getValue()));

    }
}
