public class withoutLock {

    public synchronized void outerMethod() {
        System.out.println("Outer Method");
        innerMethod();
    }

    private synchronized void innerMethod() {
        System.out.println("Inner Method ");
    }

    public static void main(String[] args) {
        withoutLock l = new withoutLock();
      Runnable r = new Runnable() {

        @Override
        public void run() {
          l.outerMethod();
        }
        
      };
      Thread t1 = new Thread(r,"Thread 1");
      Thread t2 = new Thread(r,"Thread 2");
      t1.start();
      t2.start();    }
}
