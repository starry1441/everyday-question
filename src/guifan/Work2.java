package guifan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 10:49
 */
// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
