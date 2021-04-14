package week1.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -14
 * Time: 10:36
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int i = 0;
        int max = 0;
        int left = 0;
        int right = 0;
        while(i < s.length()) {
            if(s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                int j = i;
                while(true) {
                    if(j < s.length() && s.charAt(j) >= '1' && s.charAt(j) <= '9') {
                        j++;
                    }else{
                        break;
                    }
                }
                if(max < j-i) {
                    max = j-i;
                    left = i;
                    right = j;
                }
                i = j;
            }else{
                i++;
            }
        }
        for(int j = left; j < right; j++) {
            System.out.print(s.charAt(j));
        }
    }

}
