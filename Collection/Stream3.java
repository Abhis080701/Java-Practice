import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
    String name;
    int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student1 [name=" + name + ", marks=" + marks + "]";
    }

}

public class Stream3 {
    private static List<Student1> list;

    public static void main(String[] args) {
        /*
         * List<String> li = Arrays.asList(
         * "AB", "SD",
         * "SSS", "sjds",
         * "GHS", "GFG",
         * "DD", "AA");
         * System.out.println(li.stream().filter(x -> x.length() <= 2).toList());
         */

        List<Student1> stud1 = Arrays.asList(

                new Student1("Abhi", 80),
                new Student1("Kartik", 85),
                new Student1("Shubham", 50),
                new Student1("Aniket", 65),
                new Student1("XYZ", 90));

        list = stud1.stream().filter(marks -> marks.getMarks() >= 75).toList();
        list.forEach(x -> System.out.println(x.marks + " " + x.name));

        HashMap<String, Integer> HashMap = new HashMap<>();
        HashMap.put("Fruit1", 87);
        HashMap.put("Fruit2", 60);
        HashMap.put("Fruit3", 67);
        HashMap.put("Fruit4", 79);
        HashMap.put("Fruit5", 90);
        System.out.println("Calculating the sum of Fruit Items: ");

        System.out.println(HashMap.values().stream().reduce(Integer::sum));

        System.out.println();
        System.out.println("ALL OPERATIONS: " + HashMap.values().stream().collect(Collectors.summarizingInt(x -> x)));
        System.out.println();

        System.out.println("Addition of Items: " + HashMap.values().stream().collect(Collectors.summingInt(x -> x)));
        System.out.println("Average of Items: " + HashMap.values().stream().collect(Collectors.averagingLong(x -> x)));
        System.out.println("counting the items: " + HashMap.values().stream().count());
        System.out.println("Min Value From the Items: " + HashMap.values().stream().reduce(Integer::min));
        System.out.println("Max Value From the Items: " + HashMap.values().stream().reduce(Integer::max));

    }
}
