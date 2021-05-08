package week3.day6;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -08
 * Time: 13:30
 */
public class Test3 {

    public String a = "6";
    public int[] arr = {1,2,3};

    public static void main(String[] args) {
        Test3 b = new Test3();
        b.change(b.a);
        b.change(b.arr);
        System.out.println(b.a);
        System.out.println(Arrays.toString(b.arr));
    }

    public void change(String a) {
        a = "10";
    }

    public void change(int[] arr) {
        arr[2] = 99;
    }

}
