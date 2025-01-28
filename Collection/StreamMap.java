import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
    List<String> li = Arrays.asList("Abhishek","Kartik","Chandu Patil");
    Map<String, Integer> collect = li.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length()));
    collect.entrySet().stream()
    .forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
}
}
