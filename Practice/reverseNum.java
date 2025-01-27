public class reverseNum {
    static int  reverseNum1(int n)
    {
        int reverse=0;
        while (n!=0) {
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseNum1(123));
    }
}
