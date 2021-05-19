package week5.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -19
 * Time: 17:13
 */
public class Work2 {

    public static boolean isThree(String a,String b,String c){
        if(a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        int j = b.length()-1;
        int i = a.length()-1;
        int goon = 0;
        StringBuilder s = new StringBuilder();
        while(j >= 0) {
            int x = a.charAt(i)-'0';
            int y = b.charAt(j)-'0';
            int sum = x+y+goon;
            if(sum > 9) {
                goon = 1;
            }else {
                goon = 0;
            }
            s.append(sum%10);
            i--;
            j--;
        }
        if(goon == 1) {
            while(i >= 0) {
                int x = a.charAt(i)-'0';
                int sum = x+goon;
                if(sum > 9) {
                    goon = 1;
                }else {
                    goon = 0;
                }
                s.append(sum%10);
                i--;
            }
            if(goon == 1) {
                s.append(1);
            }
        }else {
            s.append(a.substring(0,i+1));
        }
        String res = s.toString();
        StringBuilder reverse = new StringBuilder();
        for (int k = res.length()-1; k >= 0; k--) {
            reverse.append(res.charAt(k));
        }
        String add = reverse.toString();
        if(add.equals(c)) {
            return false;
        }else if (add.length() < c.length()) {
            return false;
        }else if (add.length() == c.length()) {
            for (int m = 0; m < add.length(); m++) {
                if (add.charAt(m) < c.charAt(m)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] three = str.split(" ");
            if(three.length == 3) {
                if (isThree(three[0],three[1],three[2]) &&
                        isThree(three[1],three[2],three[0]) &&
                        isThree(three[0],three[2],three[1])) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else {
                System.out.println("No");
            }
        }
    }

}
