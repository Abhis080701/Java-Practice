class Thread1 implements Runnable
{
    public void run()
    {
        System.out.println("Thread runnnig using Runnable interface.");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        Runnable r = new Thread1();
        Thread t = new Thread(r);
        t.start();


    }
}
