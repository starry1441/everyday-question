package week5.day2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -18
 * Time: 13:14
 */
public class Work2 {

    public int jumpFloorII(int target) {
        if(target == 1) return 1;
        return 2 * jumpFloorII(target-1);
    }

}
