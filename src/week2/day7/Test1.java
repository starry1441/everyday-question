package week2.day7;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -24
 * Time: 10:44
 */

interface test {
    abstract void dog();
}

public class Test1 {

    public static void main(String[] args) {
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(null,null);
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = new String("hello");
        String str4 = "hello";
        System.out.println(str1 == str4);
        try{
            int a = 10;
            int b = a/0;
        }catch (java.lang.ArithmeticException e) {
            System.out.println("aaa");
        }catch (Exception e) {
            System.out.println("eee");
        }
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a);
        add(b);
        System.out.println(b);
    }

    public static void add(Byte b) {
        b = b++;
    }

}
