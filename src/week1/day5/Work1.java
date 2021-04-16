package week1.day5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -16
 * Time: 14:08
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        int count = 0;
        for(int i = 0; i <= a.length(); i++) {
            StringBuilder s = new StringBuilder();
            for(int m = 0; m < i; m++) {
                s.append(a.charAt(m));
            }
            s.append(b);
            for(int n = i; n < a.length(); n++) {
                s.append(a.charAt(n));
            }
            if(isReverse(s)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isReverse(StringBuilder s) {
        String str = s.toString();
        int i = 0;
        int j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main1(String[] args) {
        String a = "abcd";
        String b = "dexr";
        StringBuilder s = new StringBuilder();
        s.append(a);
        s.append(b);
        System.out.println(s);
        System.out.println(s.charAt(2));
    }

}
