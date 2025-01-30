import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}

public class Stream2 {
    public static void main(String[] args) {
        ReflectionEx s1 = new ReflectionEx(1, "Abhishek");
        ReflectionEx s2 = new ReflectionEx(2, "Kartik");
        ReflectionEx s3 = new ReflectionEx(4, "Vaibhav");
        ReflectionEx s4 = new ReflectionEx(3, "Nishant");
        ReflectionEx s5 = new ReflectionEx(6, "Chandu");
        ReflectionEx s6 = new ReflectionEx(5, "Shubham");

        List<ReflectionEx> lisStudents = Arrays.asList(s1, s2, s3, s4, s5, s6);
        System.out.println(lisStudents);
        List<String> l = lisStudents.stream()
                .filter(s -> s.getName().startsWith("A"))
                .map(ReflectionEx::getName)
                .collect(Collectors.toList());

        System.out.println(l);
        List<Integer> li = Arrays.asList(1, 2, 4, 5, 6, 7, 8);

        long countOfEven = li.stream().filter(x -> x % 2 == 0).count();

        System.out.println(countOfEven);
    }

    @Override
    public String toString() {
        return "Stream2 []";
    }
}
