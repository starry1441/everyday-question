package week1.day3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -14
 * Time: 10:52
 */
public class Work2 {

    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length/2;
        while(j < array.length) {
            if(array[i] == array[j]) {
                return array[i];
            }else{
                i++;
                j++;
            }
        }
        return 0;
    }

}
