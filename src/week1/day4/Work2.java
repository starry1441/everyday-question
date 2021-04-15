package week1.day4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -14
 * Time: 20:15
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        boolean zheng = true;
        if(m < 0) {
            zheng = false;
            m = -m;
        }
        if(n < 10) {
            Stack<Integer> stack = new Stack<>();
            while (m != 0) {
                stack.push(m%n);
                m = m/n;
            }
            int size = stack.size();
            if(!zheng) {
                System.out.print("-");
            }
            for(int i = 0; i < size; i++) {
                System.out.print(stack.pop());
            }
        }else {
            Stack<Character> stack = new Stack<>();
            while (m != 0) {
                int tmp = m%n;
                if(tmp == 10) stack.push('A');
                if(tmp == 11) stack.push('B');
                if(tmp == 12) stack.push('C');
                if(tmp == 13) stack.push('D');
                if(tmp == 14) stack.push('E');
                if(tmp == 15) stack.push('F');
                if(tmp < 10){
                    stack.push((char) ('0'+tmp));
                }
                m = m/n;
            }
            int size = stack.size();
            if(!zheng) {
                System.out.print("-");
            }
            for(int i = 0; i < size; i++) {
                System.out.print(stack.pop());
            }
        }
    }

}
