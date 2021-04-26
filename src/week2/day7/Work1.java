package week2.day7;

import week2.day3.Work2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -24
 * Time: 11:19
 */
public class Work1 {
    //      6    2
    //‭0100 0000 0000‬    1024
    //1 0011‬‬              19
    //‭0100 0100 1100
    public int binInsert(int n, int m, int j, int i) {
        return n+m*(int)Math.pow(2, j);
    }

    public List<Integer> insertBin(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0) {
            list.add(n%2);
            n = n/2;
        }
        return list;
    }

    public static void main(String[] args) {
        Work1 a = new Work1();
        System.out.println(a.binInsert(1024, 19, 2, 6));
//        System.out.println(a.insertBin(19));
    }

}
