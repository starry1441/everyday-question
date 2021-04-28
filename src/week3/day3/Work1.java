package week3.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -28
 * Time: 10:54
 */
public class Work1 {

    public static int findNumberof1(int num) {
        int count = 0;
        while(num > 0) {
            if(num%2 == 1) {
                count++;
            }
            num = num/2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int num = in.nextInt();
            System.out.println(findNumberof1(num));
        }
    }

}
