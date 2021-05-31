package week7.day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -31
 * Time: 14:36
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextLine();
            }
            int count = 0;
            int max = 0;
            Set<String> set = new HashSet<>();
            for(int i = 0; i < arr.length; i++) {
                String[] str = arr[i].split(" ");
                if(!set.contains(str[0]) && str[1].equals("connect")) {
                    set.add(str[0]);
                    count++;
                    if(count > max) {
                        max = count;
                    }
                }
                if(set.contains(str[0]) && str[1].equals("disconnect")) {
                    set.remove(str[0]);
                    count--;
                }
            }
            System.out.println(max);
        }
    }

}
