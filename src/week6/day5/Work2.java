package week6.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -28
 * Time: 19:09
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String name = in.nextLine();
            List<String> list = new ArrayList<>();
            int tmp = 0;
            int start = 0;
            int i;
            for(i = 0; i < str.length(); i++) {
                if(tmp == 0 && str.charAt(i) == '"') {
                    start = i+1;
                    tmp = 1;
                }else if(tmp == 1 && str.charAt(i) == '"') {
                    list.add(str.substring(start,i));
                    tmp = 0;
                    i++;
                    start = i+1;
                }else if(tmp != 1 && str.charAt(i) == ',') {
                    list.add(str.substring(start,i));
                    start = i;
                    start++;
                }
            }
            if(str.charAt(str.length()-1) != '"') {
                list.add(str.substring(start,i));
            }
            if (list.contains(name)) {
                System.out.println("Ignore");
            }else {
                System.out.println("Important!");
            }
        }
    }

}
