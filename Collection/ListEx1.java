import java.util.*;

public class ListEx1
{
    public static void main(String[] args) {
        List<String> li  = new ArrayList<>();
        li.add("Abhishek");
        li.add("Nishant");
        li.add("Kartik");
        li.add("Shubham");
        li.add("Abhay");
        List<String> li1 = new ArrayList<>();
        li1.add("Saurabh");
        li1.add("Chandrashekhar");
        li1.addAll(li);
        for(String ele:li)
        {
           // System.out.println(ele);
            if(ele.startsWith("Abhi"))
                      System.out.println(ele);
                
        }
        for (String string : li1) {
            System.out.println(string);
        }

    }
}