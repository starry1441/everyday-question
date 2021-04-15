package week1.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -14
 * Time: 19:43
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextInt();
        if((a+c)%2!=0 || (b+d)%2!=0) {
            System.out.println("No");
        }else {
            int A = (a+c)/2;
            int B = (b+d)/2;
            int C = d-B;
            if(A < 0 || B < 0 || C < 0) {
                System.out.println("No");
            }else {
                System.out.print(A+" "+B+" "+C);
            }
        }
    }

}
