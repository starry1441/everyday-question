package week4.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -15
 * Time: 10:45
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            int res = calStringDistance(str1,str2); //调用求最小步数函数
            System.out.println(res);
        }
    }

    //计算最小步数函数
    public static int calStringDistance(String str1, String str2) {
        //定义dp数组，行多加一行，列多加一列，因为存放初始状态，用来辅助比较
        int[][] step = new int[str1.length()+1][str2.length()+1];
        //初始列：F(i,0) = i（删除操作）
        for (int i = 0; i < step.length; i++) {
            step[i][0] = i;
        }
        //初始行：F(0,j) = j (插入操作)
        for (int i = 0; i < step[0].length; i++) {
            step[0][i] = i;
        }
        //开始转换DP动态规划，遍历二维数组
        for (int i = 1; i < step.length; i++) {
            for (int j = 1; j < step[0].length; j++) {
                //如果A[i] == B[j]，则不用增加步数，等于上一步 F(i-1,j-1)即可
                //如果A[i] != B[j]，则需要比较三种操作中最小的步数，F(i,j) = min (F(i,j-1) , F(i-1,j) , F(i-1,j-1)) + 1
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    step[i][j] = step[i-1][j-1];
                }else {
                    step[i][j] = Math.min(Math.min(step[i - 1][j], step[i - 1][j - 1]), step[i][j - 1]) + 1;
                }
            }
        }
        //返回二维数组DP的右下角，即遍历完两个字符串的最小步数
        return step[step.length - 1][step[0].length - 1];
    }


}
