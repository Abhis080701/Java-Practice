

public class PrimeNum2 {
    static boolean isPrime(int num)
    {
        if(num<=1)
        return false;
        for(int i=2;i<=Math.sqrt(num);i++)
           if(num%i==0)
             return false;
             return true;

    }
    public static void main(String[] args) {
       
         System.out.println("Prime Num between in 1 to 200");
         

         for(int i=1;i<=200;i++)
         {
            if (isPrime(i)) {
                System.out.println(i);
            }
         }

    }
}
