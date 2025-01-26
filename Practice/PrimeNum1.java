import java.util.Scanner;

public class PrimeNum1 {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n1 = sc.nextInt();
    if(isPrime(n1))
         System.out.println(n1);
         int start =1;
         int end = 100;

         System.out.println("Prime Num between the "+start+" and "+end);
         for(int i=start;i<=end;i++)
         {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
         }
        

}
}
