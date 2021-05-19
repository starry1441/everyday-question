package week5.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -19
 * Time: 18:03
 */
public class Work4 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            if(a+b>c && a+c>b && b+c>a)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

}
