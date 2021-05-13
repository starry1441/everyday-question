package week4.day4;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -13
 * Time: 9:40
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            Map<Character,Integer> map = new HashMap<>();
            for (char c : str.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            boolean sout = false;
            for (Map.Entry<Character,Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                    sout = true;
                    break;
                }
            }
            if (!sout || str.equals("")) {
                System.out.println(-1);
            }
        }
    }

}
