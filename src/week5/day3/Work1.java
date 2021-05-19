package week5.day3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -19
 * Time: 18:07
 */
public class Work1 {

    public int Add(int num1,int num2) {
        while(num2 != 0) {
            int c = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = c;
        }
        return num1;
    }

}
