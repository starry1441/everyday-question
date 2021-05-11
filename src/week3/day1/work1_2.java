package week3.day1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:按遇到的情况划分
 * User: starry
 * Date: 2021 -05 -11
 * Time: 19:34
 */
public class work1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '"') {
                do {
                    i++;
                }while (str.charAt(i) != '"');
            }
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count+1);
        int font = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '"') {
                font = font^1;
            }
            if(str.charAt(i) != '"' && str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
            if(font == 1 && str.charAt(i) == ' ') {
                System.out.println();
            }
            if(font == 0 && str.charAt(i) == ' ') {
                System.out.print(' ');
            }
        }
    }

}
