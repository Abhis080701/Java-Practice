package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) {
        long submit = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for(int i=0;i<=1000;i++) {
            int finalLZ = i;
            executorService.submit(() ->
            {
            System.out.println(finalLZ);
            });
        }
        executorService.shutdown();
    }
}
