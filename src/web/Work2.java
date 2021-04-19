package web;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -19
 * Time: 16:56
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] <= min) {
                min = arr[i];
                System.out.print(-1);
            }else {
                //往前找
                int l;
                for(l = i-1; l >= 0; l--) {
                    if(arr[l] < arr[i]) {
                        System.out.print(l);
                        break;
                    }
                }
                if(l < 0) {
                    System.out.print(-1);
                }
            }
            //l和r中间空格
            System.out.print(" ");
            //往后找
            int r;
            for(r = i+1; r < n; r++) {
                if(arr[r] < arr[i]) {
                    System.out.print(r);
                    break;
                }
            }
            if(r >= n) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }

}

//7
//        3 4 1 5 6 2 7
