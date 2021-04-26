package week2.day7;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -24
 * Time: 11:50
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = n/2;
        while(i > 0) {
            if(isSu(i) && isSu(n-i)) {
                System.out.println(i);
                System.out.println(n-i);
                break;
            }
            i--;
        }
    }

    public static boolean isSu(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

}
