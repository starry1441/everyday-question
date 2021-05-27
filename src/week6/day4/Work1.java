package week6.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -27
 * Time: 17:40
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextLine();
            }
            for(int i = 0; i < n; i++) {
                if(arr[i].contains(",") || arr[i].contains(" ")) {
                    System.out.print("\"" + arr[i] + "\"");
                }else {
                    System.out.print(arr[i]);
                }
                if(i != n-1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

}
