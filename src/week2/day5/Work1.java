package week2.day5;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 19:37
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int i = 2;
        while(true) {
            int tmp = list.get(i-2)+list.get(i-1);
            list.add(tmp);
            i++;
            if(tmp > n){
                break;
            }
        }
        int res = Math.min(list.get(i)-n, n-list.get(i-1));
        System.out.println(res);
    }

}
