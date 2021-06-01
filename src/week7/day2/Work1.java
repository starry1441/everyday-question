package week7.day2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -01
 * Time: 9:46
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            char[][] table = new char[m][n];
            Queue<int[]> queue = new LinkedList<>();
            int[] start = new int[2];
            for (int i = 0; i < m; i++) {
                String str = in.nextLine();
                for (int j = 0; j < n; j++) {
                    table[i][j] = str.charAt(j);
                    if (table[i][j] == '@') {
                        start[0] = i;
                        start[1] = j;
                    }
                }
            }
            int count = 1;
            int i = start[0];
            int j = start[1];
            queue.offer(new int[]{i,j});
            while(!queue.isEmpty()) {
                int[] step = queue.poll();
                i = step[0];
                j = step[1];
                if(i-1>=0 && table[i-1][j] == '.') {
                    queue.offer(new int[]{i-1,j});
                    count++;
                    table[i-1][j] = '@';
                }
                if(i+1<table.length && table[i+1][j] == '.') {
                    queue.offer(new int[]{i+1,j});
                    count++;
                    table[i+1][j] = '@';
                }
                if(j-1>=0 && table[i][j-1] == '.') {
                    queue.offer(new int[]{i,j-1});
                    count++;
                    table[i][j-1] = '@';
                }
                if(j+1<table[0].length && table[i][j+1] == '.') {
                    queue.offer(new int[]{i,j+1});
                    count++;
                    table[i][j+1] = '@';
                }
            }
            System.out.println(count);
        }
    }
//    public static int bfs(int i, int j, Queue<int[]> queue, char[][] table) {
//        int count = 1;
//        queue.offer(new int[]{i,j});
//        while(!queue.isEmpty()) {
//            int[] step = queue.poll();
//            i = step[0];
//            j = step[1];
//            if(i-1>=0 && table[i-1][j] == '.') {
//                queue.offer(new int[]{i-1,j});
//                count++;
//                table[i-1][j] = '@';
//            }
//            if(i+1<table.length && table[i+1][j] == '.') {
//                queue.offer(new int[]{i+1,j});
//                count++;
//                table[i+1][j] = '@';
//            }
//            if(j-1>=0 && table[i][j-1] == '.') {
//                queue.offer(new int[]{i,j-1});
//                count++;
//                table[i][j-1] = '@';
//            }
//            if(j+1<table[0].length && table[i][j+1] == '.') {
//                queue.offer(new int[]{i,j+1});
//                count++;
//                table[i][j+1] = '@';
//            }
//        }
//        return count;
//    }

}
