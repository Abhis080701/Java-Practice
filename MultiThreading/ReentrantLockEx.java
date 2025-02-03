import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    private final  Lock lock = new ReentrantLock();
    private static int  count = 0;
    public void outerMethod() {
        lock.lock();
        try {
            ++count;
            System.out.println("Outer Method ");
            System.out.println("lock aquired for a  outer: "+count);
            innerMethod();
        } finally {
            lock.unlock();
            --count;
            System.out.println("lock released for a outer "+count);
            
        }
    }

    private void innerMethod() {
        lock.lock();
        try {
            ++count;
            System.out.println("Inner Method");
            System.out.println("lock aquired for a inner "+count);
        } finally {
            lock.unlock();
            --count;
            System.out.println("lock released for a inner "+count);
        }
    }

    public static void main(String[] args) {
    ReentrantLockEx lockEx = new ReentrantLockEx();
    lockEx.outerMethod();

    }

}