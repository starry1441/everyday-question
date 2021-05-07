package week3.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -07
 * Time: 16:08
 */
public class Test1 {

    private int count;

    public static void main(String[] args) {
        Test1 test1 = new Test1(88);
        System.out.println(test1.count);
        Test1 test2 = new Test1(99);
        System.out.println(test2.count);
    }

    Test1(int a) {
        count = a;
    }

}
