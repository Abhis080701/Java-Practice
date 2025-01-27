import java.util.ArrayList;
import java.util.List;

public class findMinMaxList {
    static void findMinMax(List<Integer> arrList) throws IllegalArgumentException {
        if (arrList.isEmpty()) {
            throw new IllegalArgumentException("Array List is Empty.");
        }
        int min  = arrList.get(0);
        int max = arrList.get(0);

        for(int ele:arrList)
        {
            if(ele>max)
            {
                max = ele;
            }
            if(ele<min)
            {
                min = ele;
            }
        }

        System.out.println("The Max Element From the ArrayList is: "+max);
        System.out.println("The Min Element From the ArrayList is: "+min);
    }


    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(45);
        arr.add(5);
        arr.add(7);
        arr.add(98);
        List<Integer> empty = new ArrayList<>();
        try {
            findMinMax(arr);
            findMinMax(empty);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

       
    }

}
