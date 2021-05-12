package week3.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -12
 * Time: 17:57
 */
public class Work4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            //进入递归函数
            System.out.println(match(str1,str2,0,0));
        }
    }

    //i为str1指向的位置，j为str2指向的位置
    public static boolean match(String str1,String str2,int i,int j) {
        //如果i，j刚好都到字符串最后，则true
        if(i == str1.length() && j == str2.length()) {
            return true;
        }
        //如果只有一个到达，另一个没到达，则false
        if(i == str1.length() || j == str2.length()) {
            return false;
        }
        if(str1.charAt(i) == '?') { //遇到？，则两个指针都往前走一步
            return match(str1,str2,i+1,j+1);
        }else if (str1.charAt(i) == '*') {  //遇到*，可能*代表0个，代表1个，代表多个，依次递归
            return match(str1,str2,i+1,j) || match(str1,str2,i+1,j+1) || match(str1,str2,i,j+1);
        }else if (str1.charAt(i) == str2.charAt(j)) {   //如果i，j下标的字符相同，则继续往后递归
            return match(str1,str2,i+1,j+1);
        }else { //上面条件都不满足，说明i，j下标字符不相同，则false
            return false;
        }
    }

}
