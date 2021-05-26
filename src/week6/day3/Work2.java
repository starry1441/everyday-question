package week6.day3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -26
 * Time: 17:38
 */

import java.util.*;

public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[81];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        while(in.hasNext()) {
            int from = in.nextInt();
            int to = in.nextInt();
            long sum = 0;
            for(int i = from; i <= to; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
