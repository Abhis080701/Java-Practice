import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListFact {
    public static void main(String[] args) {
        List <Integer> fact = Arrays.asList(1,2,3,4,5);

        Iterator <Integer> itr = fact.iterator();
        while (itr.hasNext()) {
            //  fact.stream().flatMap(x->x==0).
        }
    }
}
