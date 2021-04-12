package week1.monday4_12;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -04 -12
 * Time: 19:38
 */
public class test2 {

    public static boolean isAdmin(String user) {
        return user.toLowerCase()=="admin";
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }

}
