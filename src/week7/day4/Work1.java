package week7.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -03
 * Time: 11:46
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long sum = count(n);
            System.out.println(sum);
        }

    }

    //计算所有人都收不到自己的邮件的情况情况：错排算法
    private static long count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }

}
