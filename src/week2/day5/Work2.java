package week2.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 20:05
 */
public class Work2 {

    int count = 0;
    public int countWays(int x, int y) {
        int i = 0;
        int j = 0;
        dfs(i,j,x,y);
        return count;
    }
    //x，i行，y，j列
    public void dfs(int i,int j,int x,int y) {
        if(j >= y || i >= x) {
            return;
        }
        if(j == y-1 && i == x-1) {
            count++;
            return;
        }
        dfs(i,j+1,x,y);
        dfs(i+1,j,x,y);
    }

    public static void main(String[] args) {
        Work2 a = new Work2();
        System.out.println(a.countWays(2, 2));
    }

}
