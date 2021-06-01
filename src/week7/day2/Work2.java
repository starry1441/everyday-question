package week7.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -01
 * Time: 16:22
 */
public class Work2 {

    public static int count;
    public static int bong;
    public static boolean mush;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[][] table = new int[m][n];
            for(int i = 0; i < k; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                table[a-1][b-1] = 1;
            }
            count = 0;
            bong = 0;
            mush = false;
            dfs(0,0,table);
            System.out.println(String.format("%.2f",(float)bong/count));
        }
    }
    public static void dfs(int i,int j,int[][] table) {
        if(table[i][j] == 1) {
            mush = true;
        }
        if(i == table.length-1 && j == table[0].length-1) {
            count++;
            if(mush) bong++;
        }
        if(j+1 < table[0].length) {
            dfs(i,j+1,table);
        }
        if(i+1 < table.length) {
            dfs(i+1,j,table);
        }
    }

}
