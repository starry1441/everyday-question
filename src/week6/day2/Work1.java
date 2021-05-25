package week6.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -25
 * Time: 9:21
 */
public class Work1 {

    public static final int[] arr = {31*2,28,31,30*2,31,30*2,31,31*2,30*2,31*2,30,31*2};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int year1 = in.nextInt();
            int month1 = in.nextInt();
            int day1 = in.nextInt();
            int year2 = in.nextInt();
            int month2 = in.nextInt();
            int day2 = in.nextInt();
            int sum = 0;
            //年
            for(int i = year1; i < year2; i++) {
                for(int j = 0; j < 12; j++) {
                    if(j==1 && isRun(i)) {
                        sum += 29;
                    }else {
                        sum += arr[j];
                    }
                }
            }
            //月
            for(int i = month1-1; i < month2-1; i++) {
                if(i == 1 && isRun(year2)) {
                    sum += 29;
                }else {
                    sum += arr[i];
                }
            }
            //日
            if(month2 == 2 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 11) {
                sum += day2-day1+1;
            }else {
                sum += 2*(day2-day1+1);
            }
            System.out.println(sum);
        }
    }

    public static boolean isRun(int year) {
        return (year%4==0 && year%100!=0 || year%400==0);
    }

}
