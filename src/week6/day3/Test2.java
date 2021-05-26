package week6.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -26
 * Time: 17:31
 */
public class Test2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long[] a = new long[85];
        a[1] = 1;
        a[2] = 1;
        for ( int i = 3; i <=80; i++ ) {
            a[i] = a[i - 1] + a[i - 2];
        }

        while ( in.hasNext()) {

            long sum = 0;
            int from = in.nextInt();
            int to = in.nextInt();

            for ( int i = from; i <= to; i++ ) {
                sum +=a[i];
            }

            System.out.println(sum);
        }
        in.close();
    }

}
