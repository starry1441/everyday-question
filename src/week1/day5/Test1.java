package week1.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -16
 * Time: 13:32
 */
public class Test1 {

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);
        String s;
        System.out.println();
    }

    static void operate(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
    }

}
