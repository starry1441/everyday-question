package week3.day6;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -08
 * Time: 15:47
 */
public class Work3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            Stack<int[]> stack = new Stack<>();
            int i = 0;
            int j = 0;
            while (j < str2.length()) {
                if(i < str1.length() && str2.charAt(j) == str1.charAt(i)) {
                    i++;
                    j++;
                }else if(str1.charAt(i) == '?') {
                    str1 = str1.replace(str1.substring(i,i+1),str2.substring(j,j+1));
                }else if(str1.charAt(i) == '*') {

                    for (int k = 0; k < str2.length()-i; k++) {
                        String tmp = str1;
                        tmp = tmp.replace(str1.substring(i,i+1),str2.substring(j,j+k));

                    }
                }else {
                    System.out.println("false");
                    break;
                }
            }
        }
    }

}
