package week4.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -10
 * Time: 20:40
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            if(str1.length() > str2.length()) {
                String tmp = str1;
                str1 = str2;
                str2 = tmp;
            }
            int max = 0;
            for (int i = 0; i < str1.length(); i++) {
                int j = i+1;
                String tmp = "";
                while (true) {
                    if(j <= str1.length()) {
                        tmp = str1.substring(i,j);
                    }
                    if(j <= str1.length() && str2.contains(tmp)) {
                        j++;
                    }else {
                        if(j-1-i > max) {
                            max = j-1-i;
                        }
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }

}
