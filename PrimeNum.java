import java.util.Scanner;

public class PrimeNum {
    static boolean isPrime(int Num)
    {
       // System.out.println(Math.sqrt(Num));
        if(Num<=1) return false;
         for(int i=2;i<=Num/2;i++)
                      if(Num%i==0)
                         return false;
                         return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println("Prime No is: ");
        for(int i=0;i<=n;i++)
        {
        if (isPrime(i)) {
            System.out.print(i+" ");
        }
    }
    }
}
