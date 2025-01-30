public class RevNum {
     static void revN(int n)
     {
        String Original = String.valueOf(n);

        String rev="";
        for(int i=Original.length()-1;i>=0;i--)
        {
         rev+= Original.charAt(i);
        }
        System.out.println(rev);
     }
    public static void main(String[] args) {
       revN(100);
    }

}
