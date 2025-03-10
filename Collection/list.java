import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class list {
    public static void main(String[] args) {
        List<Long> li = new LinkedList<>();
        Map<Long, Long> map = new HashMap<>();
        // for(long i=0;i<=12233323;i++)
        // {
        // li.add(i);
        // }
      //  System.out.println(li);
      //  System.out.println(li.get(1223332));
        for (long i = 1; i <= 10; i++) {
            map.put(i, i);
        }
        map.get(1);
        int index = map.hashCode()%map.size();
        System.out.println(index);
      //  System.out.println(map.get(1223332l));
    }
}