package week4.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -15
 * Time: 10:45
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            int res = calStringDistance(str1,str2);
            System.out.println(res);
        }
    }

    public static int calStringDistance(String str1, String str2) {
        int[][] step = new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i < step.length; i++) {
            step[i][0] = i;
        }
        for (int i = 0; i < step[0].length; i++) {
            step[0][i] = i;
        }
        for (int i = 1; i < step.length; i++) {
            for (int j = 1; j < step[0].length; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    step[i][j] = step[i-1][j-1];
                }else {
                    step[i][j] = Math.min(Math.min(step[i - 1][j], step[i - 1][j - 1]), step[i][j - 1]) + 1;
                }
            }
        }
        return step[step.length - 1][step[0].length - 1];
    }


}
