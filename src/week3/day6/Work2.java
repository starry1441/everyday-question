package week3.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -08
 * Time: 14:19
 */
public class Work2 {

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
                    i++;
                    j++;
                }else if(str1.charAt(i) == '*') {
                    int tmp = j;
                    if(i+1 < str1.length()) {
                        int k = 1;
                        while (str1.charAt(i+k) == '?') {
                            k++;
                        }
                        stack.add(new int[]{i+k,j+k-1});
                        while (j < str2.length()) {
                            if(str2.charAt(j) == str1.charAt(i+k)){
                                stack.add(new int[]{i,j});
                            }
                            j++;
                        }
                        i += k;
                    }else {
                        System.out.println("true");
                        break;
                    }
                }else {
                    if(!stack.isEmpty()) {
                        int[] arr = stack.pop();
                        i = arr[0];
                        j = arr[1];
                    }
                    System.out.println("false");
                    break;
                }
            }
            if(j >= str2.length()) {
                System.out.println("true");
            }
        }
    }

}
