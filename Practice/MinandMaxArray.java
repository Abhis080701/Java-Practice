public class MinandMaxArray {
    // it return the min element from the array.
    public static int Min(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < maxValue)
                maxValue = arr[i];
        }
        return maxValue;
    }

    // it return max element from the array.
    public static int Max(int[] arr) {
        int maxValue = arr[0];
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]>maxValue)
            maxValue = arr[i];
       }
        return maxValue;
    }

    public static void main(String[] args) {

        System.out.println("MIN ELEMENT: "+Min(new int[]{1,2,44,32,11,56}));
        System.out.println("MAX ELEMENT: "+Max(new int[]{1,2,44,32,11,56}));

    }

}
