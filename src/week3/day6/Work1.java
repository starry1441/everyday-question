package week3.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -08
 * Time: 14:09
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int a = 1;
            int b = 1;
            int count = 2;
            while(count < n) {
                int c = a+b;
                a = b;
                b = c;
                count++;
            }
            System.out.println(b);
        }
    }

}
