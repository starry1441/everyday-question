package week5.day4;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -20
 * Time: 14:46
 */
public class Work1 {

    public static void oddInOddEvenInEven(int[] arr) {
        int i = 0;    //偶数
        int j = 1;    //奇数
        while(i < arr.length && j < arr.length) {
            if(arr[i]%2 == 0) {
                i += 2;
            }else if(arr[j] == 1) {
                j += 2;
            }else {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i += 2;
                j += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,7,9,5,1,6,7,9,3,2,6};
        oddInOddEvenInEven(arr);
        System.out.println(Arrays.toString(arr));
    }

}
