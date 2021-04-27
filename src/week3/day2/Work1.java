package week3.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -26
 * Time: 20:39
 */
public class Work1 {

    public static int iConverDateToDay(int year,int month,int day) {
        int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        if(year < 0 || month < 0 || month > 12) {
            return -1;
        }
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            monthDay[1] = 29;
        }
        if(day > monthDay[month-1]) {
            return -1;
        }
        for(int i = 0; i < month-1; i++) {
            sum += monthDay[i];
        }
        sum += day;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            System.out.println(iConverDateToDay(year, month, day));
        }
    }

}
