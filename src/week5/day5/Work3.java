package week5.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -02
 * Time: 20:46
 */
import java.util.*;

public class Work3 {
    /**
     *  正数数组中的最小不可组成和
     *  输入：正数数组arr
     *  返回：正数数组中的最小不可组成和
     */
    public int getFirstUnFormedNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            max += arr[i];
            min = Math.min(min,arr[i]);
        }
        boolean[] form = new boolean[max+1];
        form[0] = true;
        for(int i = 0; i < arr.length; i++) {
            //逆序判断背包承重中能够放入的数据
            //当数组中只有2的时候，背包承重从2-10都可以放入2的数值
            //当数组中放入2和3的时候，背包承重从5-10可以放入5，3-4放入3，2只能放入2
            //当数组中放入2，3，5时，背包承重10放入10，8-9放入8，7放入7，5-6放入5...
            //dp[j-arr[i]]意思是背包承重为j时，如果已经放置了arr[i]的重量后还能放置的最大重量
            for(int j = max; j >= arr[i]; j--) {
                form[j] = form[j - arr[i]] || form[j];
            }
        }
        for(int i = min; i < form.length; i++) {
            if(!form[i]) {
                return i;
            }
        }
        return max+1;
    }
}
