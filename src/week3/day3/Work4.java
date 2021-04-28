package week3.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -28
 * Time: 13:03
 */
public class Work4 {

    //正常数组版
    public static boolean isHuiWen(int num) {
        int num2 = num;
        int count = 0;  //用来记录位数
        //这里先计算出来num数的位数
        while(num2 > 0) {
            count++;
            num2 = num2/10;
        }
        int[] res = new int[count]; //存放num的每一位
        //这里把num的每一位放到res数组中，依次为个位，十位，百位。。。
        for (int i = 0; i < count; i++) {
            res[i] = num%10;
            num = num/10;
        }
        //定义变量left为res数组的首位置
        //变量right为res数组的尾位置
        int left = 0;
        int right = count-1;
        //left往右走，right往左走，若相遇就结束循环
        while (left < right) {
            //如果list的left下标和right下标对应的值不相等，则不是回文
            if(res[left] != res[right]) {
                return false;
            }
            left++;
            right--;
        }
        //程序走到这里，遍历完了整个res数组，并没有出现左右两边不相等的情况，所以是回文
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHuiWen(121));
    }

}
