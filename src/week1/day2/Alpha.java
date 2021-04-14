package week1.day2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -12
 * Time: 19:34
 */

class Base {
    Base() {
        System.out.println("Base");
    }
}

public class Alpha extends Base{
    public static void main(String[] args) {
        new Alpha();
        new Base();
    }
}
