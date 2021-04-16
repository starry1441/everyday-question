package week1.day5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -16
 * Time: 14:24
 */
public class Work2 {

    // 1 2 -4 4 2 -3 2 1
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = Math.max(arr[0], 0);
        int max = 0;
        for(int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], 0);
            if(max < dp[i]) {
                max = dp[i];
            }
        }
        if(max == 0) {
            int downMax = (int) Math.pow(-2,31);
            for(int i = 0; i < n; i++) {
                if(downMax < arr[i]) {
                    downMax = arr[i];
                }
            }
            System.out.println(downMax);
        }else {
            System.out.println(max);
        }
    }

    //动态规划
    public int maxSubArray1(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(dp[i-1] < 0) {
                dp[i] = nums[i];
            }else {
                dp[i] = dp[i-1] + nums[i];
            }
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Work2 a = new Work2();
        int[] arr = {-3,-2,-5,-111,-2};
        System.out.println(a.maxSubArray1(arr));
    }

}
