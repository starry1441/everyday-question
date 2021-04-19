package week2.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -19
 * Time: 21:21
 */
public class Work3 {


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(input.hasNext()){
            list.add(input.nextInt());
        }
        int k=list.remove(list.size()-1);
        Collections.sort(list);
        for(int i=0; i<k-1; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.get(k-1));
    }

}
