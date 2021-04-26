package week3.day1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -26
 * Time: 18:02
 */

import java.util.*;

public class Work2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(n,0);
        queue.add(n);
        while (!queue.isEmpty()) {
            int head = queue.poll();
            if(head == m) {
                System.out.println(map.get(head));
                return;
            }
            List<Integer> list = yueNum(head);
            for(int i = 0; i < list.size(); i++) {
                int sum = head + list.get(i);
                if(!map.containsKey(sum) && sum <= m) {
                    queue.add(sum);
                    map.put(sum,map.get(head)+1);
                }
            }
        }
        System.out.println(-1);
    }

    private static List<Integer> yueNum1(int head) {
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i < head; i++) {
            if(head % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static ArrayList<Integer> yueNum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        Queue<Integer> queue = new LinkedList<Integer>();
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        ArrayList<Integer> factor = new ArrayList<Integer>();
//        queue.add(n);
//        map.put(n, 0);
//        int i;
//        while(!queue.isEmpty()) {
//            int head = queue.poll();
//            factor = getAppNums(head);
//            if(head == m) {
//                System.out.print(map.get(head));
//                return;
//            }
//            for(i=0;i<factor.size();i++) {
//                if(!map.containsKey(head+factor.get(i)) && head+factor.get(i)<=m) {
//                    queue.add(head+factor.get(i));
//                    map.put(head+factor.get(i), map.get(head)+1);
//                }
//            }
//        }
//        System.out.print(-1);
//    }
//
//    public static ArrayList<Integer> getAppNums(int n) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                list.add(i);
//                if (n / i != i) {
//                    list.add(n / i);
//                }
//            }
//        }
//        return list;
//    }
}