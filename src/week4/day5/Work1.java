package week4.day5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -15
 * Time: 10:35
 */
public class Work1 {

    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int i = 0;
        int j = n/2+1;
        while(j < n) {
            if(gifts[i] == gifts[j]) {
                return gifts[i];
            }
            i++;
            j++;
        }
        return 0;
    }

}
