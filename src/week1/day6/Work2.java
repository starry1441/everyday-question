package week1.day6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -17
 * Time: 13:30
 */
public class Work2 {

    public int StrToInt(String str) {
        if(str == null || str.equals("")) return 0;
        char[] ch = str.toCharArray();
        int count = 0;
        int sum = 0;
        for(int i = ch.length-1; i > 0; i--) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                int tmp = ch[i]-'0';
                sum += tmp * (int)Math.pow(10,count);
                count++;
            }else {
                return 0;
            }
        }
        if(ch[0] == '+') {
            return sum;
        }else if(ch[0] == '-'){
            sum = -sum;
        }else {
            int tmp = ch[0]-'0';
            sum += tmp * (int)Math.pow(10,count);
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "";
        Work2 a = new Work2();
        System.out.println(a.StrToInt(str));
    }

}
