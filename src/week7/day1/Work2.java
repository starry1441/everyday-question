package week7.day1;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -31
 * Time: 15:29
 */
public class Work2 {

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextLine();
            }
//            List<String> list = new ArrayList<>();
            Arrays.sort(arr);
            for(int i = 0; i < n; i++) {
                String str = arr[i];
                int j;
                for(j = 0; j < n; j++) {
                    if(j == i) continue;
                    if(arr[j].contains(str)) {
                        break;
                    }
                }
                if(j >= n) {
                    System.out.println("mkdir -p " + str);
                }
            }
//            list.sort(new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    return o1.length() - o2.length();
//                }
//            });
//            for(String s : list) {
//                System.out.println("mkdir -p " + s);
//            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i ++ ) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr);
            List<String> res = new ArrayList<>();
            for (int i = 1; i < arr.length; i ++ ) {
                if( ! arr[i].startsWith(arr[i - 1] + "/")) res.add(arr[i - 1]);
            }
            res.add(arr[n - 1]);
            for (String s:res) {
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
    }

}
