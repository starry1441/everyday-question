package week2.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 19:17
 */


public class Test1 {

    public static int a(int i,int j) {
        try {
            return i+j;
        }catch (Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Test1.a(1, 2));
    }

}
