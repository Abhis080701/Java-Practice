import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
private String fname;
private String lname; 
public Employee(String fname,String lname)
{
this.fname = fname;
this.lname = lname;
}


public String getFname() {
    return fname;
}


public String getLname() {
    return lname;
}


@Override
public String toString() {
    return "Employee [fname=" + fname + ", lname=" + lname + "]";
}


public int compareTo(Employee emp2)
{
    if(this.fname.compareTo(emp2.fname)!=0)
    {
        return this.fname.compareTo(emp2.fname);
    }
    return this.lname.compareTo(emp2.lname);

}

}
public class EmployeeSortByFirstName {
    public static void main(String[] args) {
     List<Employee> employees = Arrays.asList(
        new Employee("Abhishek","Suryawanshi"),
        new Employee("Shubham", "Ransing"),
        new Employee("Shubham", "Taware"),
        new Employee("Karkik", "M"),
        new Employee("Abhishek", "Mane"),
        new Employee("Shubham", " Rakate")
     ); 
       Collections.sort(employees);
       System.out.println("Sorting the Employee its First Name: ");
       employees.stream().forEach(System.out::println);
       System.out.println("--------------OR--------------");
       employees.stream().forEach(x->System.out.println(x.getFname()+" "+x.getLname()));
    }
}