package week5.day5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -21
 * Time: 16:20
 */
public class Work2 {

    public static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            if(n == 0) {
                break;
            }
            step(n);
            System.out.println(count);
            count = 0;
        }
    }

    public static void step(int n) {
        if(n == 1) {
            return;
        }
        count++;
        if (n == 2 || n == 3) {
            return;
        }
        step(n%3 == 0 ? n/3 : n/3+1);
    }

}
