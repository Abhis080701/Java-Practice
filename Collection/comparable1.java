import java.util.Arrays;

class NumberSort implements Comparable<NumberSort>  {
    int num;

    public NumberSort(int num) {
        this.num = num;
    }

    public String toString() {
        return "num: " + num;
    }

    public int compareTo(NumberSort n) {
        /*
         * sort the Element by asending order for (this.num - n.num)
         * 
         * sort the Element by desending order for(n.num - this.num)
         */
        // return this.num - n.num;
        return n.num - this.num;
    }
}

public class comparable1 {
   public static void main(String[] args) {
    NumberSort[] n = { new NumberSort(1), new NumberSort(3), new NumberSort(6),
        new NumberSort(2), new NumberSort(0)};

        System.out.println("Before Sorting :"+Arrays.toString(n));

        Arrays.sort(n);

        System.out.println("After Sorting: "+Arrays.toString(n));
   }

}
