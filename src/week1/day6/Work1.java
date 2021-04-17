package week1.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -17
 * Time: 13:30
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hang = scanner.nextInt();
        int lie = scanner.nextInt();
        int[][] table = new int[hang][lie];
        //1表示蛋糕，2表示不能放的格子，0代表可以放
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < hang) {
            if(table[i][j] == 0) {
                table[i][j] = 1;
                count++;
                if(i+2 < hang) {
                    table[i+2][j] = 2;
                }
                if(j+2 < lie) {
                    table[i][j+2] = 2;
                }
            }
            if(++j >= lie) {
                j = 0;
                i++;
            }
        }
        System.out.println(count);
    }

}
