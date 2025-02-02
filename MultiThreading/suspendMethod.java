

public class suspendMethod  extends Thread {
    public void run()
    {
    for (int i = 1; i < 5; i++) { 
        try { 
            
            // thread to sleep for 500 milliseconds 
            sleep(5); 
            System.out.println( 
                "Currently running - "
                + Thread.currentThread().getName()); 
        } 
        catch (InterruptedException e) { 
            System.out.println(e); 
        } 
        System.out.println(i); 
    } }
    public static void main(String[] args) throws Exception {
      
        suspendMethod t1 = new suspendMethod();
        suspendMethod t2 = new suspendMethod();
        suspendMethod t3= new suspendMethod();


          t1.start();
          t2.start();
          
          t2.join();

          t3.join();
          t3.start();
    }
}
