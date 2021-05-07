package week3.day5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -07
 * Time: 16:35
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int count = 2*n-1 + 2;
            int[] tmp = new int[count];
            int[] res = new int[count];
            int i = count/2;
            res[i] = 1;
            int j = 1;
            while (j <= n) {
                tmp = res.clone();
                res[i] = tmp[i] + tmp[i-1] + tmp[i+1];
                for(int k = 1; k < j; k++) {
                    res[i-k] = tmp[i-k] + tmp[i-k-1] + tmp[i-k+1];
                    res[i+k] = tmp[i+k] + tmp[i+k-1] + tmp[i+k+1];
                }
                j++;
            }
            int q;
            for(q = 1; q < res.length-1; q++) {
                if(res[q]%2 == 0) {
                    System.out.println(q);
                    break;
                }
            }
            if (q >= res.length-1){
                System.out.println(-1);
            }
        }
    }

}
