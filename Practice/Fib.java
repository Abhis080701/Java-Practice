public class Fib {
    static int n1=0,n2=1,n3=0;
    static void fibonaci(int num)
    {
      if (num>0) {
        n3 = n1+n2;
        n1=n2;
        n2= n3;
        System.out.print(n3+" ");
        fibonaci(num-1);
      }
    }
    public static void main(String[] args) {
          int num=10;
          System.out.print(0+" "+1+" ");
         fibonaci(num-2);
    }
}
