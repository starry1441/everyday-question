package week1.monday4_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -12
 * Time: 21:04
 */
public class Work2 {

    public static void reverse(char[] c,int i,int j) {
        while(i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        s = s.trim();
        char[] c = s.toCharArray();
        reverse(c,0,c.length-1);
        int start = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                reverse(c,start,i-1);
                start = i+1;
            }
        }
        System.out.println(new String(c));
    }



}
