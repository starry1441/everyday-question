package week5.day1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -16
 * Time: 22:04
 */
public class Test1 {

    public static void main(String[] args) {

//        Integer a= new Integer(100);
//        Integer b= new Integer(100);
//        Integer c= 100;
//        Integer d= 100;
//        int e= 100;
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(d==c);
//        System.out.println(e==c);
//        System.out.println(e==a);


        Integer a = new Integer(5);
        Integer b = new Integer(5);

        Integer c = 5;
        Integer d = 5;

        Integer e = 128;
        Integer f = 128;

        int g = 128;

        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(d==c);
        System.out.println(e==f);
        System.out.println(f==g);

        Integer integer3 = new Integer(200);

        Integer a1 = 200; //或者写成Integer a1 = Integer.valueOf(127);

        System.out.println(integer3 == a1);

//        Integer a= new Integer(200);
//        Integer b= new Integer(200);
//        Integer c= 200;
//        Integer d= 200;
////        int e= 200;
////        System.out.println(a==b);
////        System.out.println(a==c);
//        System.out.println(d==c);
//        System.out.println(e==c);
//        System.out.println(e==a);

    }

}
