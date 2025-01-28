import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<List<String>> list =  Arrays.asList(
            Arrays.asList("A","B"),
            Arrays.asList("C","D"),
            Arrays.asList("E","F")
        );
        List<String> li = list.stream().flatMap(List::stream).map(String::toLowerCase).collect(Collectors.toList());;
        System.out.println(li);
    }
}
