package week4.day1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -10
 * Time: 9:02
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n == 0) return;
            int count = 0;
            while (n > 2) {
                int kong = n%3;
                int drink = n/3;
                count += drink;
                n = kong + drink;
            }
            if(n == 2) count++;
            System.out.println(count);
        }
    }

}
