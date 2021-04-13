package week1.monday4_12;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -12
 * Time: 20:22
 */
public class Work1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //0:需要判断 1:递增 2:递减
        int sta = 0;
        int count = 0;
        int j = 0;
        while(j < n) {
            j++;
            while(j < n) {
                if(arr[j] > arr[j-1]){
                    sta = 1;
                    break;
                }else if(arr[j] < arr[j-1]) {
                    sta = 2;
                    break;
                }else {
                    j++;
                }
            }
            for(j = j+1 ; j < n; j++) {
                if(sta == 2 && arr[j] > arr[j-1]) {
                    count++;
                    break;
                }
                if(sta == 1 && arr[j] < arr[j-1]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count+1);
    }


    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int goon = 0;   //0:变低  1：变高   2：重新判断
        int i = 1;
        while(i < n) {
            if(goon == 1) {
                if(arr[i] >= arr[i-1]) {
                    i++;
                }else {
                    goon = 2;
                }
            }else if(goon == 0) {
                if(arr[i] <= arr[i-1]) {
                    i++;
                }else {
                    goon = 2;
                }
            }

        }



//        boolean ishigh = false;
//        int count = 0;
//        int i = 1;
//        int start = 1;
//        while(i < n) {
//            if(start == 1){
//                int j = i;
//                if(arr[j] > arr[j-1]){
//                    ishigh = true;
//                    break;
//                }else if(arr[j] < arr[j-1]) {
//                    ishigh = false;
//                    break;
//                }else {
//                    j++;
//                }
//                i = j+1;
//                start = 0;
//            }
//            //减 变 增
//            if(!ishigh && arr[i] > arr[i-1]) {
//                ishigh = true;
//                start = 1;
//                count++;
//            }else if(ishigh && arr[i] < arr[i-1]) {//增 变 减
//                ishigh = false;
//                start = 1;
//                count++;
//            }else {
//                i++;
//            }

//        }



//        while(j < n) {
//            if(arr[j] > arr[j-1]){
//                ishigh = true;
//                break;
//            }else if(arr[j] < arr[j-1]) {
//                break;
//            }else {
//                j++;
//            }
//        }

//        10
//        3 5 3 12 4 5 3 3 4 1
//        for(int i = j+1; i < n; i++) {
//            //减 变 增
//            if(!ishigh && arr[i] > arr[i-1]) {
//                ishigh = true;
//                i++;
//                count++;
//            }
//            //增 变 减
//            if(ishigh && arr[i] < arr[i-1]) {
//                ishigh = false;
//                i++;
//                count++;
//            }
//        }
//        System.out.println(count);
    }

}
