import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

class Mythread extends Thread
{
    public void run()
    {
        System.out.println("Running: "+Thread.currentThread().getName());
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Mythread t1= new Mythread();
        // Mythread t2 = new Mythread();
       
        // t1.start();
        // t2.start();
        List<String> names = Arrays.asList("John", "Jane", "Alex","CCC");

    names.stream().filter(x->x.startsWith("J") || x.startsWith("A")).forEach(x->System.out.println(x));



    }
}
