import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;


        for(int i=0;i<=30;i++)
        {
            if(isEven.test(i))
                System.out.print(i+" ");
        }
        
    }
}
