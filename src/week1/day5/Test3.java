package week1.day5;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -16
 * Time: 13:53
 */
public class Test3 {

    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        Test3 ex = new Test3();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+ Arrays.toString(ex.ch));
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }


}
