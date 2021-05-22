package week5.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -22
 * Time: 13:55
 */
public class Work2 {

    public static List<Integer> list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int num = in.nextInt();
            list = new ArrayList<>();
            calc(num);
//            System.out.println(list);
            int len = list.size();
            if(len < 2) {
                System.out.println(1);
            }else {
                System.out.println(len);
            }
        }
    }
    public static void calc(int num) {
        boolean inter = false;
        for(int i = 2; i*i <= num; i++) {
            if(num%i == 0) {
                inter = true;
                if(!list.contains(i) && !list.contains(num/i)) {
                    calc(i);
                    if(num/i != i) {
                        calc(num/i);
                    }
                }
            }
        }
        if(!inter) {
            list.add(num);
        }
    }

}
