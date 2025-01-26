public class AmstrongNum {
    static boolean Amstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
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
        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        for(int i=1;i<=999;i++)
        {
            if(Amstrong(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
