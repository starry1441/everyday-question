package week6.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -26
 * Time: 16:25
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            String left = s[0];
            String right = s[1];
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < left.length(); i++) {
                list.add(left.charAt(i));
            }
            int count = 0;
            boolean out = false;
            while(!out) {
//                List<Character> l = new ArrayList<>();
                int i;
                for(i = 0; i < right.length(); i++) {
                    char c = right.charAt(i);
                    if(list.contains(c)) {
//                        l.add(right.charAt(i));
                        list.remove((Object)c);
                    }else {
                        out = true;
                        break;
                    }
                }
                if (i >= right.length()) {
                    count++;
                }
//                if(i >= right.length()) {
//                    for(int j = 0; j < l.size(); j++) {
//                        list.remove(l.get(j));
//                    }
//                    count++;
//                }
            }
            System.out.println(count);
        }
    }

}
