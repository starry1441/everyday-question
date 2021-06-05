package week7.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -05
 * Time: 11:13
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            char[][] table = new char[20][20];
            List<int[]> black = new ArrayList<>();
            List<int[]> white = new ArrayList<>();
            for(int i = 0; i < 20; i++) {
                String str = in.nextLine();
                for(int j = 0; j < 20; j++) {
                    table[i][j] = str.charAt(j);
                    if(table[i][j] == '*') {
                        black.add(new int[]{i,j});
                    }
                    if(table[i][j] == '+') {
                        white.add(new int[]{i,j});
                    }
                }
            }
            boolean res = false;
            for(int[] tmp : black) {
                int i = tmp[0];
                int j = tmp[1];
                int count = 1;
                //上下
                for(int k = 1; k < 5; k++) {
                    if(i+k<20 && table[i+k][j] == '*') {
                        count++;
                    }
                    if(i-k>=0 && table[i-k][j] == '*') {
                        count++;
                    }
                    if(count >= 5) {
                        res = true;
                        break;
                    }
                }
                if(res) break;
                //左右
                count = 1;
                for(int k = 1; k < 5; k++) {
                    if(j+k<20 && table[i][j+k] == '*') {
                        count++;
                    }
                    if(j-k>=0 && table[i][j-k] == '*') {
                        count++;
                    }
                    if(count >= 5) {
                        res = true;
                        break;
                    }
                }
                if(res) break;
                //左斜
                count = 1;
                for(int k = 1; k < 5; k++) {
                    if(i-k>=0 && j-k>=0 && table[i-k][j-k] == '*') {
                        count++;
                    }
                    if(i+k<20 && j+k <20 && table[i+k][j+k] == '*') {
                        count++;
                    }
                    if(count >= 5) {
                        res = true;
                        break;
                    }
                }
                if(res) break;
                //右斜
                count = 1;
                for(int k = 1; k < 5; k++) {
                    if(i-k>=0 && j+k<20 && table[i-k][j+k] == '*') {
                        count++;
                    }
                    if(i+k<20 && j-k>=0 && table[i+k][j-k] == '*') {
                        count++;
                    }
                    if(count >= 5) {
                        res = true;
                        break;
                    }
                }
                if(res) break;
            }
            if(!res) {
                for(int[] tmp : white) {
                    int i = tmp[0];
                    int j = tmp[1];
                    int count = 1;
                    //上下
                    for(int k = 1; k < 5; k++) {
                        if(i+k<20 && table[i+k][j] == '+') {
                            count++;
                        }
                        if(i-k>=0 && table[i-k][j] == '+') {
                            count++;
                        }
                        if(count >= 5) {
                            res = true;
                            break;
                        }
                    }
                    if(res) break;
                    //左右
                    count = 1;
                    for(int k = 1; k < 5; k++) {
                        if(j+k<20 && table[i][j+k] == '+') {
                            count++;
                        }
                        if(j-k>=0 && table[i][j-k] == '+') {
                            count++;
                        }
                        if(count >= 5) {
                            res = true;
                            break;
                        }
                    }
                    if(res) break;
                    //左斜
                    count = 1;
                    for(int k = 1; k < 5; k++) {
                        if(i-k>=0 && j-k>=0 && table[i-k][j-k] == '+') {
                            count++;
                        }
                        if(i+k<20 && j+k <20 && table[i+k][j+k] == '+') {
                            count++;
                        }
                        if(count >= 5) {
                            res = true;
                            break;
                        }
                    }
                    if(res) break;
                    //右斜
                    count = 1;
                    for(int k = 1; k < 5; k++) {
                        if(i-k>=0 && j+k<20 && table[i-k][j+k] == '+') {
                            count++;
                        }
                        if(i+k<20 && j-k>=0 && table[i+k][j-k] == '+') {
                            count++;
                        }
                        if(count >= 5) {
                            res = true;
                            break;
                        }
                    }
                    if(res) break;
                }
            }
            if(res) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

}
