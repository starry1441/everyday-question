package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -26
 * Time: 14:50
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int l = 0;
        int r = 0;
        boolean symbol = false;
        List<String> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        while (r < arr.length) {
            if(arr[r] == '/') {
                symbol = true;
                StringBuilder str = new StringBuilder();
                while (l < r) {
                    str.append(arr[l]);
                    l++;
                }
                if(!str.toString().trim().equals("")) {
                    list.add(str.toString().trim());
                }
            }
            if(arr[r] == ':') {
                symbol = true;
                StringBuilder str = new StringBuilder();
                while (l < r-1) {
                    str.append(arr[l]);
                    l++;
                }
                if(!str.toString().trim().equals("")) {
                    list.add(str.toString().trim());
                }
            }
            if(arr[r] == '\"') {
                symbol = true;
                StringBuilder str = new StringBuilder();
                while (l < r) {
                    str.append(arr[l]);
                    l++;
                }
                l++;
                if(!str.toString().trim().equals("")) {
                    list.add(str.toString().trim());
                }
            }
            r++;
        }
        StringBuilder str = new StringBuilder();
        while (l < r) {
            str.append(arr[l]);
            l++;
        }
        if(!str.toString().trim().equals("")) {
            list.add(str.toString().trim());
        }
        if(symbol) {
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }else {
            String[] res = s.trim().split(" ");
            System.out.println(res.length);
            for(int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        }

    }

    public static void main3(String[] args) {
        String a = "\"da\"";
        System.out.println(a);
        if(a.charAt(0) == '\"') {
            a = a.substring(1,a.length()-1);
        }
        System.out.println(a);
    }

    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        String s = "gqpj /lrl d:\\ a:\\ c:\\ /nkb";
        String[] arr = s.split(" ");
        List<String> list = new ArrayList<>();
        list.add(arr[0]);
        int i = 1;
        while (i < arr.length) {
//            if(arr[i].charAt(0) == '\"') {
//                arr[i] = arr[i].substring(1,arr[i].length()-1);
//            }
            StringBuilder str = new StringBuilder();
            if(arr[i].length() > 1 && arr[i].charAt(1) == ':') {

                list.add(arr[i]);
            }else if(arr[i].charAt(0) == '/') {
                list.add(arr[i]);
            }
            i++;
        }
        System.out.println(list.size());
        for(int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }

    public static void main2(String[] args) {
        String s = "xcopysdaf /sf as c:\\asd fsa d:\\fdsa fe";
        String[] arr = s.split(" ");
        String t1 = arr[0];
        StringBuilder t2 = new StringBuilder();
        StringBuilder t3 = new StringBuilder();
        StringBuilder t4 = new StringBuilder();
        int i = 1;
        while (i < arr.length) {
            if(arr[i].length() >= 3) {
                String start = arr[i].substring(0,3);
                if(start.equals("c:\\")) {
                    break;
                }
            }
            t2.append(arr[i]);
            t2.append(" ");
            i++;
        }
        while (i < arr.length) {
            if(arr[i].length() >= 3) {
                String start = arr[i].substring(0,3);
                if(start.equals("d:\\")) {
                    break;
                }
            }
            t3.append(arr[i]);
            t3.append(" ");
            i++;
        }
        while (i < arr.length) {
            t4.append(arr[i]);
            i++;
        }
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }

}
