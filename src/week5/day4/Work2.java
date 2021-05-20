package week5.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -20
 * Time: 15:00
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            for (double i = 0; true; i += 4) {
                int count = 0;
                double sum = i;
                while (count < n) {
                    sum = sum / 4 * 5 + 1;
                    if (sum-(int)sum > 0) {
                        break;
                    }
                    count++;
                }
                if (count == n) {
                    System.out.println((int)sum);
                    System.out.println((int)i + n);
                    break;
                }
            }
        }
    }

}
