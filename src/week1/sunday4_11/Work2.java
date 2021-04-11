package week1.sunday4_11;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:2
 * User: starry
 * Date: 2021 -04 -11
 * Time: 20:38
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.nextLine();
        String b = cin.nextLine();
        char[] c = a.toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < c.length; i++) {
            if(!b.contains(c[i]+"")){
                s.append(c[i]);
            }
        }
        System.out.println(s.toString());
    }

}
