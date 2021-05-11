package week4.day3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -11
 * Time: 20:45
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[2*n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }
            for (int j = 0; j < k; j++) {
                arr = wash(arr);
            }
            for (int j = 0; j < arr.length; j++) {
                if(j == arr.length-1) {
                    System.out.println(arr[j]);
                    continue;
                }
                System.out.print(arr[j] + " ");
            }
        }
    }

    public static int[] wash(int[] arr) {
        int i = 0;
        int j = arr.length/2;
        int[] res = new int[arr.length];
        int index = 0;
        while (j < arr.length) {
            res[index] = arr[i];
            index++;
            res[index] = arr[j];
            index++;
            i++;
            j++;
        }
        arr = res;
        return arr;
    }

}


