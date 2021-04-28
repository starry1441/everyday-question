package week3.day4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -28
 * Time: 20:31
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] both = s.split("-");
        String[] left = both[0].split(" ");
        String[] right = both[1].split(" ");
        //判断比较性
        if(left.length != right.length) {
            if(left.length != 4 && right.length != 4) {
                if(!both[0].equals("joker JOKER") && !both[1].equals("joker JOKER")) {
                    System.out.println("ERROR");
                    return;
                }
                if(both[0].equals("JOKER") && right.length != 1 || both[1].equals("JOKER") && left.length != 1) {
                    System.out.println("ERROR");
                    return;
                }
                if(both[0].equals("joker") && right.length != 1 || both[1].equals("joker") && left.length != 1) {
                    System.out.println("ERROR");
                    return;
                }
            }
        }
        //个子、对子、顺子、三个、
        if(both[0].equals("joker JOKER") || both[1].equals("joker JOKER")) {
            System.out.println("joker JOKER");
            return;
        }
        if(left.length == 4 && right.length != 4 || right.length == 4 && left.length != 4) {
            if(left.length == 4) {
                System.out.println(both[0]);
                return;
            }else {
                System.out.println(both[1]);
                return;
            }
        }
        if(both[0].equals("joker") || both[1].equals("joker")) {
            System.out.println("joker");
            return;
        }
        if(both[0].equals("JOKER") || both[1].equals("JOKER")) {
            System.out.println("JOKER");
            return;
        }
        int l = change(left[0]);
        int r = change(right[0]);
        if(l > r) {
            System.out.println(both[0]);
            return;
        }else {
            System.out.println(both[1]);
            return;
        }
    }

    public static int change(String num) {
        int l = 0;
        switch (num) {
            case "3":
                l = 3;
                break;
            case "4":
                l = 4;
                break;
            case "5":
                l = 5;
                break;
            case "6":
                l = 6;
                break;
            case "7":
                l = 7;
                break;
            case "8":
                l = 8;
                break;
            case "9":
                l = 9;
                break;
            case "10":
                l = 10;
                break;
            case "J":
                l = 11;
                break;
            case "Q":
                l = 12;
                break;
            case "K":
                l = 13;
                break;
            case "A":
                l = 14;
                break;
            case "2":
                l = 15;
                break;
        }
        return l;
    }

}
