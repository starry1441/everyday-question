package week2.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 10:57
 */
public class Work1 {

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = n;
        for(int i = n-1; i > 0; i--) {
            res = res * i;
        }
        System.out.println(res);
        int count = 0;
        while(res > 0) {
            if(res%10 == 0) {
                count++;
            }else{
                break;
            }
            res = res/10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n/5);
    }

}
