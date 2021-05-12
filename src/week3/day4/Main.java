package week3.day4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -12
 * Time: 18:30
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] pp = str.split("-");
        String[] p1 = pp[0].split(" ");
        String[] p2 = pp[1].split(" ");
        String p = "34567891JQKA2";
        if (pp[0].equals("joker JOKER") || pp[1].equals("joker JOKER")) {
            System.out.println("joker JOKER");
        }else if (p1.length == p2.length) {
            if (p.indexOf(p1[0].substring(0,1)) > p.indexOf(p2[0].substring(0,1))) {
                System.out.println(pp[0]);
            }else {
                System.out.println(pp[1]);
            }
        }else if (p1.length == 4) {
            System.out.println(pp[0]);
        }else if (p2.length == 4) {
            System.out.println(pp[1]);
        }else {
            System.out.println("ERROR");
        }
    }
}