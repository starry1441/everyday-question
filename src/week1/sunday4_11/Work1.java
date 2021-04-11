package week1.sunday4_11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:1
 * User: starry
 * Date: 2021 -04 -11
 * Time: 20:38
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[3*n];
        for(int i = 0; i < 3*n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = n; i < 3*n; i+=2) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
