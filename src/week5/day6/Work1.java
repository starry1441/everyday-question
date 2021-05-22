package week5.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -22
 * Time: 13:55
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            char[] arr = str.toCharArray();
            for(int i = 0; i < arr.length; i++) {
                arr[i] = change(arr[i]);
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
    public static char change(char c) {
        if(c >= 'F' && c <= 'Z') {
            c = (char)(c - 5);
        }else if(c == 'A') {
            c = 'V';
        }else if(c == 'B') {
            c = 'W';
        }else if(c == 'C') {
            c = 'X';
        }else if(c == 'D') {
            c = 'Y';
        }else if(c == 'E') {
            c = 'Z';
        }
        return c;
    }

}
