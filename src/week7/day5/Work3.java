package week7.day5;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -06 -05
 * Time: 12:49
 */
public class Work3 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String m=sc.nextLine();
            int n=Integer.valueOf(m);
            String str=sc.nextLine();
            String[]math=str.split(" ");
            Stack<String> stack=new Stack<>();
            for(String x:math){
                if(x.equals("+")||x.equals("-")||x.equals("*")||x.equals("/")){
                    int b=Integer.valueOf(stack.pop());
                    int a=Integer.valueOf(stack.pop());
                    if(x.equals("+")){
                        stack.push(a+b+"");
                    }else if(x.equals("-")){
                        stack.push(a-b+"");
                    }else if(x.equals("*")){
                        stack.push(a*b+"");
                    }else{
                        stack.push(a/b+"");
                    }
                }else{
                    stack.push(x);
                }
            }
            System.out.println(stack.pop());
        }
    }

}
