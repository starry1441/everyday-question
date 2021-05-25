package week6.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -25
 * Time: 15:56
 */
public class Work2 {

    public static int[] fid = new int[100001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fiding(fid.length);
        while(in.hasNext()) {
            int n = in.nextInt();
            if(n < 25){
                System.out.println(fid[n]);
            }else {
                System.out.println(String.format("%06d",fid[n]));
            }
        }
    }
    public static void fiding(int n) {
        fid[0] = 1;
        fid[1] = 1;
        int i = 2;
        while(i < n) {
            fid[i] = (fid[i-1] + fid[i-2])%1000000;
            i++;
        }
    }

}
