package week5.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -18
 * Time: 9:29
 */
public class Work1 {

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            if(s.length != 2) {
                System.out.println("No");
                continue;
            }
            String n = s[0];
            String r = s[1];
            if(n.length() == r.length()){
                int i;
                for(i = 0; i < n.length(); i++) {
                    float a = n.charAt(i) - '0';
                    float b = r.charAt(i) - '0';
                    float cir = 2*3.14f*b;
                    if(cir < a) {
                        System.out.println("No");
                        break;
                    }
                }
                if(i >= n.length()) {
                    System.out.println("Yes");
                }
            }else {
                System.out.println("No");
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Double n = in.nextDouble();
            Double r = in.nextDouble();
            if(n < 2 * 3.14 * r)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

}
