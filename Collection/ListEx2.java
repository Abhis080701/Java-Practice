import java.util.*;
public class ListEx2 {
  
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(78);
        li.add(86);
        li.add(23);
        li.add(56);

       for(int i=0;i<li.size();i++)
       {
        if(li.get(i)>=75)
        {
            System.out.println(li.get(i));
        }
       }
    }
}
