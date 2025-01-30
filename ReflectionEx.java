import java.lang.reflect.Field;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}

public class ReflectionEx
{
public static void main(String[] args) throws Exception {
    Student s = new Student(1, "Abhi");

    Class<?> studClass = s.getClass();
    //Accessing the Private field  id and Name
    Field idField = studClass.getDeclaredField("id");
    Field namField = studClass.getDeclaredField("name");

    // allowing for accessing 
    idField.setAccessible(true);
    namField.setAccessible(true);

    int id = (Integer)idField.get(s);
    String name = (String)namField.get(s);
    System.out.println("Before Changing the Value Of Private Fields of the Student Class: "+id+" "+name);

     //seting the value
     idField.set(s, 101);
     namField.set(s,"Abhishek");
     //getting the updating value.
    id = (Integer)idField.get(s);
    name = (String)namField.get(s);

     System.out.println("After Changing the value of Private Fields: "+id+" "+name);

}
}