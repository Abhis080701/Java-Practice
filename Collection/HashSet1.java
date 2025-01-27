import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4 }));
        set2.addAll(Arrays.asList(new Integer[] { 5, 6, 2, 4, 8, 9 }));
        System.out.println("SET 1: " + set1);
        System.out.println("SET 2: " + set2);
        System.out.println();
        System.out.println("UNION: ");
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
        System.out.println();
        System.out.println("INTERSECTION: ");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        System.out.println();
        System.out.println("DIFFERENCE: ");
        Set<Integer> diff = new HashSet<>(set1);

        diff.removeAll(set2);
        System.out.println(diff);

    }
}
