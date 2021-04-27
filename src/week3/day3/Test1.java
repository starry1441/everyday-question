package week3.day3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -27
 * Time: 14:09
 */
public class Test1 {

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
                    break;
            default:
                result = result + 5;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getValue(10));
    }


    public static void main4(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }

    public static void main2(String[] args) {
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }

    public static void main1(String[] args) {
        String x="fmn";
        x.toUpperCase();
        System.out.println(x);
        String y=x.replace('f','F');
        System.out.println(y);
        y=y+"wxy";
        System.out.println(y);
    }

}


