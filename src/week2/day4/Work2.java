package week2.day4;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 11:22
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder s = new StringBuilder();
        while(n > 0) {
            s.append((char)(n%10+'0'));
            n = n/10;
        }
        System.out.println(s.toString());
    }

}
