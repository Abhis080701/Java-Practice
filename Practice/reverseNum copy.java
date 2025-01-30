public class reverseNum {
    static int ReverseNum(int n)
    {
        System.out.println("Reverse Using while");
        int rev=0;
        while (n!=0) {
          int remainder = n%10;
          rev = rev*10+remainder;
          n = n/10;  
        }
        return rev;
    }
    static String reverseNum1(String num)
    {
        String str = "";
        for(int i=num.length()-1;i>=0;i--)
        {
            str += num.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
      String reveString = reverseNum1("200");

      int reverseNumber = Integer.parseInt(reveString);
      System.out.println(reveString);

      System.out.println(ReverseNum(2000));

    }
}
