package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -19
 * Time: 20:52
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        int[] res = new int[arr.length-1];
        int i;
        for(i = 0; i < arr.length-1; i++) {
            res[i] = Integer.parseInt(arr[i]);
        }
        int k = Integer.parseInt(arr[i]);
        Arrays.sort(res);
        int j;
        for(j = 0; j < k-1; j++) {
            System.out.print(res[j] + " ");
        }
        System.out.print(res[j]);
    }

}
