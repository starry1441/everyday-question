package week5.day1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -16
 * Time: 21:32
 */
public class Work1 {

    public static String fid(int n) {
        if(n < 3) return change(n);
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c % 100000;
        }
        return change(c);
    }

    public static String change(int c) {
        String str = String.valueOf(c);
        int len = str.length();
        StringBuilder res = new StringBuilder();
        if(len < 5) {
            for(int i = 0; i < 4-len; i++) {
                res.append(0);
            }
            res.append(str);
            return res.toString();
        }
        for(int i = len-4; i < len; i++) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            for(int i = 0; i < n; i++) {
                int num = in.nextInt();
                System.out.print(fid(num));
            }
            System.out.println();
        }
    }

}
