package week2.day4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 10:44
 */

class Person {
    String name = "no name";
    public Person(String nm) {
        name = nm;
    }
}

class Employee extends Person {
    String e = "dd";
    public Employee(String id) {
        super(id);
        e = id;
    }
}

public class Test2 {

    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }

}
