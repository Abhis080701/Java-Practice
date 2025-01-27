

import java.util.Iterator;
import java.util.TreeSet;

 class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Person nextPerson) {
        return Integer.compare(this.age,nextPerson.age);
    }

}

public class TreeSetComparable1   {
   public static void main(String[] args) {
    TreeSet<Person> p = new TreeSet<>();
    p.add(new Person("Abhishek", 22));
    p.add(new Person("Kartik", 34));
    p.add(new Person("Shubham", 24)); 
    p.add(new Person("OM", 26));

    // Iterator<Person> itr = p.iterator();
    // while (itr.hasNext()) {
    //     System.out.println(itr.next().name+" "+itr.next().age);
    // }


   // System.out.println(p);

   // for each loop
   for(Person ele:p)
   {
    System.out.println("Age: "+ele.age+" Name: "+ele.name);
   }

   }
}
