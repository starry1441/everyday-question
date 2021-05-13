package week4.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -13
 * Time: 9:18
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                if (a >= b[i]) {
                    a = a + b[i];
                }else {
                    a = a + Max(a,b[i]);
                }
            }
            System.out.println(a);
        }
    }

    public static int Max(int a,int b) {
        int max = 0;
        for (int i = 1; i <= a; i++) {
            if (a%i == 0 && b%i == 0) {
                max = i;
            }
        }
        return max;
    }

}
