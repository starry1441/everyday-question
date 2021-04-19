package web;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -19
 * Time: 16:32
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int a = 0;
        int b = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()%2 == 1) {
                if(a == 0) {
                    a = entry.getKey();
                }else {
                    b = entry.getKey();
                }
            }
        }
        if(a < b) {
            System.out.println(a+" "+b);
        }else {
            System.out.println(b+" "+a);
        }
    }

}
