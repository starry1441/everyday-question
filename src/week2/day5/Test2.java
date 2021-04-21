package week2.day5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -21
 * Time: 19:25
 */
public class Test2 {

    public final static native int w();
    //abstract double d;

    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("FIRD"));
        //default String s;
        //public final static native int w();

    }

}
