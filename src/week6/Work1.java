package week6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -24
 * Time: 17:27
 */
public class Work1 {

    public static int[] num = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int year = in.nextInt();
            //1月1日
            System.out.println(year + "-01-01");
            //1月第3个星期1
            startWeek(year,1,3,1);
            //2月第3个星期1
            startWeek(year,2,3,1);
            //5月最后一个星期1
            lastWeek(year,5,1);
            //7月4日
            System.out.println(year + "-07-04");
            //9月第1个星期1
            startWeek(year,9,1,1);
            //11月第4个星期4
            startWeek(year,11,4,4);
            //12月25日
            System.out.println(year + "-12-25");
        }
    }
    public static int manyDays(int year,int month,int day) {
        int sum = 0;
        for(int i = 2000; i < year; i++) {
            if(isRun(i)) {
                sum += 366;
            }else {
                sum += 365;
            }
        }
        for(int i = 1; i < month; i++) {
            if(isRun(year) && i == 2) {
                sum += 29;
            }else {
                sum += num[i-1];
            }
        }
        sum += day;
        return sum;
    }

    public static void startWeek(int year,int month,int week,int n) {
        int days = manyDays(year,month,1);
        int monthWeek = (5+days) % 7;
        if (monthWeek == 0) {
            monthWeek = 7;
        }
        System.out.println(monthWeek);
        int day = (n >= monthWeek ? n-monthWeek : n+7-monthWeek)+1;
        day += (week-1)*7;
        System.out.println(year + "-"+ (month < 10 ? "0"+month : month) +"-"+(day < 10 ? "0"+day : day));
    }

    public static void lastWeek(int year,int month,int n) {
        int days = manyDays(year,month,num[month-1]);
        int monthWeek = (5+days) % 7;
        if (monthWeek == 0) {
            monthWeek = 7;
        }
        int day = num[month-1] - (n <= monthWeek ? monthWeek-n : 7- n-monthWeek);
        System.out.println(year + "-"+ (month < 10 ? "0"+month : month) +"-"+(day < 10 ? "0"+day : day));
    }

    public static boolean isRun(int i) {
        return (i%4 == 0 && i%100 != 0 || i%400 == 0);
    }

    public static void main(String[] args) {
        startWeek(2000,1,1,6);
    }

}
