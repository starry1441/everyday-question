package week2.day1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -18
 * Time: 19:29
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        if(min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        int a = 0;
        for(int i = min; i > 0; i--) {
            if(min % i == 0 && max % i == 0) {
                a = i;
                break;
            }
        }
        int b = min * (max/a);
        System.out.println(b);
    }

}
