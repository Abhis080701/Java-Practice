public class FactorialEx {
    static long Fact(long num) {
        if (num == 0)
            return 1;
        else
            return num * Fact(num - 1);
    }

    public static void main(String[] args) {
        for (long i = 0; i <= 10; i++) {
            System.out.print(Fact(i) + " ");
        }
    }
}
