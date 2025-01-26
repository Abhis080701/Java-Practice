public class FibonacciEx1 {
static int n1=0,n2=1,n3=0;
static void printF(int count)
{
  if(count>0)
  {
    n3 = n1+n2;
    n1 =n2;
    n2 = n3;
    System.out.print(" "+n3);
    printF(count-1);
  }
}
public static void main(String[] args) {
    int cnt=10;
    System.out.print(n1+" "+n2);
    printF(cnt-2);
}
    
}