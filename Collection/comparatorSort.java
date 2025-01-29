import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    private String name;
    private int marks;

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student1 [name=" + name + ", marks=" + marks + "]";
    }
    
    

}

class SortByName implements Comparator<Student1>
{
public int compare(Student1 stud1,Student1 stud2)
{
 
    int ByName = stud1.getName().compareTo(stud2.getName());
    int ByMarks = stud2.getMarks().compareTo(stud1.getMarks());

    return (ByName==0)?ByMarks:ByName;
}
}
public class comparatorSort {

    static  List<Student1> liStud = Arrays.asList(
        new Student1("Abhishek", 87),
        new Student1("Kartik", 45),
        new Student1("Nishant", 76),
        new Student1("Abhishek", 90)
    );

   public static void main(String[] args) {

    Collections.sort(liStud,new SortByName());
    liStud.stream().forEach(x->System.out.println(x.getName()+" "+x.getMarks()));
    
   }
    
}
