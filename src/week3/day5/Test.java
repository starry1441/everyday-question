package week3.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -07
 * Time: 16:29
 */
public class Test {

    public String name = "abc";

    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test();
        System.out.println(a.equals(b));
        System.out.println(a.name.equals(b.name));
    }

}
