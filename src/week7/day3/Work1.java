package week7.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -02
 * Time: 15:57
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            String s1 = s[0];
            String s2 = s[1];
            int len1 = Integer.parseInt(s[2]);
            int len2 = Integer.parseInt(s[3]);
            long sum = 0;
            for(int i = len1; i <= len2; i++) {
                char a = s1.charAt(0);
                char b = s2.charAt(0);
                sum += (long)Math.pow(26,i-1)*(b-a);
                long suma = 0;
                long sumb = 0;
                for (int j = 1; j < s1.length(); j++){
                    suma = suma + (s1.charAt(j) - 'a') * (long) Math.pow(26, i- 1 - j);
                }
                for (int j = 1; j < s2.length(); j++){
                    sumb = sumb + (s2.charAt(j) - 'a') * (long) Math.pow(26, i - 1 - j);
                }
                sum = sum + sumb-suma;
            }
            sum--;
            System.out.println(sum % 1000007);
        }
    }

}
