package week6.day6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -29
 * Time: 9:41
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        String[] num1 = s[0].split("/");
        String[] num2 = s[1].split("/");
        int z1 = Integer.parseInt(num1[0]);
        int m1 = Integer.parseInt(num1[1]);
        int z2 = Integer.parseInt(num2[0]);
        int m2 = Integer.parseInt(num2[1]);
        int n1 = z1/m1;
        int n2 = z2/m2;
        jia(n1,z1,m1,n2,z2,m2);
        jian(n1,z1,m1,n2,z2,m2);

    }
    public static void jia(int n1,int z1,int m1,int n2,int z2,int m2) {
        int m3;
        int z3;
        if(z1 == 0) {
            m3 = m2;
            z3 = z2;
        }else if(z2 == 0) {
            m3 = m1;
            z3 = z1;
        }else {
            m3 = min(m1,m2);
            z3 = m3/m1*z1 + m3/m2*z2;
        }
        int n3 = z3/m3;
        start(n1,z1,m1,n2,z2,m2,"+");
        if(n3 != 0) {
            System.out.print(n3 + " ");
        }
        System.out.println(z3%m3 + "/" + m3);
    }
    public static void jian(int n1,int z1,int m1,int n2,int z2,int m2) {
        int m3;
        int z3;
        if(z1 == 0) {
            m3 = m2;
            z3 = z2;
        }else if(z2 == 0) {
            m3 = m1;
            z3 = z1;
        }else {
            m3 = min(m1,m2);
            z3 = m3/m1*z1 - m3/m2*z2;
        }
        int n3 = z3/m3;
        start(n1,z1,m1,n2,z2,m2,"-");
        if(n3 != 0) {
            System.out.print(n3 + " ");
        }
        System.out.println(z3%m3 + "/" + m3);
    }

    public static void start(int n1,int z1,int m1,int n2,int z2,int m2,String s) {
        if(n1 != 0) {
            System.out.print(n1 + " ");
        }
        if(z1 == 0) {
            System.out.print(0);
        }else {
            System.out.print(z1%m1 + "/" + m1);
        }
        System.out.print(" " + s + " " + z2 + " = ");
    }
    public static int max(int m1,int m2) {
        if(m2 > m1) {
            int tmp = m1;
            m1 = m2;
            m2 = tmp;
        }
        int i;
        for(i = m1; i > 0; i--) {
            if(m1%i==0 && m2%i==0) {
                break;
            }
        }
        return i;
    }
    public static int min(int m1,int m2) {
        int max = max(m1,m2);
        return m1*m2/max;
    }

}
