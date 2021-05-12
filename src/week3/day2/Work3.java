package week3.day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -12
 * Time: 16:21
 */
public class Work3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        //排序为了简化流程
        Arrays.sort(num);
        System.out.println(dfs(num,0,1,0));
    }

    public static int dfs(int[] num,int sum,int product,int index) {
        int count = 0;  //幸运袋子个数
        //从index位置开始遍历数组
        for (int i = index; i < num.length; i++) {
            sum += num[i];
            product *= num[i];
            if (sum > product) {    //如果和比积大，则个数加一，并向下递归
                count = count + 1 + dfs(num,sum,product,i+1);
            }else if(num[i] == 1) { //1特例，因为数字1能提高总和值但不会提高总积值，1的个数越多，和更有可能大于积，所以给它一次机会向下递归，但不+1
                count = count + dfs(num,sum,product,i+1);
            }else { //如果遇到了大于的情况，则不用向后遍历，因为数组有序，往后肯定越大，不可能再比sum小了
                break;
            }
            //回溯需要把sum和product回溯到上一递归的值。
            sum = sum-num[i];
            product = product/num[i];
            //注意：因为题目说了，拥有相同号码的球是无区别的，所以遇到相同的，往后遍历即可
            while (i+1 < num.length && num[i] == num[i+1]) {
                i++;
            }
        }
        return count;
    }

}
