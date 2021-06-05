package week7.day5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -05
 * Time: 12:49
 */
public class Work2 {

    static int[][] direction = {{0, 1}, {0, - 1}, {1, 0}, { - 1, 0}, {1, 1}, {1, - 1}, { - 1, 1}, { - 1, - 1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Character[][] map = new Character[20][20];
            for (int i = 0; i < 20; i ++ ) {
                String s = sc.next();
                for (int j = 0; j < 20; j ++ ) {
                    map[i][j] = s.charAt(j);
                }
            }
            if(check(map)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public static boolean check(Character[][] map) {
        for (int i = 0; i < 20; i ++ ) {
            for (int j = 0; j < 20; j ++ ) {
                if(map[i][j] == '*' || map[i][j] == '+') {
                    for (int k = 0; k < 8; k ++ ) {
                        int count = 1;
                        int x = i + direction[k][0];
                        int y = j + direction[k][1];
                        while (x >= 0 && x < 20 && y >= 0 && y < 20 && map[x][y] == map[i][j]) {
                            count ++ ;
                            x += direction[k][0];
                            y += direction[k][1];
                        }
                        if(count == 5) return true;
                    }
                }
            }
        }
        return false;
    }

}
