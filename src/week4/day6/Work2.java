package week4.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -15
 * Time: 17:23
 */
public class Work2 {

    public static int min = Integer.MAX_VALUE;  //到达长点最小步骤
    public static List<int[]> stack = null; //用链表代替栈的功能
    public static List<List<int[]>> list = null; //链表存放能到达终点的所有路径
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] map = new int[n][m];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }
            boolean[][] isUsed = new boolean[n][m]; //判断该节点是否走过
            int count = 1;  //计走的步数
            stack = new ArrayList<>();  //实例化
            list = new ArrayList<>();   //实例化
            dfs(0,0,map,isUsed,count);  //调用函数，深度优先遍历
            int minStep = Integer.MAX_VALUE;    //最小步数
            List<int[]> res = null;     //最小步数的所有节点
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).size() < minStep) {
                    minStep = list.get(i).size();
                    res = list.get(i);
                }
            }
            //打印所有步数
            for (int i = 0; i < res.size(); i++) {
                System.out.println("(" + res.get(i)[0] + "," + res.get(i)[1] + ")");
            }
        }
    }

    //回溯法
    public static void dfs(int i, int j, int[][] map, boolean[][] isUsed,int count) {
        stack.add(new int[]{i,j});  //每次递归进来都给栈加i，j位置
        //如果到达了终点，则把之前的所有步位置放到list保存
        if (i == map.length-1 && j == map[0].length-1) {
            List<int[]> res = new ArrayList<>(stack);
            list.add(res);
            if (count < min) {
                min = count;
            }
            return; //这里回溯，因为有可能不是最小步数
        }
        isUsed[i][j] = true;    //该位置变为走过
        //分别在上下左右进行递归，下一步的位置不能越界，不能走过，不能是墙
        //上
        if (i-1 < map.length && i-1 >= 0 && !isUsed[i-1][j] && map[i-1][j] == 0) {
            dfs(i-1,j,map,isUsed,count+1);
        }
        //下
        if (i + 1 < map.length && !isUsed[i + 1][j] && map[i+1][j] == 0) {
            dfs(i+1,j,map,isUsed,count+1);
        }
        //左
        if (j-1 < map[0].length && j-1 >= 0 && !isUsed[i][j-1] && map[i][j-1] == 0) {
            dfs(i,j-1,map,isUsed,count+1);
        }
        //右
        if (j + 1 < map[0].length && !isUsed[i][j + 1] && map[i][j+1] == 0) {
            dfs(i,j+1,map,isUsed,count+1);
        }
        isUsed[i][j] = false;   //回溯后要给走过位置置为为走过
        stack.remove(stack.size()-1);   //回溯后要给出栈
    }

}
