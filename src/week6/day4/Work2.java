package week6.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -27
 * Time: 17:52
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[91];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < 91; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(arr[n]);
        }
    }

}
