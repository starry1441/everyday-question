package week3.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -07
 * Time: 16:15
 */

class X {
    Y y = new Y();
    public X() {
        System.out.println("X");
    }
}

class Y {
    public Y() {
        System.out.println("Y");
    }
}

public class Z extends X{
    Y y = new Y();
    public Z() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
