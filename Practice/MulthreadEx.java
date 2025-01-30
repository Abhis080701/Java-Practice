public class MulthreadEx implements Runnable {
    public void run() {
        try {
            System.out.println("The Thread: " + Thread.currentThread().getId() + " currently running !");
            // Thread.sleep(8000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
         for (int i = 1; i <=5; i++) {
            Thread t = new Thread(new MulthreadEx());
            t.start();
           
         }
    }
}
