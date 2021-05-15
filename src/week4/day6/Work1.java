package week4.day6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -15
 * Time: 17:23
 */
public class Work1 {

    public int getMost(int[][] board) {
        int[][] dp = new int[board.length][board[0].length];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = board[i][j];
                }else if(i == 0) {
                    dp[i][j] = dp[i][j-1] + board[i][j];
                }else if(j == 0) {
                    dp[i][j] = dp[i-1][j] + board[i][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + board[i][j];
                }
            }
        }
        return dp[board.length-1][board[0].length-1];
    }

}
