package week3.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -28
 * Time: 12:51
 */
public class Work3 {

    //list集合版
    public static boolean isHuiWen(int num) {
        List<Integer> list = new ArrayList<>();
        //这里把num的每一位放到list中，依次为个位，十位，百位。。。
        while(num > 0) {
            list.add(num%10);
            num = num/10;
        }
        //定义变量left为list的首位置
        //变量right为list的尾位置
        int left = 0;
        int right = list.size()-1;
        //left往右走，right往左走，若相遇就结束循环
        while (left < right) {
            //如果list的left下标和right下标对应的值不相等，则不是回文
            if(list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        //程序走到这里，遍历完了整个list，并没有出现左右两边不相等的情况，所以是回文
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHuiWen(123));
    }

}
