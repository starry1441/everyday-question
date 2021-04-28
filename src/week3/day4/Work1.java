package week3.day4;

import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -28
 * Time: 20:18
 */
public class Work1 {

    public static int count(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if(i == sum(i)) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int num) {
        int sum = 1;
        int i;
        for (i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                sum += i;
                if(num/i != i) {
                    sum += num / i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }

}
