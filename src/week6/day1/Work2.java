package week6.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -24
 * Time: 20:46
 */
public class Work2 {

    public static List<Integer> list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int num = in.nextInt();
            list = new ArrayList<>();
            calc(num);
            System.out.print(num + " =");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i));
                if (i != list.size()-1) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    public static void calc(int num) {
        boolean inter = false;
        for(int i = 2; i*i <= num; i++) {
            if(num%i == 0) {
                inter = true;
                calc(i);
                calc(num/i);
                break;
            }
        }
        if(!inter) {
            list.add(num);
        }
    }

}
