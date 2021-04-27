package week3.day2;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:幸运的袋子
 * https://www.nowcoder.com/questionTerminal/a5190a7c3ec045ce9273beebdfe029ee?answerType=1&f=discussion
 * 此题有点难，没做出来
 * User: starry
 * Date: 2021 -04 -26
 * Time: 20:39
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for(int i=0; i<n; i++)
                nums[i] = scanner.nextInt();

            Arrays.sort(nums);
            System.out.println(find(nums, 0, 0, 1));
        }
    }

    private static int find(int[] nums, int index, long sum, long multi) {
        int count = 0;
        for(int i=index; i<nums.length; i++) {
            sum += nums[i];
            multi *= nums[i];
            if(sum > multi)
                count += 1+ find(nums, i+1, sum, multi);
            else if(nums[i] == 1)
                count += find(nums, i+1, sum, multi);
            else
                break;
            sum -= nums[i];
            multi /= nums[i];
            while(i<nums.length-1&& nums[i]==nums[i+1])
                i++;
        }
        return count;
    }


    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int cheng = 1;
        for(int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
            sum += arr[i];
            cheng *= arr[i];
        }
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int sum1 = sum;
            sum1 = sum1-arr[i];
            int cheng1 = cheng;
            cheng1 = cheng1/arr[i];
            if(sum1 > cheng1) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(sum1);
                list.add(cheng1);
                list.add(i);
                queue.add(list);
                count++;
            }
        }
        while (!queue.isEmpty()) {
            ArrayList<Integer> a = queue.poll();
            for(int i = 0; i < n; i++) {

            }

        }
    }

}
