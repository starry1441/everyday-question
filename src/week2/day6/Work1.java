package week2.day6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -23
 * Time: 9:07
 */
public class Work1 {

    public int getLCA(int a, int b) {
        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(a == b) return a;
        //b最大了
        while(a != b) {
            b = b/2;
            if(b < a) {
                a = a/2;
                if(a == b) break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Work1 a = new Work1();
        System.out.println(a.getLCA(4,7));
    }

}
