package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -11
 * Time: 16:40
 */
public class Work3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m+1];
        //初始化n-m的数据为最大值
        for (int i = n; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        arr[n] = 0; //初始状态
        for (int i = n; i < m; i++) {
            //如果没有到达过这个位置，则下一轮循环
            if (arr[i] == Integer.MAX_VALUE) {
                continue;
            }
            //list来记录当前石板能跳的所有距离
            List<Integer> list = piv(i);
            //遍历当前石板所有能跳的距离
            for (int j : list) {
                //大前提，跳到的石板下标不能超过m，否则数组越界
                if(i+j <= m) {
                    //如果跳到的石板之前没有跳到过，则直接+1
                    if(arr[i] == Integer.MAX_VALUE) {
                        arr[i+j] = arr[i] + 1;
                    }else { //否则就取跳到石板步数最小值
                        arr[i+j] = Math.min(arr[i+j],arr[i]+1);
                    }
                }
            }
        }
        //最后判断下标为m的石板的最小步数
        if(arr[m] == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else {
            System.out.println(arr[m]);
        }
    }

    //用来记录石板下标的所有约数
    public static List<Integer> piv(int num) {
        List<Integer> list = new ArrayList<>();
        //这里只需要遍历到i*i <= num即可，因为两数相乘才得到num，小的乘数找到了，对应的大的乘数则为num/i
        for (int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                list.add(i);
                //这里有可能有i == num/i 的情况，所以只取一次i
                if(i != num/i) {
                    list.add(num/i);
                }
            }
        }
        return list;
    }

}
