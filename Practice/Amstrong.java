public class Amstrong {
    static boolean isAmstrong(int n) {
        int temp, last = 0, digits = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2000; i++) {
           if (isAmstrong(i)) {
            System.out.print(i+" ");
           }
        }
    }
}
