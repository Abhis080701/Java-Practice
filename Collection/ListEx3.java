import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    static int count;
    public static void main(String[] args) {
       
        List<String> li = new ArrayList<>();

        li.add("Abhishek");
        li.add("Nishant");
        li.add("Kartik");

        System.out.println("elementts of the ArrayList Are:");
        for (String ele : li) {
            System.out.println(ele+" "+ele.length());
            
        }

    }
}
