package week2.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -23
 * Time: 9:27
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 0) {
            n = -n;
        }
        String s = Integer.toBinaryString(n);
        int i = 0;
        int start = 0;
        boolean one = false;
        int end = 0;
        int max = 0;
        while(i < s.length()) {
            if(s.charAt(i) == '1') {
                if(!one) {
                    start = i;
                    one = true;
                }
                end = i;
                if(i+1 >= s.length()) {
                    max = Math.max(end - start+1, max);
                }
            }else {
                one = false;
                max = Math.max(end - start+1, max);
            }
            i++;
        }
        if (s.equals("0")){
            System.out.println(0);
        }else {
            System.out.println(max);
        }
    }

}
