import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class hashMap1 {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 5);
       // System.out.println(hm);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
