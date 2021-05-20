package week5.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -20
 * Time: 16:07
 */
public class Work3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long n = in.nextInt();
            if(n == 0)
                break;
            long a = (long)Math.pow(5, n);
            long b = (long)Math.pow(4, n);
            System.out.println((a-4)+" "+(b-4+n));
        }
    }

}
