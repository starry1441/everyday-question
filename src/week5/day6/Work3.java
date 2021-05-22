package week5.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -22
 * Time: 13:56
 */
public class Work3 {

    //正确
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int cnt = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    cnt++;
                }
            }
            if (n != 1) {
                cnt++;
            }
            System.out.println(cnt);
        }
    }

    //错误
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int num = in.nextInt();
            int res = calc(num);
            if(res == 0) {
                System.out.print(1 + " ");
            }else {
                System.out.print(res+1 + " ");
            }
        }
    }
    public static int calc(int num) {
        int count = 0;
        for(int i = 2; i*i <= num; i++) {
            if(num%i == 0) {
                count++;
                while(num%i == 0) {
                    num = num/i;
                }
            }
        }
        return count;
    }

}
