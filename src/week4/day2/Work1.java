package week4.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -10
 * Time: 20:11
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String n = scanner.nextLine();
            char[] res = n.toCharArray();
            int i = 0;
            int j = res.length-1;
            while(i < j) {
                char tmp = res[i];
                res[i] = res[j];
                res[j] = tmp;
                i++;
                j--;
            }
            String result = String.valueOf(res);
            System.out.println(result);
        }
    }

}
