package week3.day5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -07
 * Time: 17:43
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            if(a.length() > b.length()) {
                StringBuilder s = new StringBuilder();
                for(int i = 0; i < a.length()-b.length(); i++) {
                    s.append('0');
                }
                b = s.toString() + b;
            }else {
                StringBuilder s = new StringBuilder();
                for(int i = 0; i < b.length()-a.length(); i++) {
                    s.append('0');
                }
                a = s.toString() + a;
            }
            int i = a.length()-1;
            int upOne = 0;
            char[] res = new char[i+1];
            while (i >= 0) {
                int c = (int)a.charAt(i)-(int)'0';
                int d = (int)b.charAt(i)-(int)'0';
                int sum = c+d+upOne;
                if(sum >= 10) {
                    upOne = 1;
                }else {
                    upOne = 0;
                }
                res[i] = (char) (sum%10+'0');
                i--;
            }
            String s = String.valueOf(res);
            if(upOne == 1) {
                s = "1" + s;
            }
            System.out.println(s);
        }
    }

}
