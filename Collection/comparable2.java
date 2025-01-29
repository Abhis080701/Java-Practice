import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>
{
    private int rollNo;
    private String name;

    public Student(int rollNo,String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    } 

    public int compareTo(Student s)
    {
        if((this.name.compareTo(s.name))!=0)
        {
            return this.name.compareTo(s.name);
        }
        return this.rollNo - s.rollNo;
    }
    

}

public class comparable2 {
    public static void main(String[] args) {

        List<Student> li = Arrays.asList(
            new Student(102, "kartik"),
            new Student(101, "Nishant"),
            new Student(104, "Chandu"),
            new Student(105, "Sushant"),
            new Student(103, "Sushant")
        );
        System.out.println("Before Sorting Element: ");
       li.stream().forEach(x->System.out.println(x.getRollNo()+" "+x.getName()));
       System.out.println();
        Collections.sort(li);
       System.out.println("After Sorting Student By Name: ");
        li.stream().forEach(x->System.out.println(x.getName()+" "+x.getRollNo()));




    }
}
