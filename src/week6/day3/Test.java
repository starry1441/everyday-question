package week6.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -26
 * Time: 16:30
 */
public class Test {

    public static void main1(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        char c = 'a';
        list.remove((Object)c);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.remove(0);
        System.out.println(list);
    }

}
