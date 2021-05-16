package week5.day1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -16
 * Time: 22:47
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            System.out.println(gen(str));
        }
    }

    public static String gen(String str) {
        if(str.length() == 1) return str;
        while(str.length() > 1){
            str = pas(str);
        }
        return str;
    }

    public static String pas(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int tmp = c-'0';
            sum += tmp;
        }
        String res = String.valueOf(sum);
        return res;
    }

}
