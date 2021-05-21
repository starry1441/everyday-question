package week5.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -21
 * Time: 14:14
 */
public class Work1 {

    public static int getFirstUnFormedNum(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {
            list.add(value);
        }
        int sum = 0;
        for (int count = 0; count < arr.length; count++) {
            sum += arr[count];
            int qu = sum;
            int start = 0;
            for (int i = count; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    list.add(qu + arr[j]);
                }
                qu = qu - arr[start] + arr[i+1];
                start++;
            }
        }
//        list.sort(Integer::compareTo);
        System.out.println(list);
        int start = list.get(0);
        int end = list.get(list.size()-1);
        for(int k = start; k <= end; k++) {
            if(!list.contains(k)) {
                return k;
            }
        }
        return end+1;
    }

    public static void main(String[] args) {
        System.out.println(getFirstUnFormedNum(new int[]{8,10,2,10,4,8,6,3,5,7,10}));
    }

}
