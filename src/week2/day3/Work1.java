package week2.day3;


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -19
 * Time: 19:43
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = i;
            }
            boolean[] del = new boolean[n];
            int count = 0;
            int i = 0;
            int res = n;
            while(true) {
                if(!del[i]) {
                    count++;
                }
                if(count == 3) {
                    if(res == 1) {
                        System.out.println(i);
                        break;
                    }
                    del[i] = true;
                    res--;
                    count = 0;
                }
                i++;
                if(i == n) {
                    i = 0;
                }
            }
        }

    }

}
