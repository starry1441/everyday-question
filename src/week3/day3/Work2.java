package week3.day3;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -28
 * Time: 10:55
 */
public class Work2 {

    public int minCount(int[] left,int[] right) {
        //对应数就是 左数组和右数组下标相同的值 不为0 的数
        List<Integer> l = new ArrayList<>();    //用来存放左数组的对应数
        int sumL = 0;   //左数组的总和
        int sumR = 0;   //右数组的总和
        int sumDuiR = 0;    //左对应数和
        //遍历数组得到上述所有的值
        for(int i = 0; i < left.length; i++) {
            if(left[i] != 0 && right[i] != 0) {
                l.add(left[i]);
                sumDuiR += right[i];
            }
            sumL += left[i];
            sumR += right[i];
        }
        l.sort(Integer::compareTo);
        //左数组总结公式：左数组和 - 对应值最小的数 + 1
        int resL = sumL - l.get(0) + 1;
        //右数组总结公式：右数组和 - 右对应数和 + 1
        int resR = sumR - sumDuiR + 1;
        return resL + resR;
    }

    public int findMinimum(int n, int[] left, int[] right) {
        int res1 = minCount(left,right);
        int res2 = minCount(right,left);
        //交换左右数组进行比较，返回最小的
        if(res1 > res2) {
            return res2;
        }
        return res1;
    }

    public static void main(String[] args) {
        Work2 work = new Work2();
        System.out.println(work.findMinimum(4, new int[]{1,2,0,1,3,1}, new int[]{0,0,0,2,0,1}));
//        List<Integer> list = new ArrayList<>();
//        int[] arr = {4,8,6,2,7,1,9};
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        list.sort(Integer::compareTo);
//        System.out.println(list);
    }

}
